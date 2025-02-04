package Ejercicio07_02;

import java.util.Scanner;

//Mostrar los números desde 1 hasta N utilizando la estructura repetitiva while.

public class ejercicio07_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        System.out.println("Numeros del 1 al " + n + ": ");
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}