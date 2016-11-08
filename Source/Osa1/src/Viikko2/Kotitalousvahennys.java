package Viikko2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kotitalousvahennys {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		DecimalFormat f= new DecimalFormat("0.00");
		
		double summa= 0, työkorvaus;
		
		
		System.out.println("Anna työkorvauksen määrä(0 lopettaa): ");
		työkorvaus= input.nextDouble();
		
		while (työkorvaus>0){
			summa = summa + työkorvaus;
			System.out.println("Anna työkorvauksen määrä(0 lopettaa): ");
			työkorvaus= input.nextDouble();
		}
		
		double vähennys= summa*45/100-100;
		if (vähennys >= 2400){
			System.out.println("Kotitalousvähennyksen määrä on 2400,00 euroa");
		} else
			if (vähennys <0){
				System.out.println("Kotitalousvähennyksen määrä on 0,00 euroa");
			}		
		 else {
			System.out.println("Kotitalousvähennyksen määrä on "+ f.format(vähennys)+" euroa");
		}
		

	}

}
