package Ajedrez;

public abstract class Pieza {
	protected Color color;
	protected int x;
	protected int y;

	public Pieza(Color color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;
	}

	public abstract boolean esMovimientoValido(int xDestino, int yDestino);

	// Getters y setters para los atributos color, x, y

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
