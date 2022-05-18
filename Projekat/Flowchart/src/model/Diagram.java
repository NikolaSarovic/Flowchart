package model;

public class Diagram {

	String naziv;
	
	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Diagram(String naziv) {
		super();
		this.naziv = naziv;
	}
	
	@Override
	public String toString() {
		
		return naziv;
	}
}
