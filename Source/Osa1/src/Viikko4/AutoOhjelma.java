package Viikko4;

import java.util.Scanner;

import Viikko5.Auto;
public class AutoOhjelma {
	private Scanner input;
	public AutoOhjelma(){
		input = new Scanner(System.in);
		
		Auto auto= new Auto();
		System.out.print("Anna merkki: ");
		auto.setMerkki(input.nextLine());
		System.out.print("Anna malli: ");
		auto.setMalli(input.nextLine());
		System.out.print("Anna rekisterinumero: ");
		auto.setReknro(input.nextLine());
		System.out.print("Anna vuosimalli: ");
		auto.setvMalli(input.nextLine());
		
		System.out.println("Merkki ja malli: " + auto.getMerkki() + " " + auto.getMalli());
		System.out.println("Rekisterinumero: " + auto.getReknro());
		System.out.println("Vuosimalli: " +auto.getvMalli());
		
	}

	public static void main(String[] args) {
new AutoOhjelma();


	}

}
