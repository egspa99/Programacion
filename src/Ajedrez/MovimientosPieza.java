package Ajedrez;


public class MovimientosPieza {

	public static boolean validarMovimiento(Pieza pieza, int xDestino, int yDestino, Pieza[][] tablero) {
		if (!esCoordenadaValida(xDestino, yDestino)) {
			return false;
		}

		// Verificar si la casilla destino está ocupada por una pieza del mismo color
		Pieza piezaDestino = tablero[xDestino][yDestino];
		if (piezaDestino != null && piezaDestino.getColor() == pieza.getColor()) {
			return false;
		}

		return pieza.esMovimientoValido(xDestino, yDestino);
	}

	private static boolean esCoordenadaValida(int x, int y) {
		return x >= 0 && x < 8 && y >= 0 && y < 8;
	}
}
