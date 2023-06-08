/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author usuario
 */
public class Comparadores {

    public static Comparator<Pelicula> ordenarTituloAscen = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t1.getTitulo().compareTo(t2.getTitulo());
        }
    };

    public static Comparator<Pelicula> ordenarDirectorAscen = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t1.getDirector().compareTo(t2.getDirector());
        }
    };

    public static Comparator<Pelicula> ordenarDuracionAscen = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t1.getDuracion().compareTo(t2.getDuracion());
        }
    };

    public static Comparator<Pelicula> ordenarDuracionDescen = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t2.getDuracion().compareTo(t1.getDuracion());
        }
    };
}

