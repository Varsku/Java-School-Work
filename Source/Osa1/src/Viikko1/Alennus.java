package Viikko1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Alennus {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		DecimalFormat f= new DecimalFormat("0.00");
		double hinta;
		int alennusProsentti;
		
		System.out.println("Anna alentamaton hinta: ");
		hinta= input.nextDouble();
		System.out.println("Anna alennusprosentti: ");
		alennusProsentti= input.nextInt();
		
		double aleHinta= (double) hinta * (100 - alennusProsentti)/100;
		System.out.println("Alennettu hinta on " + f.format(aleHinta));
		
		

	}

}
