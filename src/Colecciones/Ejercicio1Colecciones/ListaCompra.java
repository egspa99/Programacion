package Colecciones.Ejercicio1Colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaCompra {

	private Map<String, List<Producto>> lista;

	public ListaCompra() {
		lista = new HashMap<>();
	}

	public void agregarProducto(String categoria, String nombre, double cantidad, String unidad) {
		Producto producto = new Producto(nombre, cantidad, unidad);
		lista.computeIfAbsent(categoria, k -> new ArrayList<>()).add(producto);
	}

	public void eliminarProducto(String categoria, String nombre) {
		lista.get(categoria).removeIf(producto -> producto.getNombre().equals(nombre));
	}

	public List<Producto> obtenerListaCategoria(String categoria) {
		return lista.getOrDefault(categoria, new ArrayList<>());
	}

	public void imprimirLista() {
		for (Map.Entry<String, List<Producto>> entry : lista.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
	
	 public static void main(String[] args) {
	        ListaCompra listaCompra = new ListaCompra();
	        listaCompra.agregarProducto("Carne", "Alitas", 400, "g");
	        listaCompra.agregarProducto("Carne", "Pechugas de pollo", 200, "g");
	        listaCompra.agregarProducto("Carne", "Albóndigas", 3, "unidades");
	        listaCompra.agregarProducto("Frutas", "Manzanas", 5, "unidades");
	        listaCompra.agregarProducto("Frutas", "Uvas", 500, "g");

	        System.out.println("Lista de la compra:");
	        listaCompra.imprimirLista();

	        System.out.println("\nEliminar Albóndigas de la lista de Carne:");
	        listaCompra.eliminarProducto("Carne", "Albóndigas");
	        listaCompra.imprimirLista();

	        System.out.println("\nLista de productos en la categoría Frutas:");
	        List<Producto> frutas = listaCompra.obtenerListaCategoria("Frutas");
	        for (Producto producto : frutas) {
	            System.out.println(producto);
	        }
	    }

}
