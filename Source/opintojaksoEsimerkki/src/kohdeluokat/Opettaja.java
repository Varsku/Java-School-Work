package kohdeluokat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Opettaja {
	private String tunnus;
	private String etunimi;
	private String sukunimi;
	private double palkka;
	private String puhelin;
	private Date syntpvm; // tieto voi puuttua, toteutetaan vahvana koostumussuhteena
	
	public Opettaja() {
		super();
		tunnus = etunimi = sukunimi = puhelin = null;
		palkka = 0;
		syntpvm = null;
	}
	public Opettaja(String tunnus, String etunimi, String sukunimi,
			double palkka, String puhelin, Date syntpvm) {
		super();
		this.tunnus = tunnus;
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.palkka = palkka;
		this.puhelin = puhelin;
		this.syntpvm = null;
		if (syntpvm != null)
			this.syntpvm = (Date)syntpvm.clone();
	}
	public String getTunnus() {
		return tunnus;
	}
	public void setTunnus(String tunnus) {
		this.tunnus = tunnus;
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
	public double getPalkka() {
		return palkka;
	}
	public void setPalkka(double palkka) {
		this.palkka = palkka;
	}
	public String getPuhelin() {
		return puhelin;
	}
	public void setPuhelin(String puhelin) {
		this.puhelin = puhelin;
	}
	public Date getSyntpvm() { // palauta kopio alkuperaisesta syntpvm-oliosta
		Date pvm = null;
		if ( syntpvm != null)
			pvm = (Date) syntpvm.clone();
		return pvm;
	}
	public void setSyntpvm(Date syntpvm) {
		this.syntpvm = null;
		if (syntpvm != null)
			this.syntpvm = (Date) syntpvm.clone();
	}
	
	public String toString() {
		SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy");
		String paluu = "tunnus: " + tunnus + ", etunimi: " + etunimi
				+ ", sukunimi: " + sukunimi + ", palkka: " + palkka
				+ ", puhelin: " + puhelin ;
		if (syntpvm != null)
			paluu = paluu +", syntpvm: " + f.format(syntpvm);
		return paluu;
	}
	
	
	

}
