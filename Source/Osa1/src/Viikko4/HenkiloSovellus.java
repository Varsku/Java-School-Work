package Viikko4;

import java.util.Scanner;

import Viikko5.Henkilo;

public class HenkiloSovellus {
	private Scanner input;
	private Henkilo hlo;
	
	public HenkiloSovellus(){
		naytaValikko();
	}
	private void naytaValikko(){
		input= new Scanner(System.in);
		System.out.println("1. Anna henkilö");
		System.out.println("2. Näytä henkilön tiedot");
		System.out.println("3. Muuta henkilön tietoja");
		System.out.println("0. Lopetus");
		System.out.print("Anna valintasi (0-3): ");
		switch (Integer.parseInt(input.nextLine())) {
		case 1:
			annaHenkilo();
			break;
		case 2:
			naytaTiedot();
			break;
		case 3:
			muutaTiedot();
			break;
		case 0:
			System.exit(0);
			break;
		
		default:
			System.out.println("Anna henkilö: ");
			break;
	}
		naytaValikko();
}
	private void annaHenkilo(){
	
		hlo= new Henkilo();
		System.out.print("Anna nimi: ");
		hlo.setNimi(input.nextLine());
		System.out.print("Anna osoite: ");
		hlo.setOsoite(input.nextLine());
	}
	private void naytaTiedot() {
		if(hlo==null) {
			System.out.println("Henkilöä ei ole");
			return;
		}
		System.out.println(hlo);
	}
	private void muutaTiedot(){
		if(hlo==null){
			System.out.println("Henkilöä ei ole");
			return;
		}
		System.out.println("Anna nimi: ");
		hlo.setNimi(input.nextLine());
		System.out.println("Anna osoite: ");
		hlo.setOsoite(input.nextLine());
	}
	public static void main(String[] args) {
		new HenkiloSovellus();
	}

}
