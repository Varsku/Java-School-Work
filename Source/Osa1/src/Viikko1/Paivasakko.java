package Viikko1;

import java.util.Scanner;

public class Paivasakko {
/*Tee ohjelma Paivasakko,  joka laskee p‰iv‰sakon m‰‰r‰n.
P‰iv‰sakon m‰‰r‰ on (nettotulot ñ 255)/60
Esimerkki ohjelmasta
Anna nettotulot: 3100
Nettotuloilla 3100 p‰iv‰sakko on 47 euroa
 
 */
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int nettoTulot;
		System.out.println("Anna nettotulot: ");
		nettoTulot= input.nextInt();
		
System.out.println("Nettotuloilla " + nettoTulot + " p‰iv‰sakko on " + (nettoTulot - 255)/60 +" euroa");

	}

}
