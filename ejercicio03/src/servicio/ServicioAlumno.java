/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioAlumno {

    Scanner leer1 = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);
    List<Alumno> alumnoList = new ArrayList<>();

    public ServicioAlumno() {
        //int cont = 0;
        do {
            cargarAlumno();
            System.out.println("Desea continuar agreando alumnos? (S/N)");
            //cont++;
        } while (!(leer1.nextLine().equalsIgnoreCase("n")));
        //mostrarAlumnos();

    }

    public void cargarAlumno() {
        String nombre;
        ArrayList<Integer> notasAux = new ArrayList<>();
        Alumno alumnoAux = new Alumno();

        System.out.println("Ingrese el nombre del alumno ");
        nombre = leer1.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + " del alumno " + nombre);
            notasAux.add(leer2.nextInt());
        }
        //System.out.println("El nombre es " + nombre);
        //System.out.println("Notas " + notasAux);
        alumnoAux.setNombre(nombre);
        alumnoAux.setNotas(notasAux);
        alumnoList.add(alumnoAux);

    }

    public void mostrarAlumnos() {

        for (int i = 0; i < alumnoList.size(); i++) {
            System.out.println("Alumno " + alumnoList.get(i).getNombre());
            for (int j = 0; j < alumnoList.get(i).getNotas().size(); j++) {
                System.out.println("   Nota numero " + (1 + j) + ": " + alumnoList.get(i).getNotas().get(j));
            }
        }
    }

    public void notaFinal() {
        System.out.println("Ingrese el nombre del alumno al cual se le desea calcular el promedio");
        String nombreProm = leer1.nextLine();
        int suma = 0;
        int ban = 0;

        for (int i = 0; i < alumnoList.size(); i++) {
            if (alumnoList.get(i).getNombre().equalsIgnoreCase(nombreProm)) {
                for (int j = 0; j < alumnoList.get(i).getNotas().size(); j++) {
                    suma = suma + alumnoList.get(i).getNotas().get(j);
                }
                
            } else {
                ban++;
            }
        }
        if (ban==alumnoList.size()){
            System.out.println("Alumno no encontrado");
        }else {
            System.out.println("El promedio de notas del alumno "+nombreProm+" es "+(suma/3));
        }

    }

}
