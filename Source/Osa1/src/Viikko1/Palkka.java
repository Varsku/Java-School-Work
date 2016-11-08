package Viikko1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Palkka {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat f= new DecimalFormat("0.00");
		int palkka, ikä;
		double veroPros;
		
		
		System.out.println("Anna palkka: ");
		palkka = input.nextInt();
		System.out.println("Anna veroprosentti: ");
		veroPros = input.nextDouble();
		System.out.println("Anna ikä: ");
		ikä= input.nextInt();
		
		System.out.println("Bruttopalkka " + palkka);
		
		double vero= palkka * veroPros / 100.0;
		System.out.println("Veron osuus " + f.format(vero));
		
		double työEläke;
		if (ikä < 53){
			työEläke= palkka * 5.55/100;
		}else {
			työEläke = palkka * 7.05/100;
		}
		System.out.println("Työeläkevakuutusmaksun osuus "+ f.format(työEläke));
		
		double työVakuutus = palkka * 0.005;
		System.out.println("Työeläkevakuutusmaksun osuus " + f.format(työVakuutus));
		
		System.out.println("Käteen jää " + f.format(palkka-vero-työEläke-työVakuutus));
		

	}

}
