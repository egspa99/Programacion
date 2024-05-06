package InterfacesDIA;

import InterfacesDIA.Frescos.Frescos;

public abstract class TipoProductos implements Frescos {

	public String tipo;
	public double peso;
	public double ancho;
	public double alto;
	public double fondo;
	public String categoria;
	public String marca;

	public TipoProductos(String tipo, double peso, double ancho, double alto, double fondo, String categoria,
			String marca) {
		super();
		this.tipo = tipo;
		this.peso = peso;
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		this.categoria = categoria;
		this.marca = marca;
	}

	public void Carnes() {
		// TODO Auto-generated method stub

	}

}
