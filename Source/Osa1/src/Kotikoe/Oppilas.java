package Kotikoe;
//Tomi Salin a1600563
public class Oppilas {
	
	private String oppilasnro, etunimi, sukunimi, osoite;
	private Posti posti;
	
	
	public Oppilas(){
		oppilasnro="";
		etunimi="";
		sukunimi="";
		osoite="";
		posti= null;
	}
	
	public Oppilas(String oppilasnro, String etunimi, String sukunimi, String osoite, Posti posti){
		this.oppilasnro=oppilasnro;
		this.etunimi=etunimi;
		this.sukunimi=sukunimi;
		this.osoite=osoite;
		this.posti=posti;
	}

	public String getOppilasnro() {
		return oppilasnro;
	}

	public void setOppilasnro(String oppilasnro) {
		this.oppilasnro = oppilasnro;
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

	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}

	public Posti getPosti() {
		return posti;
	}

	public void setPosti(Posti posti) {
		this.posti = posti;
	}

	@Override
	public String toString() {
		return "Oppilas [oppilasnro=" + oppilasnro + ", etunimi=" + etunimi
				+ ", sukunimi=" + sukunimi + ", osoite=" + osoite + "]";
	}
	

}
