package tietokanta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kohdeluokat.Asiakas;
import kohdeluokat.Posti;


public class Dao {
	
	private Connection yhdista() throws SQLException, Exception {
		Connection tietokantayhteys= null;
		
		String JDBCAjuri = "org.mariadb.jdbc.Driver";
		String url= "jdbc:mariadb://localhost:3306/a1600563";
		
		try {
			Class.forName(JDBCAjuri);
			tietokantayhteys= DriverManager.getConnection(url, "a1600563", "faNEcW53r");
			
		}catch (SQLException sqlE){
			System.err.println("Tietokantayhteyden avaaminen ei onnistu. " +
		url + "\n" + sqlE.getMessage() + " " + 
					sqlE.toString() +"\n");
			sqlE.printStackTrace();
			throw (sqlE);
		} catch (Exception e) {
			System.err.println("Tietokantaliitynn‰inen virhe: " +
		"JDBC:n omaa tietokanta-ajuria ei loydy. \n\n" + e.getMessage() +
		" " + e.toString() + "\n");
			e.printStackTrace();
			System.out.print("\n");
			throw (e);
		} return tietokantayhteys;
	}
	// copypastea alla
	public List<Asiakas> haeAsiakkaat () throws SQLException, Exception
	{
		Asiakas asiakas = null;
		List<Asiakas> lista = null;
		String sql = "SELECT numero"
					+ ", etunimi, sukunimi, osoite, puhelin, asiakas.postinro AS postinro, postitmp "
					+" FROM asiakas NATURAL JOIN posti  "
					+ " ORDER BY numero";
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
	        			
	        			  asiakas=teeAsiakas(tulosjoukko);
		        	
	        		      if (lista == null)
	        				lista = new ArrayList<Asiakas>();
	        			
	        			  lista.add(asiakas);

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
	public Asiakas haeAsiakas (int numero) throws SQLException, Exception
	{
		Asiakas asiakas = null;
		String sql = "SELECT numero  "
					+ ", etunimi, sukunimi, osoite, puhelin, asiakas.postinro AS postinro, postitmp "
					+" FROM asiakas NATURAL JOIN posti"
					+ " WHERE numero =?";
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
	        		
	        		preparedStatement.setInt(1,  numero);
	        		
	        		tulosjoukko = preparedStatement.executeQuery();
	        		
	        		// sulje preparedStatement
	        		preparedStatement.close();
	        		// p‰‰t‰ transaktio hyv‰ksym‰ll‰
	        		conn.commit();
	        		// sulje yhteys kantaa
	        		conn.close();
	        	
	        		if (tulosjoukko != null && tulosjoukko.next())
		        	{
	        			asiakas=teeAsiakas(tulosjoukko);
		        	
		        		//System.out.println(opintojakso);
		        		tulosjoukko.close();
		        		
		        	}
		        	else  // opintojaksoa ei lˆytynyt
		        	{
		        		asiakas = null;
		        		
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
	    
		return asiakas;
	}
	private Asiakas teeAsiakas(ResultSet tulosjoukko)throws SQLException
    {
		Asiakas asiakas=null;
    	int numero;
    	String etunimi, sukunimi, osoite, puhelin, postinro, postitmp;
    	Posti posti=null;
    	
    	if (tulosjoukko != null)
    	{
    		try
    		{
    			numero = tulosjoukko.getInt("numero");
    			etunimi = tulosjoukko.getString("etunimi");
    			sukunimi = tulosjoukko.getString("sukunimi");
    			osoite = tulosjoukko.getString("osoite");
    			puhelin = tulosjoukko.getString("puhelin");
    			
    			postinro = tulosjoukko.getString("postinro");
    			postitmp =tulosjoukko.getString("postitmp");
    			
    		posti= new Posti(postinro, postitmp);		
    		asiakas = new Asiakas(numero, etunimi, sukunimi, osoite, puhelin, posti);	
    				
    			
     		}
    		catch (SQLException e)
    		{
    			throw e;
    		}
    	}
    	
    	return asiakas;
    }
}

