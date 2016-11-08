package KOE;
// Tomi Salin a1600563

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Koulu {
	private Scanner input;
	
	private List<Opintojakso> opintojaksoLista = new ArrayList<Opintojakso>();
	
	public Koulu(){
		input= new Scanner(System.in);
		Opettaja opettaja= new Opettaja();
		
		System.out.print("Anna opettajan tunnus: ");
		opettaja.setTunnus(input.nextLine());
		System.out.print("Anna opettajan etunimi: ");
		opettaja.setEtunimi(input.nextLine());
		System.out.print("Anna opettajan sukunimi: ");
		opettaja.setSukunimi(input.nextLine());
		System.out.print("Anna opettajan palkka: ");
		opettaja.setPalkka(input.nextDouble());
		input.nextLine();
		
		int lkm=0;
		do{
		Opintojakso opintojakso= new Opintojakso();
		System.out.print("Anna kurssin tunnus: ");
		opintojakso.setTunnus(input.nextLine());
		System.out.print("Anna kurssin nimi: ");
		opintojakso.setNimi(input.nextLine());
		System.out.print("Anna opintojakson laajuus: ");
		opintojakso.setLaajuus(input.nextLine());
		opintojakso.setOpettaja(opettaja);
		opintojaksoLista.add(opintojakso);
		lkm++;
		} while(lkm<2);
		
		for(int i=0; i<opintojaksoLista.size(); i++){
			System.out.println(opintojaksoLista.get(i).getNimi());
			System.out.println(opintojaksoLista.get(i).getLaajuus());
			System.out.println("Vastuuopettaja: "+ opintojaksoLista.get(i).getOpettaja().getTunnus() +", " 
			+ opintojaksoLista.get(i).getOpettaja().getEtunimi()
					+ " " + opintojaksoLista.get(i).getOpettaja().getSukunimi() +"\n");
			
		}
	
			
	}

	public static void main(String[] args) {
		
		new Koulu();
	

	}

}
