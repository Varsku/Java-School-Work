package Viikko1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kimppakyyti {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		DecimalFormat f= new DecimalFormat("0.00");
		
		int ajettu;
		double kulutus;
		double hinta;
		int ihmiset;
		
		System.out.println("Anna ajetut kilometrit: ");
		ajettu= input.nextInt();
		System.out.println("Anna kulutus per 100 km: ");
		kulutus= input.nextDouble();
		System.out.println("Anna polttoaineen litrahinta: ");
		hinta= input.nextDouble();
		System.out.println("Anna kimppakyytiläisten lukumäärä: ");
		ihmiset= input.nextInt();
		
		double osuus= ajettu * kulutus / 100.0 * hinta / ihmiset;
		
		System.out.println("Bensakustannus per henkilö on " + f.format(osuus) + " euroa");
		
		
		
	}

}
