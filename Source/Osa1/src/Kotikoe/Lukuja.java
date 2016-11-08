package Kotikoe;
// Tomi Salin a1600563
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lukuja {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		DecimalFormat f= new DecimalFormat("0.00");
	String mjono;
	double luku;
	int lkm=0;
	double summa=0;
	
	do {
		System.out.print("Anna "+(lkm+1) +". desimaaliluku: ");
		mjono= input.nextLine();
		mjono= mjono.replace(',', '.');
		try {
			luku=Double.parseDouble(mjono);
			if(luku<0){
				lkm++;
				summa=(summa)+(luku);
			}else{
				throw new Exception();
			}
			
		}catch (Exception e){
			
		}
		
	}while(mjono.equalsIgnoreCase("loppu")==false);
	System.out.println("Lukujen summa on " + f.format(summa));
	System.out.println("Lukujen lukumäärä on " + lkm);
	
	}

}
