package model;

/**
 * Clase para establecer un usuario en la biblioteca
 * Contiene el nombre, identificacion y tipo de usuario
 * @author William Galvis
 * @version 1.0
 */
public class Usuario {
    private String nombre;
    private String identificacion;
    private String usuario;

    //Constructor vacio
    public Usuario() {
    }

    /**
     * Constructor con parametros
     * 
     * @param identificacion
     * @param nombre
     * @param usuario
     */
    public Usuario(String identificacion, String nombre, String usuario) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.usuario = usuario;
    }

    /**
     * Obtiene el nombre del usuario
     * @return El nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el nombre del usuario
     * @param nombre    El nombre del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la identificacion del usuario
     * @return La identificacioon del usuario
     */
    public String getIdentificacion() {
        return identificacion;
    }
    /**
     * Establece la identificacion del usuario
     * @param identificacion    La identificacion del usuario
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Obtiene el tipod e usuario del usuario
     * @return El tipo de usuario del usuario
     */
    public String getUsuario() {
        return usuario;
    }
    /**
     * Establece el tipo de usuario del usuario
     * @param usuario   El tipo de usuario del usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }   
}