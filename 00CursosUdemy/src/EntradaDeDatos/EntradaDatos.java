package EntradaDeDatos;

import javax.swing.JOptionPane;

public class EntradaDatos {
	
public static void main (String[] args) {
	
	//creamos las variables
	
	int numeroEntero;
	String cadenaCaracteres;
	
	//Inicializamos las variables
	
	numeroEntero = 10;
	cadenaCaracteres = "Hola Mundo ";
	
	/*
	 * Pedimos que nos introduzcan un valor para esas variables si nos damos cuenta
	 * para un valor numerico necesitamos primero hacer el Integer.parseInt
	 */
	
	numeroEntero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor numerico entero: "));
	
	/*
	 * Con una cadena de caracteres no es necesario podemos directamente utilizar el JOptionPlane para 
	 * que nos ingrese los datos
	 */
	
	cadenaCaracteres = JOptionPane.showInputDialog(null, "Ingresa una cadena de caracteres: ");
	
	
		
	//System.out.println("Hola Mundo");//imprimir en pantalla el mensaje que queramos con salto de linea.
		
	}

}
