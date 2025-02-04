package Prog_Tarea02;

/*10.- Diseña un programa Java para leer las longitudes de los lados de un triangulo (L1, L2, L3) y
calcular el área del mismo de acuerdo con la siguiente fórmula:*/

import java.util.Scanner;
//importamos el paquete necesario para poder usar la clase Scanner

/**
* @author José Luis
* @class triangulo
* @description Hallar el área del triángulo introduciendo los valores de los lados por teclado
*/

public class Ejercicio10 {
  public static void main (String args[]){
      Scanner dato = new Scanner( System.in );
      float n1,n2,n3;
      System.out.println("Introduzca el valor del primer lado del triángulo: ");
      n1 =dato.nextFloat();   // introducimos el primer lado del triangulo
      System.out.println("Introduzca el valor del primer lado del triángulo: ");
      n2 = dato.nextFloat();  // introducimos el segundo lado del triangulo
      System.out.println("Introduzca el valor del primer lado del triángulo: ");
      n3 = dato.nextFloat();  // introducimos el tercer lado del triangulo
      System.out.printf("El área del triángulo de lado: %.1f x %.1f x %.1f es igual a: %.2f\n",n1,n2,n3,area(n1,n2,n3));
  }
  /*
   * Usamos una función independiente para practicar su uso
   */
  public static Double area(float na1,float na2,float na3){
      float sp;
      double miArea;
      sp = (na1+na2+na3)/2;
      miArea = Math.sqrt(sp*(sp-na1)*(sp-na2)*(sp-na3));
      return miArea;
  }
}