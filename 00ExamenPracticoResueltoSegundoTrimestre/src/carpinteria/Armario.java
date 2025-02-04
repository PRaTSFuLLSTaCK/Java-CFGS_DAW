package carpinteria;

public class Armario extends Producto_Carpinteria {
	// atributo de clase
	static int numero_armarios = 0; // total de armarios que se construyen
	// atributo de instancia
	int numero_puertas;
	
	// constructor
	public Armario (String desc, Trabajador trabaja, int horas, double precio, int puertas) {
		// llamada al constructor de la superclase	
		super (desc, trabaja, horas);
		// establecer el precio del armario
		set_precio_material (precio);		
		numero_puertas = puertas;
		// llevar la cuenta de los armarios construidos
		numero_armarios ++;		
		// incrementar paga trabajador	
		trabaja.incrementar_paga (paga_trabajador());
	} // fin constructor
	
	// implementar el método de la interfaz	
	public double paga_trabajador () {	
		return get_horas_trabajadas()*15 +10;
	}
	
	// implementar el método que hereda de la superclase abstracta
	public double coste_fabricacion () {
		return get_precio_material () + numero_puertas * 20 + paga_trabajador();
	}	

} // fin clase Armario
