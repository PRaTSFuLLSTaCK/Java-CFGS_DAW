package Operadores;

public class Concatenacion {
	
	public static void main (String[] args) {
		
		String saludo = "Hola" + " Mundo" + " como vas.";// podemos sumar trozos de cadena 
		
		System.out.println(saludo);
		
		int sueldo = 20000; //declaramos variable numerica
		
		//Añadimos cadenas de caracteres a una variable de tipo cadena junto con el valor de la variable anterior.
		
		String mensaje = "Su sueldo es: " + sueldo + " euros netos.";
		
		System.out.println(mensaje);
		
		/*
		 * OJO
		 * 
		 * para concatenar uno de los operandos, ha de ser tipo cadena sino hay ninguno nos dara un error.
		 * 
		 * Esto nos dara error String cadenaMala = 13 + 's';
		 */
		
		
	}

}
