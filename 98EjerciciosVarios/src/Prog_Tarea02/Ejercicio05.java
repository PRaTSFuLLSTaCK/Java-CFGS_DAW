package Prog_Tarea02;

/*5.- Diseña un programa Java que pida dos números por teclado, determine si el primero es múltiplo
del segundo y muestre el resultado.*/

import java.util.Scanner;
/**
 * @author José Luis
 * @class multiplo
 * @description Saber si el primer número es múltiplo del segundo
 */

public class Ejercicio05 {
    public static void main (String args[]) {
        Scanner dato = new Scanner( System.in );
        int numero,numero2;
        System.out.println("Introduzca un número: ");
        numero = dato.nextInt();
        System.out.println("Introduzca otro número ");
        numero2 = dato.nextInt();
        System.out.println(numero+(multiplo(numero,numero2)?"":" NO")+" es multiplo de "+numero2);
    }
    public static boolean multiplo(int n1,int n2){
	if (n2%n1==0)
            return true;
	else
            return false;
    }
}

