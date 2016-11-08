package kohdeluokat;

public class Posti {
	String postinro, postitmp;
	public Posti (){
		postinro ="";
		postitmp ="";
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
		return  postinro + " " + postitmp;
	}
	
}


