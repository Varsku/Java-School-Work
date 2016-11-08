package Viikko3;
import java.util.Arrays;
import java.util.Scanner;
public class Lampotilat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] lampotilat = new int[100];
		int laskuri=0;
		
		for(int i=0; i<lampotilat.length; i++){
			System.out.print("Anna lämpötila: ");
			int sArvo= input.nextInt();
				if(sArvo == -999){
			break;	
				} else{
					lampotilat[i]=sArvo;
				}laskuri++;
		}
		Arrays.sort(lampotilat, 0, laskuri);	
		System.out.print("Annoit lämpötilat: ");
		for(int i=0; i < laskuri; i++){
			System.out.print(" "+lampotilat[i]);
		}
	}
}
