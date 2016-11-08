package Viikko2;

import java.util.Scanner;

public class Arvaus {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int arvaus=0, target= 78, summa= 0;
		double random= (int) (Math.random()* 100)+ 1;
		
		System.out.println("Arvaa lukua väliltä 1-100: ");
		arvaus = input.nextInt();
		
	
		while (arvaus!=target) {
			if (arvaus > target){
				System.out.println("Arvaa pienempää: ");
			}
			if (arvaus< target){
				System.out.println("Arvaa suurempaa: ");
			}
			arvaus=input.nextInt();
			summa++;
		}
		System.out.println("Arvasit oikein. Arvauksia oli " + (summa+1));
		}
		
		}



