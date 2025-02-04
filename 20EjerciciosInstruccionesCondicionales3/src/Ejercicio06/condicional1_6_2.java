package Ejercicio06;

/* 
 * Ejemplo de programa con estructura condicional
* Programa que lea un carácter por teclado y compruebe si es un número
La otra solución es directa y consiste en comprobar si el carácter que se ha leído por teclado 
es mayor o igual que el carácter 0 y menor o igual que el carácter 9.*/

import java.io.*;
public class condicional1_6_2 {
  public static void main(String[] args) throws IOException {
       char car1;
       System.out.print("Introduzca carácter: ");
       car1 = (char)System.in.read(); //lee un carácter
       if(car1>='0' && car1<='9')
           System.out.println("Es un número");
        else
           System.out.println("No es un número");
 }
}
