package Viikko6;

import java.util.ArrayList;
import java.util.List;


class Auto {
	
	private String malli, merkki, reknro, vMalli;
	private List<Lisavaruste> lisavarusteet;
	
	public Auto() {
		malli="";
		merkki="";
		reknro="";
		vMalli="";
		lisavarusteet= new ArrayList<Lisavaruste>();
	}
	
	public Auto(String malli,String merkki,String reknro, String vMalli){
		this.malli= malli;
		this.merkki=merkki;
		this.reknro=reknro;
		this.vMalli= vMalli;
		lisavarusteet= new ArrayList<Lisavaruste>();
	}

	
	
	public String getMalli() {
		return malli;
	}
	public void setMalli(String malli) {
		this.malli = malli;
	}
	public String getMerkki() {
		return merkki;
	}
	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}
	public String getReknro() {
		return reknro;
	}
	public void setReknro(String reknro) {
		this.reknro = reknro;
	}
	public String getvMalli() {
		return vMalli;
	}
	public void setvMalli(String vMalli) {
		this.vMalli = vMalli;
	}
	
	public List<Lisavaruste> getLisavarusteet() {
		return lisavarusteet;
	}
	public String getLisavaruste() {
		   String varusteet = "";
		    for (int i = 0; i < lisavarusteet.size(); i++){
		        if (i < lisavarusteet.size() - 1)
		            varusteet = varusteet + lisavarusteet.get(i).toString() + " ";
		        else
		            varusteet = varusteet + lisavarusteet.get(i).toString();
		    }
		    return (varusteet);
		} 
	
	public void addLisavaruste(Lisavaruste lisavaruste) {
		if(lisavaruste!= null){
			lisavarusteet.add(lisavaruste);
		}
		
	}
	public Lisavaruste getLisavaruste(int i) {
		Lisavaruste lisa = null;
		if ( i >= 0 && i< lisavarusteet.size())
			lisa = lisavarusteet.get(i);
		return lisa;
	}

	@Override
	public String toString() {
		return "Merkki ja malli: " + merkki +" " + malli +"\nRekisterinumero: " + reknro +"\nVuosimalli: "
				+ vMalli +"\nLisävarusteet: "+getLisavaruste()+""  ;
				
	}

}