package Kotikoe;
// Tomi Salin a1600563
public class Elain {
	private String nimi, laji;
	private int sVuosi;
	
	public Elain(){
		nimi="";
		laji="";
		sVuosi=0;
	}
public Elain(String nimi, String laji, int sVuosi){
	this.nimi=nimi;
	this.laji=laji;
	this.sVuosi=sVuosi;
}
public String getNimi() {
	return nimi;
}
public void setNimi(String nimi) {
	this.nimi = nimi;
}
public String getLaji() {
	return laji;
}
public void setLaji(String laji) {
	this.laji = laji;
}
public int getsVuosi() {
	return sVuosi;
}
public void setsVuosi(int sVuosi) {
	this.sVuosi = sVuosi;
}
@Override
public String toString() {
	return "Elain [nimi=" + nimi + ", laji=" + laji + ", sVuosi=" + sVuosi
			+ "]";
}

}
