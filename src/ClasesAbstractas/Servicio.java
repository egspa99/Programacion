package ClasesAbstractas;

import java.time.LocalDate;

public abstract class Servicio {
	
	protected String nombre;
	protected LocalDate fecha;
	protected String cliente;
	
	public Servicio(String nombre, LocalDate fecha, String cliente) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.cliente = cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public  abstract double costeMaterial();
	
	public abstract double costeManoObra();
	
	
	public  abstract double costeTotal();
	
	public  abstract String detalleServicio();

}
