package Ajedrez;

public class Peon extends Pieza {
	private boolean primerMovimiento; // Para llevar registro del primer movimiento del peón

	public Peon(Color color, int x, int y) {
		super(color, x, y);
		this.color = color;
		this.x = x;
		this.y = y;
		this.primerMovimiento = true;
	}

	@Override
	public boolean esMovimientoValido(int xDestino, int yDestino) {
		int direccionMovimiento = (color == Color.BLANCO) ? 1 : -1;

		// Movimiento válido para adelante
		if (xDestino == x && yDestino == y + direccionMovimiento) {
			return true;
		}

		// Movimiento válido para adelante en el primer movimiento
		if (primerMovimiento && xDestino == x && yDestino == y + 2 * direccionMovimiento) {
			return true;
		}

		// Captura diagonal
		if (Math.abs(xDestino - x) == 1 && yDestino == y + direccionMovimiento) {
			// Aquí verificarías si hay una pieza del oponente en la casilla destino
			return true;
		}

		return false;
	}

	// Otros métodos si es necesario
}
