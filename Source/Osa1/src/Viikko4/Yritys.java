package Viikko4;

public class Yritys {

	public static void main(String[] args) {
		Posti posti= new Posti("00670", "HELSINKI");
		
		Asiakas asiakas1= new Asiakas(1234567, "Martta","Lahtinen","Lainakaarentie 3", posti);
		Asiakas asiakas2= new Asiakas();
		asiakas2.setNumero(1234568);
		asiakas2.setEtunimi("Vilho");
		asiakas2.setSukunimi("Laaksonen");
		asiakas2.setKatuosoite("Vihtorintie 34");
		asiakas2.setPosti(posti);
		
		System.out.println(asiakas1.toString() +"\n\n" + asiakas2);

	}

}
