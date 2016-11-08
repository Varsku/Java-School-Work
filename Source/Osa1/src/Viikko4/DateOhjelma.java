package Viikko4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateOhjelma {
	private Scanner input;
	
	public DateOhjelma(){
		input= new Scanner(System.in);
	}
	public void aja(){
		Date pvm;
		pvm=pyydaDate();
		tulostaDate(pvm);
	}
	private void tulostaDate(Date pvm){
		SimpleDateFormat f=new SimpleDateFormat("dd.MM.yyyy");
		if(pvm != null){
			System.out.println( pvm.toString() +"\n"+f.format(pvm));
		}
	}
private Date pyydaDate(){
	String pvm;
	Date paluu =null;
	SimpleDateFormat f=new SimpleDateFormat("d.M.yyyy");
	do {
	System.out.print("Anna syntym‰p‰iv‰ muodossa pp.kk.vvv: ");
	pvm= input.next();
	
	try{
		paluu=f.parse(pvm); //muuta string Date-olioksi
		//onnistui
		System.out.println("Kiitos!");
		
	} catch(ParseException e) {
		System.out.println("Pyydet‰‰n muotoa pp.kk.vvvv");
		paluu= null;
	}
	}while (paluu == null);
	return paluu;
}
	
	
	public static void main(String[] args) {
		DateOhjelma ohj = new DateOhjelma();
		ohj.aja();

	}

}
