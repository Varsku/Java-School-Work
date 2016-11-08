package Viikko5;

class Auto {
	
	private String malli, merkki, reknro, vMalli;
	
	
	public Auto() {
		malli="";
		merkki="";
		reknro="";
		vMalli="";
	}
	
	public Auto(String malli,String merkki,String reknro, String vMalli){
		this.malli= malli;
		this.merkki=merkki;
		this.reknro=reknro;
		this.vMalli= vMalli;
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
	@Override
	public String toString() {
		return "Auto [malli=" + malli + ", merkki=" + merkki + ", reknro="
				+ reknro + ", vMalli=" + vMalli + "]";
	}

}
