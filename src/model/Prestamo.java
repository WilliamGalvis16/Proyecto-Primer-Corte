package model;
import java.time.LocalDate;

/**
 * Clalse para establecer un prestamo en la biblioteca
 * Contiene el libro, usuario, fecha de prestamo y fecha de devolucion
 * @author  William Galvis
 * @version 1.0
 */
public class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaPrestamo; 
    private LocalDate fechaDevolucion;

    //Constructor vacio
    public Prestamo() {
    }

    /**
     * Constructor con parametros
     * 
     * @param fechaDevolucion
     * @param fechaPrestamo
     * @param libro
     * @param usuario
     */
    public Prestamo(LocalDate fechaDevolucion, LocalDate fechaPrestamo, Libro libro, Usuario usuario) {
        this.fechaDevolucion = fechaDevolucion;
        this.fechaPrestamo = fechaPrestamo;
        this.libro = libro;
        this.usuario = usuario;
    }

    /**
     * Obtiene el libro del prestamo
     * @return      El libro del prestamo
     */
    public Libro getLibro() {
        return libro;
    }
    /**
     * Establece el libro del prestamo
     * @param libro
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    /**
     * Obtiene el usuario del prestamo
     * @return      El usuario del prestamo
     */
    public Usuario getUsuario() {
        return usuario;
    }
    /**
     * Establece el usuario del prestamo
     * @param usuario
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene la fecha de prestamo del prestamo
     * @return      la fecha del prestamo
     */
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }
    /**
     * Establede la fecha de prestamo del prestamo
     * @param fechaPrestamo
     */
    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    /**
     * Obtiene la fecha de devolucion del prestamo
     * @return      la fecha de devolucion del prestamo
     */
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
    /**
     * Establece la fehca de devolucion del prestamo
     * @param fechaDevolucion
     */
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}