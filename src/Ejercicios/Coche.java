package Ejercicios;

public class Coche extends Vehiculos{

	private int numeroPuertas;
	 
	public Coche(String matricula, int numPuertas) {
	    super(matricula);
	    numeroPuertas = numPuertas;
	}
	 
	public int totalPuertas() {
	    return numeroPuertas;
	}
	

}
