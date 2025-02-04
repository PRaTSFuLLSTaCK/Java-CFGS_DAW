package ejemplosPolimorfismoSinClasesAbstractas;

public class Ave extends Animal {	
	
	private String color_plumaje;
	
	// hay que definir el constructor con argumentos
	public Ave (String desc, int edad2, String color) {
		super (desc, edad2);
		color_plumaje = color;
	}
	
	@Override
	// sobreescribir el método mover
	public void mover () {
		System.out.println ("\n Soy un ave y muevo las alas para desplazarme");
	}
	
	@Override
	// sobreescribir el método toString() de la superclase
	public String toString () {
		return super.toString() + ", color del plumaje = " + color_plumaje;
	}
	
	public String get_color_plumaje () {
		return color_plumaje;
	}
	
	public void set_color_plumaje (String color) {
		color_plumaje = color;
	}
	
}

