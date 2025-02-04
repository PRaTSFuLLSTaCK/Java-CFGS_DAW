package Ejercicio03;

//Calcular 2 elevado a n de forma iterativa

/*Programa Java recursivo para calcular 2 elevado a n siendo n un número entero mayor o igual que 0.

La solución recursiva se basa en lo siguiente:

Caso Base:

si n = 0 entonces 2^0 = 1

Si n > 0  Podemos calcular 2^n  como  2 * 2^n-1

Por ejemplo: 2^5 = 2 * 2^4

*/
import java.util.*;
public class Potencia2 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num;
      do{
         System.out.print("Introduce un numero entero >=0 ");
         num = sc.nextInt();
      }while(num<0);
      System.out.println("2 ^ " + num + " = " + potencia(num));
  }
  public static double potencia(int n){
         double resultado=1;
         int i;
         for(i=1;i<=n;i++)
             resultado = resultado * 2;
         return resultado;
  } }
