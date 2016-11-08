package Viikko5;


import java.util.Scanner;

public class OpiskelijaTutkintoOhjelma {
	private Scanner input;
	
	public OpiskelijaTutkintoOhjelma() {
	input= new Scanner(System.in);
	
	Opiskelija opiskelija= new Opiskelija();
	Tutkinto tutkinto= new Tutkinto();
	
	System.out.print("Anna opiskelijanumero: ");
	opiskelija.setNumero(input.nextLine());
	System.out.print("Anna opiskelijan nimi: ");
	opiskelija.setNimi(input.nextLine());
	System.out.print("Anna opiskelijan kotikunta: ");
	opiskelija.setKotikunta(input.nextLine());
	System.out.print("Anna tutkinnon nimi: ");
	tutkinto.setTutkintoNimi(input.nextLine());
	System.out.print("Anna tutkinnon suuntaus: ");
	tutkinto.setSuuntaus(input.nextLine());
	System.out.print("Anna tutkinnon tavoitteena oleva valmistumisvuosi: ");
	tutkinto.setTavoiteVuosi(input.nextInt());
	
	opiskelija.setTutkinto(tutkinto);
	
	System.out.println("Opiskelija " + opiskelija.getNimi() + " suorittaa tutkintoa " + opiskelija.getTutkinto().getTutkintoNimi());
		
		
	}

	public static void main(String[] args) {
		new OpiskelijaTutkintoOhjelma();

	}

}
