package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Clase para establecer una biblioteca
 * Contiene libros, usuarios y prestamos
 * @author William Galvis
 * @version 1.0
 */
public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Prestamo> prestamos;

    //Constructor vacio
    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    /**
     * Constructor con parametros
     * 
     * @param libros
     * @param prestamos
     * @param usuarios
     */
    public Biblioteca(ArrayList<Libro> libros, ArrayList<Prestamo> prestamos, ArrayList<Usuario> usuarios) {
        this.libros = libros;
        this.prestamos = prestamos;
        this.usuarios = usuarios;
    }

    /**
     * Registra un libro en la biblioteca
     * 
     * @param titulo
     * @param autor
     * @param ejemplar
     * @param isbn
     * @param publicacion
     * @return Mensaje de confirmacion
     */
    public String registrarLibros (String titulo, String autor, int ejemplar, String isbn, int publicacion){
        libros.add(new Libro(titulo, autor, ejemplar, isbn, publicacion));
        return "El libro se añadio con exito";
    }

    /**
     * Elimina un libro de la biblioteca usando el ISBN
     * 
     * @param isbn
     * @return Mensaje de confirmacion o de error
     */
    public String eliminarLibro (String isbn){
        for (int i = 0; i < libros.size(); i++){
            if (isbn.equals(libros.get(i).getIsbn())) {
                Libro libroEliminado = libros.remove(i);
                return ("El libro " + libroEliminado.getTitulo() + " ha sido eliminado");
            }
        }
        return "El Libro no se ha encontrado";
    }

    /**
     * Muestra los libros disponibles en la biblioteca
     * 
     * @return Lista con la informacion de cada libro
     */
    public String mostrarLibro (){
        String librosString = "";
        for (int i = 0; i < libros.size(); i++) {
            librosString = librosString + "Titulo: "+libros.get(i).getTitulo()+" Autor: "+libros.get(i).getAutor()+" ISBN: "+libros.get(i).getIsbn()+" Publicacion: "+libros.get(i).getPublicacion()+" Ejemplares: "+libros.get(i).getEjemplar()+"\n";
        }
        return librosString;
    }

    /**
     * Busca un libro de la biblioteca usando el ISBN
     * 
     * @param isbn
     * @return Mensaje con informacion basica del libro buscado o de error
     */
    public String buscarLibro (String isbn){
        for (int i = 0; i < libros.size(); i++) {
            if (isbn.equals(libros.get(i).getIsbn()) ){
                return ("El libro con isbn " + isbn + " es el libro: "+libros.get(i).getTitulo());
            }
        }
        return "El libro no se ha encontrado";
    }

    /**
     * Modifica un libro de la biblioteca
     * 
     * @param tituloNuevo
     * @param autorNuevo
     * @param ejemplarNuevo
     * @param isbn
     * @param publicacionNueva
     * @return Mensaje de confirmacion dependiendo que caracteristica se cambio o de error
     */
    public String modificarLibro (String isbn, int opcion, String tituloNuevo, String autorNuevo, int ejemplarNuevo, int publicacionNueva){
        for (int i = 0; i < libros.size(); i++) {
            if (isbn.equals(libros.get(i).getIsbn())){
                switch (opcion) {
                    case 1:
                        libros.get(i).setTitulo(tituloNuevo);
                        return "El titulo cambiado con exito";
                    case 2:
                        libros.get(i).setAutor(autorNuevo);
                        return "El autor se cambio con exito";
                    case 3:
                        libros.get(i).setPublicacion(publicacionNueva);
                        return "El año de publicacion se cambio con exito";
                    case 4:
                        libros.get(i).setEjemplar(ejemplarNuevo);
                        return "El numero de ejemplares se cambio con exito";
                }
            }
        }
        return "El libro no se ha encontrado";
    }
    
    /**
     * Registra un usuario en la biblioteca 
     * 
     * @param identificacion
     * @param nombre
     * @param usuario
     * @return Mensaje de confirmacion
     */
    public String registrarUsuario (String identificacion, String nombre, String usuario){
        usuarios.add(new Usuario(identificacion, nombre, usuario));
        return "El usuario se añadio con exito";
    }

    /**
     * Elimina un usuario de la biblioteca usando la identificacion
     * 
     * @param identificacion
     * @return Mensaje de confirmacion o de error
     */
    public String eliminarUsuario (String identificacion){
        for (int i = 0; i < usuarios.size(); i++) {
            if (identificacion.equals(usuarios.get(i).getIdentificacion())) {
                Usuario usuarioEliminado = usuarios.remove(i);
                return ("El Usuario " + usuarioEliminado.getNombre() + " ha sido eliminado");   
            }
        }
        return "El usuario no se ha encontrado";
    }

    /**
     * Busca un usuario en la biblioteca usando la identificacion
     * 
     * @param identificacion
     * @return Mensaje con la informacion basica del usuario buscado o de error
     */
    public String buscarUsuario (String identificacion){
        for (int i = 0; i < usuarios.size(); i++) {
            if (identificacion.equals(usuarios.get(i).getIdentificacion())) {
                return ("El usuario con identificacion "+identificacion+" es el usuario: "+usuarios.get(i).getNombre());
            }
        }
        return "El ususario no se ha encontrado";
    }

    /**
     * Modifica un usuario de la biblioteca
     * 
     * @param identificacion
     * @param usuarioNuevo
     * @return Mensaje de confirmacion o de error 
     */
    public String modificarUsuario (String identificacion, String usuarioNuevo){
        for (int i = 0; i < usuarios.size(); i++) {
            if (identificacion.equals(usuarios.get(i).getIdentificacion())) {
                usuarios.get(i).setUsuario(usuarioNuevo);
                return "El tipo de usuario se cambio con exito";
            }
        }
        return "El ususario no se ha encontrado";
    }

    /**
    * Muestra los usuarios inscritos en la biblioteca
    * 
    * @return Lista con la informacion de cada usuario
    */
    public String mostrarUsuario (){
        String usuarioString = "";
        for (int i = 0; i < usuarios.size(); i++) {
            usuarioString = usuarioString + "Nombre: "+usuarios.get(i).getNombre()+" Id: "+usuarios.get(i).getIdentificacion()+" Tipo de usuario: "+usuarios.get(i).getUsuario()+"\n";
        }
        return usuarioString;
    }

    /**
     * Hace un prestamo de un libro de la biblioteca
     * 
     * @param isbn
     * @param identificacion
     * @return Mensaje de confirmacion o de erorr
     */
    public String hacerPrestamo (String isbn, String identificacion){
        for (int i = 0; i < libros.size(); i ++){
            if (isbn.equals(libros.get(i).getIsbn()) && libros.get(i).getEjemplar() > 0){
                for (int j = 0; j < usuarios.size(); j ++){
                    if(identificacion.equals(usuarios.get(j).getIdentificacion())){
                        libros.get(i).setEjemplar(libros.get(i).getEjemplar() - 1);
                        LocalDate fechaPrestamo = LocalDate.now();
                        LocalDate fechaDevolucion = fechaPrestamo.plusDays(15);
                        prestamos.add(new Prestamo(fechaDevolucion, fechaPrestamo, libros.get(i), usuarios.get(j)));
                        return "El prestamo se realizo correctamente";
                    }
                }
                return "El usuario no se ha encontrado";
            } 
        }
        return "El libro no se ha encontrado";
    }

    /**
    * Muestra los prestamos hechos en la biblioteca
    * 
    * @return Lista con la informacion de cada prestamo
    */
    public String mostrarPrestamo (){
        String prestamoString = "";
        for (int i = 0; i < prestamos.size(); i++) {
            prestamoString = prestamoString + "Identificacion usuario: "+prestamos.get(i).getUsuario().getIdentificacion()+" ISBN del libro:  "+prestamos.get(i).getLibro().getIsbn()+"\n";
        }
        return prestamoString;
    }

    /**
     * Hace la devolucion de un prestamo de la biblioteca
     * 
     * @param isbn
     * @param identificaicon
     * @return Mensaje de confirmacion o de error
     */
    public String hacerDevolucion (String isbn, String identificaicon){
        for (int i = 0; i < prestamos.size(); i ++){
            if (isbn.equals(libros.get(i).getIsbn()) && identificaicon.equals(prestamos.get(i).getUsuario().getIdentificacion())) {
                prestamos.get(i).getLibro().setEjemplar(prestamos.get(i).getLibro().getEjemplar() + 1);
                prestamos.remove(i);
                return ("La devolucion de libro se ha hecho de manera correcta");
            }
        }
        return "El prestamo no se ha encontrado";
    }

    /**
     * Revisa la disponibilidad del libro de la biblioteca
     * 
     * @param isbn
     * @return Mensaje con la cantidad de ejemplares disponibles o de error
     */
    public String disponibilidadLibro (String isbn){
        for (int i = 0; i < libros.size(); i++) {
            if (isbn.equals(libros.get(i).getIsbn())){
                return ("El libro con isbn " + libros.get(i).getTitulo() + " tiene "+libros.get(i).getEjemplar()+" ejemplares disponibles");
            }
        }
        return "No se ha encontrado el libro";
    }
}
