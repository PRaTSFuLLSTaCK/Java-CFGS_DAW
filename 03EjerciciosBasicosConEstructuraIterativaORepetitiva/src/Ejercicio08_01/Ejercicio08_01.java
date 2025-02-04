package Ejercicio08_01;

import java.util.Scanner;

/*Programa que pida que se introduzca por teclado el valor de un número entero N 
 * y muestre los números desde N hasta 1 ambos incluidos. 
 * Se debe resolver este ejercicio de tres formas distintas: 
 * utilizando la estructura repetitiva while, utilizando la estructura repetitiva do .. while 
 * y utilizando la estructura repetitiva for.*/

 //Números desde N hasta 1 utilizando la estructura while.

public class Ejercicio08_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        System.out.println("Numeros del " + n + " al 1 utilizando while: ");
        int i = n;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
   }
}