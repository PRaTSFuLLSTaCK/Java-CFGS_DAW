package ejemplosPolimorfismoSinClasesAbstractas;

public class Polimorfismo2 {
	
	public static void main (String args[]) {
		// Crear objetos animal
		Animal animal1 = new Animal ("Perro", 5);
		Animal animal2 = new Animal ("Gato", 4);			
		
		// Crea objeto Pez
		Pez pez1 = new Pez ("Sardina", 3);					
		
		// Crear objetos Ave
		Ave ave1 = new Ave ("Urraca", 7, "negro");
		Ave ave2 = new Ave ("Gorrión", 2, "marrón");		
		
		
		// Ejemplo 2 Polimorfismo => USO DE VECTORES
		System.out.println ("\n Ejemplo 2 de polimorfismo, vector de objetos: ");
		System.out.println (  " ---------------------------------------------");
		
		// Se va a crear un vector de objetos Animal y de sus subclases
		// pero esto objetos de la superclase Animal van a apuntar a objetos de esta superclase
		// o a las de sus subclases: Pez y Ave
		// Ya tenemos variables de la superclase que apuntan a objetos de la subclase
		// v[2] => apunta a pez1 (objeto de la subclase Pez)
		// v[3] => apunta a ave1 (objeto de la subclase Ave)
		Animal [] v = {animal1, animal2, pez1, ave1, ave2};
		
		
		// POLIMORFISMO => mediante variables de la superclase que apuntan a objetos de la subclase,
		//                 se pueden llamar a métodos que estén tanto en la superclase como en la subclase,
		//                 por ejemplo toString() y mover()
		for (int i=0; i<v.length; i++) {
			System.out.println (v[i].toString() ); // no hace falta poner .toString()
			v[i].mover();
		}				
		
	}
}

