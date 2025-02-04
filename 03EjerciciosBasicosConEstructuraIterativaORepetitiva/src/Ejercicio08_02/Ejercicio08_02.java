package Ejercicio08_02;

import java.util.Scanner;

//Números desde N hasta 1 utilizando la estructura do .. while.

public class Ejercicio08_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        System.out.println("Numeros del " + n + " al 1 utilizando do .. while: ");
        int i = n;
        do {
            System.out.println(i);
            i--;
        } while (i >= 1);
   }
}