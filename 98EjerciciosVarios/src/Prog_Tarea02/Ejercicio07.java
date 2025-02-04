package Prog_Tarea02;

/*7.- Diseña un programa Java para resolver una ecuación de primer grado con una incógnita (x),
suponiendo que los coeficientes de la ecuación (C1 y C2) se introducen desde teclado.
								C1x + C2 = 0*/

import java.util.Scanner;
/**
 * @author José Luis
 * @class ecuacion
 * @description Ecuación de primer grado con dos números introducidos por teclado
 */

public class Ejercicio07 {
    public static void main (String args[]) {
        Scanner dato = new Scanner( System.in );
        float numero,numero2;
        System.out.println("Introduzca el primer número de la ecuación: ");
        numero = dato.nextFloat();
        System.out.println("Introduzca segundo número de la ecuación: ");
        numero2 = dato.nextFloat();
        System.out.printf("El resultado de la ecuación "+numero+"X + "+numero2+" = 0, es igual a ");
        System.out.println(hacerEcuacion(numero,numero2));
    }
    public static float hacerEcuacion(float n1,float n2){
        // N1x + N2 = 0       --->     N1x = -N2      --->      x = -N2 / N1
        float resultado = -n2 / n1;
            return resultado;
    }
}
