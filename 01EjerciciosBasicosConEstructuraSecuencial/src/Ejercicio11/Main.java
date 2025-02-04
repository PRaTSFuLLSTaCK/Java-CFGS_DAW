package Ejercicio11;

/*Programa que lea un número entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
Por ejemplo para un número N = 12345   La salida debe ser:
1
12
123
1234
12345*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Introduzca valor de N: ");
        N = sc.nextInt(); //supondremos que el número introducido tiene 5 cifras
        System.out.println(N/10000);
        System.out.println(N/1000);
        System.out.println(N/100);
        System.out.println(N/10);
        System.out.println(N);
    }
}