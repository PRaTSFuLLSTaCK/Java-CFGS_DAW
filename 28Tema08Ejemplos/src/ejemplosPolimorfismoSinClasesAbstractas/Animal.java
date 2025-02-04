package ejemplosPolimorfismoSinClasesAbstractas;

public class Animal {
	
	// atributos
	private String descripcion; // descripción del animal
	private int edad = 0;       // edad 
	
	// constructor
	public Animal (String des, int edad) {
		descripcion = des;
		this.edad = edad;
	}
	
	// especifica como se mueve el animal
	public void mover () {
		System.out.println ("\n Soy un animal y me muevo como puedo :) ");
	} 
	
	@Override // sobrescribir el método de la superclase Object	
	public String toString () {
		return "\n Descripción: " + descripcion + ", edad = " + edad;
	}
	
}

