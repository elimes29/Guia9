/*
Para ello, se debe crear una clase llamada Libro que guarde la información de
cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
 */
package entidad;

/**
 *
 * @author usuario
 */
public class Libro {
    private String titulo;
    private String autor;
    private Integer numLibros;
    private Integer numLibrosPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, Integer numLibros, Integer numLibrosPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numLibros = numLibros;
        this.numLibrosPrestados = numLibrosPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumLibros() {
        return numLibros;
    }

    public void setNumLibros(Integer numLibros) {
        this.numLibros = numLibros;
    }

    public Integer getNumLibrosPrestados() {
        return numLibrosPrestados;
    }

    public void setNumLibrosPrestados(Integer numLibrosPrestados) {
        this.numLibrosPrestados = numLibrosPrestados;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", numLibros=" + numLibros + ", numLibrosPrestados=" + numLibrosPrestados + '}';
    }
    
    
}
