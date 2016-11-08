package Viikko4;

public class Posti {
private String postinro;
private String postitmp;

public Posti() {
	super(); //yliluokan oletumuodostimen kutsu
	postinro=postitmp=null;
}

public Posti(String postinro, String postitmp) {
	this.postinro = postinro;
	this.postitmp = postitmp;
}

public String getPostinro() {
	return postinro;
}

public void setPostinro(String postinro) {
	this.postinro = postinro;
}

public String getPostitmp() {
	return postitmp;
}

public void setPostitmp(String postitmp) {
	this.postitmp = postitmp;
}

@Override
public String toString() {
	return postinro+" "+postitmp;
}

}
