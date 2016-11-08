package Viikko6;

public class Opintojakso {

	private String tunnus, nimi;
	private int laajuus;
	
	public Opintojakso() {
		
		tunnus="";
		nimi="";
		laajuus=0;
		
	}
	public Opintojakso(String tunnus, String nimi, int laajuus){
		this.tunnus=tunnus;
		this.nimi=nimi;
		this.laajuus=laajuus;
		
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
	public int getLaajuus() {
		return laajuus;
	}
	public void setLaajuus(int laajuus) {
		this.laajuus = laajuus;
	}
	@Override
	public String toString() {
		return "Opintojakso [tunnus=" + tunnus + ", nimi=" + nimi
				+ ", laajuus=" + laajuus + "]";
	}
	
}
