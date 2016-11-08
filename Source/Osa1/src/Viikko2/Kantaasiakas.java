package Viikko2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kantaasiakas {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		DecimalFormat f= new DecimalFormat("0.00");
		
		double summa;
		final String kyllä="kyllä";
		final String ei="ei";
		
		
		System.out.println("Anna ostosten summa: ");
		summa= input.nextDouble();
		
		input.nextLine();
		
		System.out.println("Oletko kanta-asiakas (kyllä, ei): ");
		String vastaus= input.nextLine();
		
		if (summa>=1000 && vastaus.equals(kyllä)){
			System.out.println("Ostosten loppusumma on " + f.format(summa * 0.99));
		}
		if (summa<1000 && vastaus.equals(kyllä)){
			System.out.println("Ostosten loppusumma on "+ f.format(summa*0.995));
		} else if (vastaus.equals(ei)){
			System.out.println("Ostosten loppusumma on " +f.format(summa));
		}
			
		

	}

}
