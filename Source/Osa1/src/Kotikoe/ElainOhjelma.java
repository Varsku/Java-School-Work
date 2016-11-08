package Kotikoe;
//Tomi Salin a1600563
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElainOhjelma {

	private Scanner input;
	List<Elain> elaimet = new ArrayList<Elain>();

	public void aja() {
		input = new Scanner(System.in);
		int valinta = -1;
		do {
			System.out.println("1) Lis‰‰ el‰in");
			System.out.println("2) Poista el‰in");
			System.out.println("3) Etsi el‰imet");
			System.out.println("4) Tulosta el‰imet");
			System.out.println("0) Lopeta");

			System.out.print("Valitse: ");
			valinta = input.nextInt();

			switch (valinta) {
			case 1:
				lisaaElain();
				break;
			case 2:
				poistaElain();
				break;
			case 3:
				etsiElaimet();
				break;
			case 4:
				tulostaElaimet();
				break;
			}
		} while (valinta != 0);
	}

	public void lisaaElain() {
		input = new Scanner(System.in);
		Elain elain = new Elain();
		System.out.print("Anna el‰imen nimi: ");
		elain.setNimi(input.nextLine());
		System.out.print("Anna el‰imen laji: ");
		elain.setLaji(input.nextLine());
		System.out.print("Anna el‰imen syntym‰vuosi: ");
		elain.setsVuosi(input.nextInt());
		input.nextLine();
		elaimet.add(elain);
	}

	
	public void poistaElain() {
		input=new Scanner(System.in);
		String nimi;
		int i=0;
		System.out.println("Anna poistettavan el‰imen nimi: ");
		nimi=input.nextLine();
		while(i<elaimet.size()){
			if(nimi.equals(elaimet.get(i).getNimi())){
				elaimet.remove(i);
			}else{
				System.out.println("Ei el‰imi‰ listalla");
				i++;
			}
		}
		 
		
	
	}
	public void etsiElaimet() {
		input = new Scanner(System.in);
		String loytyy;

		if (elaimet.size() > 0) {
			System.out.print("Anna etsitt‰v‰n el‰imen laji: ");
			loytyy = input.nextLine();
			for (int i = 0; i < elaimet.size(); i++) {
				if (loytyy.equals(elaimet.get(i).getLaji())) {
					System.out.println(elaimet.get(i).toString() + "\n");
				}
			}
		} else {
			System.out.println("Listalla ei ole yht‰‰n el‰int‰");
		}
	}

	public void tulostaElaimet() {
		if (elaimet.size() > 0) {
			for (int i = 0; i < elaimet.size(); i++) {
				System.out.println(elaimet.get(i).toString());
			}
		} else {
			System.out.println("Listalla ei ole el‰imi‰!");
		}

	}

	public static void main(String[] args) {

		ElainOhjelma ohj = new ElainOhjelma();
		ohj.aja();
	}

}
