package Operadores;

import javax.swing.JOptionPane;

public class Resta {
	
	private static int b;
	private static int a;
	private static int resta;

	public static void main (String[] args) {
		
		//resta de tipos enteros
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor numerico entero para a: "));
		
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor numerico entero para b: "));
		
		/*
		 * Podemos restar de dos formas, o bien sin utilizar una variable auxiliar en la que almacenamos la resta
		 * 
		 * resta = a - b; 
		 * 
		 * o como en la siguiente instruccion en la que mediante parentesis restamos las variables (a - b)
		 */
		
		System.out.println("La resta de estas dos variables utilizando la expresion + (a - b) es: " + (a - b));
		
		System.out.println("");//salto de linea
		
		resta = a - b;
		
		System.out.println("La resta de estas dos variables utilizando la expresion resta = a - b es: " + resta);
		
		System.out.println("");
		
		//resta de tipos dobles
		
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
		
		System.out.println("La resta de estas dos variables utilizando la expresion + (x - y) es: " + (x - y));
		
		System.out.println("");//salto de linea
		
		resultado = x - y;
		
		System.out.println("La resta de estas dos variables utilizando la expresion resultado = x - y es: " + resultado);
		
		System.out.println("");//imprimir en pantalla el mensaje que queramos con salto de linea.
		
	}

}
