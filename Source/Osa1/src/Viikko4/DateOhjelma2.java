package Viikko4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class DateOhjelma2 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		Date tanaan = new Date();
		SimpleDateFormat fdate = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("T‰n‰‰n on " + fdate.format(tanaan));
		SimpleDateFormat fclock = new SimpleDateFormat("H");
		String h = fclock.format(tanaan);
		int kello = Integer.parseInt(h);
		if (kello < 12) {
			System.out.println("On aamup‰iv‰");
		} else {
			System.out.println("On iltap‰iv‰");
		}
		
		int syntymaVuosi;

		System.out.print("Anna syntym‰vuotesi: ");
		syntymaVuosi = input.nextInt();

		SimpleDateFormat fvuosi = new SimpleDateFormat("yyyy");
		String vuosiTanaan = fvuosi.format(tanaan);
		int vuosi = Integer.parseInt(vuosiTanaan);

		System.out.println("T‰yt‰t/olet t‰ytt‰nyt t‰n‰ vuonna "
				+ (vuosi - syntymaVuosi));

		System.out.println("Anna p‰iv‰m‰‰r‰ muodossa pp/kk/vvvv");
		String pvm = input.next();

		String string = pvm;
		DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		Date paluu = null;
		try {
			paluu = f.parse(string);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println(paluu);

	}
}