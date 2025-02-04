package carpinteria;

public class Montaje implements Carpinteria {
	// atributos de instancia
	Producto_Carpinteria producto;
	Trabajador trabajador;
	int horas_trabajadas;
	String direccion;
	// atributo de clase		
	static int numero_montajes = 0;
	
	// Constructor
	public Montaje (Producto_Carpinteria prod, Trabajador trab, int horas, String dir) {	
		producto = prod;
		trabajador = trab;
		horas_trabajadas = horas;
		direccion = dir;
		// llevar la cuenta del número de montajes
		numero_montajes ++;	
		// incrementar la paga del trabajador	
		trabajador.incrementar_paga (paga_trabajador());
	} // fin constructor

	// implementar el método de la interfaz		
	public double paga_trabajador () {	
		return horas_trabajadas * 10 + 10;
	}
	
	public Trabajador get_trabajador () {
		return trabajador;
	}
	

} // fin clase Montaje
