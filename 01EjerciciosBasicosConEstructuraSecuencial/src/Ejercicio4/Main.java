package Ejercicio4;

import java.util.*;

/*Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
F = 32 + ( 9 * C / 5)
*/

public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double gradosC, gradosF;//Declaracion de variables
      System.out.println("Introduce grados Centígrados:");//Mostrar peticion para introducir temperatura
      gradosC = sc.nextDouble();//Lectura del dato
      gradosF = 32 + (9 * gradosC / 5);//conversion del dato
      System.out.println(gradosC +" ºC = " + gradosF + " ºF"); //mostrar el dato convertido
  }
}
