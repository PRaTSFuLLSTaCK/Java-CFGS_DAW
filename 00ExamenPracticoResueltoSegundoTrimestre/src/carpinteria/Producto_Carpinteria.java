package carpinteria;

public abstract class Producto_Carpinteria implements Carpinteria {
	// Atributos de instancia
	String descripcion;
	int horas_trabajadas;
	int id_producto;
	double precio_material;
	Trabajador trabajador;
	
	// atributo de clase
	static int numero_articulos = 0;
	
	// constructor
	public Producto_Carpinteria (String desc, Trabajador trabaja, int horas) {
		descripcion = desc;
		horas_trabajadas = horas;
		// llevar la cuenta del número de montajes
		numero_articulos ++;
		id_producto = numero_articulos;
		// no se pone aquí el precio_material, de eso se encargarán las subclases
		trabajador = trabaja;	
	} // fin constructor
	
	// definir el método abstracto que después implementarán las subclases
	public abstract double coste_fabricacion();
	
	public double get_precio_material () {
		return precio_material;
	}
	
	public void set_precio_material (double precio) {
		precio_material = precio;
	}
	
	public double get_horas_trabajadas () {
		return horas_trabajadas;
	}
	
	public int get_id_producto () {
		return id_producto;
	}
	
	public void set_id_producto (int num) {
		id_producto = num;
	}
	
	public Trabajador get_trabajador () {
		return trabajador;
	}
	

} // fin clase Producto_Carpinteria
