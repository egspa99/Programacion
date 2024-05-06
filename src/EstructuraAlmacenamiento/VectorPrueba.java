package EstructuraAlmacenamiento;

public class VectorPrueba {

    public static void main(String[] args) {
    	Alumno a1 = new Alumno("Luis");
        Alumno a2 = new Alumno("Jose");
        Alumno a3 = new Alumno("Luis");

        Vector lista = new Vector();

        lista.agrega(a1);
        lista.agrega(a2);
        lista.agrega(a3);

        System.out.println(lista);
    }
}