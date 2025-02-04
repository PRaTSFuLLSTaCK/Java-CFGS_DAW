package Operadores;

import javax.swing.JOptionPane;

public class Division {
	
	private static int b;
	private static int a;
	private static int division;

	public static void main (String[] args) {
		
		//multipilcacion de tipos enteros
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor numerico entero para a: "));
		
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor numerico entero para b: "));
		
		/*
		 * Podemos multiplicar de dos formas, o bien sin utilizar una variable auxiliar en la que almacenamos la division
		 * 
		 * division = a / b; 
		 * 
		 * o como en la siguiente instruccion en la que mediante parentesis restamos las variables (a * b)
		 */
		
		System.out.println("La division de estas dos variables utilizando la expresion + (a / b) es: " + (a / b));
		
		System.out.println("");//salto de linea
		
		division = a / b;
		
		System.out.println("La division de estas dos variables utilizando la expresion mutiplicacion = a / b es: " + division);
		
		System.out.println("");
		
		//multiplicacion de tipos dobles
		
		/*
		 * Para solicitar los valores cambiamos Integer.parseInt por Double.parseDouble
		 */
		
		double x = 0;
		double y = 0;
		double resultado = 0;
		
		x = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa un valor numerico entero para a: "));
		
		y = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa un valor numerico entero para b: "));
		
		/*
		 * Podemos sumar de dos formas, o bien sin utilizar una variable auxiliar en la que almacenamos la division
		 * 
		 * resultado = x / y; 
		 * 
		 * o como en la siguiente instruccion en la que mediante parentesis dividimos las variables (x / y)
		 */
		
		System.out.println("La division de estas dos variables utilizando la expresion + (x / y) es: " + (x / y));
		
		System.out.println("");//salto de linea
		
		resultado = x / y;
		
		System.out.println("La division de estas dos variables utilizando la expresion resultado = x / y es: " + resultado);
		
		System.out.println("");//imprimir en pantalla el mensaje que queramos con salto de linea.
		
	}

}
