package KOE;
// Tomi Salin a1600563

class Opettaja {
	private String tunnus, etunimi, sukunimi;
	private double palkka;



public Opettaja(){
	tunnus="";
	etunimi="";
	sukunimi="";
	palkka=0;
	
}
public Opettaja(String tunnus, String etunimi, String sukunimi, double palkka){
	this.tunnus=tunnus;
	this.etunimi=etunimi;
	this.sukunimi=sukunimi;
	this.palkka=palkka;
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
@Override
public String toString() {
	return "Opettaja [tunnus=" + tunnus + ", etunimi=" + etunimi
			+ ", sukunimi=" + sukunimi + ", palkka=" + palkka + "]";
}

}
	
