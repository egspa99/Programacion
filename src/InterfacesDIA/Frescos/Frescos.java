package InterfacesDIA.Frescos;

import javax.swing.DefaultRowSorter;

import InterfacesDIA.TipoProductosException;

public interface Frescos {

		double temperaturaMin=0;
		double temperaturaMax=15;
		
	
		public String caducar();
		public String neveraAbierta();
		
		public default double temperatura() {
			if(temperatura() > temperaturaMax | temperatura() < temperaturaMin) {
				throw new TipoProductosException("Temperatura fuera de rango", temperatura);
			}
		}
	
}