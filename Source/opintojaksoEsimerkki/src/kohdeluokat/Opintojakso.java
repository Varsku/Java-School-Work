package kohdeluokat;
public class Opintojakso {
	private String tunnus;
	private String nimi;
	private int opintopisteet;
	private Opettaja vastuuopettaja; // yhteyssuhde
	
	public Opintojakso()
	{
		tunnus = nimi = null;
		opintopisteet = 0;
		vastuuopettaja = null;
	}
	public Opintojakso (String tunnus, String nimi, int pisteet)
	{
		this.tunnus= tunnus;
		this.nimi = nimi;
		opintopisteet = pisteet;
		vastuuopettaja = null;
	}
	public Opintojakso (String tunnus, String nimi, int pisteet, Opettaja ope)
	{
		this.tunnus= tunnus;
		this.nimi = nimi;
		opintopisteet = pisteet;
		vastuuopettaja = ope;
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
	public int getOpintopisteet() {
		return opintopisteet;
	}
	public void setOpintopisteet(int opintopisteet) {
		this.opintopisteet = opintopisteet;
	}
	
	public Opettaja getVastuuopettaja() {
		return vastuuopettaja;
	}
	public void setVastuuopettaja(Opettaja vastuuopettaja) {
		this.vastuuopettaja = vastuuopettaja;
	}
	public String toString ()
	{
		String paluu = "Opintojakso: tunnus: " +  tunnus+ ", nimi: " + nimi + ", laajuus: " + opintopisteet + " op";
		if (vastuuopettaja != null)
			paluu = paluu + "\nvastuuopettaja: " + vastuuopettaja.toString();
		return paluu;
	}
}


