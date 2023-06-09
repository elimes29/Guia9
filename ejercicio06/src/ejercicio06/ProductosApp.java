/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package ejercicio06;

import servicio.ServicioProductos;

/**
 *
 * @author usuario
 */
public class ProductosApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioProductos sp = new ServicioProductos();
        
        for (int i = 0; i < 5; i++) {
            sp.introducirProducto();
            
        }
        
        sp.mostraProductos();
        System.out.println("----------------------------");
        sp.modificarPrecio();
        sp.mostraProductos();
        System.out.println("----------------------------");
        sp.eliminarProducto();
        sp.mostraProductos();
    }
    
}
