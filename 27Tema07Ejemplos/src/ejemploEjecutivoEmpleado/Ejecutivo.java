package ejemploEjecutivoEmpleado;

public class Ejecutivo extends Empleado {
	
	/* La clase Ejectutivo hereda de la clase Empleado todos sus métodos y atributos,
	 * excepto el constructor de la superclase que no se hereda */ 
	 

	// atributo de instancia
	private int presupuesto;

	// Constructor por defecto      
	Ejecutivo () {
		// sino lo pones => super() => hace lo mismo, 
		// ya que en el constructor por defecto se hace una llamada implicita 
		// al constructor por defecto de la superclase
		// super(); 
		presupuesto = 0;
	}

	// constructor 2
	Ejecutivo (String nombre, int sueldo) {
		// llamada explícita al constructor de la superclase
		super(nombre,sueldo);
		// poner a cero el presupuesto
		presupuesto = 0;
	}

	// constructor 3
	Ejecutivo (String nombre, int sueldo, int presupuesto2) {
		// llamada explícita al constructor de la superclase
		super(nombre,sueldo);
		// modificar el atributo presupuesto
		presupuesto = presupuesto2;
	}

	//
	public void asignarPresupuesto(int p) {
		presupuesto = p;
	}
	
	// redefine el método toString de la superclase	
	@Override
	public String toString() {
		return super.toString() + ". Presupuesto = " + presupuesto;		
	}
} // fin clase Ejecutivo

