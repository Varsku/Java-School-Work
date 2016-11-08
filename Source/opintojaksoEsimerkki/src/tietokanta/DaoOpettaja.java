package tietokanta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import kohdeluokat.Opettaja;
import kohdeluokat.Opintojakso;

public class DaoOpettaja {
	
	private Connection yhdista() throws SQLException  , Exception {
		
    	Connection tietokantayhteys = null;
    	        	
    	String JDBCAjuri = "org.mariadb.jdbc.Driver";
    	String url = "jdbc:mariadb://localhost:3306/a1600563";
        	
    	
    	try {
	         Class.forName(JDBCAjuri); // ajurin m‰‰ritys
	        	    	 
	         // otetaan yhteys tietokantaan
	         tietokantayhteys = DriverManager.getConnection(url,"a1600563", "faNEcW53r");
	
	         // yhteyden otto onnistu
	     }
	     catch (SQLException sqlE)
	     {
	         System.err.println("Tietokantayhteyden avaaminen ei onnistunut. " +
	        		 url + "\n" +sqlE.getMessage() + " " + 
				sqlE.toString()+"\n");
	     	sqlE.printStackTrace();
	         throw( sqlE);
	     } 
	     catch (Exception e)
	     {
	         System.err.println("TIETOKANTALIITTYN VIRHETILANNE: " +
	            "JDBC:n omaa tietokanta-ajuria ei loydy.\n\n" + e.getMessage() +
	            " " + e.toString() + "\n");
	        	e.printStackTrace();
	         System.out.print("\n");
	         throw (e);
	     }
	     return tietokantayhteys;
	}
	public List<Opettaja> haeOpettajat () throws SQLException, Exception
	{
		Opettaja ope = null;
		List<Opettaja> lista = null;
		String sql = "SELECT tunnus AS opetunnus "
					+ ", etunimi, sukunimi, palkka, puhelin, syntpvm "
					+" FROM opettaja  "
					+ " ORDER BY tunnus";
			PreparedStatement preparedStatement=null; // suoritettava SQL-lause
	        ResultSet tulosjoukko = null; // SQL-kyselyn tulokset
	        Connection conn=null;
	      
	        try
	        {
	        	conn = yhdista();
	        	if (conn != null)
	        	{
	        		// aloita transsaktio, ensin automaattinen commitointi pois 
	        		conn.setAutoCommit(false);
	        		// laita eristyvyystaso p‰‰lle
	        		conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
	       
	        		preparedStatement = conn.prepareStatement(sql);
	        		
	        		tulosjoukko = preparedStatement.executeQuery();
	        		
	        		// sulje preparedStatement
	        		preparedStatement.close();
	        		// p‰‰t‰ transaktio hyv‰ksym‰ll‰
	        		conn.commit();
	        		// sulje yhteys kantaa
	        		conn.close();
	        	
	        		if (tulosjoukko != null)
	        		{
	        			while (tulosjoukko.next())
	        			{
	        			
	        			  ope=teeOpettaja(tulosjoukko);
		        	
	        		      if (lista == null)
	        				lista = new ArrayList<Opettaja>();
	        			
	        			  lista.add(ope);

	        			}
		        		tulosjoukko.close();
		        		
		        	}
		        	else  // opintojaksoa ei lˆytynyt
		        	{
		        		lista = null;
		        	}
	        	}

	        }
	        catch (SQLException e)
	        {
	        	throw e;
	        }
	        catch (Exception e)
	        {
	        	throw e;
	        }
	       
	        finally {
				if (conn != null &&  conn.isClosed() == false) 
				{
					try 
					{
						conn.rollback();  // peruuta transaktion
						conn.close();     // yhteys poikki
					} 
					catch(Exception e) 
					{
						throw  e;
					}
				}
			}
	    
		return lista;
	}
	public Opettaja haeOpettaja (String tunnus) throws SQLException, Exception
	{
		Opettaja opettaja = null;
		String sql = "SELECT tunnus AS opetunnus "
					+ ", etunimi, sukunimi, palkka, puhelin, syntpvm "
					+" FROM opettaja"
					+ " WHERE tunnus =?";
			PreparedStatement preparedStatement=null; // suoritettava SQL-lause
	        ResultSet tulosjoukko = null; // SQL-kyselyn tulokset
	        Connection conn=null;
	      
	        try
	        {
	        	conn = yhdista();
	        	if (conn != null)
	        	{
	        		// aloita transaktion ensin automaattinen commitointi pois 
	        		conn.setAutoCommit(false);
	        		// laita eristyvyystaso p‰‰lle
	        		conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
	       
	        		preparedStatement = conn.prepareStatement(sql);
	        		
	        		preparedStatement.setString(1,  tunnus);
	        		
	        		tulosjoukko = preparedStatement.executeQuery();
	        		
	        		// sulje preparedStatement
	        		preparedStatement.close();
	        		// p‰‰t‰ transaktio hyv‰ksym‰ll‰
	        		conn.commit();
	        		// sulje yhteys kantaa
	        		conn.close();
	        	
	        		if (tulosjoukko != null && tulosjoukko.next())
		        	{
	        			opettaja=teeOpettaja(tulosjoukko);
		        	
		        		//System.out.println(opintojakso);
		        		tulosjoukko.close();
		        		
		        	}
		        	else  // opintojaksoa ei lˆytynyt
		        	{
		        		opettaja = null;
		        		
		        	}
	        	}

	        }
	        catch (SQLException e)
	        {
	        	e.printStackTrace();
	        	throw e;
	        }
	        catch (Exception e)
	        {
	        	e.printStackTrace();
	        	throw e;
	        }
	        finally {
				if (conn != null &&  conn.isClosed() == false) 
				{
					try 
					{
						conn.rollback();  // p‰‰t‰ transaktion peruuttamalla
						conn.close();     // yhteys poikki
					} 
					catch(Exception e) 
					{
						throw  e;
					}
				}
			}
	    
		return opettaja;
	}
	private Opettaja teeOpettaja(ResultSet tulosjoukko)throws SQLException
    {
    	String opetunnus, etunimi, sukunimi,puhelin, pvm;
    	double palkka;
    	Date syntpvm;
    	Opettaja ope=null;
    	
    	if (tulosjoukko != null)
    	{
    		try
    		{
    			opetunnus = tulosjoukko.getString("opetunnus");
    			etunimi = tulosjoukko.getString("etunimi");
    			sukunimi = tulosjoukko.getString("sukunimi");
    			puhelin = tulosjoukko.getString("puhelin");
    			palkka = tulosjoukko.getDouble("palkka");
    			syntpvm = tulosjoukko.getDate("syntpvm");
    				
    			ope = new Opettaja(opetunnus, etunimi, sukunimi, palkka, puhelin, syntpvm);
    				
    			
     		}
    		catch (SQLException e)
    		{
    			throw e;
    		}
    	}
    	
    	return ope;
    }
}
