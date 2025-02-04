package ejemplosPolimorfismoSinClasesAbstractas;

public class Pez extends Animal {	
	
	// esta clase no tiene atributos nuevos, hereda todos de la superclase Animal
	
	// hay que definir el constructor con argumentos
	public Pez (String desc, int edad2) {
		super (desc, edad2);
	}
	
	@Override
	// sobreescribir el método mover
	public void mover () {
		System.out.println ("\n Soy un pez y muevo las aletas para desplazarme");
	}	
	
}

