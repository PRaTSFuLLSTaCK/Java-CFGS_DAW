package ejemploForMejorado;

// Uso de la instrucción for mejorada para sumar el total de enteros en un arreglo.

public class PruebaForMejorado 
{
   public static void main( String args[] ) 
   {
      int arreglo[] = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
      int total = 0;

      // suma el valor de cada elemento al total
      for ( int numero : arreglo )
         total += numero;

      System.out.printf( "Suma del total de elementos del arreglo: %d\n", total );
   } // fin de main
} // fin de la clase PruebaForMejorado
