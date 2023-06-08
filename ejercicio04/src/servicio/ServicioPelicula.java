/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla
 */
package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import utilidades.Comparadores;

/**
 *
 * @author usuario
 */
public class ServicioPelicula {

    List<Pelicula> peliculaLista = new ArrayList<>();
    Scanner leerS = new Scanner(System.in);
    Scanner leerI = new Scanner(System.in);

    public ServicioPelicula() {

        /*bucle que crea un objeto Pelicula pidiéndole al usuario
        todos sus datos y guardándolos en el objeto Pelicula.*/
        int cont = 0;
        do {
            cargarPelicula();
            System.out.println("Desea continuar agreando peliculas? (S/N)");
            cont++;
        } while (!(leerS.nextLine().equalsIgnoreCase("n")));
        mostrarPeliculas();//,muetra peliculas

        //Mostrando solo peliculas de mas de 1 hora de duración
        System.out.println("*****Mostrando peliculas duracion >1h********");
        for (int i = 0; i < peliculaLista.size(); i++) {
            
            if (peliculaLista.get(i).getDuracion() > 1) {
                System.out.println("Pelicula # " + (i + 1));
                System.out.println("Titulo: " + peliculaLista.get(i).getTitulo());
                System.out.println("Director: " + peliculaLista.get(i).getDirector());
                System.out.println("Duración: " + peliculaLista.get(i).getDuracion() + " horas");
                System.out.println("  ");
            }
        }
        System.out.println("*************Título******************");
        Collections.sort(peliculaLista, Comparadores.ordenarTituloAscen);
        mostrarPeliculas();//,muetra peliculas
        
        System.out.println("*************Duracion+******************");
        Collections.sort(peliculaLista, Comparadores.ordenarDuracionAscen);
        mostrarPeliculas();//,muetra peliculas
        
        System.out.println("*************Duracion-******************");
        Collections.sort(peliculaLista, Comparadores.ordenarDuracionDescen);
        mostrarPeliculas();//,muetra peliculas
        
        System.out.println("*************Director******************");
         Collections.sort(peliculaLista, Comparadores.ordenarDirectorAscen);
        mostrarPeliculas();//,muetra peliculas
        

    }

    public void cargarPelicula() {
        String titulo;
        String director;
        float duracion;

        Pelicula peli = new Pelicula();

        System.out.println("Ingrese el titulo de la pelicula ");
        titulo = leerS.nextLine();
        System.out.println("Ingrese el director de la pelicula ");
        director = leerS.nextLine();
        System.out.println("Ingrese la duración de la pelicula en horas ");
        duracion = leerI.nextFloat();

        peli.setDirector(director);
        peli.setTitulo(titulo);
        peli.setDuracion(duracion);
        peliculaLista.add(peli);

    }

    public void mostrarPeliculas() {
        System.out.println("*********Mostrando peliculas************");

        for (int i = 0; i < peliculaLista.size(); i++) {
            System.out.println("Pelicula # " + (i + 1));
            System.out.println("Titulo: " + peliculaLista.get(i).getTitulo());
            System.out.println("Director: " + peliculaLista.get(i).getDirector());
            System.out.println("Duración: " + peliculaLista.get(i).getDuracion() + " horas");
            System.out.println("  ");
        }
    }
}
