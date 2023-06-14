/*
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
 */
package servicio;

import entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioLibreria {

    Scanner leerS = new Scanner(System.in);
    Scanner leer = new Scanner(System.in);

    public boolean prestamo(Libro libro) {
        boolean prestado=false;
        System.out.println(libro);
        if (libro.getNumLibros()>libro.getNumLibrosPrestados()) {
             libro.setNumLibrosPrestados(libro.getNumLibrosPrestados()+1);
             prestado=true;
        }
       return prestado;
    }
    
        public boolean devolucuon(Libro libro) {
        boolean devuelto=false;
        System.out.println(libro);
        if (libro.getNumLibrosPrestados()>0) {
             libro.setNumLibrosPrestados(libro.getNumLibrosPrestados()-1);
             devuelto=true;
        }
       return devuelto;
    }
}
