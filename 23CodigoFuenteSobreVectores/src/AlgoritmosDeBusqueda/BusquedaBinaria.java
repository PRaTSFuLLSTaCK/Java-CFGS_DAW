package AlgoritmosDeBusqueda;

/*El funcionamiento del algoritmo es simple y cuenta con las siguientes partes:

Datos de entrada :
Un arreglo ordenado
Un valor a buscar en el arreglo
Datos de salida:
La posición del elemento en el arreglo o -1 en caso de no encontrarlo
El algoritmo de búsqueda binaria sigue los siguientes pasos:

Verifica si el elemento a buscar es menor al máximo elemento en el arreglo y mayor al mínimo elemento del arreglo, en caso de no ser así  se devolverá 
-1 ya que sabemos que no se encuentra el elemento.

Obtiene el elemento que se encuentra en la mitad del arreglo y lo compara con el valor que se busca.

En caso de que el elemento sea mayor al valor que se busca se descartará la parte derecha y se volverá a ejecutar 
la misma validación pero solo sobre el lado izquierdo del arreglo.

El paso anterior se repetirá hasta encontrar el elemento
En caso de no encontrar el elemento se devolverá -1 para indicar que no se encontró.*/

public class BusquedaBinaria {
	
	/**
	    * Algoritmo de búsqueda binaria recursiva en Java.
	    * Esta vez para buscar en arreglos de Strings o cadenas
	    */
	public static int busquedaBinariaRecursiva(String[] arreglo, String busqueda, int izquierda, int derecha) {
	    // Si izquierda es mayor que derecha significa que no encontramos nada
	    if (izquierda > derecha) {
	        return -1;
	    }
	 
	    // Calculamos las mitades...
	    int indiceDelElementoDelMedio = (int) Math.floor((izquierda + derecha) / 2);
	    String elementoDelMedio = arreglo[indiceDelElementoDelMedio];
	 
	    // Primero vamos a comparar y luego vamos a ver si el resultado es negativo,
	    // positivo o 0
	    int resultadoDeLaComparacion = busqueda.compareTo(elementoDelMedio);
	 
	    // Si el resultado de la comparación es 0, significa que ambos elementos son iguales
	    // y por lo tanto quiere decir que hemos encontrado la búsqueda
	    if (resultadoDeLaComparacion == 0) {
	        return indiceDelElementoDelMedio;
	    }
	 
	    // Si no, entonces vemos si está a la izquierda o derecha
	    if (resultadoDeLaComparacion < 0) {
	        derecha = indiceDelElementoDelMedio - 1;
	        return busquedaBinariaRecursiva(arreglo, busqueda, izquierda, derecha);
	    } else {
	        izquierda = indiceDelElementoDelMedio + 1;
	        return busquedaBinariaRecursiva(arreglo, busqueda, izquierda, derecha);
	    }
	}
}