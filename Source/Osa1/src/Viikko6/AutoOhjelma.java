package Viikko6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AutoOhjelma {
	private Scanner input;

	public AutoOhjelma() {
		input = new Scanner(System.in);
		Auto auto = new Auto();
		Lisavaruste lisavaruste;
		System.out.print("Anna merkki: ");
		auto.setMerkki(input.nextLine());
		System.out.print("Anna malli: ");
		auto.setMalli(input.nextLine());
		System.out.print("Anna rekisterinumero: ");
		auto.setReknro(input.nextLine());
		System.out.print("Anna vuosimalli: ");
		auto.setvMalli(input.nextLine());
		String nimi;
		do {
			System.out.print("Anna lisävarusteen nimi (LOPPU lopettaa): ");
			nimi = input.nextLine();
			if(!nimi.equals("LOPPU")){
				System.out.print("Anna lisävarusteen kuvaus: ");
				String kuvaus = (input.nextLine());
				lisavaruste = new Lisavaruste(nimi, kuvaus);
				auto.getLisavarusteet().add(lisavaruste);
			}
		} while (!nimi.equals("LOPPU"));

		System.out.println("Merkki ja malli: " + auto.getMerkki() + " "
				+ auto.getMalli());
		System.out.println("Resiterinumero: " + auto.getReknro());
		System.out.println("Vuosimalli: " + auto.getvMalli());
		System.out.print("Lisävarusteet: ");
		int i = 0;
		while (auto.getLisavaruste(i) != null) {
			System.out.print(auto.getLisavaruste(i).getNimi() + " ");
			i++;
		}
		System.out.println();

	}

	public static void main(String[] args) {
		new AutoOhjelma();

	}

}
