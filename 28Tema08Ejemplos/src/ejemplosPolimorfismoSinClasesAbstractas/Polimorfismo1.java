package ejemplosPolimorfismoSinClasesAbstractas;

public class Polimorfismo1 {
	
	public static void main (String args[]) {
		// Crear objeto Animal
		Animal animal1 = new Animal ("Perro", 5);			
				
		
		// Crear objetos Ave
		Ave ave1 = new Ave ("Urraca", 7, "negro");		
		
		
		// Ejemplo 1 POLIMORFISMO
		// mediante una variable de la superclase que apunta a un objeto de la subclase,
		// se pueden llamar a métodos que estén tanto en la superclase como en la subclase,
		// por ejemplo toString() y mover()
		
		System.out.println ("\n Ejemplo 1 de polimorfismo: ");
		
		// Paso 1) Apuntar con una variable de la superclase => animal3 a otra de la subclase => ave1
		Animal animal3 = ave1;
		
		/* Paso 2) Con esta variable animal3 llamar a los métodos que estén 
		 *         tanto en la subclase como en la superclase */
		System.out.println (animal3.toString() );
		animal3.mover();
		
		/* ERROR: Con una variable de la superclase que apunta a una subclase, 
		 * no puedes llamar a métodos que estén en la subclase pero no en la superclase
		 * Por ejemplo: prueba a descomentar la siguiente línea de código y verás que sucede: */
		
		// System.out.println ("Color del plumaje: " + animal3.get_color_plumaje());
		
		// Para conseguir que una variable de la superclase llame a métodos solo de la superclase
		// hay que hacerlo mediante la conversión descendente: 		
		Ave ave_prueba = (Ave) animal3;
		System.out.println ("\n Color del plumaje: " + ave_prueba.get_color_plumaje());
		
		
				
		
	}
}

