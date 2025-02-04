package SalidaDeDatos;

import javax.swing.JOptionPane;

public class SalidaDatos {
	
	public static void main (String[] args) {
		
		//creamos las variables
		
		int numeroEntero;
		String cadenaCaracteres;
		
		//Inicializamos las variables
		
		numeroEntero = 10;
		cadenaCaracteres = "Hola Mundo ";
		
		//nos va a mostar los valores con los que inicializamos las variables.
		
		System.out.println("El numero entero es: " + numeroEntero);//imprime el valor numerico introducido.
		
		System.out.println("La cadena dice lo siguiente: " + cadenaCaracteres);//Imprime el valor de la cadena introducida.
		
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
		
		
			
		System.out.println("El numero entero es: " + numeroEntero);//imprime el valor numerico introducido.
		
		System.out.println("La cadena dice lo siguiente: " + cadenaCaracteres);//Imprime el valor de la cadena introducida.
			
		}


}
