package Viikko1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EkaOhjelma {
/*
 * T‰m‰ ohjelma pyyt‰‰ kaksi kokonaislukua ja tulostaa lukujen
 * summan, osam‰‰r‰n, erotuksen ja jakoj‰‰nnˆksen
 */
	public static void main(String[] args) {
		int luku1,luku2;
		Scanner input= new Scanner(System.in);
		
		System.out.print("Anna 1. luvun arvo: ");
		luku1=input.nextInt();      // lue 1. luvun arvo
		
		System.out.print("Anna 2. luvun arvo: ");
        luku2=input.nextInt();      //lue 2. luvun arvo
        
        System.out.println(luku1 + " + "+ luku2 + " = "+ (luku1+luku2));
        System.out.println(luku1 + " - "+ luku2 + " = "+ (luku1-luku2));
        
        System.out.println(luku1 + " / " + luku2 + " = " +(luku1/luku2));
        
        System.out.println(luku1 + " % "+ luku2+" = " + (luku1 % luku2));
        
        double dluku1,dluku2;
        dluku1= luku1;
        dluku2= luku2;
        
        
      
        System.out.println(dluku1 + " + "+ dluku2 + " = "+ (dluku1+dluku2));
        System.out.println(dluku1 + " - "+ dluku2 + " = "+ (dluku1-dluku2));
        
        System.out.println(dluku1 + " / " + dluku2 + " = " +(dluku1/dluku2));
        
        System.out.println(dluku1 + " % "+ dluku2+" = " + (dluku1 % dluku2));
        
        double sade;
        System.out.println("Anna sateen pituus: ");
        sade= input.nextDouble();
        double ala,keha;
        DecimalFormat f= new DecimalFormat("0.00");
        
        
        ala= Math.PI*sade*sade;
        keha= 2*Math.PI*sade;
        
        System.out.println("Ympyran ala on " +f.format(ala));
        System.out.println("Ympyran keha on " +f.format(keha));
        
        
	}

}
