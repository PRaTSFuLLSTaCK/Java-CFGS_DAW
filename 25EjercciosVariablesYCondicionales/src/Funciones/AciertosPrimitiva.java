package Funciones;

public class AciertosPrimitiva {

	/* algunas mejoras propuestas para el alumno son:
	 * 
	 * - comprobar que no hay números repetidos en las tablas    
	 * - comprobar que los números están en el rango 1..49     
	 * - mirar el tamaño de las tablas, que debe ser 6     
	 *       
	 */
	static int primitiva(int apuesta[], int premiado[]){   

		int aciertos;

		int a;    // utilizaremos a como índice de la tabla apuesta
		int p;    // y p para recorrer premiado
		
		aciertos=0;

		for (a=0;a<apuesta.length;a++) // recorremos la tabla de apuesta  

		{            p=0;    // para cada número de la apuesta recorremos premiado
		// se podría hacer con un for, pero con el while evitamos vueltas innecesarias 

		while(p<premiado.length && apuesta[a]!=premiado[p])  

			p++;

		if(p<premiado.length) 

			// si p indica un elemento de la tabla   

			aciertos++;    

		// tenemos un acierto más

		}

		return(aciertos);  

	}    

	public static void main(String[] args) {  

		int primitiva[]=new int[6];  
		int apuesta[]=new int[6]; 
		
		int aciertos=0;

		System.out.println("Su apuesta es: "); 
		for (int i=0;i<primitiva.length;i++)  

		{            
			primitiva[i]=(int)(Math.random()*49+1);  

			System.out.print(primitiva[i] + "    ");  

		}

		System.out.println("\nLa combinación ganadora es: "); 

		for (int i=0;i<apuesta.length;i++) 

		{         

			apuesta[i]=(int)(Math.random()*49+1);    

			System.out.print(apuesta[i] +"    ");  

		}

		aciertos=primitiva(primitiva,apuesta);

		System.out.println("\n\nTiene "+aciertos+" aciertos\n");

		if (aciertos == 0)         

			System.out.println("Lo importante no es ganar... es participar.\n");  

	}

}

