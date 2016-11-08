package Viikko6;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OpintojaksoOhjelma {
	private Scanner input= new Scanner(System.in);
	
	public OpintojaksoOhjelma(){
		Map<String, Opintojakso> opintojaksot= new HashMap<String,Opintojakso>();
		
		System.out.println("Syötä neljän opintojakson tiedot!");
		
		for(int i=0; i<4;i++){
			Opintojakso opintojakso= new Opintojakso();
			System.out.print("Anna opintojakson tunnus: ");
			opintojakso.setTunnus(input.nextLine());
			System.out.print("Anna opintojakson nimi: ");
			opintojakso.setNimi(input.nextLine());
			System.out.print("Anna opintojakson laajuus: ");
			opintojakso.setLaajuus(input.nextInt());
			input.nextLine();
			
			opintojaksot.put(opintojakso.getTunnus(), opintojakso);
		}
		
			System.out.println("Opintojaksot: ");
		
			Set<String> jaksot = opintojaksot.keySet();
			Iterator<String> ite = jaksot.iterator();
			
		String seurOpintojakso=null;
		String seurTunnus=null;
		String seurNimi=null;
		int seurLaajuus=0;
			
			while(ite.hasNext()){
			seurTunnus=ite.next();
			seurOpintojakso= opintojaksot.get(seurTunnus).getTunnus();
			seurNimi= opintojaksot.get(seurTunnus).getNimi();
			seurLaajuus= opintojaksot.get(seurTunnus).getLaajuus();
			
			
			System.out.println(seurOpintojakso + ": " +seurNimi+ " " +
			seurLaajuus + " opintopistettä");
		}
		
	}

	


	public static void main(String[] args) {
		new OpintojaksoOhjelma();

	}

}
