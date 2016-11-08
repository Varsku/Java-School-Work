package Viikko3;


import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Arrays;
public class MinigolfTilasto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat f= new DecimalFormat("0.00");
		
		int pelaajat=0;
		int yht=0, alleKa=0;
		double keskiArvo;
		System.out.print("Anna pelaajien lukum‰‰r‰: ");
		pelaajat= input.nextInt();
		
		int[] tulokset= new int[pelaajat];
		
		for(int i=0; i<tulokset.length; i++){
			System.out.print("Anna pelaajan "+(i+1) +". tulos: ");
			tulokset[i]=input.nextInt();
			yht= yht + tulokset[i];
			}
		
		Arrays.sort(tulokset, 0, tulokset.length);
		
		keskiArvo= yht/(double)tulokset.length;
		for(int i=0; i<tulokset.length; i++){
			if(tulokset[i]<keskiArvo){
			alleKa++;
			}
		}
			
		System.out.println("Pelien keskiarvo oli "+ f.format(keskiArvo));
		System.out.println("Pienin peli oli " + tulokset[0]);
		System.out.println("Suurin peli oli " + tulokset[pelaajat-1]);
		System.out.println(alleKa +" pelaajalla oli keskiarvoa pienempi tulos");
					
	}
		
}
		