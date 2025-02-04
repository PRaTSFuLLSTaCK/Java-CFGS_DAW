package EstructuraSelectivaSimpleYDoble;

public class NumeroEnteroPositivoNegativoNeutro {
	
	public static void main (String [] args) {
		
		//variables
		int n;
		String r = "";
		
		n = Utilidades.teclado.leer_entero("Introduzca el numero que desea revisar: ");
		
		//proceso
		
		if (n > 0)
			
			r = "EL NUMERO ES POSITIVO.";
		
		if (n < 0)
			
			r = "EL NUMERO ES NEGATIVO.";

		if (n == 0)
	
			r = "EL NUMERO ES NEUTRO.";
		
		//salida
		
		System.out.println(r);
		
	}

}
