package Ejercicio11;

/*Programa que lea dos números enteros positivos N y M y muestre los múltiplos de N que hay desde 1 hasta M. 
Por ejemplo si N = 4 y M = 500 el programa mostrará los múltiplos de 4 desde 1 hasta 500. 
El valor de N deberá ser menor que el valor de M. 
Si no se introducen valores válidos para N o M se mostrará el mensaje correspondiente y se vuelven a pedir.
 
Solución:

Para resolverlo seguiremos los siguientes pasos:

1.    Introducir los valores de N y M por teclado. En este punto se debe comprobar 
que los valores introducidos por teclado para N y M sean válidos, en concreto se debe 
comprobar que los valores de N y M sean mayores que cero y además que el valor de N sea menor que el de M.

2.    Mediante un bucle for se mostrarán los múltiplos de N entre 1 y M.*/

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M;

        //Lectura de dos números enteros N Y M
        //N y M deben ser positivos
        //N debe ser menor que M
        do {
            System.out.print("Introduce un número entero positivo: ");
            N = sc.nextInt();
            if(N<=0){
                System.out.println("Debe introducir un número positivo");
            }
        }while(N<=0);
        do {
            System.out.print("Introduce otro número entero positivo mayor que " + N + ": ");
            M = sc.nextInt();
            if(M<=0){
                System.out.println("Debe introducir un número positivo");
            }else if(N>=M){
                System.out.println("Debe introducir un número mayor que " + N);
            }
        }while(M<=0 || N >=M);
          


        //Mostrar los múltiplos de N desde 1 hasta M
        System.out.println("\nMúltiplos de  " + N + " desde 1 hasta " + M + " : ");
        for (int i = 1; i <= M; i++) {
            if (i % N == 0) {
                System.out.println(i);
            }
        }
    }
}