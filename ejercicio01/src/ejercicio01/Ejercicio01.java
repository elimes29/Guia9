/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package ejercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        List<String> razaPerro = new ArrayList();
        String otro;
        boolean cent = true;

        //Captando valores de pantalla
        do {
            System.out.println("Ingrese una raza de perro");
            razaPerro.add(leer.nextLine());
            System.out.println("¿Desea ingresar otra raza?(SI/NO)");
            otro=leer.nextLine();
            System.out.println(otro.equalsIgnoreCase("NO"));
            if (otro.equalsIgnoreCase("NO")) {
                cent=false;
            }
        } while (cent);
        System.out.println("-------------------------");
        //Imprimiendo valores captados en lista ArrayList
        System.out.println("Las razas ingresadas fueron: ");
        for (String aux : razaPerro){
            System.out.println(aux);
        }
        System.out.println("Numero de razas: "+razaPerro.size());
        System.out.println("------------------------------------");
        
        /*
        Ejercicio 2
        Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
        un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
        está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
        ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
        la lista ordenada.
        */
        
        System.out.println("Indique una raza de perro a buacar");
        String perroBusca = leer.nextLine();
        Iterator<String> it = razaPerro.iterator();
        String ban;
        while (it.hasNext()){
            ban=it.next();
            if (ban.equals(perroBusca)){
                it.remove();
                System.out.println("Raza liminada: "+ban);
            }
        }  
        System.out.println("----------------------");
        
        //Ordenando
        
        Collections.sort(razaPerro);
        System.out.println("Las razas ordenandas son: ");
        for (String aux : razaPerro){
            System.out.println(aux);
        }
        System.out.println("Numero de razas: "+razaPerro.size());
    }

}
