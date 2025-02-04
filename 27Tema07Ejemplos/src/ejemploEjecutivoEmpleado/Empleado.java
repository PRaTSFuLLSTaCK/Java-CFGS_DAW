package ejemploEjecutivoEmpleado;

public class Empleado {
	
	// atributos de instancia => por norma general: private
	private String nombre;
	private int numEmpleado, sueldo;
	
	// atributo de clase => por norma general: private
	private static int contador = 0;
	
	// Constructor por defecto
	public Empleado () {
		nombre = "Sin_nombre";
		sueldo = 0;
		numEmpleado = ++contador;
	}
	
	// constructor con parámetros
	public Empleado(String nombre, int sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		numEmpleado = ++contador;
	}
	
	// métodos get 
	public String get_nombre () {
		return nombre;
	}
	
	public int get_numEmpleado () {
		return numEmpleado;
	}
	
	public int get_sueldo () {
		return sueldo;
	}
	
	public static int get_contador () {
		return contador;
	}
	
	// métodos set
	public void set_nombre (String nombre) {
		this.nombre = nombre;
	}
	
	/* es mejor no declarar este método set para que el número de empleado lo 
	 * calcule de forma automática, y no haya dos números de empleados iguales
	 * tampoco interesa cambiar el atributo contador con un método set
	public void set_numEmpleado (int num) {
		numEmpleado = num;
	}
	 */
	
	
	public void set_sueldo (int num) {
		sueldo = num;
	}
	
	
	
	// incrementa el sueldo
	protected void aumentarSueldo (int porcentaje) {
		sueldo += (int)(sueldo * porcentaje / 100);
	}
	
	// redefine el método toString de la superclase Object
	// no se puede poner como protected ya que en la superclase Object el método es public
	@Override
	public String toString() {
		return "Num. empleado " + numEmpleado + ". Nombre: " + nombre + ". Sueldo: " + sueldo;
	}
	
	
} // fin clase Empleado
