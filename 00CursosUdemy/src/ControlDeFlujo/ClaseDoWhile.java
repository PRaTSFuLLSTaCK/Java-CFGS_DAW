package ControlDeFlujo;

import javax.swing.JOptionPane;

public class ClaseDoWhile {

	public static void main(String[] args) {
		
		/*
		 * Do While es un ciclo de repeticion, se suelen utilizar para realizar menus
		 * 
		 * 
		 * Si la condicion es false, el bucle no se va a ejecutar nunca. Solo entraria en el bucle si la condicion es true.
		 */
		
		int numero = 0;
		
		/*
		 * Solicitamos ingresar el valor de la variable
		 * 
		 * Con esto nos aseguramos de que se ejecuta a una vez almenos,
		 * 
		 * y se repetira siempre que sea distinto de 5
		 * 
		 * 
		 */
		
		do {
			
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero del 1 al 5."));
			
			switch(numero) {
			
			case 1:
				
				System.out.println("El numero introducido es 1.");//imprimir en pantalla el mensaje que queramos con salto de linea.
				System.out.println("Hola Mundo");//imprimir en pantalla el mensaje que queramos con salto de linea.
				
				break;
				
			case 2:
				
				System.out.println("El numero introducido es 2.");//imprimir en pantalla el mensaje que queramos con salto de linea.
				System.out.println("Hola buenos dias");//imprimir en pantalla el mensaje que queramos con salto de linea.
				
				break;
				
				
			case 3:
					
				System.out.println("El numero introducido es 3.");//imprimir en pantalla el mensaje que queramos con salto de linea.
				System.out.println("Hola buenas tardes");//imprimir en pantalla el mensaje que queramos con salto de linea.
					
				break;
					
			case 4:
					
				System.out.println("El numero introducido es 4.");//imprimir en pantalla el mensaje que queramos con salto de linea.
				System.out.println("Hola buenas noches");//imprimir en pantalla el mensaje que queramos con salto de linea.
					
				break;
				
				
			case 5:// en este caso se valida la condicion del while y solo se ejecutara una vez el bucle
				
				System.out.println("El numero introducido es 5.");//imprimir en pantalla el mensaje que queramos con salto de linea.
				System.out.println("Hola gracias por utilizar el programa");//imprimir en pantalla el mensaje que queramos con salto de linea.
				
				break;
				
			default:
				
				System.out.println("Error, usted no ha seleccionado un numero dentro del rango");//imprimir en pantalla el mensaje que queramos con salto de linea.
			}
			
		}while (numero != 5);
			
		
		
		System.out.println("El programa ha finalizado.");//imprimir en pantalla el mensaje que queramos con salto de linea.
		

	}

}
