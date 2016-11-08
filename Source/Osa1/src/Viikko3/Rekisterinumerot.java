package Viikko3;

import java.util.Scanner;

public class Rekisterinumerot {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		String[] reknrot= new String[10];
		int laskuri=0;
		
		for (int i=0; i<reknrot.length; i++){
			System.out.println("Anna rekisterinumero (- lopettaa): ");
			String saaturek= input.next();
			saaturek=saaturek.toUpperCase();
			if(saaturek.equals("-")) {
				break;
			} else{
				reknrot[i]= saaturek;	
			}
			laskuri++;
		}
		
System.out.println("Rekisterinumerot ovat: ");
for(int i=0; i<laskuri; i++){
	System.out.println(reknrot[i]);
}
	}
}


