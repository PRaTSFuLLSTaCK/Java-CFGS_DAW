/**
 * 
 */
/**
 * @author PRATS
 *
 */
package Ejercicio1;

import java.util.Scanner;

/*
 * Solución Ejercicio Básico Inicial 1
 */

//1.      Programa Java que lea dos números enteros por teclado y los muestre por pantalla.

public class Main {
    public static void main(String[] args){
        //declaración de variables
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        //leer el primer número
        System.out.println("Introduce un número entero: ");
        n1 = sc.nextInt();      //lee un entero por teclado
        //leer el segundo número
        System.out.println("Introduce otro número entero: ");
        n2 = sc.nextInt();      //lee un entero por teclado
        //mostrar resultado
        System.out.println("Ha introducido los números: " + n1 + " y " + n2);

    }
}