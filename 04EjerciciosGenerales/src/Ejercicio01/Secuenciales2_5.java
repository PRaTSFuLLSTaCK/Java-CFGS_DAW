package Ejercicio01;

/* 
 * Programa que lea dos variables
 * numéricas A y B e 
 * intercambie sus contenidos.
 */
import java.util.*;
public class Secuenciales2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, AUX;
        System.out.print("Introduzca valor de A: ");
        A = sc.nextInt();
        System.out.print("Introduzca Valor de B: ");
        B = sc.nextInt();
        System.out.println("Valores iniciales: A = " + A + "   B = " + B);
        //instrucciones para hacer el intercambio
        //se utiliza una variable auxiliar
        AUX = A;
        A = B;
        B = AUX;      
        System.out.println("Valores intercambiados: A = " + A + "   B = " + B);
    }
}