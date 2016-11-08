package Viikko1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bensa {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		DecimalFormat f = new DecimalFormat ("0.00");
		double tankattu;
		int ajettu;
		double hinta;
		
		System.out.println("Anna tankattu m‰‰r‰: ");
		tankattu= input.nextDouble();
		System.out.println("Anna ajetut kilometrit: ");
		ajettu= input.nextInt();
		System.out.println("Anna litrahinta: ");
		hinta= input.nextDouble();
		
		double ajo = tankattu / ajettu * hinta;
		
		System.out.println("Ajo per kilometri maksaa "+ f.format(ajo));
		
		

	}

}
