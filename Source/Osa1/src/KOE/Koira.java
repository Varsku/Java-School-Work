package KOE;
// Tomi Salin a1600563

class Koira {
	
	private String nimi, rotu;
	private int sVuosi;
	
	public Koira(){
		nimi="";
		rotu="";
		sVuosi=0;
	}
	public Koira(String nimi, String rotu, int sVuosi){
		
		this.nimi=nimi;
		this.rotu=rotu;
		this.sVuosi=sVuosi;
	}
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public String getRotu() {
		return rotu;
	}
	public void setRotu(String rotu) {
		this.rotu = rotu;
	}
	public int getsVuosi() {
		return sVuosi;
	}
	public void setsVuosi(int sVuosi) {
		this.sVuosi = sVuosi;
	}
	@Override
	public String toString() {
		return "Koira [nimi=" + nimi + ", rotu=" + rotu + ", sVuosi=" + sVuosi
				+ "]";
	}

}
