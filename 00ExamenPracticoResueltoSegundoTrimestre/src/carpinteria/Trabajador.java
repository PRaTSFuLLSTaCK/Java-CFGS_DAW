package carpinteria;

public class Trabajador {

	// Atributos de instancia
	String nombre;
	String NIF;	
	double total_paga = 0;
	
	// constructor
	public Trabajador (String nomb, String nif) {
		nombre = nomb;
		NIF = nif;	
	}
	
	public void set_total_paga (double paga) {
		total_paga = paga; 
	}
	public double get_total_paga () {
		return total_paga; 
	}
	
	// incrementa la paga del trabajador	
	public void incrementar_paga (double paga) {
		total_paga += paga;
	}
	
	public String get_nombre () {	
		return nombre;
	}
	
} // fin clase Trabajador


