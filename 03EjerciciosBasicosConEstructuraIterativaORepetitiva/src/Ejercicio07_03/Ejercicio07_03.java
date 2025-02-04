package Ejercicio07_03;

import java.util.Scanner;

//Mostrar los números desde 1 hasta N utilizando la estructura repetitiva do..while.

public class Ejercicio07_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        System.out.println("Numeros del 1 al " + n + ": ");
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }
}