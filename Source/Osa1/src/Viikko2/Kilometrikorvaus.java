package Viikko2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kilometrikorvaus {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		DecimalFormat f= new DecimalFormat("0.00");
		
		int summa=0;
		int ajetutKm;
		
	
		
		System.out.println("Anna ajetut kilometrit (0 lopettaa): ");
		ajetutKm=input.nextInt();
		
		while (ajetutKm>0){
			summa = summa + ajetutKm;
			System.out.println("Anna ajetut kilometrit (0 lopettaa): ");
			ajetutKm=input.nextInt();
		}
		int ajetut= summa;
		double korvaus= ajetut * 0.43;
		System.out.println("Yhteensä "+ ajetut +" kilometriä");
		System.out.println("Korvaus on "+ f.format(korvaus) +" euroa");

	}

}
