package PracticaExcepciones;

import java.util.ArrayList;

public class Parking {
	 
    private final ArrayList<String> matriculas;
    private final String nombre;
    
    public Parking(String nombre, int plazas) {
        this.nombre = nombre;
        matriculas = new ArrayList<>();
        for(int i=0; i<plazas; i++) {
        	matriculas.add(null);
        }
    }

    public String getNombre() {
        return nombre;
    }
    
    
    public void entrada(String matricula, int plaza) throws ParkingException {
        
        if(matricula==null || matricula.length()<4) 
            throw new ParkingException("Matrícula incorrecta",matricula);
        
        if(matriculas.get(plaza)!=null)
            throw new ParkingException("Plaza ocupada",matricula);
        
        if(matriculas.contains(matricula))
            throw new ParkingException("Matrícula repetida",matricula);
        
        if(plaza >= matriculas.size() || plaza < 0)
            throw new ParkingException("Plaza inexistente",matricula);
        
        matriculas.set(plaza, matricula);
    }
    
    public int salida(String matricula) throws ParkingException {
        
        if(!matriculas.contains(matricula))
            throw new ParkingException("Matrícula no existente",matricula);
        
        int plaza = matriculas.indexOf(matricula);
        matriculas.set(plaza, null);
        return plaza;
    }
    
    
    public int getPlazasTotales() {
        return matriculas.size();
    }
    
    public int getPlazasOcupadas() {
        return getPlazasTotales() - getPlazasLibres();
    }
    
    public int getPlazasLibres() {
    	int plaza=0;
    	for(int i=0; i<matriculas.size(); i++) {
    		if(matriculas.get(i)==null) {
    			plaza++;
    		}
    	}
    	return plaza;
    }

    
    @Override
    public String toString() {
        
        String cadena = "Parking "+nombre+"\n";
        cadena += "-------------------\n";
        for(int i=0;i<matriculas.size();i++) {
            cadena += "Plaza "+i+": ";
            cadena += (matriculas.get(i)==null) ? "(vacía)" : matriculas.get(i);
            cadena += "\n";
        }
        cadena += "-------------------\n";
        
        return cadena;
    }
}
