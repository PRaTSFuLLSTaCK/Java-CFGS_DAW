package Variables;

public class VariablesYConstantesEnJava {
	
	//Tipos de datos logicos Variables:
	
	/*
	 * Las variables se nombran siempre en minuscula, y si su nombre es compuesto la siguiente palabra comienza en mayuscula por ejemplo variablePruebaCadena
	 */
	
	static boolean x = true; //dabo booleano verdadero o falto por defecto es false en este caso esta inicializada a true
	/*
	 * conviene siempre inicializar las variables
	 */
	
	//Tipos de datos de texto
	
	static char caracter = 'a'; //variable caracter, nos guarda un caracter el cual va entre comillas simples. Valor por defecto \u0000
	
	static String cadena = null; //Variable cadena, nos guarda una cadena de caracteres, el valor va entre dobles comillas
	
	/*
	 * Las cadenas de caracteres en Java son objetos si ponemos el nombre de una variable seguida de un punto nos saldran una serie de metodos para 
	 * trabajar con esos datos
	 * 
	 * Para inicializar las cadenas o dejamos las comillas vacias "" o utilizamos la palabra null
	 */
	
	//Tipos de datos enteros
	
	static byte a = 0; //podemos asignar siempre que no nos pasemos del 127
	static short b = 0; 
	static int c = 0;
	static long d = 0l; //si no la inicializmos nos la tratara como un entero para inicializarla tenemos que poner un 0l minuscula o L mayuscula
	
	//Tipos de datos Reales
	
	static float f = 0.0f; // Por defecto todo numero real, todos son variables dobles, por eso nos da este error al declarar una variable float.
	
	/*
	 * Para solucionar esto solo tenemos que añadir tras 0.0f una f minuscula o f mayuscula y de esa forma diremos al compilador que queremos este tipo 
	 * de variable.
	 */
	
	static double w = 0.0;
	
	//CONSTANTES EN JAVA
	
	static final int CONSTANTE = 0; // Las variables se declaran con la palabra reservada final tipo de dato y las inicializamos
	
	/*
	 * Por contrario las constantes siempre se nombran en mayuscula integramente
	 * 
	 */
	
	
	
	public static void main(String [] args) {
		
		System.out.println("el valor de la variable es: " + x);//mostramos el contenido de la variable si ponemos dobles comillas nos mostrara el nombre de la variable
		System.out.println("el valor de la variable es: " + caracter);
		System.out.println("el valor de la variable es: " + cadena);
		System.out.println("el valor de la variable es: " + a);
		System.out.println("el valor de la variable es: " + b);
		System.out.println("el valor de la variable es: " + c);
		System.out.println("el valor de la variable es: " + d);
		System.out.println("el valor de la variable es: " + f);
		System.out.println("el valor de la variable es: " + w);
		System.out.println("el valor de la variable es: " + CONSTANTE);
		
		//para concatenar utilizamos el signo + como vemos anteriormente
	}

}
