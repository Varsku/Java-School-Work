package Viikko2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Luottolaskuri {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		DecimalFormat f= new DecimalFormat("0.00");
		
		double hinta, er‰, j‰ljell‰;
		int er‰tJ‰ljell‰;
		
		System.out.println("Anna luotollisen ostoksen hinta: ");
		hinta=input.nextDouble();
		System.out.println("Anna kuukausierien lukum‰‰r‰: ");
		er‰tJ‰ljell‰= input.nextInt();
		
		er‰= hinta/er‰tJ‰ljell‰;
		
		
		for (int i=1; i<er‰tJ‰ljell‰+1; i++){
			System.out.println(i +". er‰ " + f.format(er‰) + " euroa, luottoa j‰ljell‰ " + f.format( hinta-( er‰*i))+" euroa");
		}
		
		

	}

}
