package ComposicionClases;

public class Dimension {

	private double alto;
	private double ancho;
	private double profundidad;
	private double volumen;
	
	public Dimension() {
		this.alto=0;
		this.ancho=0;
		this.profundidad=0;
		this.volumen=0;
	}
	
	public Dimension (double alto, double ancho, double profundidad) {
		this.alto=alto;
		this.ancho=ancho;
		this.profundidad=profundidad;
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

	public double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}
	
	public void setVolumen(double volumen) {
		this.volumen=volumen;
	}
	
	public double getVolumen() {		
		volumen = alto*ancho*profundidad;
		return volumen;
	}

	@Override
	public String toString() {
		return "Dimension [alto=" + alto + ", ancho=" + ancho + ", profundidad=" + profundidad + "volumen" + volumen ;
	}
	
}
