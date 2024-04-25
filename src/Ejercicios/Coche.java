package Ejercicios;

public class Coche {

	String matricula;
	double velocidad;
	int puertas;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		return "Esto es un coche con matricula=" + matricula + ", que circula a "
				+ "una velocidad de " + velocidad + "km/h , y es de " + puertas + "puertas.";
	}
	
	

}
