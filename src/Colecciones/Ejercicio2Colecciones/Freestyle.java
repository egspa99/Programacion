package Colecciones.Ejercicio2Colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Freestyle {
	
	private Map<String, Map<String, Double>> evaluaciones;

    public Freestyle() {
        evaluaciones = new HashMap<>();
    }

    public void agregarEvaluacion(String juez, String artista, String aspecto, double puntaje) {
        evaluaciones.computeIfAbsent(artista, k -> new HashMap<>())
                .put(aspecto + " - " + juez, puntaje);
    }

    public List<Double> obtenerNotasArtista(String artista) {
        List<Double> notas = new ArrayList<>();
        Map<String, Double> evaluacionesArtista = evaluaciones.get(artista);
        if (evaluacionesArtista != null) {
            for (Double puntaje : evaluacionesArtista.values()) {
                notas.add(puntaje);
            }
        }
        return notas;
    }

    public double calcularMediaNotasArtista(String artista) {
        List<Double> notas = obtenerNotasArtista(artista);
        if (notas.isEmpty()) {
            return 0.0;
        }
        double suma = 0.0;
        for (Double puntaje : notas) {
            suma += puntaje;
        }
        return suma / notas.size();
    }

    public List<Double> obtenerNotasJuez(String juez) {
        List<Double> notas = new ArrayList<>();
        for (Map<String, Double> evaluacionesArtista : evaluaciones.values()) {
            for (Map.Entry<String, Double> entry : evaluacionesArtista.entrySet()) {
                String clave = entry.getKey();
                if (clave.endsWith(" - " + juez)) {
                    notas.add(entry.getValue());
                }
            }
        }
        return notas;
    }

    public String obtenerMejorArtistaEnAspecto(String aspecto) {
        String mejorArtista = null;
        double mejorPuntaje = Double.MIN_VALUE;
        for (Map.Entry<String, Map<String, Double>> entry : evaluaciones.entrySet()) {
            String artista = entry.getKey();
            Map<String, Double> evaluacionesArtista = entry.getValue();
            for (Map.Entry<String, Double> evaluacion : evaluacionesArtista.entrySet()) {
                String clave = evaluacion.getKey();
                if (clave.startsWith(aspecto)) {
                    double puntaje = evaluacion.getValue();
                    if (puntaje > mejorPuntaje) {
                        mejorPuntaje = puntaje;
                        mejorArtista = artista;
                    }
                }
            }
        }
        return mejorArtista;
    }

    public static void main(String[] args) {
        Freestyle competition = new Freestyle();
        competition.agregarEvaluacion("Paco", "DjMotroco", "Rimas", 8.5);
        competition.agregarEvaluacion("Paco", "Trueno", "Técnica", 8.0);
        competition.agregarEvaluacion("Mercedes", "DjMotroco", "Rimas", 8.5);

        System.out.println("Notas de DjMotroco:");
        System.out.println(competition.obtenerNotasArtista("DjMotroco"));

        System.out.println("\nMedia de notas de DjMotroco:");
        System.out.println(competition.calcularMediaNotasArtista("DjMotroco"));

        System.out.println("\nNotas dadas por Paco:");
        System.out.println(competition.obtenerNotasJuez("Paco"));

        System.out.println("\nMejor artista en Rimas:");
        System.out.println(competition.obtenerMejorArtistaEnAspecto("Rimas"));
    }
}
