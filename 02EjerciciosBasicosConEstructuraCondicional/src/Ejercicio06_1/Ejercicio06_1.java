package Ejercicio06_1;

/*Programa java que lea un carácter por teclado y compruebe si es un dígito numérico (cifra entre 0 y 9).

Vamos a escribir dos soluciones a este ejercicio. 

La primera consiste en comprobar si el carácter es un dígito mediante 
el método isDigit de la clase Character. Este método devuelve true si el carácter 
que se le pasa como parámetro es una cifra entre 0 y 9:*/

import java.io.*;
public class Ejercicio06_1 {
   public static void main(String[] args) throws IOException {
        char car1;
        System.out.print("Introduzca carácter: ");
        car1 = (char)System.in.read(); //lee un carácter
        if(Character.isDigit(car1)) //utilizamos el método isDigit de la clase Character
           System.out.println("Es un número");
        else
           System.out.println("No es un número");
  }
}