package Enteros;

/*Ejercicio 5) Crea la clase Notas, que dispone de

Atributos de instancia (privados):
•	nota1, nota y nota3 => estos 3 atributos son reales

Dos constructores:
•	Sin argumentos (pone las notas a cero al crear el objeto)
•	Con argumentos (inicializa el valor de las 3 notas al crear el objeto con los valores pasados como argumentos o parámetros)

Métodos de instancia:
•	set ( ) => cambia el valor de los atributos nota1, nota2 y nota3
•	get () => devuelven el valor de los atributos de la clase
•	get_nota1 () => devuelve el valor de nota1
•	get_nota2 () => devuelve el valor de nota2
•	get_nota3 () => devuelve el valor de nota3
•	nota_media () => devuelve el valor de la nota media de las 3 notas (3 atributos de la clase)

En el main de esta clase Notas:

•	Crea un objeto de la clase Notas con todas las notas a cero.
•	Muestra por pantalla el valor de los atributos (las 3 notas) de ese objeto usando los métodos get()
•	Cambia el valor de las notas del anterior objeto y pon todas las notas con el valor 10 => usa el método set()
•	Muestra por pantalla el valor de los atributos (las 3 notas) de ese objeto usando los métodos get() para comprobar que tienen el valor correcto (un 10 en todas las notas).
•	Muestra la nota media de las calificaciones de ese objeto => usa el método nota_media()
•	Crea un segundo objeto de la clase Notas pero con las siguientes notas (5, 4.6, 7.8)
•	Muestra por pantalla el valor de los atributos (las 3 notas) de ese nuevo objeto usando los métodos get()
•	Muestra la nota media de las calificaciones de ese nuevo objeto => usa el método nota_media()
*/

public class Notas {
	// Atributos de instancia o de objeto
	double nota1, nota2, nota3;
	
	// Constructor 1 => por defecto (sin argumentos)
	// pone las notas a cero al crear el objeto
	public Notas () {
		nota1 = 0;
		nota2 = 0;
		nota3 = 0;
	}
	
	// Constructor 2
	// inicializa el valor de las 3 notas al crear el objeto 
	// con los valores pasados como argumentos o parámetros
	public Notas (double n1, double n2, double n3) {
		nota1 = n1;
		nota2 = n2;
		nota3 = n3;
	}
	
	
	// métodos de instancia o de objeto
	
	// E: n1, n2, n3 => 3 notas
	// S: nada, actualiza los atributos nota1, nota2 y nota3
	//    con los valores recibidos en n1, n2 y n3
	public void set (double n1, double n2, double n3) {
		nota1 = n1;
		nota2 = n2;
		nota3 = n3;
	}
	
	
	public double get_nota1 () {
		return nota1;
	}
	
	public double get_nota2 () {
		return nota2;
	}
	
	public double get_nota3 () {
		return nota3;
	}
	
	// devuelve la nota media de los atributos nota1, nota2 y nota3
	public double nota_media () {
		return (nota1 + nota2 + nota3) / 3;
	}
	
	// muestra las notas del objeto de tipo Notas por pantalla
	public void muestra () {
		double n1, n2, n3;
		
		/* dentro de un método de instancia puedo llamar 
		 * a otro método de instancia (de esta misma clase)
		 * sin necesidad de poner el objeto antes del método */
		n1 = get_nota1();
		n2 = get_nota2();
		n3 = get_nota3();
		
		System.out.println ("Las notas son: " + n1 + ", " + n2 + ", " + n3);		
	}
	
	
	public static void main (String args[]){
		
		/* Crea un objeto de la clase Notas con todas las notas a cero */
		Notas calif = new Notas ();
		
		// Muestra por pantalla el valor de los atributos (las 3 notas)
		calif.muestra();
		
		// Cambia el valor de las notas del anterior objeto y pon todas las notas con el valor 10
		calif.set (10,10,10);
		
		// Muestra por pantalla el valor de los atributos (las 3 notas)
		calif.muestra();
		
		// Muestra la nota media de las calificaciones => usa el método nota_media() */
		System.out.println ("La nota media es: " + calif.nota_media() );		
		
		
		// Crear un segundo objeto
		Notas calif2 = new Notas (5, 4.6, 7.8);
		
		// Muestra por pantalla el valor de los atributos (las 3 notas) de ese segundo objeto
		calif2.muestra();
		
		// Muestra la nota media de las calificaciones del segundo objeto  
		// => usa el método nota_media()
		System.out.println ("La nota media es: " + calif2.nota_media() );		
		
		
		// Para probar con más valores de los que te pide el ejercicio:
		
		// Cambia el valor de las notas 
		calif.set (5.5,7.5,5);
		
		// Muestra por pantalla el valor de los atributos (las 3 notas)
		calif.muestra();
		
		// Muestra la nota media de las calificaciones => usa el método nota_media() */
		System.out.println ("La nota media es: " + calif.nota_media() );
		
	} // fin main
	
} // fin clase Notas

