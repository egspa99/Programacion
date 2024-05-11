package Superheroes;

public class Dimension {
	
	private double alto;
	private double ancho;
	private double profundo;
	
	public Dimension(double alto, double ancho, double profundo) {
		super();
		this.alto = 0;
		this.ancho = 0;
		this.profundo = 0;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getProfundo() {
		return profundo;
	}

	public void setProfundo(double profundo) {
		this.profundo = profundo;
	}
	
	public double getVolumen() {
		return alto * ancho * profundo;
	}

	@Override
	public String toString() {
		return "Alto: " + alto + "Ancho: " + ancho + "Profundo: " + profundo + "Volumen: " + getVolumen();
	}
	
	
	

}
