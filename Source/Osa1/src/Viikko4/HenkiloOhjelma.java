package Viikko4;

import java.util.Scanner;

import Viikko5.Henkilo;

public class HenkiloOhjelma {
	 private Scanner input= new Scanner(System.in);
	 
	 public HenkiloOhjelma(){
		 Henkilo hlo= new Henkilo();
		 System.out.print("Anna nimi: ");
		 hlo.setNimi(input.nextLine());
		 System.out.print("Anna osoite: ");
		 hlo.setOsoite(input.nextLine());
		System.out.println(hlo.toString());
		
		 
	 }
	
	public static void main(String[] args) {
	new HenkiloOhjelma();	
	}

}