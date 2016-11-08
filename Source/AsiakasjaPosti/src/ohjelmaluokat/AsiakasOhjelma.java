package ohjelmaluokat;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import tietokanta.Dao;
import kohdeluokat.Asiakas;





public class AsiakasOhjelma {
	private Scanner input;
	
	
	public AsiakasOhjelma(){
		input = new Scanner(System.in);
	}
	
	public void aja() {
		int valinta =-1;
		
		do {
			System.out.println("\n1) hae kaikki asiakkaat");
			System.out.println("2) hae tietty asiakas");
			System.out.println("0) lopeta");
			valinta= lueValinta();
			
			switch (valinta){
			case 0: break;
			case 1: haeAsiakkaat();
					break;
			case 2: haeAsiakas();
					break;
			default: System.out.println("Anna luku väliltä 0-2");
			}
		}while(valinta !=0);
	}
	private int lueValinta(){
		int valinta;
		
		try{
			valinta= input.nextInt();
		} catch (Exception e) {
			input.nextLine();
			valinta = -1;
		} return valinta;
	}
	private void haeAsiakkaat(){
		List<Asiakas> lista;
		Dao dao= new Dao();
		
		try {
			lista = dao.haeAsiakkaat();
			if (lista != null){
				System.out.println("\nAsiakkaat: ");
				for(int i=0; i<lista.size(); i++)
					System.out.println("\n" + lista.get(i));
			}else 
				System.out.println("Tietokanassa ei ole yhtään asiakasta");
		}catch (SQLException e){
			System.out.println("Tietokantaan ei saa yhteyttä");
		}catch (Exception e){
			System.out.println("Ohjelmointi virhe");
		}	
	}
	private void haeAsiakas() {
		int numero;
		Asiakas asiakas;
		
		System.out.print("Anna asiakkaan id: ");
		numero= input.nextInt();
		input.nextLine();
		
		Dao dao= new Dao();
		try {
			asiakas= dao.haeAsiakas(numero);
			
			if( asiakas != null)
				System.out.println(asiakas);
			else
				System.out.println(numero + " asiakasta ei löytynyt");
		}catch (SQLException e){
			System.out.println("Ei yhteyttä tietokantaan");
		}catch (Exception e){
			System.out.println("Ohjelmointi virhe!");
		}
		
	}

	public static void main(String[] args) {
		AsiakasOhjelma ohj= new AsiakasOhjelma();
		ohj.aja();
		
	}

}
