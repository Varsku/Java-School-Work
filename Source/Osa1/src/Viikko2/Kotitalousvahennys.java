package Viikko2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kotitalousvahennys {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		DecimalFormat f= new DecimalFormat("0.00");
		
		double summa= 0, ty�korvaus;
		
		
		System.out.println("Anna ty�korvauksen m��r�(0 lopettaa): ");
		ty�korvaus= input.nextDouble();
		
		while (ty�korvaus>0){
			summa = summa + ty�korvaus;
			System.out.println("Anna ty�korvauksen m��r�(0 lopettaa): ");
			ty�korvaus= input.nextDouble();
		}
		
		double v�hennys= summa*45/100-100;
		if (v�hennys >= 2400){
			System.out.println("Kotitalousv�hennyksen m��r� on 2400,00 euroa");
		} else
			if (v�hennys <0){
				System.out.println("Kotitalousv�hennyksen m��r� on 0,00 euroa");
			}		
		 else {
			System.out.println("Kotitalousv�hennyksen m��r� on "+ f.format(v�hennys)+" euroa");
		}
		

	}

}
