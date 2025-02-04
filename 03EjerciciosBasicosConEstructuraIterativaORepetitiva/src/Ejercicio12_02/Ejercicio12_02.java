package Ejercicio12_02;

//utilizando un bucle do .. while y finalizando cuando se introduce un cero.

import java.util.Scanner;

public class Ejercicio12_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        do {

            System.out.print("Introduce un número (0 para acabar): ");
            numero = sc.nextInt();

            if (numero != 0) {
                if (numero > 0) {
                    System.out.print("Positivo");
                } else {
                    System.out.print("Negativo");
                }
                if (numero % 2 == 0) {
                    System.out.println(" Par");
                } else {
                    System.out.println(" Impar");
                }
            }

        } while (numero != 0);
    } 
}