package Ajedrez;

public class Caballo extends Pieza {

	public Caballo(Color color, int x, int y) {
		super(color, x, y);
	}

	@Override
	public boolean esMovimientoValido(int xDestino, int yDestino) {
		int dx = Math.abs(xDestino - x);
		int dy = Math.abs(yDestino - y);

		// Verifica si el movimiento forma una L: 2 en una dirección y 1 en otra
		return (dx == 1 && dy == 2) || (dx == 2 && dy == 1);
	}
}
