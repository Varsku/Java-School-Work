package Viikko2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kotitalousvahennys {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		DecimalFormat f= new DecimalFormat("0.00");
		
		double summa= 0, tyˆkorvaus;
		
		
		System.out.println("Anna tyˆkorvauksen m‰‰r‰(0 lopettaa): ");
		tyˆkorvaus= input.nextDouble();
		
		while (tyˆkorvaus>0){
			summa = summa + tyˆkorvaus;
			System.out.println("Anna tyˆkorvauksen m‰‰r‰(0 lopettaa): ");
			tyˆkorvaus= input.nextDouble();
		}
		
		double v‰hennys= summa*45/100-100;
		if (v‰hennys >= 2400){
			System.out.println("Kotitalousv‰hennyksen m‰‰r‰ on 2400,00 euroa");
		} else
			if (v‰hennys <0){
				System.out.println("Kotitalousv‰hennyksen m‰‰r‰ on 0,00 euroa");
			}		
		 else {
			System.out.println("Kotitalousv‰hennyksen m‰‰r‰ on "+ f.format(v‰hennys)+" euroa");
		}
		

	}

}
