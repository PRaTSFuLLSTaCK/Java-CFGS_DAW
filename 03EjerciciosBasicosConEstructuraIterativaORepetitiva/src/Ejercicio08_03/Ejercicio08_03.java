package Ejercicio08_03;

import java.util.Scanner;

//Números desde N hasta 1 utilizando la estructura for.

public class Ejercicio08_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        System.out.println("Numeros del " + n + " al 1 utilizando for: ");
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
   }
}