package Viikko6;

import java.util.ArrayList;

public class Kalastaja {
	
	private String nimi;
	private ArrayList<Kala> kalat= new ArrayList<Kala>();
	
	public Kalastaja(){
		nimi=null;
		
	}
	
	public Kalastaja(String nimi, Kala kala){
		this.nimi=nimi;
		Kala uusiKala= new Kala(kala.getLaji(), kala.getPaino(), kala.getPituus());
		kalat.add(uusiKala);
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public ArrayList<Kala> getKalat() {
		return kalat;
	}

	@Override
	public String toString() {
		return "Kalastaja [nimi=" + nimi + ", kalat=" + kalat + "]";
	}
}
