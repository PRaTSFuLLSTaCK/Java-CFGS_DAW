package Bailarina;

public class bailarina {
	
	private String nombre;
	private double peso;
	private int altura;
	private boolean tutu;
	



	public bailarina(String nombre, double peso, int altura, boolean tutu) {

		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
		this.tutu = tutu;
	}

	public String toString() {
		
		return   nombre + ", peso=" + peso + ", altura=" + altura + ", tutu=" + (tutu ? "Si" : "no") ;
	
	}

	public double getPeso() {
		return peso;
	}
	
}