package view;
import  java.util.Scanner;

/**
* Clase que maneja la interacción con el usuario a través de la consola
* Contiene sc
* @author William Galvis
* @version 1.0
*/
public class BibliotecaView {
    private Scanner sc;

	/**
    * Constructor
    * Inicializa el objeto Scaner.
    */
    public BibliotecaView (){
        sc = new Scanner (System.in);
    }

	/**
    * Muestra un mensaje en la consola.
	* 
    * @param mensaje El mensaje que se muestra.
    */
    public void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }

	/**
    * Solicita un número de tipo double
    * @return El número double
    */
    public double pedirDouble () {
		double valor = sc.nextDouble();
		sc.nextLine();
		return valor;
	}

	/**
    * Solicita un número entero

    * @return El número entero
    */
	public int pedirInt () {
		int valor = sc.nextInt();
		sc.nextLine();
		return valor;
	}  
	
	/**
    * Solicita una cadena de texto
    * @return La cadena de texto 
    */
	public String pedirString () {
		return sc.nextLine();
	}
    
}
