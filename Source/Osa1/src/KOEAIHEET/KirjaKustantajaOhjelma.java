package KOEAIHEET;

import java.util.Scanner;

public class KirjaKustantajaOhjelma {
		private Scanner input;

			public KirjaKustantajaOhjelma() {
			input= new Scanner(System.in);
			
			Kirja kirja= new Kirja();
			Kustantaja kustantaja = new Kustantaja();
			
			System.out.print("Kirjan nimi: ");
			kirja.setNimi(input.nextLine());
			System.out.print("Kirjan isbn: ");
			kirja.setIsbn(input.nextLine());
			System.out.print("Kirjan hinta: ");
			kirja.setHinta(input.nextDouble());
			input.nextLine();
			System.out.print("Kustantajan nimi: ");
			kustantaja.setNimi(input.nextLine());
			System.out.print("Kustantajan osoite: ");
			kustantaja.setOsoite(input.nextLine());
			System.out.print("Kustantajan puhelin: ");
			kustantaja.setPuhelin(input.nextLine());
			
			kirja.setKustantaja(kustantaja);
			
			System.out.println("Kirjan " + kirja.getNimi() +
					" kustantaja on " + kirja.getKustantaja().getNimi());
			
		}

	public static void main(String[] args) {
		new KirjaKustantajaOhjelma();

	}

}

