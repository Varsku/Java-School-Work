package Viikko2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kassakone {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		DecimalFormat f= new DecimalFormat("0.00");
		
		double hinta;
		double summa= 0;
		
		System.out.println("Anna ostoksen hinta (0 lopettaa): ");
		hinta= input.nextDouble();
		
		while (hinta > 0) {
			summa = summa + hinta;
			System.out.println("Anna ostoksen hinta (0 lopettaa: ");
			hinta= input.nextDouble();	
		}
		double verohinta= summa;
		double alv= summa * 24/124;
		double veroton= verohinta - alv;
		
		System.out.println("Ostosten verollinen hinta on " + f.format(verohinta));
		System.out.println("ALV:n osuus on " + f.format(alv));
		System.out.println("Veroton hinta on " +f.format(veroton));
		
		
		

	}

}
