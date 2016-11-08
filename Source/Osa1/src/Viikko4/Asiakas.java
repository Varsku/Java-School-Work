package Viikko4;

public class Asiakas {
	private int numero;
	private String etunimi;
	private String sukunimi;
	private String katuosoite;
	private Posti posti; //yhteyssyhde Posti-olioon
	
	public Asiakas() {
	numero=0;
	etunimi= sukunimi= katuosoite= null;
	posti= null;
	}

	public Asiakas(int numero, String etunimi, String sukunimi,
		String katuosoite, Posti posti) {
		this.numero = numero;
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.katuosoite = katuosoite;
		this.posti = posti;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEtunimi() {
		return etunimi;
	}

	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}

	public String getSukunimi() {
		return sukunimi;
	}

	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}

	public String getKatuosoite() {
		return katuosoite;
	}

	public void setKatuosoite(String katuosoite) {
		this.katuosoite = katuosoite;
	}

	public Posti getPosti() {
		return posti;
	}

	public void setPosti(Posti posti) {
		this.posti = posti;
	}

	@Override
	public String toString() {
		return  numero + " "+ etunimi+" "+ sukunimi +
				"\n" + katuosoite + 
				"\n" +posti;
	}
	
	
}
