package Ejercicio3;

import java.util.Scanner;

//Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un número entero:");//Peticion del dato
        numero = sc.nextInt();//Lectura del dato
        System.out.println("Número introducido: " + numero);//Muestra el dato introducido
        System.out.println("Doble de " + numero + " -> "+ 2*numero);//Muestra el doble del dato introducido
        System.out.println("Triple de " + numero + " -> "+ 3*numero);//Muestra el triple del dato introducido
       
    }
}