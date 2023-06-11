/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class PaisesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        HashSet<String> paises = new HashSet<>();
        String pais;

        int cont = 0;
        do {
            //cargarPelicula();
            System.out.println("Ingresa un pais");
            pais = leer.nextLine();
            paises.add(pais);
            System.out.println("Desea continuar agreando paises? (S/N)");
            cont++;
        } while (!(leer.nextLine().equalsIgnoreCase("n")));

        //Mostrando paises
        //System.out.println(paises);
        System.out.println("--------------Paises-----------------");
        paises.forEach(System.out::println);

        //Ordenando pasasndo set a lista
        ArrayList<String> paisesList = new ArrayList<>(paises);
        //paises.forEach(System.out::println);
        Collections.sort(paisesList);
        System.out.println("--------------Paises Ordenados forma 1-----------------");
        paisesList.forEach(System.out::println);

        //solicitando país a borra
        System.out.println("Ingrese el pais que desea eliminar");
        String paisEliminar = leer.nextLine();
        //Ordenando paises iterator
        Iterator it = paises.iterator();
        boolean noEliminado = true;
        while (it.hasNext()) {
            if (it.next().equals(paisEliminar)) {
                it.remove();
                noEliminado = false;
            }
        }
        if (noEliminado) {
            System.out.println("Pais no encontrado");
        } else {
            System.out.println("Pais borrado satisfactoriamente");
            System.out.println("--------------Paises-----------------");
            paises.forEach(System.out::println);
        }
    }
}
