package Superheroe;

public class Superheroe {

	public class Dimension {

	}

	private String nombre;
	private String descripcion;
	private boolean capa;
	
	public Superheroe(String nombre, String descripcion, boolean capa) {
		this.nombre=nombre;
		this.descripcion="";
		this.capa= false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean getCapa() {
		return capa;
	}

	public void setCapa(boolean capa) {
		this.capa = capa;
	}

	@Override
	public String toString() {
		return "El Superheroe" + nombre + descripcion + capa +" tiene capa";
	}
	
}
