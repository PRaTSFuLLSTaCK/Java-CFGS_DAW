package Ejercicio7;

//Ejercicio 7. Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la 
//longitud de la hipotenusa según el teorema de Pitágoras.

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cateto1, cateto2;//declaracion de variables
        System.out.print("Introduzca longitud del primer cateto: ");//peticion de la primera variable
        cateto1 = sc.nextDouble();//lectura de la primera variable
        System.out.print("Introduzca longitud del segundo cateto: ");//peticion de la segunda variable
        cateto2 = sc.nextDouble();//lectura de la segunda variable
      System.out.println("Hipotenusa -> " +  Math.sqrt(Math.pow(cateto1,2)+ Math.pow(cateto2, 2)));//Mostrar el resultado
    }
}