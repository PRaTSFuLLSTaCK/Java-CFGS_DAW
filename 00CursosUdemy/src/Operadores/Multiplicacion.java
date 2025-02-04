package Operadores;

import javax.swing.JOptionPane;

public class Multiplicacion {
	
	private static int b;
	private static int a;
	private static int multiplicacion;

	public static void main (String[] args) {
		
		//multipilcacion de tipos enteros
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor numerico entero para a: "));
		
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor numerico entero para b: "));
		
		/*
		 * Podemos multiplicar de dos formas, o bien sin utilizar una variable auxiliar en la que almacenamos la multiplicacion
		 * 
		 * multiplicacion = a * b; 
		 * 
		 * o como en la siguiente instruccion en la que mediante parentesis restamos las variables (a * b)
		 */
		
		System.out.println("La multiplicacion de estas dos variables utilizando la expresion + (a * b) es: " + (a * b));
		
		System.out.println("");//salto de linea
		
		multiplicacion = a * b;
		
		System.out.println("La multiplicacion de estas dos variables utilizando la expresion mutiplicacion = a * b es: " + multiplicacion);
		
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
		 * Podemos sumar de dos formas, o bien sin utilizar una variable auxiliar en la que almacenamos la suma
		 * 
		 * resultado = x + y; 
		 * 
		 * o como en la siguiente instruccion en la que mediante parentesis sumamos las variables (x + y)
		 */
		
		System.out.println("La multiplicacion de estas dos variables utilizando la expresion + (x * y) es: " + (x * y));
		
		System.out.println("");//salto de linea
		
		resultado = x * y;
		
		System.out.println("La multiplicacion de estas dos variables utilizando la expresion resultado = x * y es: " + resultado);
		
		System.out.println("");//imprimir en pantalla el mensaje que queramos con salto de linea.
		
	}

}
