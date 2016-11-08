package Viikko5;

public class Tuote {
	//Tuote olion attribuutit
	private int numero;
	private String nimi;
	private double hinta;
	
	
	public Tuote(){
		numero=0;
		nimi= null;
		hinta=0;
	}
	public Tuote(int nro, String nimi, double hinta){
		numero=nro;
		this.nimi=nimi;
		this.hinta=hinta;
		
		
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public double getHinta() {
		return hinta;
	}
	public void setHinta(double hinta) {
		this.hinta = hinta;
	}
	@Override
	public String toString() {
		return "Tuote [numero=" + numero + ", nimi=" + nimi + ", hinta="
				+ hinta + "]";
	}
	
	
//palauttaa kopion parametristä
public static Tuote teeKopio(Tuote olio){
	Tuote kopio=null;
	if(olio != null) {
		kopio= new Tuote(olio.numero, olio.nimi, olio.hinta);
	}
	return kopio;
}
}


