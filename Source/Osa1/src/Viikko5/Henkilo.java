package Viikko5;


class Henkilo {
	
private String nimi, osoite;
private Auto auto;
private Koko koko;


public Henkilo(){
	nimi=null;
	osoite=null;
	auto=null;
	koko=new Koko();
}

public Henkilo(String nimi, String osoite, Auto auto, Koko koko){	
this.nimi=nimi;
this.osoite=osoite;
this.auto=auto;
this.koko= new Koko();

}
public Henkilo(String nimi, String osoite, Koko koko){
	this.nimi=nimi;
	this.osoite=osoite;
	this.koko= new Koko();
	if( koko != null){
		this.koko.setPaino(koko.getPaino());
		this.koko.setPituus(koko.getPituus());
	} else {
		koko= new Koko();
	}
}

public String getNimi() {
	return nimi;
}
public void setNimi(String nimi) {
	this.nimi = nimi;
}
public String getOsoite() {
	return osoite;
}
public void setOsoite(String osoite) {
	this.osoite = osoite;
}

public Auto getAuto() {
	return auto;
}
public void setAuto(Auto auto) {
	this.auto = auto;
}

public Koko getKoko() {
	Koko kopio= new Koko(koko.getPituus(), koko.getPaino());
	return kopio;
}

public void setKoko(Koko koko) {
	if (koko != null) {
		this.koko.setPaino(koko.getPaino());
		this.koko.setPituus(koko.getPituus());
	}
	this.koko = koko;
}

@Override
public String toString() {
	return "Henkilo [nimi=" + nimi + ", osoite=" + osoite + ", auto=" + auto
			+ ", koko=" + koko.toString() + "]";
}


}









