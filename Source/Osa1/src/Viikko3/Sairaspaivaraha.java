package Viikko3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sairaspaivaraha {
	private Scanner input= new Scanner(System.in);
	DecimalFormat f= new DecimalFormat("0.00");
	
	public Sairaspaivaraha() {
		double vuositulot=kysyTulot();
		double paivaraha= laskePaivaraha(vuositulot);
		System.out.println("Vuosituloilla " +f.format(vuositulot)+" sairaspäiväraha on "+f.format(paivaraha)+" euroa/päivä.");
	}
	
	private double kysyTulot() {
		System.out.println("Anna vuositulosi: ");
		return input.nextDouble();
	}
	
	private double laskePaivaraha(double tulot) {
		double korvaus=0;
		if(tulot>0 && tulot<=1399){
			korvaus=0.0;	
		}else if (tulot>1399 && tulot <=36419){
			korvaus= 0.7*tulot/300.0;
		}else if (tulot>=6420 && tulot<=56032){
			korvaus= 84.98 +0.4*(tulot-36419)/300.0;
		}else if (tulot> 56032){
			korvaus = 111.13+0.25*(tulot-56032)/300.0;
		}
		return korvaus;
	}

	public static void main(String[] args) {
		new Sairaspaivaraha();

	}

}
