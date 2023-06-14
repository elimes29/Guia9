/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
 */
package ejercicioex02;

import entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import servicio.ServicioCantanteFamoso;

/**
 *
 * @author usuario
 */
public class CantantesAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ArrayList<CantanteFamoso> cantaF = new ArrayList<>();
        CantanteFamoso cantaAux = new CantanteFamoso();
        ServicioCantanteFamoso scf = new ServicioCantanteFamoso();

        // Llenando 5 Cantantes en la lista
        for (int i = 0; i < 5; i++) {
            scf.aregarCantante(cantaF);
        }
        //mostrando Cantantes
        scf.mostrarTodo(cantaF);

        //Menú
        String opc;
        boolean sal = true;
        do {
            System.out.println("-----------Menú-----------");
            System.out.println("Ingrese una opción");
            System.out.println("1. Agrear cantante");
            System.out.println("2. Mostrar Cantantes");
            System.out.println("3. Eliminar Cantantes");
            System.out.println("Otro: Salir");
            opc = leer.nextLine();
            switch (opc) {
                case "1":
                    scf.aregarCantante(cantaF);
                    break;
                case "2":
                    scf.mostrarTodo(cantaF);
                    break;
                case "3":
                    scf.eliminarCantante(cantaF);
                    break;
                default:
                    sal = false;
                    break;
            }
        } while (sal);

        System.out.println("-------------Luego de cambos-------------");
        scf.mostrarTodo(cantaF);
    }

}
