package EstructuraSelectivaSimpleYDoble;

public class SolucionesRealesDeUnaEcuacionDeSegundoGrado {
	
	public static void main (String [] args) {
		
		//variables
		
		double a, b, c, d, x1, x2;
		
		a = Utilidades.teclado.leer_double("Introduzca el primer valor: ");
		b = Utilidades.teclado.leer_double("Introduzca el segundo valor: ");
		c = Utilidades.teclado.leer_double("Introduzca el tercer valor: ");
		d = Utilidades.teclado.leer_double("Introduzca el cuarto valor: ");
		
		//proceso
		
		d = (-b - Math.pow(d, (1.0 / 2.0))) / 2 * a;
		
		if (a != 0 && d >= 0) {
			
			x1 = (-b + Math.pow(d, (1.0 / 2.0))) / 2 * a;
			x2 = (-b - Math.pow(d, (1.0 / 2.0))) / 2 * a;
			
		} else {
			
			x1 = 0;
			x2 = 0;
			
		}
		
		//salida
		
		System.out.println("La primera solucion de esta ecuacion es: " + x1);
		
		System.out.println("La segunda solucion de esta ecuacion es: " + x2);
		
	}

}
