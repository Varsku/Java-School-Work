package Viikko3;

import java.util.Scanner;
import java.util.Arrays;
public class Vedenkulutus {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int[] kulutukset = new int[7];
		
		System.out.print("Anna vesimittarin alkulukema: ");
		kulutukset[0] =input.nextInt();
		
		for(int i=1; i<kulutukset.length; i++){
			System.out.print("Anna "+ i + ". vesimittarin lukema: " );
			kulutukset[i]= input.nextInt();		
		}
		
		System.out.println(" ");
		
		for (int i=0; i<kulutukset.length-1; i++){
			System.out.println("Kuukauden " + (i+1) +" kulutus oli "+ (kulutukset[i+1]-kulutukset[i]));
		}
		

	}

}
