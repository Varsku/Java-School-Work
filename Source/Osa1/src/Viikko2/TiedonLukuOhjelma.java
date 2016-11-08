package Viikko2;

import java.util.Scanner;

public class TiedonLukuOhjelma {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int luku;
		String rivi;
		
		System.out.println("Anna luku: ");
		luku = input.nextInt();
		
		input.nextLine(); //lue rivinvaihtomerkki pois puskurista
		
		System.out.println("Anna rivi tekstiä: ");
		rivi = input.nextLine();
		
		System.out.println("luku= " + luku);
		System.out.println("rivi=" + rivi);
		System.out.println("loppu");
		

	}

}
