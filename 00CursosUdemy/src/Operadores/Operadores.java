package Operadores;

import javax.swing.JOptionPane;

public class Operadores {
	
	static int dividendo = 0;
	static int divisor = 0;
	static int cociente = 0;
	static int resto = 0;
	
	

	public static void main (String[] args) {
		
		//solicitamos los datos con los que vamos a operar 
	
		dividendo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor numerico entero: "));
		
		divisor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor numerico entero: "));
		
		cociente = dividendo / divisor; //con este operador / sacamos el cociente entero de una division.
		resto = dividendo % divisor; // con este operador % sacamos el resto de una division entera.
		
		//imprimir en pantalla el mensaje que queramos sin salto de linea.
		
			System.out.print("El cociente de la division entre " + dividendo);
			System.out.print("/" +  divisor);
			System.out.print(" es: " +  cociente);
			
			System.out.println(" ");//salto de linea
			
			System.out.print("El resto de la division entre " + dividendo);
			System.out.print("/" +  divisor);
			System.out.print(" es: " +  resto);
			
		
	}
}
