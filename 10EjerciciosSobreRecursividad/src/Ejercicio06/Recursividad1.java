package Ejercicio06;

/*
Ejemplos de recursividad. Sumar dos números enteros

 
Método java que calcula la suma de dos números enteros de forma recursiva. 

La solución recursiva para sumar dos números enteros se basa en lo siguiente:

Caso Base:

Si uno de los números es igual a cero, la suma es el otro número.

Por ejemplo, si queremos sumar a=3 y b=0 la suma es igual a a: suma=3

si a == 0
   la suma es b  
sino si b == 0
          la suma es a

Procedimiento recursivo:

Si ninguno de los dos números a sumar es igual a cero, la suma de ambos la podemos expresar como:

suma = 1 + suma(a, (b-1))

Por ejemplo:
Dados los números a=3 y b =4
la suma de 3 + 4 es igual que sumar 1 + (3 + 3)
A su vez, sumar 3 + 3 es igual que 1 + (3 + 2)

Si repetimos el proceso hasta que b sea 0 obtendremos la suma de forma recursiva:*/

import java.util.*;
public class Recursividad1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Introduzca primer numero: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca segundo numero: ");
        n2 = sc.nextInt();
        System.out.println("suma: " + suma(n1, n2));

    }
    public static int suma(int a, int b) {
        if (b == 0) {
            return a;
        } else if (a == 0) {
            return b;
        } else {
            return 1 + suma(a, b - 1);
        }
    }
}