package kohdeluokat;

public class Asiakas {
	private int numero;
	private String etunimi, sukunimi, osoite, puhelin;
	private Posti posti;
	
	public Asiakas(){
		numero = 0;
		etunimi="";
		sukunimi="";
		osoite="";
		puhelin="";
		posti= null;
		
	}

	public Asiakas(int numero, String etunimi, String sukunimi, String osoite,
			String puhelin, Posti posti) {
		this.numero = numero;
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.osoite = osoite;
		this.puhelin = puhelin;
		this.posti=posti;
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

	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}

	public String getPuhelin() {
		return puhelin;
	}

	public void setPuhelin(String puhelin) {
		this.puhelin = puhelin;
	}
	

	public Posti getPosti() {
		return posti;
	}

	public void setPosti(Posti posti) {
		this.posti = posti;
	}

	@Override
	public String toString() {
		String paluu = "Asiakas [numero=" + numero + ", etunimi=" + etunimi
				+ ", sukunimi=" + sukunimi + ", osoite=" + osoite
				+ ", puhelin=" + puhelin + "]";
		if(posti != null)
			paluu +="\nPostitoimipaikka: " + posti.toString();
		return paluu;
	}
	
	
	
}
