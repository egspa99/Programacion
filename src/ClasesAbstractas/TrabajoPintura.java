package ClasesAbstractas;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio{
	
	protected double superficie;
	protected double precioPintura;


	public TrabajoPintura(String nombre, LocalDate fecha, String cliente, double superficie, double precioPintura) {
		super(nombre, fecha, cliente);
		this.superficie=superficie;
		this.precioPintura=precioPintura;
	}

	@Override
	public double costeMaterial() {
		
		return (superficie/7.8) * precioPintura;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	
	private double costeAdicional() {
		if(superficie>50) {
			return(costeMaterial()+costeManoObra())*0.15;
		}
		else {
			return 0;
		}
	}

	public double getCostePintura() {
		return precioPintura;
	}

	public void setPrecioPintura(double precioPintura) {
		this.precioPintura = precioPintura;
	}

	@Override
	public double costeManoObra() {
		return (superficie/10) * 9.5;
		
	}

	@Override
	public double costeTotal() {
		
		return costeMaterial() + costeManoObra() + costeAdicional();
	}

	@Override
	public String detalleServicio() {
		
		String cadena = "";
		
		cadena += "TRABAJO DE PINTURA\n";
		cadena += "Cliente: " +cliente+ "\n";
		cadena += "Fecha de Inicio: " + fecha + "\n";
		cadena +="--------\n";
		cadena +="Pintor: " + nombre + "\n";
		cadena += "Coste Material: " + costeMaterial()+ "\n";
		cadena +="Coste Mano de Obra: "+ costeManoObra()+ "\n";
		cadena +="Coste Adicional: " + costeAdicional()+ "\n";
		cadena +="Coste Total: "+ costeTotal()+ "\n";
		cadena +="--------\n";
		return cadena;
		
	}

}
