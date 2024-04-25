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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public void acelerar(double cantidad){
		velocidad+=cantidad;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("Introduzca matricula vehiculo:");
		String matricula = sc.nextLine();
		

		System.out.println("Introduzca velocidad a la que circula:");
		double velocidad = sc.nextDouble();
		

		System.out.println("Introduzca numero de puertas del vehiculo:");
		int puertas = sc.nextInt();
		

		System.out.println(coche.toString());
	}

}
