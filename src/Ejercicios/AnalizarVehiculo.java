package Ejercicios;

import java.util.Scanner;

public class AnalizarVehiculo {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculos vehiculo = new Coche("5698FST", 4);
		((Coche)vehiculo).totalPuertas();
		
		System.out.println("Introduzca el número de matricula");
		String matricula = sc.nextLine();
		
		System.out.println("Introduzca la velocidad a la que va a circular:");
		double velocidad = sc.nextInt();
		
		System.out.println("Introduzca cuantos km/h aumentamos la velocidad:");
		double acelerar = sc.nextDouble();
		
		
		
	}

}
