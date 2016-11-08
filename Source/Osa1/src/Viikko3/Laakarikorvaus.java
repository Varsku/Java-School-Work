package Viikko3;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Laakarikorvaus {
	
   Scanner input = new Scanner(System.in);
   DecimalFormat f = new DecimalFormat("0.00");
    
    public Laakarikorvaus(){
    int aika;
    
    	System.out.print("Anna kesto:");
        aika = input.nextInt();
        double korvaus = laskeKorvaus(aika);
        System.out.println("Kestoltaan "+ aika +" minuutin yleisl‰‰k‰rik‰ynnist‰ kelakorvaus on "+f.format(korvaus)+" euroa");
    }
    
    private double laskeKorvaus(int kesto){
        double korvaus=0;
        if (kesto<=10){
        	
            korvaus=8.00;
            
        }else if (kesto<=20){
        	
            korvaus=11.00;
            
        }else if (kesto<=30){
        	
            korvaus=13.50;
        }
        
        return korvaus;
    }
    
    public static void main(String[] args) {
        new Laakarikorvaus();
    }

}