package presenter;
import model.Biblioteca;
import view.BibliotecaView;

/**
 * Clase que actúa como intermediario entre el modelo y la vista
 * Contiene biblioteca, view
 * @author William Galvis
 * @version 1.0
 */

public class BibliotecaPresenter {
    private Biblioteca biblioteca;
    private BibliotecaView view;

    /**
     * Constructor de la clase BibliotecaPresenter.
     * Inicializa la biblioteca y la vista.
     */
    public BibliotecaPresenter() {
        biblioteca = new Biblioteca();
        view = new BibliotecaView();
    }

    /**
     * Inicia el programa y muestra el menú principal de la biblioteca.
     */
    public void start (){
        int opc = 0;
        int opc1 = 0;
        int opc2 = 0;
        int opc3 = 0;
        int opc4 = 0;
        String desicion = " ";
        do {
            view.mostrarMensaje("Bienvenido a la Biblioteca Municipal de Sogamoso, elija que tipo de servicio requiere: \n1. Manipular libros \n2. Manioular usuarios \n3. Prestamos \n4. Devoluciones \n5. Consultas \n6. Salir");
            opc = view.pedirInt();
            switch (opc) {
                case 1:
                    do {
                        view.mostrarMensaje("Elija una de las opciones: \n1. Ingresar un libro \n2. Elminar un libro\n3. Mostrar libros disponibles \n4. Buscar libros \n5. Modificar un libro \n6. Salir");
                        opc1 = view.pedirInt();
                        switch (opc1) {
                            case 1:
                                do {
                                    view.mostrarMensaje("Bienvenido, en este espacio va a ingresar un libro nuevo. \nIngrese el titulo del libro");
                                    String titulo = view.pedirString();
                                    view.mostrarMensaje("Ingrese el autor del libro");
                                    String autor = view.pedirString();
                                    view.mostrarMensaje("Ingrese el año de publicacion del libro");
                                    int publicacion = view.pedirInt();
                                    view.mostrarMensaje("Ingrese la cantidad de ejemplares del libro");
                                    int ejemplar = view.pedirInt();
                                    view.mostrarMensaje("Ingrese el ISBN del libro, consta de un numero de dos cifras entre el 1 al 20");
                                    String isbn = view.pedirString();
                                    view.mostrarMensaje(biblioteca.registrarLibros(titulo, autor, ejemplar, isbn, publicacion));
                                    view.mostrarMensaje("Desa ingresar otro libro ?? (Si/No)");
                                    desicion = view.pedirString();
                                } while (desicion.equalsIgnoreCase("Si"));
                                break;
                            case 2:
                                do {
                                    view.mostrarMensaje("Bienvenido, en este espacio podra eliminar un libro. \nIngrese el ISBN del libro que desea eliminar");
                                    String isbn = view.pedirString();
                                    view.mostrarMensaje(biblioteca.eliminarLibro(isbn));
                                    view.mostrarMensaje("Desa eliminar otro libro ?? (Si/No)");
                                    desicion = view.pedirString();
                                } while (desicion.equalsIgnoreCase("Si"));
                                break;
                            case 3:
                                view.mostrarMensaje("Bienvenido, los libros disponibles son: ");
                                view.mostrarMensaje(biblioteca.mostrarLibro());
                                break;
                            case 4:
                                do {
                                    view.mostrarMensaje("Bienvenido, en este espacio podra buscar un libro. \nIngrese el ISBN del libro");
                                    String isbn = view.pedirString();
                                    view.mostrarMensaje(biblioteca.buscarLibro(isbn));
                                    view.mostrarMensaje("Desea buscar otro libro ?? (Si/No)");
                                    desicion = view.pedirString();
                                } while (desicion.equalsIgnoreCase("Si"));
                                break;
                            case 5:
                                do {
                                    view.mostrarMensaje("Bienvenido, en este espacio puede modificar un libro.\nIngrese el ISBN del libro que desea modificar");
                                    String isbn = view.pedirString();
                                    do {
                                        view.mostrarMensaje("Que desea modificar del libro:\n1. Titulo\n2. Autor\n3. Publicacion\n4. Ejemplar\n5. Salir");
                                        opc3 = view.pedirInt();
                                        switch (opc3) {
                                            case 1:
                                                view.mostrarMensaje("Ingrese el nuevo titulo del libro");
                                                String nuevoTitulo = view.pedirString();
                                                view.mostrarMensaje(biblioteca.modificarLibro(isbn, opc3, nuevoTitulo, null, 0,0));
                                                break;
                                            case 2:
                                                view.mostrarMensaje("Ingrese el nuevo autor del libro");
                                                String nuevoAutor = view.pedirString();
                                                view.mostrarMensaje(biblioteca.modificarLibro(isbn, opc3, null, nuevoAutor, 0,0));
                                                break;
                                            case 3:
                                                view.mostrarMensaje("Ingrese el nuevo año de publicacion del libro");
                                                int nuevoPublicacion = view.pedirInt();
                                                view.mostrarMensaje(biblioteca.modificarLibro(isbn, opc3, null, null, 0,nuevoPublicacion));
                                                break;
                                            case 4:
                                                view.mostrarMensaje("Ingrese la nueva cantidad de ejemplares del libro");
                                                int nuevoEjemplar = view.pedirInt();
                                                view.mostrarMensaje(biblioteca.modificarLibro(isbn, opc3, null, null, nuevoEjemplar,0));
                                                break;
                                            case 5:
                                                view.mostrarMensaje("Volviendo al menu de modificacion de Libro");
                                                break;
                                            default:
                                                view.mostrarMensaje("Opcion ivalida, ingrese otra");
                                                break;
                                        }
                                    } while (opc3 != 5);
                                    view.mostrarMensaje("Desea modificar otro libro ?? (Si/No)");
                                    desicion = view.pedirString();                               
                                } while (desicion.equalsIgnoreCase("Si"));
                                break;
                            case 6:
                                view.mostrarMensaje("Volviendo al menu principal");
                                break;
                            default:
                                view.mostrarMensaje("Opcion invalida, ingrese otra");
                                break;
                        }
                    } while (opc1 != 6);
                    break;
                    
                case 2:
                    do {
                        view.mostrarMensaje("Bienvenido, elija una de las opciones: \n1. Ingresar un usuario \n2. Eliminar un usuario \n3. Buscar usarios \n4. Modificar tipo de usuario \n5. Mostrar usuarios \n6. Volver al menu principal");
                        opc2 = view.pedirInt();
                        switch (opc2) {
                            case 1:
                                do {
                                    view.mostrarMensaje("Bienvenido, en este espacio va a ingresar un usuario nuevo. \nPor favor ingrese el nombre del usuario");
                                    String nombre = view.pedirString();
                                    view.mostrarMensaje("Ingrese la identificacion del usuario");
                                    String identificacion = view.pedirString();
                                    view.mostrarMensaje("Ingrese tipo de usuario, este puede ser Estudiante, Profesoro o Ciudadano del libro");
                                    String usuario = view.pedirString();
                                    view.mostrarMensaje(biblioteca.registrarUsuario(identificacion, nombre, usuario));
                                    view.mostrarMensaje("Desa ingresar otro usuario ?? (Si/No)");
                                    desicion = view.pedirString();
                                } while (desicion.equalsIgnoreCase("Si"));
                                break;
                            case 2:
                                do {
                                    view.mostrarMensaje("Bienvenido, en este espacio podra eliminar un usuario. \nIngrese la identificacion del usuario que desea eliminar");
                                    String identificacion = view.pedirString();
                                    view.mostrarMensaje(biblioteca.eliminarUsuario(identificacion));
                                    view.mostrarMensaje("Desea eliminar otro usuario ?? (Si/No)");
                                    desicion = view.pedirString();
                                } while (desicion.equalsIgnoreCase("Si"));
                                break;
                            case 3:
                                do {
                                    view.mostrarMensaje("Bienvenido, en este espacio podra buscar un usuario. \nIngrese la identificacion del usuario");
                                    String identificacion = view.pedirString();
                                    view.mostrarMensaje(biblioteca.buscarUsuario(identificacion));
                                    view.mostrarMensaje("Desea buscar otro usuario ?? (Si/No)");
                                    desicion = view.pedirString();
                                } while (desicion.equalsIgnoreCase("Si"));
                                break;
                            case 4:
                                do {
                                    view.mostrarMensaje("Bienvenido, en este espacio puede modificar un usuario.\nIngrese la identificaciond el usuario que desea modificar");
                                    String identificacion = view.pedirString();
                                    view.mostrarMensaje("Ingrese el nuevo tipo de Usuario del usuario identificado con "+identificacion+"(Estudiante, Profesor, Ciudadano)");
                                    String nuevoUsuario = view.pedirString();
                                    view.mostrarMensaje(biblioteca.modificarUsuario(identificacion, nuevoUsuario));
                                    view.mostrarMensaje("Desea modificar otro usuario ?? (Si/No)");    
                                    desicion = view.pedirString();               
                                } while (desicion.equalsIgnoreCase("Si"));
                                break;
                            case 5:
                                view.mostrarMensaje("Bienvenido, los usuarios inscritos son: ");
                                view.mostrarMensaje(biblioteca.mostrarUsuario());
                                break; 
                            case 6:
                                view.mostrarMensaje("Volviendo al menu principal");
                                break;
                            default:
                                view.mostrarMensaje("Opcion ivalida, ingrese otra");
                                break;
                        }   
                    } while (opc2 != 6);
                    break;
                    
                case 3:
                    do {
                        view.mostrarMensaje("Bienvenido, elija una de las opciones\n1. Hacer prestamo \n2. Mostrar Prestamos \n3. Volver al menu");
                        opc4 = view.pedirInt();
                        switch (opc4) {
                            case 1:
                                do {
                                    view.mostrarMensaje("Bienvenido, en este espacio puede realizar el prestamo de un libro \nIngrese el numero de identificaion del usuario");
                                    String identificacion = view.pedirString();
                                    view.mostrarMensaje("Ingrese el ISBN del libro");
                                    String isbn = view.pedirString();
                                    view.mostrarMensaje(biblioteca.hacerPrestamo(isbn, identificacion));
                                    view.mostrarMensaje("Desea prestar otro libro ? (Si/No)");
                                    desicion = view.pedirString();  
                                } while (desicion.equalsIgnoreCase("Si"));
                                break;
                            case 2:
                                view.mostrarMensaje("Bienvenido, los prestamos hechos son: ");
                                view.mostrarMensaje(biblioteca.mostrarPrestamo());
                                break;
                            case 3:
                                view.mostrarMensaje("Volviendo al menu principal");
                            default:
                                view.mostrarMensaje("Opcion invalida, ingrese otra");
                                break;
                        }                     
                    } while (opc4 != 3);
                    break;
                case 4:
                    do {
                        view.mostrarMensaje("Bienvenido, en este espacio puede realizar la devolucion de un libro \nIngrese el numero de identificacion del usuario");
                        String identificacion = view.pedirString();
                        view.mostrarMensaje("Ingrese el ISBN del libro");
                        String isbn = view.pedirString();
                        view.mostrarMensaje(biblioteca.hacerDevolucion(isbn, identificacion));
                        view.mostrarMensaje("Desea devolver otro libro ? (Si/No)");
                        desicion = view.pedirString();
                    } while (desicion.equalsIgnoreCase("Si"));
                    break;
                case 5:
                    do {
                        view.mostrarMensaje("Bienvenido, en este espacio puede consultar la disponibilidad de los libros \nIngrese el ISBN del libro que desea consulta");
                        String isbn = view.pedirString();
                        view.mostrarMensaje(biblioteca.disponibilidadLibro(isbn));
                        view.mostrarMensaje("Desea consultar la disponibilidad de otro libro ? (Si/No)");
                        desicion = view.pedirString();
                    } while (desicion.equalsIgnoreCase("Si"));
                    break;
                case 6:
                    view.mostrarMensaje("Gracias por usar los servicios de la Bilioteca Municipal de Sogamoso");
                    break;
                default:
                    view.mostrarMensaje("Opcion ivalida, ingrese otra");
                    break;
            }    
        } while (opc != 6);
    }
}
