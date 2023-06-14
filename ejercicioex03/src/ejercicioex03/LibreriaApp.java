/*
Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos
repetidos. Para ello, se debe crear una clase llamada Libro que guarde la información de
cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus
datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le
pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
● Constructor por defecto.
● Constructor con parámetros.
● Métodos Setters/getters
● Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca
en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El
método se incrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un
préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
● Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
método decrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
produzca la devolución de un libro. No se podrán devolver libros donde que no tengan
ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
● Método toString para mostrar los datos de los libros.
 */
package ejercicioex03;

import entidad.Libro;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import servicio.ServicioLibreria;

/**
 *
 * @author usuario
 */
public class LibreriaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerS = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        HashSet<Libro> libroLista = new HashSet<>();
        ServicioLibreria sl = new ServicioLibreria();

        String autor, titulo;
        int cont = 0, numLibros, numLibrosPrestado;
        do {
            Libro libroAux = new Libro();
            cont++;
            System.out.println("*******Libro " + cont + " ******************");
            System.out.println("Ingresa El título del libro");
            titulo = leerS.nextLine();
            System.out.println("Ingresa el autor del libro");
            autor = leerS.nextLine();
            System.out.println("Ingresa la cantidad de libros disponibles");
            numLibros = leer.nextInt();
            System.out.println("Ingresa la cantidad de libros presetados");
            numLibrosPrestado = leer.nextInt();
            libroAux.setAutor(autor);
            libroAux.setTitulo(titulo);
            libroAux.setNumLibros(numLibros);
            libroAux.setNumLibrosPrestados(numLibrosPrestado);
            libroLista.add(libroAux);
            System.out.println("Desea continuar agreando libros? (S/N)");
        } while (!(leerS.nextLine().equalsIgnoreCase("n")));

        System.out.println(libroLista.size() + " libros");
        for (Iterator<Libro> iterator = libroLista.iterator(); iterator.hasNext();) {
            Libro next = iterator.next();
            System.out.println(next);
        }

        //Préstamo
        System.out.println("Cual libro desea pedir prestado?");
        String libroPresta = leerS.nextLine();

        for (Iterator<Libro> iterator = libroLista.iterator(); iterator.hasNext();) {
            Libro next = iterator.next();
            if (next.getTitulo().equalsIgnoreCase(libroPresta)) {
                if (sl.prestamo(next)) {
                    System.out.println("El libro se prestó con exito");
                    System.out.println(next);
                } else {
                    System.out.println("No se pudro hacer el prestamo del libro porque no hay suficientes");
                }
            }
        }
        
        //devolucion
                System.out.println("Cual libro desea devolver?");
        String libroDevolver = leerS.nextLine();

        for (Iterator<Libro> iterator = libroLista.iterator(); iterator.hasNext();) {
            Libro next = iterator.next();
            if (next.getTitulo().equalsIgnoreCase(libroDevolver)) {
                if (sl.devolucuon(next)) {
                    System.out.println("El libro se devolvió con exito");
                    System.out.println(next);
                } else {
                    System.out.println("No se pudo delvolver el libro porque no es de esta librería");
                }
            }
        }

    }

}
