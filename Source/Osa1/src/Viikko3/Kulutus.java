package Viikko3;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Kulutus {
	private Scanner input= new Scanner(System.in);
	
	public Kulutus(){
		int kilometrit= kysyKilometrit();
		int tankattu= kysyTankkaus();
		double kulutus= laskeKulutus(kilometrit, tankattu);	
		naytaKulutus(kulutus);
	}
	
	private int kysyKilometrit(){
		System.out.print("Anna kilometrit: ");
		return input.nextInt();		
	}
	
	private int kysyTankkaus(){
		System.out.print("Anna tankattu m‰‰r‰: ");
		return input.nextInt();	
	}
	
	private double laskeKulutus(int kilometrit, int tankattu){
		return (double) tankattu/kilometrit*100;
	}
	
	private void naytaKulutus(double kulutus){
		DecimalFormat f= new DecimalFormat("0.00");
		System.out.println("Kulutus/100km on "+ f.format(kulutus)+" litraa");
	}

	public static void main(String[] args) {
	new Kulutus();

	}

}
