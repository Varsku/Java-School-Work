package Viikko3;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Arrays;

public class Palkkalaskuri {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("0.00");

		double tuntiPalkka;
		int p‰iv‰t;
		int yht = 0;
		double brutto = 0;

		System.out.print("Anna tuntipalkkasi: ");
		tuntiPalkka = input.nextDouble();
		System.out.print("Monenko p‰iv‰n tuntim‰‰r‰t annat: ");
		p‰iv‰t = input.nextInt();

		int[] tunnit = new int[p‰iv‰t];

		for (int i = 0; i < tunnit.length; i++) {
			System.out.print("Anna tuntien m‰‰r‰ p‰iv‰ss‰: ");
			int sArvo = input.nextInt();
			tunnit[i] = sArvo;
			yht = yht + sArvo;
			brutto = yht * tuntiPalkka;
		}
		System.out.println("Tunteja yhteens‰: " + yht);
		System.out.println("Bruttopalkkasi: " + f.format(brutto));

		System.out.print("Annoit tunnit: ");
		for (int i = 0; i < tunnit.length; i++) {
			System.out.print(" " + tunnit[i]);

		}

	}

}
