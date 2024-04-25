package Ajedrez;

import java.util.Scanner;

public class JuegoAjedrez {

	public static void main(String[] args) {
		Tablero tablero = new Tablero();
		Scanner scanner = new Scanner(System.in);
		Color turno = Color.BLANCO; // Comienza el juego con las blancas

		while (!esFinDePartida(tablero)) {
			System.out.println("Turno de las " + (turno == Color.BLANCO ? "blancas" : "negras"));
			tablero.mostrarTablero();

			// Solicitar entrada del movimiento al jugador
			System.out.print("Ingrese coordenadas de origen (fila columna): ");
			int xOrigen = scanner.nextInt();
			int yOrigen = scanner.nextInt();

			System.out.print("Ingrese coordenadas de destino (fila columna): ");
			int xDestino = scanner.nextInt();
			int yDestino = scanner.nextInt();

			
		}

		System.out.println("Fin de la partida.");
	}

	private static boolean esFinDePartida(Tablero tablero) {
		// Aquí puedes implementar la lógica para detectar si hay un jaque mate o un
		// empate por reglas especiales
		return false;
	}
}
