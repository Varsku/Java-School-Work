package Viikko3;

import java.util.Arrays;
import java.util.Scanner;

public class Nimet {

	public static void main(String[] args) {
	/*Harjoitus:

Tee ohjelma Nimet, joka pyytää käyttäjältä 5 etunimeä, tallentaa 
nimet taulukkoon String[] nimet = new String[5], 
lajittelee nimet aakkosjärjestykseen ja tulostaa järjestetyt nimet.
	 
	 */
		Scanner input= new Scanner(System.in);
		String[] nimet=new String[5];
		
		//pyydä nimet
		
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
