package EstructuraSelectivaSimpleYDoble;

public class TresNumerosEnOrdenAscendente {
	
	public static void main (String [] args) {
		
		//variables
		
		int n1, n2, n3, mayor, inter, menor;
		
		//entrada
		
		n1 = Utilidades.teclado.leer_entero("Introduzca el primer numero a comprobar: ");
		n2 = Utilidades.teclado.leer_entero("Introduzca el segundo numero a comprobar: ");
		n3 = Utilidades.teclado.leer_entero("Introduzca el tercer numero a comprobar: ");
		
		//proceso
		
		if (n1 > n2 && n1 > n3) {
			
			mayor = n1;
			
		}else {
			
			if (n2 > n1 && n2 > n3) {
				
				mayor = n2;
				
			} else {
				
				mayor = n3;
				
			}
			
		}
		
		if (n1 < n2 && n1 < n3) {
			
			menor = n1;
			
		}else {
			
			if (n2 < n1 && n2 < n3) {
				
				menor = n2;
				
			} else {
				
				menor = n3;
				
			}
			
		}
		
		inter = (n1 + n2 + n3) - (mayor + menor);
		
		//salida
		
		System.out.println("El numero mayor de los tres es: " + mayor);
		System.out.println("El numero intermedio de los tres es: " + inter);
		System.out.println("El numero menor de los tres es: " + menor);
		
	}

}
