package Enteros;

/*Ejercicio 6) Crea la clase Alumno, que dispone de

Atributos instancia (privados):
•	Nombre (cadena de caracteres)
•	Numero_matricula (no superior a 1000) => ajusta con un tipo de dato entero que ahorre el mayor espacio en memoria.
•	Calificaciones => será de tipo Notas => de la clase Notas creada anteriormente

Dos constructores:
•	Sin argumentos (no da ningún valor inicial a los atributos de la clase, pero ten en cuenta que  al crear el objeto, el atributo calificaciones es un objeto que no se ha creado aún, por lo tanto, aquí se deberás crear el objeto de tipo Notas que será asignado al atributo Calificaciones)
•	Con argumentos: tiene los siguientes argumentos (Nombre1, num_matricula, calificacion1, calificacion2, calificacion3) ==> primero deberás crear el objeto de tipo Notas que será asignado al atributo Calificaciones, y poner como valores iniciales del objeto al crearse los argumentos o parámetros anteriores.

Métodos de instancia:
•	set ( ) => cambia el valor de los atributos del objeto
•	get () => devuelven el valor de los atributos del objeto => crea todos los métodos get que necesites.

En el main de esta clase Alumno:

•	Crea un objeto de la clase Alumno con el constructor sin argumentos y después asigna mediante el método set() los siguientes valores a ese objeto Alumno:
•	Nombre: “Evaristo”
•	Número de matrícula: 733
•	Notas (8, 8.6, 7.55)
•	Muestra por pantalla el valor de los datos de ese alumno (objeto anterior), usando los métodos get()
•	Muestra la nota media de las calificaciones de ese alumno => usa el método nota_media()
•	Crea un nuevo objeto de la clase Alumno con el constructor con argumentos y establece los siguientes valores a ese objeto Alumno:
•	Nombre: “María”
•	Número de matrícula: 525
•	Notas (9, 5.4, 7.44)
•	Muestra por pantalla el valor de los datos de ese nuevo alumno (objeto anterior), usando los métodos get()
•	Muestra la nota media de las calificaciones de ese nuevo alumno => usa el método nota_media()
*/

public class Alumno {
	
	/* Atributos instancia  y privados */
	private String nombre; // nombre del alumno
	private short numero_matricula; // no superior a 1000 (el tipo byte no vale => llega a 127 como mucho)
	private Notas calificaciones;  // objeto de la clase Notas
	
	/* Constructor 1 => Sin argumentos (no da ningún valor inicial 
	 * a los atributos de la clase, pero ten en cuenta que  al crear el objeto, 
	 * el atributo calificaciones es un objeto que no se ha creado aún, 
	 * por lo tanto, aquí se deberás crear el objeto de tipo Notas que será asignado 
	 * al atributo Calificaciones) */
	public Alumno () {
		// hay que reservar memoria con new() al objeto calificaciones
		calificaciones = new Notas();
		
		// el objeto calificaciones tendrá sus 3 notas a cero
		// porque el constructor por defecto de la clase Notas hace esto		
	}
	
	
	/* Constructor 2 => Con argumentos: 
	 * E: Nombre1 => nombre del alumno
	 *    num_matricula => número de matrícula 
	 *    calificacion1, calificacion2, calificacion3 => notas del alumno
	 * S: crea un objeto con los valores iniciales proporcionados en los argumentos */
	public Alumno (String nombre1, short num_matricula, double calificacion1,
	                 double calificacion2, double calificacion3) {
						 
		nombre = nombre1;
		numero_matricula = num_matricula;
		
		// hay que reservar memoria con new() al objeto calificaciones
		// y se le pasan las calificaciones a la misma vez
		calificaciones = new Notas (calificacion1, calificacion2, calificacion3); 						 
	}
	
	
	// métodos set y get
	
	// cambia el valor de los atributos del objeto
	public void set (String nombre1, short num_matricula, double calificacion1,
	                 double calificacion2, double calificacion3) {
						 
		nombre = nombre1;
		numero_matricula = num_matricula;
		
		// cambiar las notas del objeto calificaciones con las que recibe este método
		calificaciones.set (calificacion1, calificacion2, calificacion3);		
	}
	
	
	public String get_nombre () {
		return nombre;
	}
	
	public short get_numero_matricula () {
		return numero_matricula;
	}
	
	public Notas get_calificaciones() {
		// devuelve el atributo calificaciones que es un objeto
		return calificaciones;
	}
	
	// también se podrían definir más métodos get para obtener 
	// las notas una a una y no en un objeto
	// Ojo, aunque se llame el método igual que en la clase Notas
	// no hay problema en hacerlo así, ya que se diferencian los métodos
	// por pertenecer a clases distintas
	public double get_nota1 () {
		return calificaciones.get_nota1();
	}
	
	public double get_nota2 () {
		return calificaciones.get_nota2();
	}	
	
	public double get_nota3 () {
		return calificaciones.get_nota3();
	}
	
	// muestra los datos del alumno (objeto de tipo Alumno) por pantalla
	public void muestra () {
		System.out.println ("Nombre: " + get_nombre() );
		System.out.println ("Número de matrícula: " + get_numero_matricula() );
		
		// mostrar las calificaciones del alumno actual
		calificaciones.muestra();		
	}
	
	
	public static void main (String args[]) {
	
		// Crea un objeto de la clase Alumno con el constructor sin argumentos 
		Alumno evaristo = new Alumno ();
		
		/* asigna mediante el método set() los siguientes valores a ese objeto Alumno:
		 * Nombre: "Evaristo", Número de matrícula: 733, Notas (8, 8.6, 7.55) */		
		evaristo.set ("Evaristo", (short) 733, 8, 8.6, 7.55); // forzado de tipo (short)
		
		// Muestra por pantalla los datos del alumno evaristo
		evaristo.muestra();
		
		// Muestra la nota media de las calificaciones de evaristo
		System.out.println ("La nota media de " + evaristo.get_nombre() + 
		                    " es " + evaristo.calificaciones.nota_media() );
		                    
		                    
		/* Crea un nuevo objeto de la clase Alumno con los datos:
		 * Nombre: “María”, Número de matrícula: 525, Notas (9, 5.4, 7.44) */
		Alumno maria = new Alumno ("María", (short) 525, 9, 5.4, 7.44);
		
		// Muestra por pantalla los datos del alumno evaristo
		maria.muestra();
		
		// Muestra la nota media de las calificaciones de maria
		System.out.println ("La nota media de " + maria.get_nombre() + 
		                    " es " + maria.calificaciones.nota_media() );
		                    	
	} // fin main
	
} // fin clase Alumno


