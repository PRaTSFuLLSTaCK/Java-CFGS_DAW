package Ejercicio09;

/*Programa que pida que se introduzcan dos números enteros por teclado y 
 * muestre los números desde el menor hasta el mayor de los números introducidos. 
 * Los dos números introducidos deben ser distintos. 
 * Si son iguales se mostrará un mensaje indicándolo y se vuelven a introducir.
 
Solución

Para resolver este ejercicio seguiremos los siguientes pasos:
1.      Introducir los dos números por teclado. Como los números deben ser distintos 
		utilizaremos una estructura repetitiva do .. while para repetir la lectura 
		mientras los números que se introducen sean iguales.
2.      Calculamos cuál es el mayor y cuál es el menor.
3.      Finalmente se muestran por pantalla los números desde el menor hasta el mayor.
 		Para ello utilizaremos la estructura repetitiva for.
A continuación se muestra el código Java de este ejercicio resuelto:*/

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, menor, mayor;
       
        //Lectura de dos números enteros distintos
        do {
            System.out.print("Introduce un número entero: ");
            numero1 = sc.nextInt();
            System.out.print("Introduce otro número entero distinto del anterior: ");
            numero2 = sc.nextInt();
            if(numero1 == numero2){
                System.out.println("Debes introducir dos números distintos");
            }
        } while (numero1 == numero2);
       
        //Calcular cuál de los números es el mayor y cuál el menor
        if (numero1 > numero2) {
            mayor = numero1;
            menor = numero2;
        } else {
            mayor = numero2;
            menor = numero1;
        }
       
        //Mostrar por pantalla los números desde el menor hasta el mayor.
        System.out.println("\nNúmeros desde " + menor + " hasta " + mayor + " : ");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
    }
}
