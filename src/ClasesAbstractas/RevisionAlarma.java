package ClasesAbstractas;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio {

	protected int numAlarmas;

	public RevisionAlarma(LocalDate fecha, String cliente, int numAlarmas) {
		super("Revisor epecializado contra Incendios", fecha, cliente);

		this.numAlarmas = numAlarmas;
	}

	public int getNumAlarmas() {
		return numAlarmas;
	}

	public void setNumAlarmas(int numAlarmas) {
		this.numAlarmas = numAlarmas;
	}

	@Override
	public double costeMaterial() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double costeManoObra() {
		return (numAlarmas / 3) * 40;
	}

	@Override
	public double costeTotal() {
		return costeManoObra();
	}

	@Override
	public String detalleServicio() {
		String cadena = "";

		cadena += "Revision de Alarmas\n";
		cadena += "Cliente: " + cliente + "\n";
		cadena += "Fecha de Inicio: " + fecha + "\n";
		cadena += "--------\n";
		cadena += "Realizado por: " + nombre + "\n";
		cadena += "Coste Material: " + costeMaterial() + "\n";
		cadena += "Coste Mano de Obra: " + costeManoObra() + "\n";
		cadena += "Coste Total: " + costeTotal() + "\n";
		cadena += "--------\n";
		return cadena;
	}

}
