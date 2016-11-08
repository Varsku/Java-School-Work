package Viikko4;

public class Koko {
	
private double pituus, painoindex;
private int paino;

public Koko(){
	pituus=0;
	paino=0;
	painoindex=0;
}
public Koko(double pituus, int paino){
	this.pituus=pituus;
	this.paino=paino;
}
public double getPituus() {
	return pituus;
}
public void setPituus(double pituus) {
	this.pituus = pituus;
}
public int getPaino() {
	return paino;
}
public void setPaino(int paino) {
	this.paino = paino;
}
public double getPainoindex() {
	painoindex= paino/(pituus*pituus);
	return painoindex;
}
@Override
public String toString() {
	return "Koko [pituus=" + pituus + ", paino=" + paino + "]";
}
}