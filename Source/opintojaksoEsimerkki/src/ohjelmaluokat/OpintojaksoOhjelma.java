package ohjelmaluokat;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import tietokanta.Dao;
import kohdeluokat.Opintojakso;

public class OpintojaksoOhjelma {
	private Scanner input;

	public OpintojaksoOhjelma()
	{
		input = new Scanner(System.in);
	}
	public void aja()
	{
		int valinta=-1;

		do
		{
			System.out.println("\n1) hae kaikki opintojaksot");
			System.out.println("2) hae tietty opintojakso");
			//System.out.println("3) lis‰‰ opintojakso");
			System.out.println("0) lopeta ");
			System.out.print("Valitse: ");
			valinta = input.nextInt();

			switch (valinta)
			{
			case 0: break;
			case 1: haeOpintojaksot();
					break;
			case 2: haeOpintojakso();
					break;
			//case 3: lisaaOpintojakso ();
			//		break;
			default: System.out.println("Anna luku v‰lilt‰ 0-2");
			}
		}while (valinta != 0);
	}
	private void haeOpintojaksot()
	{
		List<Opintojakso> lista;
		Dao dao = new Dao();

		try
		{
			lista = dao.haeOpintojaksot();

			if (lista != null)
			{
				System.out.println("\nOpintojaksot:");
				for (int i = 0;i <lista.size();i++)
					System.out.println("\n" + lista.get(i));
			}
			else
				System.out.println("Tietokannassa ei ole yht‰‰n opintojaksoa");
		}
		catch (SQLException e )
		{
			System.out.println("Tietokantaan ei saada yhteytt‰, korjaamme vian tuotapikaa");
		}
		catch (Exception e)
		{
			System.out.println("Ohjelmointi virhe");
		}

	}
	private void haeOpintojakso()
	{
		String tunnus;
		Opintojakso opintojakso;

		System.out.print("Anna opintojakson tunnus: ");
		tunnus = input.next();

		Dao dao = new Dao();
		try
		{
			opintojakso = dao.haeOpintojakso(tunnus);

			if (opintojakso != null)
				System.out.println(opintojakso);
			else
				System.out.println(tunnus + " opintojakso ei lˆytynyt");
		}
		catch (SQLException e)
		{
			System.out.println("Tietokantaan ei saada yhteytt‰, korjaamme vian tuotapikaa");
		}
		catch (Exception e)
		{
			System.out.println("Ohjelmointi virhe!");
		}
	}
	private void lisaaOpintojakso()
	{
		String tunnus, nimi, op;
		Opintojakso opintojakso;
		int opintopisteet;
		Dao dao;

		do  // opintojakson tunnus pit‰‰ oplla muotoa xxx9xx999, esim.  swd1tn002
		{
			System.out.print("Anna opintojakson tunnus: ");
			tunnus = input.next();
		} while (! tunnus.matches ("[a-zA-Z]{3}\\d{1}[a-zA-Z]{2}\\d{3}"));
		
		
		try
		{
			opintojakso = haeOpintojakso(tunnus);  // onko opintojakso jo tietokannassa?
			
			if (opintojakso == null)  // opintojakso ei ole kannassa, lis‰t‰‰n se sinne
			{
				opintojakso = pyydaTiedot(tunnus);
				
				dao = new Dao();
				
				if (dao.lisaaOpintojakso(opintojakso))
				{
					System.out.println("opintojakso lis‰ttiin tietokantaan onnistuneesti!");
				}
				else
				{
					System.out.println("ohjelmointivirhe, opintojakso ei lis‰tty");
				}
				
				
			}
			else
			{
				System.out.println("olet jo lis‰nnyt opintojakson " + opintojakso);
			}
			
		}	
		catch (SQLException e)
		{
			System.out.println("Tietokantaan ei saada yhteytt‰, korjaamme vian tuotapikaa");
		}
		catch (Exception e)
		{
			System.out.println("Ohjelmointi virhe!");
		}
	}
	private Opintojakso pyydaTiedot (String tunnus)
	{
		String nimi, op;
		int opintopisteet=0;
		Opintojakso opintojakso = null;
		
		
		tunnus = tunnus.toUpperCase();
		input.nextLine();
		do		// nimen pit‰‰ ola muutakin  kuin tyhj‰
		{
			System.out.println("Anna opintojakson nimi: ");
			nimi = input.nextLine();
			nimi = nimi.trim();
		}while (nimi.length() == 0);
		nimi = nimi.replaceAll("\\s+"," ");	 // poista ylim‰‰riset tyhj‰t sanojen v‰list‰"
		
		do
		{
			System.out.println("Anna opintojakson opintopisteet: ");
			op = input.next();
			try
			{
				opintopisteet = Integer.parseInt(op);  // onko k‰ytt‰j‰n antama luku numeerinen?
				if (opintopisteet <= 0)
					throw new Exception();
			}
			catch (Exception e)
			{
				System.out.println("Anna numeroilla positiivinen luku ");
				op = null;
			}
		}while (op == null);
		
		opintojakso = new Opintojakso (tunnus, nimi, opintopisteet);
		return opintojakso;
	}
	private Opintojakso haeOpintojakso (String tunnus) throws SQLException, Exception
	{
		Opintojakso opintojakso=null;
		
		if (tunnus != null) 
		{
			Dao dao = new Dao();
		
			try
			{
				opintojakso = dao.haeOpintojakso(tunnus);
					
					
			}
			catch (SQLException e)
			{
				throw e;
			}
			catch (Exception w)
			{
				throw w;
			}
		}
		return opintojakso;
	}

	public static void main(String[] args) {
		OpintojaksoOhjelma ohj = new OpintojaksoOhjelma();
		ohj.aja();
	}

}

