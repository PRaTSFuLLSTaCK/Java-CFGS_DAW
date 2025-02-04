package Enteros;

/*Ejercicio 1)  Crea la clase Enteros que dispone de

Atributos instancia (privados):
•	num1 => entero
•	num2 => entero

Métodos de instancia:

set ( )=> cambia el valor de los atributos num1 y num2

get_num1 () => devuelve el valor de num1
get_num2 () => devuelve el valor de num2


En el main de esta clase Enteros:

Crea un objeto de clase Enteros (con num1 = 5, y num2= -7) => hazlo con new () y con set()

Muestra por pantalla el valor de los atributos de ese objeto usando los métodos get()
*/

public class Enteros {
	
	// atributos de instancia
	private int num1, num2;
	
	
	/* EJERCICIO 4 */
	
	// constructor1 => sin argumentos
	Enteros () {
		num1 = 0;
		num2 = 0;
	}
	
	// constructor2 => con argumentos
	Enteros (int a, int b) {
		num1 = a;
		num2 = b;
	}
	
	/* FIN ==== EJERCICIO 4 ==== */
	
	
	// Métodos de instancia
	
	/* cambia el valor de los atributos num1 y num2 */
	public void set (int a, int b) {
		num1 = a;
		num2 = b;
	}
	
	// métodos get => devuelven el valor de los atributos
	
	public int get_num1 () {
		return num1;
	}
	
	public int get_num2 () {
		return num2;
	}
	
	// mostrar por pantalla el valor de los atributos
	public void mostrar ()	{
		System.out.println ("num1 = " + num1);
		System.out.println ("num2 = " + num2);
	}
	
	
	/* EJERCICIO 3 */
	
	// para no perder precisión devuelve la suma en un entero largo */
	public long suma () {
		return num1+num2;
	}
	
	// para no perder precisión devuelve el producto en un entero largo */
	public long producto () {
		return num1*num2;
	}
	
	/* FIN ===== EJERCICIO 3 ===== */
	
	
	// método main => método estático o de clase
	public static void main (String args[]) {
		// crear un objeto Enteros
		Enteros numeros = new Enteros();
		
		// asignar el valor num1 = 5 y num2= -7 al objeto numeros
		numeros.set (5,-7);
		
		// Mostrar por pantalla el valor de los atributos del objeto
		numeros.mostrar ();
		
		// También se podía cambiar desde la clase Enteros solamente, (por ser private)
		// el valor de los atributos con la referencia del objeto
		// OJO, pero no se recomienda, mejor con métodos set
		numeros.num1 = 44;
		numeros.num2 = -54;
		
		numeros.mostrar();		
		
	} // fin main
	
} // fin clase Enteros

