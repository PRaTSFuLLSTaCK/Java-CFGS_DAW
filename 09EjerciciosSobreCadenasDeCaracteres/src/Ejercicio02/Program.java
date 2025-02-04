package Ejercicio02;

/*MÉTODO JAVA PARA QUITAR LA ÚLTIMA PALABRA DE UN STRING.
Vamos a escribir un método que reciba un String que contiene una frase. 
El método eliminará la última palabra y devuelve un String con la frase modificada.
La forma de resolverlo es la siguiente: se busca el último espacio en blanco del texto mediante 
el método lastIndexOf. Este método devuelve la posición del último espacio en blanco. 
Si lastIndexOf devuelve -1 significa que no lo ha encontrado lo que quiere decir que la frase 
solo tiene una palabra o está vacía. En ese caso se devuelve una cadena vacía.
Si se encuentra el último espacio en blanco, se obtiene un nuevo 
String mediante el método substring desde la primera posición del texto hasta donde 
se encuentra el último espacio.
Para que esto funcione correctamente debemos asegurarnos de que el 
texto no contiene espacios en blanco al final ya que si fuese así no encontraríamos 
la última palabra con este método. Para eso se utiliza el método trim() que elimina posibles 
espacios en blanco al principio y al final del String.
*/

import java.util.*;

public class Program
{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);

			String frase = entrada.nextLine();

				frase=frase.trim();

				int posicion=0;

				for(int i=0; i<frase.length(); i++){

					if(frase.charAt(i)==' '){
						posicion=i;
					}

				}
				frase=frase.substring(0,posicion);


				System.out.println(frase);
	}
}