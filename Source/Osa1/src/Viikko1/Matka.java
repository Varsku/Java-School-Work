package Viikko1;

import java.util.Scanner;

public class Matka {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int matka;
		int nopeus;
		
		System.out.println("Anna matka: ");
		matka= input.nextInt();
		System.out.println("Anna nopeus: ");
		nopeus= input.nextInt();
		
		double aika=(double) matka / nopeus;
		
		System.out.println("Aikaa menee "+ aika +" tuntia");

	}

}
