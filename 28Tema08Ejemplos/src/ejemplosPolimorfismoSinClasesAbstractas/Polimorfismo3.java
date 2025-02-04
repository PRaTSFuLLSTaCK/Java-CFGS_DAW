package ejemplosPolimorfismoSinClasesAbstractas;

public class Polimorfismo3 {
	
	public static void main (String args[]) {
		// Crear objetos animal
		Animal animal1 = new Animal ("Perro callejero", 5);
		Animal animal2 = new Animal ("Gato", 4);			
		
		// Crea objeto Pez
		Pez pez1 = new Pez ("Sardina", 3);		
				
		
		// Crear objetos Ave
		Ave ave1 = new Ave ("Urraca", 7, "negro");
		Ave ave2 = new Ave ("Gorrión", 2, "marrón");
		Ave ave3 = new Ave ("Paloma", 3, "blanca");
		
		// Ejemplo 3: Polimorfismo, conversión descendente y Operador instanceof
		System.out.println ("\n Ejemplo 3 de polimorfismo => operador instanceof ");
		System.out.println (  " ------------------------------------------------");
		
		// ¿Pero y si quiero recorrer todo el vector y usar métodos específicos de una subclase?
		// Tengo que hacer la conversión descendente, pero antes necesito saber de que clase 
		// es el elemento del vector que estoy accediendo mediante el Operador instanceof
		
		// Vector de objetos Animal y de sus subclases
		Animal [] v = {animal1, animal2, pez1, ave1, ave2, ave3};
		
		// for mejorado para recorrer el vector
		for (Animal elemento: v) {			
			
			// comprobar si el elemento del vector es de la clase Ave
			if (elemento instanceof Ave) { // no hace falta poner == true
			
				// conversión descendente
				Ave aux_ave = (Ave) elemento; 
				
				// Cambiar el color del plumaje a verde
				aux_ave.set_color_plumaje ("verde");				
			}
			
			// Llamada al método toString()
			System.out.println (elemento);
		}

		
		
		
		
				
		
	}
}

