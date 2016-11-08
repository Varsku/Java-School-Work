package Viikko4;

import java.util.Scanner;

import Viikko5.Tuote;

public class TuoteOhjelma {
private Scanner input;
	
	private Tuote pyydaTuotteenTiedot(){
		System.out.print("Anna tuoteen numero: ");
		int nro=input.nextInt();
		
		System.out.print("Anna tuotteen nimi: ");
		String nimi= input.next();
		
		System.out.print("Anna tuotteen hinta: ");
		double hinta= input.nextDouble();
		
		
		Tuote tuote= new Tuote(); //luo olio
		tuote.setNumero(nro);// vie oliolle numero
		tuote.setNimi(nimi);// vie oliolle nimi
		tuote.setHinta(hinta);// vie oliolle hinta
		
	return tuote;
}
	private void tulostaTuote(Tuote tuote){
		if(tuote!=null){
			System.out.println(tuote.toString());
			
		}
	}
	
	public void aja(){
		input= new Scanner(System.in);	
	Tuote tuote= pyydaTuotteenTiedot();	
	tulostaTuote(tuote);
	
	Tuote tuote1= new Tuote(); //oletusmuodostimen kutsu
	System.out.println("\noletustuote: " +tuote1);
	
	Tuote tuote2= new Tuote(100, "vasara", 23.45);// Tuote(int nro, String nimi, double hinta)
	System.out.println("\nparam.tuote: " +tuote2);
	
	Tuote kopio= Tuote.teeKopio(tuote2);
	System.out.println("\nkopitoitu tuote: " +kopio);
}

	public static void main(String[] args) {
	TuoteOhjelma ohj = new TuoteOhjelma();
	ohj.aja();
	}

}
