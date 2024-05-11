package Colecciones.Ejercicio1Colecciones;

public class Producto {
	 private String nombre;
	    private double cantidad;
	    private String unidad;

	    public Producto(String nombre, double cantidad, String unidad) {
	        this.nombre = nombre;
	        this.cantidad = cantidad;
	        this.unidad = unidad;
	    }

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double getCantidad() {
			return cantidad;
		}

		public void setCantidad(double cantidad) {
			this.cantidad = cantidad;
		}

		public String getUnidad() {
			return unidad;
		}

		public void setUnidad(String unidad) {
			this.unidad = unidad;
		}

		@Override
		public String toString() {
			return nombre + " " + cantidad + " " + unidad;
		}

}
