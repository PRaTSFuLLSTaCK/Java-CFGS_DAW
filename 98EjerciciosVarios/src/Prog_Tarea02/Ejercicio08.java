package Prog_Tarea02;

/*8.- Diseña un programa Java que calcule la suma, resta, multiplicación y división de dos números
introducidos por teclado. Incorpora también las funciones que permitan realizar la potencia de un
número y la raíz cuadrada del otro.
Ejemplo de salida del programa para x=9, y=3:
Introducir primer numero: 9
Introducir segundo numero: 3
x = 9.0 y = 3.0
x + y = 12.0
x - y = 6.0
x * y = 27.0
x / y = 3.0
x ^ 2 = 81.0
√ x = 3.0
*/

import java.util.Scanner;
/**
 * @author José Luis
 * @class operaciones
 * @description Realizar varias operaciones aritméticas con dos números introducidos por teclado
 */

public class Ejercicio08 {
    public static void main (String args[]){
        Scanner dato = new Scanner( System.in );
        float x,y;
        System.out.println("Introduzca el primer número: ");
        x = dato.nextFloat();
        System.out.println("Introduzca el segundo número: ");
        y = dato.nextFloat();
        System.out.printf("x=%.1f y=%.1f\n",x,y);
        System.out.printf("x + y = %.1f\n",(x+y));
        System.out.printf("x - y = %.1f\n",(x-y));
        System.out.printf("x * y = %.1f\n",(x*y));
        System.out.printf("x / y = %.1f\n",(x/y));
        System.out.printf("x ^ 2 = %.1f\n",(x*x));
        System.out.printf("x raiz 2 = %.1f\n",Math.sqrt(x));
    }
}

