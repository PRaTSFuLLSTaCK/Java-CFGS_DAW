package Ejercicio10;

//Programa Java que lea un número entero de 3 cifras y muestre por separado las cifras del número.


import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Introduzca valor de N: ");
        N = sc.nextInt(); //supondremos que el número introducido tiene 3 cifras
        System.out.println("Primera cifra de " + N + " -> " + (N/100));
        System.out.println("Cifra central de " + N + " -> " + (N/10)%10);
        System.out.println("Última cifra  de " + N + " -> " + (N%10));
        
    }  
} 