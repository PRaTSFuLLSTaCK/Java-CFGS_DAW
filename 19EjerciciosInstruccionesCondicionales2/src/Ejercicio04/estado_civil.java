package Ejercicio04;

import java.util.Scanner;
public class estado_civil {
	public static void main (String[] args) {
		
		// para leer desde teclado
		Scanner lectura = new Scanner (System.in);
		
		String estado;
		
		// leer estado civil
		System.out.println ("Introduce estado civil: soltero, casado, etc...: ");
		estado = lectura.next();
		
		switch (estado) {
			case "soltero": case "casado": case "divorciado": case "viudo": 
				System.out.println ("El estado civil es: " + estado);
				break;
				
			// todos los casos contrarios a los anteriores	
				
			default:
				System.out.println ("Estado civil incorrecto");
		}
		
		
		
		
	}
	
}
