package ClasesAbstractas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		TrabajoPintura n1 = new TrabajoPintura("Ernesto", LocalDate.of(2024, 05, 07), "ErnestoSA", 200, 10);
		TrabajoPintura n2 = new TrabajoPintura("Juan", LocalDate.of(2024, 04, 07), "NikeSA", 20, 15);
		TrabajoPintura n3 = new TrabajoPintura("Pablo", LocalDate.of(2024, 03, 07), "AdidasSA", 200, 10);
		TrabajoPintura n4 = new TrabajoPintura("Luis", LocalDate.of(2024, 02, 07), "JomaSA", 15, 10);
		TrabajoPintura n5 = new TrabajoPintura("Carmen", LocalDate.of(2024, 01, 07), "PumaSA", 1000, 12);
		
		
		System.out.println(n1.detalleServicio());
		
		RevisionAlarma ra1 = new RevisionAlarma(LocalDate.of(2024, 05, 07), "ErnestoSA", 100);
		RevisionAlarma ra2 = new RevisionAlarma(LocalDate.of(2024, 04, 07), "NikeSA", 10);
		RevisionAlarma ra3 = new RevisionAlarma(LocalDate.of(2024, 03, 07), "AdidasSA", 5);
		RevisionAlarma ra4 = new RevisionAlarma(LocalDate.of(2024, 02, 07), "JomaSA", 6);
		RevisionAlarma ra5 = new RevisionAlarma(LocalDate.of(2024, 01, 07), "PumaSA", 2);
		
		ArrayList<Servicio> trabajoPintura= new ArrayList<>();
		trabajoPintura.add(n1);
		trabajoPintura.add(n2);
		trabajoPintura.add(n3);
		trabajoPintura.add(n4);
		trabajoPintura.add(n5);
		
		ArrayList<Servicio> revisionAlarma= new ArrayList<>();
		revisionAlarma.add(ra1);
		revisionAlarma.add(ra2);
		revisionAlarma.add(ra3);
		revisionAlarma.add(ra4);
		revisionAlarma.add(ra5);
		
		double costeTotal=0;
		double costeManoObra=0;
		
		for(Servicio trabajo: trabajoPintura){
			
			costeTotal+= trabajo.costeTotal();
			costeManoObra+= trabajo.costeManoObra();
			
			System.out.println(trabajo.detalleServicio() + "\n\n");
		}
		
		
		System.out.println("Coste total" + costeTotal);
		System.out.println("Coste de la mano de obra" + costeManoObra);

	}

}
