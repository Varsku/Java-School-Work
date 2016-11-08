package Viikko5;

class Opiskelija {
	
private String numero, nimi, kotikunta;
private Tutkinto tutkinto;

public Opiskelija(){
	numero="";
	nimi="";
	kotikunta="";
	tutkinto= new Tutkinto();
	
}
public Opiskelija(String numero, String nimi, String kotikunta, Tutkinto tutkinto){
	this.numero=numero;
	this.nimi=nimi;
	this.kotikunta= kotikunta;
	if(tutkinto != null){
		this.tutkinto.setTutkintoNimi(tutkinto.getTutkintoNimi());
		this.tutkinto.setSuuntaus(tutkinto.getSuuntaus());
		this.tutkinto.setTavoiteVuosi(tutkinto.getTavoiteVuosi());
	} else {
		tutkinto= new Tutkinto();
	}
}
public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public String getNimi() {
	return nimi;
}
public void setNimi(String nimi) {
	this.nimi = nimi;
}
public String getKotikunta() {
	return kotikunta;
}
public void setKotikunta(String kotikunta) {
	this.kotikunta = kotikunta;
}
public Tutkinto getTutkinto() {
	Tutkinto kopio= new Tutkinto(tutkinto.getTutkintoNimi(),
			tutkinto.getSuuntaus(), tutkinto.getTavoiteVuosi());
	return kopio;
}
public void setTutkinto(Tutkinto tutkinto) {
	if(tutkinto !=null){
		this.tutkinto.setSuuntaus(tutkinto.getSuuntaus());
		this.tutkinto.setTutkintoNimi(tutkinto.getTutkintoNimi());
		this.tutkinto.setTavoiteVuosi(tutkinto.getTavoiteVuosi());
	}
}
@Override
public String toString() {
	return "Opiskelija [numero=" + numero + ", nimi=" + nimi + ", kotikunta="
			+ kotikunta + ", tutkinto=" + tutkinto + "]";
}



}
