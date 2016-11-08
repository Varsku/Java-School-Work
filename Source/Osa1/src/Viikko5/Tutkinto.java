package Viikko5;

import java.text.SimpleDateFormat;
import java.util.Date;

class Tutkinto {
	private String tutkintoNimi, suuntaus;
	private int tavoiteVuosi;


public Tutkinto() {
	tutkintoNimi="";
	suuntaus="";
	tavoiteVuosi= 2016 + 3;	
}
public Tutkinto(String tutkintoNimi, String suuntaus, int tavoiteVuosi){
	this.tutkintoNimi= tutkintoNimi;
	this.suuntaus=suuntaus;
	this.tavoiteVuosi=tavoiteVuosi;
}
public String getTutkintoNimi() {
	return tutkintoNimi;
}
public void setTutkintoNimi(String tutkintoNimi) {
	this.tutkintoNimi = tutkintoNimi;
}
public String getSuuntaus() {
	return suuntaus;
}
public void setSuuntaus(String suuntaus) {
	this.suuntaus = suuntaus;
}
public int getTavoiteVuosi() {
	SimpleDateFormat fdate= new SimpleDateFormat("yyyy");
	int vuosi= Integer.parseInt(fdate.format(new Date()));
	return vuosi + 3;
}
public void setTavoiteVuosi(int tavoiteVuosi) {
	this.tavoiteVuosi = tavoiteVuosi;
}
@Override
public String toString() {
	return "Tutkinto [tutkintoNimi=" + tutkintoNimi + ", suuntaus=" + suuntaus
			+ ", tavoiteVuosi=" + tavoiteVuosi + "]";
}


}