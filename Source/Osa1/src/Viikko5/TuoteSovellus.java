package Viikko5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuoteSovellus {
	/*
	 * sovelluksen k‰yttˆliittym‰
	 * 1) lis‰‰ tuote pyyt‰‰ tuotteen numeron, etsii listasta olion jonka numero on sama
	 * 				   jos lˆyt‰‰ kertoo k‰ytt‰j‰lle, ett‰ tuote on jo lis‰tty,
	 * 				   muuten pyyt‰‰ tuotteen loput tiedot ja lis‰‰ tuotteen listaan.
	 * 2) poista tuote : pyyt‰‰ tuotteen numeron, etsii sen ja poistaa.
	 * 3) tulosta tuotteet
	 * 0) lopeta
	 * valitse:
	 */
 private Scanner input;
 private List <Tuote> lista;
 
 public TuoteSovellus(){
	 input = new Scanner(System.in);
	 lista= new ArrayList<Tuote>();
	 

 }
 public void aja(){
	 int valinta= -1;
	 while (valinta != 0){
		 System.out.print("1. lis‰‰ tuote \n"
		 		+ "2. poista tuote \n"
		 		+ "3. tulosta tuotteet \n"
		 		+ "0. lopettaa \n"); 
		 System.out.print("Anna valinta: ");
		 valinta = input.nextInt();
		 input.nextLine();
		 
		 switch(valinta){
		 case 0: break;
		 case 1:lisaaTuote();
		 break;
		 case 2: poistaTuote();
		 break;
		 case 3: naytaLista();
		 break;
		 }	
	 }
 }
 public void naytaLista() {
	 for (int i=0; i<lista.size(); i++) {
		 System.out.print(lista.get(i).toString());
	 }
	 
 }
 public void poistaTuote() {
	 Tuote tuote=null;
	 int numero;
	 
	 System.out.print("Anna tuotteen numero jonka haluat poistaa: ");
	 numero= input.nextInt();
	 
	 tuote=etsiTuote(numero);
	 
	 if(tuote != null) {
		 System.out.print("Tuote poistettu " + tuote);
		 lista.remove(tuote);
	 } else {
		 System.out.print("Ei lˆydy!");
	 }
 }
 public void lisaaTuote(){
	 Tuote tuote=null; int numero; String nimi; double hinta;
	 System.out.print("Anna tuotenumero (0 lopettaa): ");
	 numero= input.nextInt();
	 input.nextLine();
	 tuote=etsiTuote(numero);
	 if (tuote==null) {
		 
		 System.out.print("Anna tuotteen nimi: ");
		 nimi= input.next();
		 System.out.print("Anna tuotteen hinta: ");
		 hinta= input.nextDouble();
		 input.nextLine();
		
		 tuote = new Tuote(numero, nimi, hinta);
		 lista.add(tuote);
	 }
	 
 }
 private Tuote etsiTuote (int numero){
	 Tuote paluu = null;
	 for(int i=0; i < lista.size(); i++){
		 if(numero==lista.get(i).getNumero()){
			 paluu=lista.get(i);
			 break;
		 }
		 
	 }
	 return paluu;
 }
	public static void main(String[] args) {
		TuoteSovellus ohj = new TuoteSovellus();
		ohj.aja();
	}

}
