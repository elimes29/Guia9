/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author usuario
 */
public class ServicioProductos {
    HashMap<String,Double> productos = new HashMap<>();
    Scanner leerS = new Scanner(System.in);
    Scanner leerD = new Scanner(System.in);
    
    public void introducirProducto(){
        System.out.println("Ingrese el producuto que desea guardar");
        String pruducto = leerS.nextLine();
        System.out.println("Ingrese el precio del producuto que desea guardar");
        double precio = leerD.nextDouble();
        //Agreando producto  y precio a Mapa
        productos.put(pruducto, precio);
        
    }
    
    public void modificarPrecio(){
        System.out.println("Ingrese el producuto que desea modificar");
        String producto = leerS.nextLine();
        System.out.println("Ingrese el precio del producuto que desea modificar");
        double precio = leerD.nextDouble();
        boolean noModif=true;
        
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String key = entry.getKey();
            if (key.equalsIgnoreCase(producto)){
                entry.setValue(precio);
                System.out.println("Precio Modificado exitosamente");
                noModif=false;
            }
        }
        if (noModif) {
            System.out.println("Producto no encotrado");
        }
        
    }
    
    public void eliminarProducto(){
         System.out.println("Ingrese el producuto que desea eliminar");
        String producto = leerS.nextLine();
        productos.remove(producto);
        
    }
    
    public void mostraProductos(){
        productos.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        });
    }
}
