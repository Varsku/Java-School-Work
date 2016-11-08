package Viikko3;

import java.util.Scanner;


public class LaskePalkka {
	private Scanner input;
	
public void aja() {
	
	input= new Scanner(System.in);
	int tunnit;
	double tuntipalkka;
	double palkka;
	
	tunnit=annaTunnit();
	tuntipalkka=annaTuntipalkka();
	
	palkka= laskePalkka(tuntipalkka, tunnit);
	
	System.out.println(palkka);
	
}
private int annaTunnit(){
	int tunnit=0;
	
System.out.print("Anna tehdyt tunnit ");
tunnit= input.nextInt();

while(tunnit<0) {
	System.out.print("Anna tehdyt tunnit (>=0) ");
	tunnit= input.nextInt();
}
	return tunnit;
}

 private double annaTuntipalkka(){
	 double palkka;
	 do{
		 System.out.print("Anna tuntipalkka (>0 ja <100): ");
		 palkka= input.nextDouble();
		 
	 }while(palkka<0 || palkka >=100);
	 return palkka;
 }
 
 private double laskePalkka(double tuntipalkka, int tehdytTunnit){
	 return tuntipalkka * tehdytTunnit;
 }
	public static void main(String[] args) {
		LaskePalkka ohj= new LaskePalkka();
		ohj.aja();
		
	}

}
