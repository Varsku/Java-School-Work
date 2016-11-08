package Viikko2;

import java.util.Scanner;

public class LukujenKäsittelyOhjelma {
	/*
	 * pyytää desimaalilukuja kunnes käyttäjä antaa merkkijonon loppu. ohjelma laskee ja tulostaa lukujen summan
	 */

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		String luku;
		double dluku, summa=0;
		
		
		System.out.print("Anna desimaaliluku: ");
		luku= input.next();
		while (luku.equalsIgnoreCase("loppu") == false) {
			//muuta mahdollinen desimaalipilkku pisteeksi
			luku=luku.replace(',', '.');
			//.89 luku kelpaa, 89 kelpaa, 89.23 kelpaa
			if(luku.matches("\\d*[.]?\\d{1,}") || luku.matches("\\d+[.]?\\d*")){
				dluku=Double.parseDouble(luku);
				summa = summa + dluku;
			}
			else {
				System.out.println("Anna desimaaliluku, pöljä!!!");
			}
			System.out.print("Anna desimaaliluku (loppu lopettaa): ");
			luku= input.next();
		}
		System.out.println("lukujen summa on " + summa);

	}

}
