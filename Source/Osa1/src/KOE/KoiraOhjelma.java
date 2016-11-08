package KOE;

// Tomi Salin a1600563
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KoiraOhjelma {
	private Scanner input;

	private List<Koira> koiraLista = new ArrayList<Koira>();

	private void lisääKoira() {
		input = new Scanner(System.in);

		Koira koira = new Koira();
		System.out.print("Anna koiran nimi: ");
		koira.setNimi(input.nextLine());
		System.out.print("Anna koiran rotu: ");
		koira.setRotu(input.nextLine());
		System.out.print("Anna koiran syntymävuosi: ");
		koira.setsVuosi(input.nextInt());
		input.nextLine();
		koiraLista.add(koira);
	}

	private void poistaKoira() {
		input = new Scanner(System.in);
		Koira koira = null;
		String nimi;

		System.out.println("Anna koiran nimi, jonka haluat poistaa: ");
		nimi = input.nextLine();

		koira = etsiKoira(nimi);

		if (koira != null) {
			System.out.println("Poistetaan " + koira);
			koiraLista.remove(koira);
		} else {
			System.out.println("Koiraa ei löydy");
		}

	}

	private Koira etsiKoira(String nimi) {
		Koira paluu = null, koira;

		for (int i = 0; i < koiraLista.size(); i++) {
			koira = koiraLista.get(i);
			if (nimi.equals(koira.getNimi())) {
				paluu = koira;
				break;
			}
		}
		return paluu;
	}
	
	private Koira etsiKoirat(String koiraRotu) {
		Koira paluu = null, koira;

		for (int i = 0; i < koiraLista.size(); i++) {
			koira = koiraLista.get(i);
			if (koiraRotu.equals(koira.getRotu())) {
				paluu = koira;
				break;
			}
		}
		return paluu;
	}
	

	private void etsiKoirat() {
			input = new Scanner(System.in);
			Koira koira = null;
			String koiraRotu;

			System.out.println("Anna koiran rotu, jonka haluat löytää: ");
			koiraRotu=input.nextLine();
			koira = etsiKoirat(koiraRotu);
			
			for(int i=0;i<koiraLista.size();i++){
				if(koiraLista.get(i).getRotu().equalsIgnoreCase(koiraRotu) && koira!=null){
					System.out.println(koiraLista.get(i));
					break;
				}else{
					System.out.println("Rotua " + koiraRotu +" ei löytynyt");
				}
			}

			

		}

	private void tulostaKoirat() {
		for (int i = 0; i < koiraLista.size(); i++) {
			System.out.println(koiraLista.get(i));
		}

	}

	public static void main(String[] args) {

		KoiraOhjelma sovellus = new KoiraOhjelma();

		int valinta = -1;
		 Scanner input = new Scanner(System.in);

		do {
			System.out.println("\n1) Lisää koira");
			System.out.println("2) Poista koira");
			System.out.println("3) Etsi koirat");
			System.out.println("4) Tulosta koirat");
			System.out.println("0) Lopeta");

			System.out.print("Valitse: ");
			valinta = input.nextInt();

			switch (valinta) {
			case 1:
				sovellus.lisääKoira();
				break;
			case 2:
				sovellus.poistaKoira();
				break;
			case 3:
				sovellus.etsiKoirat();
				break;
			case 4:
				sovellus.tulostaKoirat();
			case 0:
				break;
			default:
				System.out.println("Virheellinen valinta");
			}
		} while (valinta != 0);

	}

}
