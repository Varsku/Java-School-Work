package KOE;
// Tomi Salin a1600563

class Opintojakso {
	private String tunnus, nimi, laajuus;
	private Opettaja opettaja;
	
public Opintojakso(){
	tunnus="";
	nimi="";
	laajuus="";
	opettaja=null;
}
public Opintojakso(String tunnus, String nimi, String laajuus,  Opettaja opettaja){
	this.tunnus=tunnus;
	this.nimi=nimi;
	this.laajuus=laajuus;
	this.opettaja=opettaja;
}
public String getTunnus() {
	return tunnus;
}
public void setTunnus(String tunnus) {
	this.tunnus = tunnus;
}
public String getNimi() {
	return nimi;
}
public void setNimi(String nimi) {
	this.nimi = nimi;
}
public String getLaajuus() {
	return laajuus;
}
public void setLaajuus(String laajuus) {
	this.laajuus = laajuus;
}
public Opettaja getOpettaja() {
	return opettaja;
}
public void setOpettaja(Opettaja opettaja) {
	this.opettaja = opettaja;
}
@Override
public String toString() {
	return "Opintojakso [tunnus=" + tunnus + ", nimi=" + nimi + ", laajuus="
			+ laajuus + ", opettaja=" + opettaja + "]";
}

}
