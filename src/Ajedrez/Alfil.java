package Ajedrez;

public class Alfil extends Pieza {

	public Alfil(Color color, int x, int y) {
		super(color, x, y);
	}

	@Override
	public boolean esMovimientoValido(int xDestino, int yDestino) {
		// Verifica si el movimiento es diagonal
		return Math.abs(xDestino - x) == Math.abs(yDestino - y);
	}
}
