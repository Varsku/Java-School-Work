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

public class Dao {
	
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

	
	public Opintojakso haeOpintojakso (String tunnus) throws SQLException, Exception
	{
		Opintojakso opintojakso = null;
		String sql = "SELECT opintojakso.tunnus AS opitunnus, nimi, opintopisteet, opettaja.tunnus AS opetunnus "
					+ ", etunimi, sukunimi, palkka, puhelin, syntpvm "
					+"FROM opintojakso LEFT JOIN opettaja ON vastuuopettaja=opettaja.tunnus "
					+ "WHERE opintojakso.tunnus =?";
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
	        			opintojakso=teeOpintojakso(tulosjoukko);
		        	
		        		//System.out.println(opintojakso);
		        		tulosjoukko.close();
		        		
		        	}
		        	else  // opintojaksoa ei lˆytynyt
		        	{
		        		opintojakso = null;
		        		
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
						conn.rollback();  // p‰‰t‰ transaktion peruuttamalla
						conn.close();     // yhteys poikki
					} 
					catch(Exception e) 
					{
						throw  e;
					}
				}
			}
	    
		return opintojakso;
	}
	public List<Opintojakso> haeOpintojaksot () throws SQLException, Exception
	{
		Opintojakso opintojakso = null;
		List<Opintojakso> lista = null;
		String sql = "SELECT opintojakso.tunnus AS opitunnus, nimi, opintopisteet, opettaja.tunnus AS opetunnus "
					+ ", etunimi, sukunimi, palkka, puhelin, syntpvm "
					+"FROM opintojakso LEFT JOIN opettaja ON vastuuopettaja=opettaja.tunnus "
					+ "ORDER BY opintojakso.tunnus";
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
	        			
	        			  opintojakso=teeOpintojakso(tulosjoukko);
		        	
	        		      if (lista == null)
	        				lista = new ArrayList<Opintojakso>();
	        			
	        			  lista.add(opintojakso);

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
	private Opintojakso teeOpintojakso(ResultSet tulosjoukko)throws SQLException
    {
    	Opintojakso opintojakso = null;
    	String tunnus, nimi;
    	int pisteet;
    	String opetunnus, etunimi, sukunimi,puhelin, pvm;
    	double palkka;
    	Date syntpvm;
    	Opettaja vastuuopettaja=null;
    	
    	if (tulosjoukko != null)
    	{
    		try
    		{
    			tunnus = tulosjoukko.getString("opitunnus");
    			nimi  = tulosjoukko.getString("nimi");
    			pisteet = tulosjoukko.getInt("opintopisteet");
    			opetunnus = tulosjoukko.getString("opetunnus");
    			if ( opetunnus == null) {  // opintojaksolla ei ole vastuuopettajaa
    			
    				opintojakso = new Opintojakso(tunnus, nimi, pisteet);
    			}
    			else {// opintojaksolla on vastuuopettaja
    				etunimi = tulosjoukko.getString("etunimi");
    				sukunimi = tulosjoukko.getString("sukunimi");
    				puhelin = tulosjoukko.getString("puhelin");
    				palkka = tulosjoukko.getDouble("palkka");
    				syntpvm = tulosjoukko.getDate("syntpvm");
    				
    				vastuuopettaja = new Opettaja(opetunnus, etunimi, sukunimi, palkka, puhelin, syntpvm);
    				
    				opintojakso = new Opintojakso(tunnus, nimi, pisteet, vastuuopettaja);
    				
    			}
     		}
    		catch (SQLException e)
    		{
    			throw e;
    		}
    	}
    	
    	return opintojakso;
    }
	public boolean lisaaOpintojakso (Opintojakso opintojakso) throws SQLException, Exception
	{
		String sql = "INSERT INTO opintojakso (tunnus, nimi, opintopisteet, vastuuopettaja) VALUES (?,?,?,?)";
			
		PreparedStatement lause=null; // suoritettava SQL-lause
        Connection conn=null;
        int lkm;
        boolean ok = true;
      
        try
        {
        	conn = yhdista();
        	if (conn != null)
        	{
        		// aloita transsaktio, ensin automaattinen commitointi pois 
        		conn.setAutoCommit(false);
        		// laita eristyvyystaso p‰‰lle
        		conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
       
        		lause = conn.prepareStatement(sql);
        		
        		lause.setString (1, opintojakso.getTunnus());
        		lause.setString(2, opintojakso.getNimi());
        		lause.setInt(3, opintojakso.getOpintopisteet());
        		String opetunnus = null;
        		if ( opintojakso.getVastuuopettaja()!= null)
        			opetunnus = opintojakso.getVastuuopettaja().getTunnus();
        		lause.setString(4, opetunnus);
        		
        		lkm = lause.executeUpdate();
        		lause.close();
        		
        		if (lkm == 1)  // lis‰ys onnistui
        		{
        			conn.commit(); // hyv‰ksy lis‰ys
        			conn.close(); // sulje yhteys kantaan
        			ok = true;
        		}
        		else	// lis‰ys ep‰onnistui
        		{
        			conn.rollback();  	// hylk‰‰ transaktion
        			conn.close();		// sulje yhteys kantaa
        			ok = false;
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
        return ok;
	}
	
}
