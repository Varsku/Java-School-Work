package Viikko1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Palkka {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat f= new DecimalFormat("0.00");
		int palkka, ik�;
		double veroPros;
		
		
		System.out.println("Anna palkka: ");
		palkka = input.nextInt();
		System.out.println("Anna veroprosentti: ");
		veroPros = input.nextDouble();
		System.out.println("Anna ik�: ");
		ik�= input.nextInt();
		
		System.out.println("Bruttopalkka " + palkka);
		
		double vero= palkka * veroPros / 100.0;
		System.out.println("Veron osuus " + f.format(vero));
		
		double ty�El�ke;
		if (ik� < 53){
			ty�El�ke= palkka * 5.55/100;
		}else {
			ty�El�ke = palkka * 7.05/100;
		}
		System.out.println("Ty�el�kevakuutusmaksun osuus "+ f.format(ty�El�ke));
		
		double ty�Vakuutus = palkka * 0.005;
		System.out.println("Ty�el�kevakuutusmaksun osuus " + f.format(ty�Vakuutus));
		
		System.out.println("K�teen j�� " + f.format(palkka-vero-ty�El�ke-ty�Vakuutus));
		

	}

}
