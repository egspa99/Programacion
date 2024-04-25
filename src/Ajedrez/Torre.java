package Ajedrez;

public class Torre extends Pieza {

    public Torre(Color color, int x, int y) {
        super(color, x, y);
    }

    @Override
    public boolean esMovimientoValido(int xDestino, int yDestino) {
        // Verifica si el movimiento es vertical u horizontal
        return xDestino == x || yDestino == y;
    }
}
