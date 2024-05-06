package Polimorfismo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
	
	 public static void main(String[] args) {
	        
	        Detergente det1 = new Detergente("Cristasol",1.25);
	        det1.setVolumen(33);
	        det1.setDescuento(2);
	        det1.setTipoEnvase("Botella de plastico");
	        
	        System.out.println(det1);
	        
	        Cereales cer1 = new Cereales("Chococrispy","CerealDeDioses",2.75);
	        cer1.setCaducidad(LocalDate.of(2022, 8, 2));
	        System.out.println("Calorías: "+cer1.getCalorias());
	        
	        System.out.println(cer1);
	        
	        Vino vin1 = new Vino("Ramon Bilbao","tinto", 9,8);
	        vin1.setVolumen(330);
	        vin1.setTipoEnvase("Botella cristal");
	        vin1.setCaducidad(LocalDate.of(2023, 7, 12));
	        vin1.setDescuento(5);
	        
	        System.out.println(vin1);
	        
	        
	        ArrayList<EsAlimento> lista = new ArrayList<>();
	        lista.add(vin1);
	        lista.add(cer1);
	        
	        int totalcalorias = 0;
	        for(EsAlimento alimento: lista) {
	            totalcalorias += alimento.getCalorias();
	        }
	        
	        System.out.println("Total calorias: "+totalcalorias);
	        
	        
	        
	        
	    }

}
