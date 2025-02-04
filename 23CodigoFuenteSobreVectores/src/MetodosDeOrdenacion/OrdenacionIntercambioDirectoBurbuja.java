package MetodosDeOrdenacion;

/*El algoritmo de la burbuja es uno de los métodos de ordenación más conocidos y uno de los primeros que aprenden los programadores.

Consiste en comparar pares de elementos adyacentes en un array y si están desordenanos intercambiarlos hasta que estén todos ordenados.

Si A es el array a ordenar, se realizan A.length-1 pasadas. Si la variable i es la que cuenta el número de pasadas, en cada pasada i se 
comprueban los elementos adyacentes desde el primero hasta A.length-i-1 ya que el resto hasta el final del array están ya ordenados. 
Si los elementos adyacentes están desordenados se intercambian.

El método de ordenación de la burbuja en java para ordenar un array A es el siguiente:*/

public class OrdenacionIntercambioDirectoBurbuja {

	/* Método de ordenación mediante algoritmo de burbuja */
    static void ordenaBurbuja(int ArrayN[]) {
        /* Bucle desde 0 hasta la longitud del array -1 */
        for (int i = 0; i < ArrayN.length - 1; i++) {
            /* Bucle anidado desde 0 hasta la longitud del array -1 */
            for (int j = 0; j < ArrayN.length - 1; j++) { /* Si el número almacenado en la posición j es mayor que el de la posición j+1 (el siguiente del array) */ if (ArrayN[j] > ArrayN[j + 1]) {
                    /* guardamos el número de la posicion j+1 en una variable (el menor) */
                    int temp = ArrayN[j + 1];
                    /* Lo intercambiamos de posición */
                    ArrayN[j + 1] = ArrayN[j];
                    ArrayN[j] = temp;
                    /* y volvemos al inicio para comparar los siguientes hasta que todos se hayan comparado*/
                    /* de esta forma vamos dejando los números mayores al final del array en orden*/
                }
            }
        }
        /* Llama al método mostrar N, si ordena damos por hecho que lo quiere mostrar */
        mostrarN(ArrayN);
    }
    
    /* Método para mostrar el array */
    static void mostrarN(int ArrayN[]) {
        System.out.println("|-----------------------|");
        /* Bucle para mostrar el array desde la posicion 0 hasta la longitud del array */
        for (int i = 0; i < ArrayN.length; i++) { System.out.print(" Elemento " + (i + 1) + " -----> " + ArrayN[i] + "\n");
        }
        System.out.println("|-----------------------|");
    }
/* Fin del método principal */
}
