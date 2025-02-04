package EstructuraRepetitivaPara;

public class SumaParEImparDeLosNNumeros {
	
	public static void main (String [] args) {
		
		//variables
		
		int i, n, sp = 0, si = 0;
		
		//entrada
		
		n = Utilidades.teclado.leer_entero("Introduzca cuantos numeros desea revisar: ");
		
		//proceso
		
		for (i = 1; i <= n; i+=2) {
			
			si +=1;
			
		}
		
		for (i = 2; i <= n; i+=2) {
			
			sp +=1;
			
		}
		
		System.out.println("La cantidad de numeros pares que tenemos son: " + sp);
		System.out.println("La cantidad de numeros impares que tenemos son: " + si);
		
	}

}
