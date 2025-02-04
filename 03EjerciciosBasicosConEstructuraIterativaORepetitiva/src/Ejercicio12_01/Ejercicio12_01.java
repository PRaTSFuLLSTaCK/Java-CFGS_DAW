package Ejercicio12_01;

/*Programa que lea números enteros por teclado y para cada número introducido indique si es positivo o negativo 
 * y si es par o impar. Se deben realizar tres versiones del programa:

1.    En la primera versión se utilizará un bucle while. 
	  La lectura de números finalizará cuando se introduzca un cero.
2.    En la segunda versión se utilizará un bucle do .. while. 
      La lectura de números en esta versión también finaliza cuando se introduzca un cero.
3.    En la tercera versión también se utilizará un bucle do .. while 
pero en este caso la lectura de números finaliza cuando se responda ‘N’ ó ‘n’ 
a la pregunta “Desea introducir más números? (S/N):”

Ejercicio resuelto:

Solución 1: utilizando un bucle while y finalizando cuando se introduce un cero.*/

import java.util.Scanner;

public class Ejercicio12_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Introduce un número (0 para acabar): ");
        numero = sc.nextInt();

        while (numero != 0) {

            if (numero > 0) {
                System.out.print("Positivo");
            } else {
                System.out.print("Negativo");
            }
            if(numero % 2 == 0){
                System.out.println(" Par");
            }else{
                System.out.println(" Impar");
            }

            System.out.print("Introduce un número (0 para acabar): ");
            numero = sc.nextInt();
        }
    } 
}