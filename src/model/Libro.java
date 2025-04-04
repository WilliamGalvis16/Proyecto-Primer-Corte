package model;

/**
 * Clase para establecer un libro en la biblioteca
 * Contiene el titulo, autor, año de publicacion, ejemplares, ISBN
 * @author William Galvis
 * @version 1.0
 */
public class Libro{
    private String titulo;
    private String autor;
    private int publicacion;
    private String isbn;
    private int ejemplar;

    //Constructor vacio
    public Libro() {
    }

    /**
     * Constructor con parametros
     * 
     * @param titulo        El titulo del libro
     * @param autor         El autor del libro
     * @param ejemplar      La cantidad de ejemplares del libro
     * @param isbn          El ISBN del libro
     * @param publicacion   El año de publicacion del libro
     */
    public Libro(String titulo, String autor, int ejemplar, String isbn, int publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplar = ejemplar;
        this.isbn = isbn;
        this.publicacion = publicacion;
    }

    /**
     * Obtiene el titulo del libro
     * @return El titulo del libro
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * Establece el titulo del libro
     * @param titulo    El titulo del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro
     * @return El autor del libro
     */
    public String getAutor() {
        return autor;
    }
    /**
     * Establece el autor del libro
     * @param autor     El autor del libro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el año de publicacion del libro
     * @return El año de publicacion del libro
     */
    public int getPublicacion() {
        return publicacion;
    }
    /**
     * Establece el año de publicacion del libro
     * @param publicacion    El año de publicacion del libro
     */
    public void setPublicacion(int publicacion) {
        this.publicacion = publicacion;
    }

    /**
     * Obtiene el ISBN del libro
     * @return El ISBN del libro
     */
    public String getIsbn() {
        return isbn;
    }
    /**
     * Establece el ISBN del libro
     * @param isbn      El ISBN del libro
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Obtiene la cantidad de ejemplares del libro
     * @return La cantidad de ejemplares del libro
     */
    public int getEjemplar() {
        return ejemplar;
    }
    /**
     * Establece la cantidad de ejemplares del libro
     * @param ejemplar     La cantidad de ejemplares del libro
     */
    public void setEjemplar(int ejemplar) {
        this.ejemplar = ejemplar;
    }
}