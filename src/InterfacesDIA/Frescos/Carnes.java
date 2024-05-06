package InterfacesDIA.Frescos;

import InterfacesDIA.TipoProductos;

public class Carnes extends TipoProductos implements Frescos {

	public Carnes(String tipo, double peso, double ancho, double alto, double fondo, String categoria, String marca) {
		super(tipo, peso, ancho, alto, fondo, categoria, marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Carnes() {
		// TODO Auto-generated constructor stub
		String tipo;
		double cantidad;
		double precio;
	}

	@Override
	public String caducar() {
		// TODO Auto-generated method stub
		return "producto caducado";
	}

	@Override
	public String neveraAbierta() {
		return "Es de nevera cerrada";
	}

}
