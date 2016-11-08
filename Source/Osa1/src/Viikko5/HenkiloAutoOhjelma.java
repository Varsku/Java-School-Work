package Viikko5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HenkiloAutoOhjelma {
	private Scanner input;
	DecimalFormat f= new DecimalFormat("0.00");
	
	public HenkiloAutoOhjelma() {
		
		input= new Scanner(System.in);
		Auto auto= new Auto();
		Henkilo hlo= new Henkilo();
		Koko koko= new Koko();
		
		System.out.print("Anna merkki: ");
		auto.setMerkki(input.nextLine());
		System.out.print("Anna malli: ");
		auto.setMalli(input.nextLine());
		System.out.print("Anna rekisterinumero: ");
		auto.setReknro(input.nextLine());
	    System.out.print("Anna vuosimalli: ");
	    auto.setvMalli(input.nextLine());
		System.out.print("Anna nimi: ");
		hlo.setNimi(input.nextLine());
		System.out.print("Anna osoite: ");
		hlo.setOsoite(input.nextLine());
		System.out.print("Anna pituus metreinä: ");
		koko.setPituus(input.nextDouble());
		input.nextLine();
		System.out.print("Anna paino kiloina: ");
		koko.setPaino(input.nextInt());
		
	
		hlo.setAuto(auto);
		hlo.setKoko(koko);
		
		System.out.println("Nimi: " + hlo.getNimi());
		System.out.println("Osoite: " +hlo.getOsoite());
		System.out.println("Auto: " +hlo.getAuto().getMerkki() + " " + hlo.getAuto().getMalli());
		System.out.println("Pituus: " + f.format(hlo.getKoko().getPituus()));
		System.out.println("Painoindeksi: " + f.format(hlo.getKoko().getPaino()/ (hlo.getKoko().getPituus()*hlo.getKoko().getPituus())));
	
	}
	
	public static void main(String[] args) {
	new HenkiloAutoOhjelma();


	}

}
