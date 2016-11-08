package Viikko6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AutolistaSovellus {
	private List<Auto> autoLista = new ArrayList<Auto>();

	public void lisaaAuto() {
		Scanner input = new Scanner(System.in);
		Auto auto= new Auto();
		
		System.out.print("Anna merkki: ");
		auto.setMerkki(input.nextLine());
		System.out.print("Anna malli: ");
		auto.setMalli(input.nextLine());
		System.out.print("Anna rekisterinumero: ");
		auto.setReknro(input.nextLine());
		System.out.print("Anna vuosimalli: ");
		auto.setvMalli(input.nextLine());
		autoLista.add(auto);

	}

	public void listaaAutot() {
		for(int i=0; i< autoLista.size(); i++){
			System.out.println(autoLista.get(i));
		
		}
		
	}



	public void lisaaLisavaruste() {
		Scanner input = new Scanner(System.in);
		String nimi;
		Lisavaruste lisavaruste;
		String reknro;
		System.out.print("Anna rekisterinumero: ");
		reknro= input.nextLine();
		for(int i=0; i< autoLista.size(); i++){
			if(autoLista.get(i).getReknro().equals(reknro)){
		do {
			System.out.print("Anna lisävarusteen nimi (LOPPU lopettaa): ");
			nimi = input.nextLine();
			if(!nimi.equals("LOPPU")){
				System.out.print("Anna lisävarusteen kuvaus: ");
				String kuvaus = (input.nextLine());
				lisavaruste = new Lisavaruste(nimi, kuvaus);
				autoLista.get(i).getLisavarusteet().add(lisavaruste);
			}
		} while (!nimi.equals("LOPPU"));
	}
		}
	}

	public static void main(String[] args) {
		AutolistaSovellus ohjelma = new AutolistaSovellus();

		int valinta;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("\n1 = Lisää auto");
			System.out.println("2 = Listaa autot");
			System.out.println("3 = Lisää autolle lisävaruste");
			System.out.println("0 = Lopeta");
			System.out.print("Anna valintasi: ");

			valinta = input.nextInt();
			input.nextLine();

			switch (valinta) {
			case 1:
				ohjelma.lisaaAuto();
				break;

			case 2:
				ohjelma.listaaAutot();
				break;

			case 3:
				ohjelma.lisaaLisavaruste();
				break;

			case 4:
				break;
			}
		} while (valinta != 0);
	}
}