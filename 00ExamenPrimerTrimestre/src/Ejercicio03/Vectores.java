package Ejercicio03;

public class Vectores {
	
public static void main (String [] args) {
		
		//variables
		
		int cp = 0, ci = 0, i,j, n;
		
		
		n = utilidades.teclado.leer_entero("Introduzca un valor mayor o igual a 5 ", 5, 1000000);
		
		int v [] = new int [n];
		//vector
		
		for ( i = 0; i < n; i++) {
			
			v [i]= utilidades.teclado.leer_entero("Introduzca un valor");
		}
		
		//entrada
		
		
		//proceso
		
		for ( j = 0; j < n; j++) {
			
				
			if (v [j]  % 2 == 0)
					
					cp += 1;
				
			else
					
				ci += 1;
				
		}
		
		int vp [] = new int [cp];
		int vi [] = new int [cp];
		int c = 0;
		int d = 0;
		
		/*for ( j = 0; j < n; j++) {
			
			
			if (v [j]  % 2 == 0) {
					
					vp [c]= v [j];
					c++;
			
			}else {
					
				vi [d]= v [j];
				d++;
			}
				
		}*/
		
		
		for ( i = 0; i < n; i++) {
			
			System.out.println("El contenido del vector es: ");
			System.out.println(v [i]);
		}
		
		/*for ( i = 0; i < c; i++) {
			
			System.out.println("El contenido del vector par es: ");
			System.out.println(vp [i]);
		}

		for ( i = 0; i < d; i++) {
	
			System.out.println("El contenido del vector impar es: ");
			System.out.println(vi [i]);
		}*/
		
		
		System.out.println("La cantidad de numeros pares es: " + cp);
		System.out.println("La cantidad de numeros impares es: " + ci);
	}


}


