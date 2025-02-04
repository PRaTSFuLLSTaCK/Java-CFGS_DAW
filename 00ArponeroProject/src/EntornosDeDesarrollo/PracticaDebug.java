package EntornosDeDesarrollo;



import java.util.Scanner;

public class PracticaDebug {
	public static void main(String[] args) {
            
	int opcion = 0;
	do {
		menu();
		opcion = leer_entero("Elija una opciÛn");
		switch (opcion) {
		case 1:
			float ancho = leer_float("Introduzca la anchura del rect·ngulo");
			float alto = leer_float("Introduzca la altura del rect·ngulo");
			System.out.println("El perÌmetro del rect·ngulo es" + calcularPerimetro(ancho, alto));
			System.out.println("El ·rea del rect·ngulo es " + calcularArea(ancho, alto));
			
			break;
		case 2:
			float radio = leer_float("Introduzca el radio de la circunferencia");
			System.out.println("El perÌmetro de la circunferencia es " + calcularPerimetro(radio));
			System.out.println("El ·rea de la circunferencia es " + calcularArea(radio));
			break;
		default:
			System.out.println("Debe elegir una opciÛn v·lida");
			break;
		}
	} while (true);
	}
	
	private static float calcularPerimetro(float w, float h) {
		return w*2 + h*2;
	}
	
	private static float calcularPerimetro(float r) {
		return (float) (2*Math.PI*r);
	}
	
	private static float calcularArea(float w, float h) {
		return w*h;
	}
	
	private static float calcularArea (float r) {
		return (float) (Math.PI*r*r);
	}
	
	private static void menu() {
		System.out.println("MEN⁄ DE OPCIONES");
		System.out.println("Elija opcion:");
		System.out.println("1.- Rectangulo");
		System.out.println("2.- Circulo");
		System.out.println("3.- Salir");
	}
	public static float leer_float (String mensaje) {			
		Scanner entrada = new Scanner (System.in);			

		// leer un real de doble precisi√≥n desde la consola 
		float real1=0;
		System.out.print (mensaje);	

		// nos aseguramos de controlar posibles errores en la lectura
		try {
			real1 = entrada.nextFloat(); // OjO hay que poner la coma como separador decimal
		}
		// mostramos mensaje de error en caso de lectura incorrecta (p.e leer una letra en vez de un n¬∫) 
		catch (Exception e){
			System.err.println ("Error de lectura del n˙mero. CÛdigo de error = " + e);
	    e.printStackTrace();
			System.exit(1);
		}	

		// devolver el real le√≠do desde teclado
		return real1;
} // fin leer_double
	public static int leer_entero (String mensaje) {
		// crea objeto entrada de la clase Scanner para obtener la entrada de la terminal de comandos
		Scanner entrada = new Scanner (System.in);		
				
		int num1 = 0;		
		
		System.out.print (mensaje);

		// nos aseguramos de controlar posibles errores en la lectura
		try {
			num1 = entrada.nextInt();
		}
		// mostramos mensaje de error en caso de lectura incorrecta (p.e leer una letra en vez de un n¬∫) 
		catch (Exception e){
			System.err.println ("Error de lectura del numero. Codigo de error = " + e);
	    e.printStackTrace();
			System.exit(1);
		}			
		
 		return num1;
	} // fin leer entero
	
}




