package KOEAIHEET;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SanalistaSovellus {
	private Scanner input;
	
	private List<String> sanaLista = new ArrayList<String>();

	private void lisaaSana() {
		
	input = new Scanner(System.in);
	System.out.print("Anna sana: ");
	String sana= input.next();
	sanaLista.add(sana);
	}

	private void listaaSanat() {
		for(int i=0; i<sanaLista.size(); i++){
			String sanat= sanaLista.get(i);
			
			System.out.print(" "+ sanat);
		}

	}

	private void laskeSanat() {
		input= new Scanner(System.in);
		int laskuri=0;
	System.out.println("Anna sana, minkä esiintymiskerrat lasketaan: ");
	String sanaLasku= input.nextLine();
	for(int i=0;i< sanaLista.size(); i++){
		if(sanaLista.get(i).equals(sanaLasku)){
			laskuri++;
		}
	}
System.out.println("Sana " + sanaLasku + " esiintyi " + laskuri + " Kertaa");
	
	}

	private void poistaSana() {
		input = new Scanner(System.in);
		boolean loytyi =false;
		System.out.print("Anna sana, joka poistetaan: ");
		String sana= input.nextLine();
		for(int i=0;i<sanaLista.size(); i++){
			
		
		if(sanaLista.get(i).equalsIgnoreCase(sana)){
			sanaLista.remove(i);
			loytyi=true;
			
		}
	}
		if(loytyi == true){
			System.out.println("Jokainen " + sana +" on poistettu listasta");
		}else {
			System.out.println("Sanaa " + sana +" ei ollut listassa");
		}
	
	}

	public static void main(String[] args) {
		SanalistaSovellus ohjelma = new SanalistaSovellus();

		int valinta;

		Scanner input = new Scanner(System.in);

		do {
			System.out.println("\n1 = Lisää sana");
			System.out.println("2 = Listaa sanat");
			System.out.println("3 = Laske sanat");
			System.out.println("4 = Poista sanat");
			System.out.println("0 = Lopeta");
			System.out.print("Anna valintasi:");

			valinta = input.nextInt();

			switch (valinta) {
			case 1:
				ohjelma.lisaaSana();
				break;

			case 2:
				ohjelma.listaaSanat();
				break;

			case 3:
				ohjelma.laskeSanat();
				break;

			case 4:
				ohjelma.poistaSana();
				break;
			}
		} while (valinta != 0);
	}
}