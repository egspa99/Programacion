package Ajedrez;

public class Tablero {
	private Pieza[][] casillas;

	public Tablero() {
		// Inicializar el tablero con las piezas en su posición inicial
		casillas = new Pieza[8][8];
		inicializarTablero();
	}

	private void inicializarTablero() {
		// Inicializar las piezas en sus posiciones iniciales

		// Peones
		for (int i = 0; i < 8; i++) {
			casillas[1][i] = new Peon(Color.BLANCO, 1, i);
			casillas[6][i] = new Peon(Color.NEGRO, 6, i);
		}

		// Torres
		casillas[0][0] = new Torre(Color.BLANCO, 0, 0);
		casillas[0][7] = new Torre(Color.BLANCO, 0, 7);
		casillas[7][0] = new Torre(Color.NEGRO, 7, 0);
		casillas[7][7] = new Torre(Color.NEGRO, 7, 7);

		// Caballos
		casillas[0][1] = new Caballo(Color.BLANCO, 0, 1);
		casillas[0][6] = new Caballo(Color.BLANCO, 0, 6);
		casillas[7][1] = new Caballo(Color.NEGRO, 7, 1);
		casillas[7][6] = new Caballo(Color.NEGRO, 7, 6);

		// Alfiles
		casillas[0][2] = new Alfil(Color.BLANCO, 0, 2);
		casillas[0][5] = new Alfil(Color.BLANCO, 0, 5);
		casillas[7][2] = new Alfil(Color.NEGRO, 7, 2);
		casillas[7][5] = new Alfil(Color.NEGRO, 7, 5);

		// Reinas
		casillas[0][3] = new Reina(Color.BLANCO, 0, 3);
		casillas[7][3] = new Reina(Color.NEGRO, 7, 3);

		// Reyes
		casillas[0][4] = new Rey(Color.BLANCO, 0, 4);
		casillas[7][4] = new Rey(Color.NEGRO, 7, 4);
	}

	// Métodos para acceder y modificar las piezas en el tablero
	public Pieza getPieza(int x, int y) {
		return casillas[x][y];
	}

	public void setPieza(int x, int y, Pieza pieza) {
		casillas[x][y] = pieza;
	}
	
	 public void mostrarTablero() {
	        System.out.println("  a b c d e f g h");
	        for (int i = 0; i < 8; i++) {
	            System.out.print(8 - i + " ");
	            for (int j = 0; j < 8; j++) {
	                Pieza pieza = casillas[i][j];
	                if (pieza == null) {
	                    System.out.print("- ");
	                } else {
	                    System.out.print(pieza.getClass().getSimpleName().charAt(0) + " ");
	                }
	            }
	            System.out.println(8 - i);
	        }
	        System.out.println("  a b c d e f g h");
	    }
}
