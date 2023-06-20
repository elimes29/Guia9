/*
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos
 */
package servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioCodigos {
    
    Scanner leer = new Scanner(System.in);
    Scanner leerS = new Scanner(System.in);
    HashMap<Integer,String> codigoMap = new HashMap<>();
    
    public void pedirCodigos(){
        System.out.println("------Ingreasando ciudades-----------");
        System.out.println("Ingrese una cuidad");
        String ciudad = leerS.nextLine();
        System.out.println("Ingrese código postal");
        Integer codigo = leer.nextInt();
        codigoMap.put(codigo, ciudad);
    }
    
    public void mostrar(){
        System.out.println("**********Mostrando códigos*************");
        for (Map.Entry<Integer, String> entry : codigoMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Ciudad: "+value+"| Codigo postal: "+key);
        }
    }
    public void buscarPorCodio(){
        System.out.println("------Buscando por código ----------");
        System.out.println("Ingrese el código de la ciudad a buscar");
        int codigo =leer.nextInt();
        if (codigoMap.containsKey(codigo)){
            System.out.println("El códio postal "+codigo+" pertenece a la ciudad "+codigoMap.get(codigo));
        }else{
            System.out.println("No se encuantra en esta lista ese codio postal");
        }
        
    }
    
    public void eliminarCiudad(){
        System.out.println("---------Eliminando por código -----------");
        System.out.println("Ingrese el codigo de la ciudad a eliminar");
        int codigo =leer.nextInt();
        codigoMap.remove(codigo);
    }
    
    

}


