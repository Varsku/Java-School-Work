package ohjelmaluokat;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tietokanta.Dao;
import tietokanta.DaoOpettaja;
import kohdeluokat.Opettaja;
import kohdeluokat.Opintojakso;

public class OpettajaOhjelma {
	private Scanner input;
	
	
	public OpettajaOhjelma() {
		input = new Scanner(System.in);
	}
	
	public void aja () {
		int valinta=-1;

		do
		{
			System.out.println("\n1) hae kaikki opettajat");
			System.out.println("2) hae tietty opettaja");
			System.out.println("0) lopeta ");
			System.out.print("Valitse: ");
			valinta = lueValinta();

			switch (valinta)
			{
			case 0: break;
			case 1: haeOpettajat();
					break;
			case 2: haeOpettaja();
					break;
			default: System.out.println("Anna luku väliltä 0-2");
			}
		}while (valinta != 0);
	}
	private int lueValinta () {
		int valinta ;
		try {
			valinta = input.nextInt();
			
		}
		catch ( Exception e) {
			input.nextLine(); // syttöpuskuris tyhjäksi
			valinta = -1;
		}
		return valinta;
	}
	private void haeOpettajat() {
		List<Opettaja> lista;
		DaoOpettaja dao = new DaoOpettaja();

		try
		{
			lista = dao.haeOpettajat();

			if (lista != null)
			{
				System.out.println("\nOpettajat:");
				for (int i = 0;i <lista.size();i++)
					System.out.println("\n" + lista.get(i));
			}
			else
				System.out.println("Tietokannassa ei ole yhtään opettajaa");
		}
		catch (SQLException e )
		{
			System.out.println("Tietokantaan ei saada yhteyttä, korjaamme vian tuotapikaa");
		}
		catch (Exception e)
		{
			System.out.println("Ohjelmointi virhe");
		}

	}
	private void haeOpettaja() {
		String tunnus;
		Opettaja opettaja;

		System.out.print("Anna opettajan tunnus: ");
		tunnus = input.next();

		DaoOpettaja dao = new DaoOpettaja();
		try
		{
			opettaja = dao.haeOpettaja(tunnus);

			if (opettaja != null)
				System.out.println(opettaja);
			else
				System.out.println(tunnus + " opettajaa ei löytynyt");
		}
		catch (SQLException e)
		{
			System.out.println("Tietokantaan ei saada yhteyttä, korjaamme vian tuotapikaa");
		}
		catch (Exception e)
		{
			System.out.println("Ohjelmointi virhe!");
		}
	}

	public static void main(String[] args) {
		OpettajaOhjelma ohj = new OpettajaOhjelma();
		ohj.aja();
	}

}
