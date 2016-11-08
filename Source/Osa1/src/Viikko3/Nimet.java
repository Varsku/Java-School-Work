package Viikko3;

import java.util.Arrays;
import java.util.Scanner;

public class Nimet {

	public static void main(String[] args) {
	/*Harjoitus:

Tee ohjelma Nimet, joka pyyt‰‰ k‰ytt‰j‰lt‰ 5 etunime‰, tallentaa 
nimet taulukkoon String[] nimet = new String[5], 
lajittelee nimet aakkosj‰rjestykseen ja tulostaa j‰rjestetyt nimet.
	 
	 */
		Scanner input= new Scanner(System.in);
		String[] nimet=new String[5];
		
		//pyyd‰ nimet
		
		for (int i=0; i< nimet.length;i++){
			System.out.print("Anna etunimi: ");
			nimet[i]= input.next();
		}
//lajitellaan taulukko
		Arrays.sort(nimet, 0, nimet.length);
		
		//tulosta nimet
		for(int i=0; i< nimet.length; i++)
			System.out.println(nimet[i]);
	}

}
