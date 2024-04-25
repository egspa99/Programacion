package Ejercicios;

import java.util.Scanner;

public class Vehiculos {

	static Scanner sc = new Scanner(System.in);

	private String matricula;
	private double velocidad;
	 
	public Vehiculos(String matricula) {
	    this.matricula = matricula;
	    this.velocidad = 0;
	}
	 
	public double getVelocidad() {
	    return velocidad;
	}
	 
	public void setVelocidad(double velocidad) {
	    this.velocidad = velocidad;
	}
	 
	public void acelerar(double cantidad) throws DemasiadoRapidoException {
	    velocidad += cantidad;
	}
	 
	public String toString() {
	    return "El vehículo con matrícula " + matricula + " va a velocidad de " + velocidad + "km/h";   
	}

}
