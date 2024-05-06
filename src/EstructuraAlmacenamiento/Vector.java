package EstructuraAlmacenamiento;

import java.util.Arrays;

public class Vector {
 private Alumno[] alumnos = new Alumno[100];
 private int totalDeAlumnos = 0;

    public void agrega(Alumno alumno) {
    	  if (totalDeAlumnos < alumnos.length) {
              alumnos[totalDeAlumnos] = alumno;
              totalDeAlumnos++;
          } else {
              // Resize the array and then add the student
              alumnos = Arrays.copyOf(alumnos, alumnos.length * 2);
              alumnos[totalDeAlumnos] = alumno;
              totalDeAlumnos++;
          }
    }
    
    public void agrega(int posicion, Alumno alumno) {
    	  if (posicion >= 0 && posicion <= totalDeAlumnos) {
              if (totalDeAlumnos == alumnos.length) {
                  // Resize the array if it's full
                  alumnos = Arrays.copyOf(alumnos, alumnos.length * 2);
              }
              // Shift elements to make space for the new one
              for (int i = totalDeAlumnos; i > posicion; i--) {
                  alumnos[i] = alumnos[i - 1];
              }
              // Insert the new student at the specified position
              alumnos[posicion] = alumno;
              totalDeAlumnos++;
          } else {
              throw new IndexOutOfBoundsException("Posición fuera de rango");
          }
    }

    public Alumno obten(int posicion) {
    	  if (posicion >= 0 && posicion < totalDeAlumnos) {
              return alumnos[posicion];
          } else {
              throw new IndexOutOfBoundsException("Posición fuera de rango");
          }
    }

    public void elimina(int posicion) {
    	  if (posicion >= 0 && posicion < totalDeAlumnos) {
              // Shift elements to remove the student at the specified position
              for (int i = posicion; i < totalDeAlumnos - 1; i++) {
                  alumnos[i] = alumnos[i + 1];
              }
              alumnos[totalDeAlumnos - 1] = null; // Set the last element to null
              totalDeAlumnos--;
          } else {
              throw new IndexOutOfBoundsException("Posición fuera de rango");
          }
    }

    public boolean contiene(Alumno alumno) {
    	  for (int i = 0; i < totalDeAlumnos; i++) {
              if (alumnos[i].equals(alumno)) {
                  return true;
              }
          }
          return false;
    }

    public int tamano() {
    	 return totalDeAlumnos;
       
    }

    public String toString() {
    	return Arrays.toString(Arrays.copyOf(alumnos, totalDeAlumnos));
    }

}