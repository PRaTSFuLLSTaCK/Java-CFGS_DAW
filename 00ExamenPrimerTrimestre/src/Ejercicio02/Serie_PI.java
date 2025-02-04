package Ejercicio02;

public class Serie_PI {
	
	static int  n = 0;
	static float anterior=1;
	static int i;
	
	static float resultado=0;
	static float r= 0;
	
	public static  float serie (int n) {
		
		for (i = 1; i <= n ; i++) {
			
			if (i % 2 != 0 ) {
				
				anterior = anterior +anterior/2 ;
			
			} else {
				
				anterior = anterior - anterior/2 ;
				
			}
		}
		return anterior;
		
	}

	public static void main(String[] args) {
		
		n = utilidades.teclado.leer_entero("Introduzca un valor mayor o igual a 3 ", 3, 1000000);
		
		resultado = serie(n);
		
		System.out.println("Valor de la serie para n igual a " + n +" es: " + resultado);
		
		r= resultado*4;
		
		System.out.println("Valor de la la constante PI para n igual a " + n +" es: " + r);
	}

}
