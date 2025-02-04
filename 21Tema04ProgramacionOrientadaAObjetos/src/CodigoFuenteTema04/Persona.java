package CodigoFuenteTema04;

public class Persona {
	
	// variables miembro de la clase, atributos o propiedades, es mejor declarar los     
    // atributos privados, para que no puedan ser modificados desde otras clases    
	private String nombre;
	private int dni;
	private short edad;	
	
	// Los métodos normalmente se deben declarar públicos		
	
	// Los métodos set son para cambiar el valor de los atributos de la clase
	public void set (String nombre1, int dni1, short edad1) {
		nombre = nombre1;
		dni = dni1;
		edad = edad1;		
	}	
	
	
	// los métodos get son para devolver el valor de los atributos de la clase
	public String get_nombre () {
		return nombre;
	}
	
	public int get_dni () {
		return dni;
	}	
	
	public short get_edad () {
		return edad;
	}
	
	// Calcular si es mayor de edad 
	public boolean mayor_edad () {
		boolean resul = edad >= 18;
		return resul;
	}	
	
	public static void main (String args[]) {
		
		// creación de un objeto de la clase Persona
		Persona individuo = new Persona();
		
		// Hay que darle un valor a los atributos del objeto individuo
		individuo.set ("Pepe", 45673422, (short)18);
		
		// Mostrar los atributos del objeto persona
		String nombre_persona = individuo.get_nombre ();
		System.out.println ("Nombre: " + nombre_persona);		
		System.out.println ("DNI: " + individuo.get_dni());		
		System.out.println ("Edad: " + individuo.get_edad());		
		
		// Mostrar si es mayor de edad
		System.out.println ("Mayor de edad: " + individuo.mayor_edad());
				
	} // fin main
	
} // fin clase Persona


