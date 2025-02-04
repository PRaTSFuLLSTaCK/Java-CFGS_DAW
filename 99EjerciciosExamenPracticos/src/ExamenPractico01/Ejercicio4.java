package ExamenPractico01;

/*Implementa un algoritmo en el que dado un entero n > 1 leído por teclado, 
 * calcule e imprima los elementos correspondientes a la Conjetura de Ullman 
 * (en honor al matemático S. Ullman). 
 * La conjetura consiste en lo siguiente:
 *  Empieza con cualquier entero positivo.
 Si es par, se divide entre 2; si es impar se multiplica por 3 se agrega 1.
 Se itera hasta obtener el número 1.
Al final se obtendrá el número 1, independientemente del entero inicial. 
Por ejemplo, cuando el entero inicial es 26, la secuencia será:
26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1*/

import java.util.Scanner;
/**
*
* @author jose
*/
public class Ejercicio4 {
	public static void main(String [] args){
		Scanner entrada_teclado = new Scanner(System.in);
		boolean numero_valido = false;
		int n = 0;
		do {
			System.out.println("Introduzca un número positivo: ");
			if (entrada_teclado.hasNextInt()) {
				n = entrada_teclado.nextInt();
				if (n>0) {
					numero_valido = true;
				} else {
					System.out.println("Debe introducir un valor mayor que 0");
				}
			} else {
				System.out.println("Número erroneo introducido. Vuelva a intentarlo");
				entrada_teclado.next();
			}
		} while (!numero_valido);
		//algoritmo para la conjetura
		System.out.print(n+", ");
		while(n!=1){
			if(n%2==0)
				n/=2;
			else
				n=n*3+1;
			System.out.print(n+", ");
		}
	}
}
