/*
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
 */
package servicio;

import entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioCantanteFamoso {
    Scanner leer = new Scanner(System.in);
    
    public void aregarCantante(ArrayList<CantanteFamoso> cantaList){
        CantanteFamoso cantaAux = new CantanteFamoso();
        System.out.println("Ingrese el cantante que desea agrear");
        cantaAux.setNombre(leer.nextLine());
        System.out.println("Ingrese el disco mas vendido");
        cantaAux.setDiscoMasVentas(leer.nextLine());
        cantaList.add(cantaAux);
    }
    
    public void mostrarCantantes(ArrayList<CantanteFamoso> cantaList){
        System.out.println("------------Cantantes en Lista ----------------------");
        for (int i = 0; i < cantaList.size(); i++) {
            CantanteFamoso get = cantaList.get(i);
            System.out.println(get.getNombre());
        }
    }
        public void mostrarTodo(ArrayList<CantanteFamoso> cantaList){
        System.out.println("------------Cantantes en Lista ----------------------");
        for (int i = 0; i < cantaList.size(); i++) {
            CantanteFamoso get = cantaList.get(i);
            System.out.print(get.getNombre());
            System.out.println(" : "+get.getDiscoMasVentas());
        }
    }
    public void eliminarCantante(ArrayList<CantanteFamoso> cantaList){
        boolean borrado = true;
        System.out.println("Ingrese el nombre del cantante a eliminar");
        String cantaBorrar= leer.nextLine();
        CantanteFamoso cantaAux= new CantanteFamoso();   
        
        Iterator it = cantaList.iterator();
        while(it.hasNext()){
            cantaAux = (CantanteFamoso) it.next();
            if (cantaAux.getNombre().equalsIgnoreCase(cantaBorrar)){
                it.remove();
                System.out.println("---------Cantante Borrado Satisfactoriamente------------");
                borrado=false;
            }
        }

        if (borrado){
            System.out.println("--------Cantante no encontrado-------------");
        }
    }
    
}
