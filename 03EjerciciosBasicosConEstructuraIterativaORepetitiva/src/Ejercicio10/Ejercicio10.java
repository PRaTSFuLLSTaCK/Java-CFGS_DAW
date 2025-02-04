package Ejercicio10;

/*Programa que pida que se introduzcan dos números enteros A y B 
 por teclado y muestre los números pares que hay entre A y B. 
 A debe ser menor que B. Si no es así se mostrará un mensaje indicándolo y se vuelven a introducir.
 
Solución

Para resolver este ejercicio seguiremos los siguientes pasos:
1.      Introducir los dos números por teclado. Como A debe ser menor que B se utilizará una estructura repetitiva do .. while para repetir la lectura mientras A sea mayor o igual que B.
2.      Mostrar los números pares desde A hasta B. Para ello utilizaremos la estructura repetitiva for.
A continuación se muestra el código Java del ejercicio resuelto:*/

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;

        //Lectura de dos números enteros A Y B
        //A debe ser menor que B
        do {
            System.out.print("Introduce un número entero: ");
            A = sc.nextInt();
            System.out.print("Introduce otro número entero mayor que el anterior: ");
            B = sc.nextInt();
            if (A >= B) {
                System.out.println("El segundo número debe ser mayor que el primero");
            }
        } while (A >= B);


        //Mostrar los números pares entre A y B.
        System.out.println("\nNúmeros pares desde " + A + " hasta " + B + " : ");
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}