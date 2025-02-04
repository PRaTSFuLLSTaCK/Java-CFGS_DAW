package Ejercicio04;

/*Programa java que calcula el número de cifras de un número entero de forma recursiva.  

La solución recursiva se basa en lo siguiente:

Caso Base:

Si n < 10 el número tiene 1 cifra

Si n >=10 tiene las cifras de un número con una cifra menos, más 1.

Es decir, si por ejemplo el número es 1234, el número de cifras es las suma de cifras del número 123 más una.

El programa que calcula el número de cifras de un entero de forma recursiva es el siguiente:*/

import java.util.*;
public class CuentaCifras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
           System.out.print("Introduce un numero entero >0 ");
           num = sc.nextInt();
        }while(num<=0);
        System.out.println("Número de cifras: " + numeroCifras(num));
    }
    public static int numeroCifras(int n){
           if(n < 10)  //caso base
              return 1;
           else
              return 1 + numeroCifras(n/10);
    }
}