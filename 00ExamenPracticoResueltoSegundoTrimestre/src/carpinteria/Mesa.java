package carpinteria;

public class Mesa extends Producto_Carpinteria {
	// atributo de clase	
	static int numero_mesas = 0;
	// atributo de instancia
	boolean formica;
	
	// constructor
	public Mesa (String desc, Trabajador trabaja, int horas, double precio, boolean formica2) {
		// llamar al método de la superclase	
		super (desc, trabaja, horas);
		// establecer el precio de la mesa
		this.set_precio_material (precio);		
		formica = formica2;
		// llevar la cuenta del número de mesas
		numero_mesas ++;	
		// incrementar la paga del trabajador	
		trabaja.incrementar_paga (paga_trabajador());
	} // fin constructor

	// implementar el método de la interfaz	
	public double paga_trabajador () {	
		return get_horas_trabajadas()*15;
	}

	// implementar el método abstracto que hereda de la superclase	
	public double coste_fabricacion () {
		return get_precio_material () + paga_trabajador();
	}

} // fin Mesa
