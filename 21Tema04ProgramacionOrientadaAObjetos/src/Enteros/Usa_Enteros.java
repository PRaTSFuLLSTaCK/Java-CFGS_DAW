package Enteros;

/*Ejercicio 2)  Crea la clase Usa_Enteros (no tiene atributos) y en el main de la clase Usa_Enteros:

Crear un objeto de clase Enteros (con num1 = 23, y num2= 100) => hazlo con new () y con set()

Muestra por pantalla el valor de los atributos de ese objeto usando los métodos get()
*/

public class Usa_Enteros {
	
	public static void main (String args[]) {
		// crear un objeto Enteros
		Enteros num = new Enteros();
		
		// asignar el valor num1 = 23 y num2 = 100 al objeto numeros
		num.set (23,100);
		
		// Mostrar por pantalla el valor de los atributos del objeto
		num.mostrar();		
				
		// No se puede cambiar desde esta clase (por ser private los atributos)
		// el valor de los atributos con la referencia del objeto
		// OJO, NO FUNCIONARÁ => prueba a descomentar las 3 líneas de código siguientes
		// e intenta compilar => mostrará un error parecido 
		// a Usa_Enteros.java:22: error: num1 has private access in Enteros
		/*
		num.num1 = 77;
		num.num2 = -88;		
		num.mostrar(); */
		
		/* EJERCICIO 3 */
		long suma1 = num.suma();
		System.out.println ("La suma de los atributos del objeto es: " + suma1);
		
		System.out.println ("El producto de los atributos del objeto es: " + num.producto());
		
		
		/* EJERCICIO 4 */
		
		// llamada al constructor sin argumentos
		Enteros objeto1 = new Enteros();
		objeto1.mostrar();
		
		// llamada al constructor con argumentos
		Enteros objeto2 = new Enteros(234,-52);
		objeto2.mostrar();
		
		
		
	}
}


