package Kotikoe;

// Tomi Salin a1600563
import java.util.Scanner;

public class OppilasOhjelma {
	private Scanner input = new Scanner(System.in);

	public void aja() {

		Posti posti = new Posti();
		System.out.print("Anna postinumero: ");
		posti.setPostinro(input.nextLine());
		System.out.print("Anna postitoimipaikka: ");
		posti.setPostitmp(input.nextLine());

		Oppilas oppilas = new Oppilas();
		System.out.print("Anna oppilasnumero: ");
		oppilas.setOppilasnro(input.nextLine());
		System.out.print("Anna etunimi: ");
		oppilas.setEtunimi(input.nextLine());
		System.out.print("Anna sukunimi: ");
		oppilas.setSukunimi(input.nextLine());
		System.out.print("Anna osoite: ");
		oppilas.setOsoite(input.nextLine());
		oppilas.setPosti(posti);

		Oppilas oppilas1 = new Oppilas();
		System.out.print("Anna oppilasnumero: ");
		oppilas1.setOppilasnro(input.nextLine());
		System.out.print("Anna etunimi: ");
		oppilas1.setEtunimi(input.nextLine());
		System.out.print("Anna sukunimi: ");
		oppilas1.setSukunimi(input.nextLine());
		System.out.print("Anna osoite: ");
		oppilas1.setOsoite(input.nextLine());
		oppilas1.setPosti(posti);

		System.out.println(oppilas.getOppilasnro() + " " + oppilas.getEtunimi()
				+ " " + oppilas.getSukunimi());
		System.out.println(oppilas.getOsoite());
		System.out.println(oppilas.getPosti().getPostinro() + " "
				+ oppilas.getPosti().getPostitmp());

		System.out.println("\n" + oppilas1.getOppilasnro() + " "
				+ oppilas1.getEtunimi() + " " + oppilas1.getSukunimi());
		System.out.println(oppilas1.getOsoite());
		System.out.println(oppilas1.getPosti().getPostinro() + " "
				+ oppilas1.getPosti().getPostitmp());

	}

	public static void main(String[] args) {
		OppilasOhjelma ohj = new OppilasOhjelma();
		ohj.aja();
	}

}
