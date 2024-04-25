package Ajedrez;

public class Rey extends Pieza {

	public Rey(Color color, int x, int y) {
		super(color, x, y);
	}

	@Override
	public boolean esMovimientoValido(int xDestino, int yDestino) {
		// Verifica si el movimiento es horizontal, vertical o diagonal y no excede una
		// casilla
		return Math.abs(xDestino - x) <= 1 && Math.abs(yDestino - y) <= 1;
	}
}
