package Ejercicio6;

//Ejercicio 6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.

import java.util.*;
public class Main {
  public static void main(String[] args) {

        var sc = new Scanner(System.in);
        double velocidad;//declaracion de la variable
        System.out.println("Introduzca velocidad en Km/h: ");//peticion de introducccion del dato
        velocidad = sc.nextDouble();//Introduccion del dato
      System.out.println(velocidad + " Km/h -> " + velocidad*1000/3600 + " m/s"); //Mostrar el dato y la conversion
  }
}