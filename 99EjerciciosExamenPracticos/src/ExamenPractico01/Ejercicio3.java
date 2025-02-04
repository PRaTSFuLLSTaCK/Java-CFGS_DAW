package ExamenPractico01;

/*Ejercicio 3 (2 puntos)
Realizaremos un programa que calcule el valor de los coeficientes binomiales. 
Los coeficientes binomiales son ampliamente utilizados en distintas ramas de las matemáticas, 
como por ejemplo la estadística. Se representan como un binomio (dos valores) entre paréntesis 
(similar a una fracción pero sin la barra horizontal). La fórmula para calcular el 
coeficiente binomial de dos valores n y k, lo representaremos como (n,k) es la siguiente: 
(𝑛𝑛,𝑘𝑘)=𝑛𝑛!𝑘𝑘!(𝑛𝑛−𝑘𝑘)!
donde ! representa el factorial y n y k mayores o iguales que 0.
Para realizar este ejercicio sigue los siguientes pasos:
a) Se implementará una función que calcule el factorial de un número. 
El número se pasará por parámetro y retornará el factorial calculado. 
La declaración de la función será como sigue:
(0.75 puntos)
public static int factorial(int n)
El factorial de un número n, n! Se calcula de la siguiente manera:
 1, si n=0.
 n*n-1....*1, si n>0.
Por ejemplo, el factorial de 3, 3! = 3*2*1 = 6.
b) Se implementará una función que calcule el coeficiente binomial. 
Los valores de n y k se pasarán por parámetro y la función devolverá el coeficiente calculado. 
Se utilizará la función factorial() para realizar este cálculo. La declaración de la función será 
como sigue (0.5 puntos):
public static int coeficienteBinomial(int n, int k)
c) El programa principal (main) deberá pedir al usuario que introduzca los valores de 
n y k (mayor o igual que 0). Se calculará el valor del binomio llamando a la función 
coeficienteBinomial() y 
se mostrarán los resultado obtenidos por pantalla. (0.75 puntos).*/

import java.util.Scanner;
/**
*
* @author jose
*/
public class Ejercicio3 {
	public static int factorial(int n) {
		int fact = 1;
		int contador = 2;
		while (contador <= n) {
			fact *= contador++;
		}
		return fact;
	}
	public static int coeficienteBinomial(int n, int k) {
		return factorial(n) / (factorial(k) * factorial(n - k));
	}
	public static void main(String[] args) {
		Scanner entrada_teclado = new Scanner(System.in);
		boolean numero_valido = false;
		int n = 0, k = 0;
		do {
			System.out.println("Introduzca N: ");
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
		do {
			System.out.println("Introduzca K: ");
			if (entrada_teclado.hasNextInt()) {
				k = entrada_teclado.nextInt();
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
		System.out.println("El coeficiente binomial (n,k)="+coeficienteBinomial(n,k));
	}
}
