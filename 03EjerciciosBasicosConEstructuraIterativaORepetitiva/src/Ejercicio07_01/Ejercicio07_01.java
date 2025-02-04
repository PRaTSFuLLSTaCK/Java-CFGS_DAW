package Ejercicio07_01;

import java.util.Scanner;

/*Escribe un programa Java que pida por teclado el valor de un número N y muestre por pantalla todos los números desde 1 hasta N. Resuelve este ejercicio de tres formas distintas:
1.      Utilizando la estructura for
2.      Utilizando la estructura while
3.      Utilizando la estructura do .. while */

public class Ejercicio07_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        System.out.println("\nNumeros del 1 al " + n + ": ");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}