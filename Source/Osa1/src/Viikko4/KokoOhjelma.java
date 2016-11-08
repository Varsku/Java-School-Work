package Viikko4;

import java.text.DecimalFormat;
import java.util.Scanner;

import Viikko5.Koko;

public class KokoOhjelma {
	private Scanner input=new Scanner(System.in);
	DecimalFormat f= new DecimalFormat("0.00");

	
	public KokoOhjelma(){
		Koko koko= new Koko();
		System.out.print("Anna pituus metreinä: ");
		koko.setPituus(input.nextDouble());
		System.out.print("Anna paino kiloina: ");
		koko.setPaino(input.nextInt());
		System.out.println("Pituus: " +f.format(koko.getPituus()));
		System.out.println("Paino: " + koko.getPaino());
		System.out.println("Painoindeksi: " + f.format(koko.getPainoindex()));
	}
	public static void main(String[] args) {
		new KokoOhjelma();
	}

}
