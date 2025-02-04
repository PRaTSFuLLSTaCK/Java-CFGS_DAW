package Ejercicios_Metodos;

public class Metodos_clase {
	
	// EJERCICIO 1
	
	/* Entrada: num => número real
	   Salida: devuelve el cuadrado de num (num*num) */
	public static double cuadrado (double num) {
		// escribe el código del método aquí
		return num*num;

	} 
	
	// EJERCICIO 3
	
	/* Entrada: descuento => descuento a aplicar
				precio => precio inicial del producto
	   Salida: devuelve el precio final aplicado el descuento */
	public static double precio_final (double descuento, double precio) {
		// escribe el código del método aquí
		
		double p_final = precio - precio * descuento / 100;
		
		return p_final;		
	} 
	
	public static void main (String args[]) {
		// EJERCICIO 2				
		
		System.out.println ("El cuadrado de 20.5 es: " + Metodos_clase.cuadrado (20.5) );
		
		// si estamos en la misma clase que se definió el método de clase 
		// no hace falta poner la clase antes del nombre del método
		System.out.println ("El cuadrado de 30 es: " + cuadrado (30) );
		
		
		// EJERCICIO 4		
		// Precio final para un precio inicial de 150€ y un descuento del 25%
		
		double total = Metodos_clase.precio_final (25, 150);		
		System.out.println ("El precio final con un precio de 150€ y un descuento del 25% es " + total);
		
		// si estamos en la misma clase que se definió el método de clase 
		// no hace falta poner la clase antes del nombre del método
		total = precio_final (10, 100);		
		System.out.println ("El precio final con un precio de 100€ y un descuento del 10% es " + total);					
		
	} // fin main
	
} // fin clase Metodos_clase
