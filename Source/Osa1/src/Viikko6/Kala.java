package Viikko6;

class Kala {
	
	private String laji;
	private double paino;
	private double pituus;
	
	public Kala(){
		laji=null;
		paino=0;
		pituus=0;
	}
	
	public Kala(String laji, double paino, double pituus){
		this.laji=laji;
		this.paino=paino;
		this.pituus=pituus;	
	}

	public String getLaji() {
		return laji;
	}

	public void setLaji(String laji) {
		this.laji = laji;
	}

	public double getPaino() {
		return paino;
	}

	public void setPaino(double paino) {
		this.paino = paino;
	}

	public double getPituus() {
		return pituus;
	}

	public void setPituus(double pituus) {
		this.pituus = pituus;
	}

	@Override
	public String toString() {
		return laji + " " + paino + "kg" + " " + pituus +"cm"
				;
	}
	

}
