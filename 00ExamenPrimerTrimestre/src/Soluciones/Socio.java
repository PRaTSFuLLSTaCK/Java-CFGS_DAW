package Soluciones;

public class Socio {

	// atributos de instancia => 0,3 ptos
	private String nombre_socio; 	// nombre y apellidos del socio de un club
	private byte tiempo;			// tiempo => años que lleva siendo socio
	private double cuota; 		
	/* cuota => cuota en euros que paga el socio de forma anual, esta cuota 	depende de los años de antigüedad que esté en el club.
		Si el socio lleva menos de 3 años no se le hace descuento, por lo tanto debe pagar la cuota_base.
		Si el socio lleva de 3 años a 5 años se le hace un descuento del 20% sobre la cuota_base.
		Si el socio lleva más de 5 años se le hace un descuento del 40% sobre la cuota_base. */
	private int numero_socio;

	// atributos de clase => 0,3 ptos
	private static int total_socios = 0; /* nº de socios del club, 
	cada vez que se cree un nuevo socio, debe actualizarse el total de socios e incrementarse en uno.*/
	private static double cuota_base = 100; // importe de la cuota base 
	private static double total_cuotas = 0; // suma de todas las cuotas que pagan todos los socios
	// mejor declarlo todo double para que los cálculos se hagan mejor
	private static double media; // media aritmética de las cuotas que pagan todos los socios

	// constructor sin argumentos => 0,5 ptos
	/* E: nada
	   S: inicializa los atributos del objeto creado con el contructor con: 
		nombre_socio =>  "Sin nombre"
		tiempo => 0
		cuota =>  se debe calcular la cuota
		numero_socio => se debe calcular el número de socio
		total_socios => se incrementa en uno  
		total_cuotas => se debe actualizar el total de cuotas (sumando esta nueva cuota)
		media => se debe actualizar el valor de la media de cuotas */
	public Socio () {
		nombre_socio =  "Sin nombre";
		tiempo = 0;

		// El socio lleva menos de 3 años no se le hace descuento, por lo tanto debe pagar la cuota_base
		cuota = cuota_base;

		// calcular el total de socios antes de calcular el número de socio
		total_socios ++;
		
		numero_socio = total_socios;

		total_cuotas += cuota;
		media = total_cuotas / total_socios;		
	}


	// constructor con argumentos => 1,5 ptos
	/* E: nombre_socio2 =>  Nombre del socio
			tiempo2 => años de antigüedad
		S: inicializa los atributos del objeto creado con el contructor con: 
			nombre_socio =>  coge el valor de nombre_socio2
			tiempo => coge el valor de tiempo2
			cuota =>  se debe calcular la cuota
			numero_socio => se debe calcular el número de socio
			total_socios => se incrementa en uno 
			total_cuotas => se debe actualizar el total de cuotas (sumando esta nueva cuota)
			media => se debe actualizar el valor de la media de cuotas */
	public Socio (String nombre_socio2, byte tiempo2) {
		nombre_socio = nombre_socio2;
		tiempo = tiempo2;
		
		// Si el socio lleva menos de 3 años no se le hace descuento, por lo tanto debe pagar la cuota_base
		if (tiempo < 3)
			cuota = cuota_base;		
		else
			// Si el socio lleva de 3 años a 5 años se le hace un descuento del 20% sobre la cuota_base
			if (tiempo >=3 && tiempo <= 5)
				cuota = cuota_base - cuota_base * 20 /100;
			else
				// Si el socio lleva más de 5 años se le hace un descuento del 40% sobre la cuota_base
				cuota = cuota_base - cuota_base * 40 /100;

		// calcular el total de socios antes de calcular el número de socio
		total_socios ++;
		
		numero_socio = total_socios;

		total_cuotas += cuota;
		media = total_cuotas / total_socios;
	}
	
	// METODOS GET => 0,15 ptos
	public String get_nombre_socio() {
		return nombre_socio;
	}
	
	public byte get_tiempo() {
		return tiempo;
	}
	
	public double get_cuota() {
		return cuota;
	}	
	
	public static int get_total_socios () {
		return total_socios;
	}
	
	public static double get_cuota_base () {
		return cuota_base;
	}
	
	public static double get_total_cuotas () {
		return total_cuotas;
	}
	
	public static double get_media () {
		return media;
	}
	
	// METODOS SET => 0,15 ptos
	
	public void set_nombre_socio (String nombre) {
		nombre_socio = nombre;
	}
	
	public void set_tiempo (byte t) {
		tiempo = t;
	}
	
	public void set_cuota (double dinero) {
		cuota = dinero;
	}	
	
	public static void set_total_socios (int num) {
		total_socios = num;
	}
	
	public static void set_cuota_base (double num) {
		cuota_base = num;
	}
	
	public static void set_total_cuotas (double num) {
		total_cuotas = num;
	}
	
	public static void set_media (double num) {
		media = num;
	}
	
	// mostrar todos los atributos de instancia de un objeto => 0,25 ptos
	public void mostrar_socio () {
		System.out.println ("\nNombre de Socio = " + nombre_socio);
		System.out.println ("Años de antigüedad = " + tiempo);
		System.out.println ("Cuota que paga = " + cuota);
		System.out.println ("Número de socio = " + numero_socio + "\n");
	}
	
	// mostrar los datos comunes a todos los socios o atributos de clase => 0,25 ptos
	public static void mostrar_datos_comunes() {
		System.out.println ("\nTotal de socios = " + total_socios);
		System.out.println ("Cuota base = " + cuota_base);
		System.out.println ("Total de cuotas = " + total_cuotas);
		System.out.println ("Media = " + media);
	}


	// main => 0,4 ptos
	public static void main (String args[]) {
		
		// establecer la cuota base a 124 euros
		set_cuota_base (124);
		
		mostrar_datos_comunes();
		
		// crear 3 objetos de la clase
		
		// OBJETO 1		
		// constructor sin argumentos
		Socio socio1 = new Socio();
		socio1.mostrar_socio();
		
		socio1.set_nombre_socio("Pedro Pérez");
		socio1.mostrar_socio();
		
		mostrar_datos_comunes();
		
		
		// OBJETO 2
		// constructor con argumentos
		Socio socio2 = new Socio ("María Fernández", (byte) 4);
		socio2.mostrar_socio();
		
		mostrar_datos_comunes();
		
		
		// OBJETO 3
		// constructor con argumentos
		Socio socio3 = new Socio ("Pepe Martínez", (byte) 7);
		socio3.mostrar_socio();
		
		mostrar_datos_comunes();		
		
		

	} // fin main

		

} // fin clase Socio
