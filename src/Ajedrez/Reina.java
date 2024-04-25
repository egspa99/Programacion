package Ajedrez;

public class Reina extends Pieza {

	public Reina(Color color, int x, int y) {
		super(color, x, y);
	}

	@Override
	public boolean esMovimientoValido(int xDestino, int yDestino) {
		// Verifica si el movimiento es horizontal, vertical o diagonal
		return xDestino == x || yDestino == y || Math.abs(xDestino - x) == Math.abs(yDestino - y);
	}
}
