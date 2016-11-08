package KOEAIHEET;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PelaajalistaSovellus {
private Scanner input;
	
	private List<Pelaaja> pelaajaLista = new ArrayList<Pelaaja>();
	
	private void lisaaPelaaja(){
	input= new Scanner(System.in);
	Pelaaja pelaaja= new Pelaaja();
	
	System.out.print("Anna pelinumero: ");
	pelaaja.setPelinumero(input.nextInt());
	input.nextLine();
	System.out.print("Anna nimi: ");
	pelaaja.setNimi(input.nextLine());
	System.out.print("Anna pelipaikka: ");
	pelaaja.setPelipaikka(input.nextLine());
	pelaajaLista.add(pelaaja);
		
	}
	private void haePelaaja(){
		System.out.print("Anna pelinumero: ");
		int peliNro=input.nextInt();
		int pelaajaNro= -1;
		for(int i=0; i<pelaajaLista.size();i++){
			if(pelaajaLista.get(i).getPelinumero()==peliNro){
				pelaajaNro=i;
				break;
			}
		}
		if(pelaajaNro==-1){
			System.out.println("Pelaajaa ei ole pelinumerolla " + peliNro);
		} else {
			System.out.println("Pelinumero: "
					+pelaajaLista.get(pelaajaNro).getPelinumero());
			System.out.println("Nimi: "
					+ pelaajaLista.get(pelaajaNro).getNimi());
			System.out.println("Pelipaikka: "
					+ pelaajaLista.get(pelaajaNro).getPelipaikka());
		}
	}
	private void naytaPelaajat(){
		for(int i=0;i < pelaajaLista.size();i++){
			System.out.println("Pelinumero: "
					+ pelaajaLista.get(i).getPelinumero());
			System.out.println("Nimi: "
					+pelaajaLista.get(i).getNimi());
			System.out.println("Pelipaikka: "
					+ pelaajaLista.get(i).getPelipaikka());
		}
		
		
	}

	public static void main(String[] args) {
		PelaajalistaSovellus sovellus = new PelaajalistaSovellus();
		
		int valinta = -1;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("\n1. Lisää pelaaja");
			System.out.println("2. Hae pelaaja");
			System.out.println("3. Näytä pelaajat");
			System.out.println("0. Lopetus");

			System.out.print("Anna valintasi (0-3): ");
			valinta = input.nextInt();

			switch (valinta) {
			case 1:
				sovellus.lisaaPelaaja();
				break;
			case 2:
				sovellus.haePelaaja();
				break;
			case 3:
				sovellus.naytaPelaajat();
				break;
			case 0:
				break;
			default:
				System.out.println("Virheellinen valinta");
			}
		} while (valinta != 0);
		
	}
}
