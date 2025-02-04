package Funciones;

public class OperarConTablas {

	/*
	 * .Diseñar la función opera_tabla, a la que se le pasa dos tablas, el número de elementos útiles y 
	 * 
	 * que operación se desea realizar: sumar, restar, multiplicar o dividir (mediante un carácter: 's', 'r', 'm', 'd'). 
	 * 
	 * La función debe devolver una tabla con los resultados.

	 */

	static int[] opera_tabla(int a[], int b[], char opc, int nelem){   

		int i, result[];

		result = new int[nelem];

		switch(opc) 

		{            case 's': 

			for(i=0;i<=nelem-1;i++) 

				result[i] = a[i] + b[i];

			break;

		case 'r': 

			for(i=0;i<=nelem-1;i++)

				result[i] = a[i] - b[i];   

			break;

		case 'm': 

			for(i=0;i<=nelem-1;i++)  

				result[i] =a[i] * b[i];  

			break;

		case 'd':

			for(i=0;i<=nelem-1;i++) 

				result[i] = a[i] / b[i];  

			break;   

		}
		return (result); 

	}   
	public static void main(String[] args) { 

		int num_datos_utiles;
		char operacion;   
		int tabla1[], tabla2[], resultado[];

		tabla1 = new int[10]; 
		tabla2 = new int[15];

		tabla1[0] =4;   
		tabla1[1] =7;    
		tabla1[2] =2;     
		tabla1[3] =7;
		tabla2[0] =-3; 
		tabla2[1] =3;   
		tabla2[2] =6;    
		tabla2[3] =17;

		num_datos_utiles =4; 

		System.out.println("tabla1    tabla2");

		for(int i=0;i<num_datos_utiles;i++)

			System.out.println (tabla1[i]+ "       " +tabla2[i]);

		System.out.println("Operación (s, r, m, d): ");  

		operacion = Utilidades.Entrada.caracter();

		resultado =opera_tabla (tabla1, tabla2, operacion, num_datos_utiles);

		System.out.println("El resultado de la operación es:");

		for(int i=0;i<num_datos_utiles;i++) 

			System.out.println (resultado[i]);  

	}

}


