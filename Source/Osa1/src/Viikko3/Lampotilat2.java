package Viikko3;

import java.util.Scanner;
import java.util.Arrays;
public class Lampotilat2 {
	private Scanner input= new Scanner(System.in);
	
	public Lampotilat2(){
		
		int [] lampotilat=new int[100];
		int syötöt= kysyLampotilat(lampotilat, lampotilat.length);
		naytaLampotilat(lampotilat, syötöt);
	}
	
	private int kysyLampotilat(int[] lampotilat, final int MAX){
		 int i;
		for(i=0; i<lampotilat.length; i++){
			System.out.print("Anna lämpötila: ");
			int sArvo= input.nextInt();
			if(sArvo==-999){
				break;
			}else {
				lampotilat[i]=sArvo;
			}
		}return i;
	}
	
	private void naytaLampotilat(int[] lampotilat, int syötöt) {
		
		Arrays.sort(lampotilat, 0, syötöt);
		System.out.print("Annoit lämpötilat: ");
		for(int i=0; i<syötöt;i++){
			System.out.print(" " + lampotilat[i]);
			
		}
	}
	
	public static void main(String[] args) {
		new Lampotilat2();
	}

}
