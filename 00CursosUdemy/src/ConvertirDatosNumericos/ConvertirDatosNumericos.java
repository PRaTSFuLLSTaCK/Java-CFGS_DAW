package ConvertirDatosNumericos;

public class ConvertirDatosNumericos {
	
	//para convertir variables utilizamos casting
	
	public static void main (String [] args) {
		
		int alfa = 20;  //varible de tipo entero 
		float beta = 23.5f;//variable tipo float
		beta = alfa;//beta es igual a alfa ya que beta es mayor que alfa con lo cual no nos dara error.
		
		alfa = (int) beta;// el casting es poner entre parentesis el tipo de dato que queremos asignar a la otra variable
		
		/*
		 * en este caso tenemos que beta es float, mayor rango que alfa, con lo cual lo que hacemos es
		 * forzar el valor de beta con esos parentesis a entero (int)
		 */
		
		alfa = (char) 'b';
		
		/*
		 * Los caracteres son tratados por su valor ascii, al añadir un caracter podermos poner en el casting
		 * o int o char
		 */
		
		System.out.println(alfa);
		
		//char caracter = alfa; 
		
		//haciendo esta secuencia nos va a dar error ya que perderemos informacion
		
		char caracter = (char) alfa; //de esta forma haciendo casting a char se añadira el valor de forma correcta
		
		System.out.println("el valor ascii del siguiente caracter es: " + alfa);
		System.out.println("el caracter al que corresponde el anterior dato es: " + caracter);
		

	}

}
