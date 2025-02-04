package Ejercicio02;

import java.util.*;

/*
Ejemplos de recursividad. Pasar de Decimal a Binario de forma recursiva

 
Programa que lea un número entero entero mayor o igual que cero en base decimal y 
muestre su equivalente en binario de forma recursiva

El caso base se obtiene cuando el número es 0 ó 1. En ese caso el número binario equivalente es el mismo.

Si no, se hace una llamada recursiva al método, enviándole n/2.

Cuando en esas llamadas recursivas se envíe un 0 o un 1 se mostrará ese valor y  a 
continuación se ejecutará la instrucción System.out.print(n % 2); que imprimirá el resto de la 
división en cada momento de la ejecucicón.

Para entender mejor como se producen la secuencia de llamadas recursivas puedes ver de forma 
gráfica el cálculo del factorial en la imagen de esta página.
*/

/**
  * Método recursivo que dado un número entero en base decimal
 * muestre su equivalente en binario
 */
public class Recursividad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduzca numero >0: ");
            n = sc.nextInt();
        } while (n < 0);
        System.out.println();
        System.out.print("Binario: ");
        decBin(n);
        System.out.println();
    }

    public static void decBin(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        } else {
            decBin(n / 2);
            System.out.print(n % 2);
            return;
        }
    }
}