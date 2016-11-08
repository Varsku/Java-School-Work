package KOEAIHEET;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class KokonaislukuOhjelma {
	private ArrayList<Integer> luvut;
	private Scanner input;
	private final int LKM=10;
	public KokonaislukuOhjelma(){
		
		input=new Scanner(System.in);
		luvut= new ArrayList<Integer>();
		
		int i=0;
		int apu;
		String rivi;
		
		while(luvut !=null && i<LKM){
			System.out.print("Anna " + (i+1)+". luku: ");
			rivi=input.nextLine();
			rivi=rivi.trim();
			try {
				apu=Integer.parseInt(rivi);
				luvut.add(apu);
				i++;
			}
			catch(Exception e){
				System.out.println("Syötä kokonaisluku numeronäppäimillä!");
			}
		}
		
		System.out.println("LUVUT:");
		Iterator<Integer> it=luvut.iterator();
		while(it.hasNext()){
			apu=it.next();
			if(it.hasNext()){
				System.out.print(apu + " ");
			} else{
				System.out.print(apu);
			}
		}
		
	}	

	public static void main(String[] args) {
		new KokonaislukuOhjelma();	
	}
}
