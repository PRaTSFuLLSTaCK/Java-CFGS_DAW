package carpinteria;

public class Estanteria extends Producto_Carpinteria {
	// atributo de clase
	static int numero_estanterias = 0;
	// atributo de instancia
	int numero_patas;
	
	// constructor
	public Estanteria (String desc, Trabajador trabaja, int horas, double precio, int patas) {	
		// llamar al método de la superclase
		super (desc, trabaja, horas);
		// establecer el precio de la estanteria
		this.set_precio_material (precio);
		numero_patas = patas;
		// llevar la cuenta del número de estanterias
		numero_estanterias ++;	
		// incrementar la paga del trabajador	
		trabaja.incrementar_paga (paga_trabajador());	
	} // fin constructor
	
	// implementar el método de la interfaz
	public double paga_trabajador () {	
		return get_horas_trabajadas()*15;
	}
	
	// implementar el método abstracto que hereda de la superclase
	public double coste_fabricacion () {
		return get_precio_material () + numero_patas * 10 + paga_trabajador();
	}	

} // fin clase Estanteria
