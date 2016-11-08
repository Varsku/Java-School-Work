package Viikko6;

import java.util.Scanner;

public class KalastajaOhjelma {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		String nimi;
		double paino, pituus;
		
		Kalastaja kalastaja= new Kalastaja();
		
		System.out.print("Anna kalastajan nimi: ");
		kalastaja.setNimi(input.nextLine());
		
		System.out.print("Haluatko lisätä kalan tiedot (k/e):");
		while(input.nextLine().matches("k")){
			Kala kala=new Kala();
			System.out.print("Anna kalan laji: ");
			kala.setLaji(input.nextLine());
			System.out.print("Anna kalan paino (kg): ");
			kala.setPaino(input.nextDouble());
			System.out.print("Anna kalan pituus (cm): ");
			kala.setPituus(input.nextDouble());
			input.nextLine();
			
			kalastaja.getKalat().add(kala);
			
			System.out.println("Haluatko lisätä kalan tiedot (k/e): ");
		}
		System.out.println("Kalastajan nimi: " +kalastaja.getNimi());
		System.out.println("Saalis: ");
		for(int i=0; i<kalastaja.getKalat().size();i++ ){
			Kala kala= kalastaja.getKalat().get(i);
			System.out.println(kala.toString());
		}
		

	}

}
