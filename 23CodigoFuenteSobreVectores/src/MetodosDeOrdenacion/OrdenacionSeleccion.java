package MetodosDeOrdenacion;

/*El método de ordenación por selección consiste en repetir los siguientes pasos:
Se busca el elemento más pequeño del array y se coloca en la primera posición.
Entre los restantes, se busca el elemento más pequeño y se coloca en la segunda posición.
Entre los restantes se busca el elemento más pequeño y se coloca en la tercera posición.
……..
Este proceso se repite hasta colocar el último elemento.
De forma gráfica el proceso sería el siguiente:
Array original a ordenar: [50, 26, 7, 9, 15, 27]*/

	class ordenSeleccion{
		//método java de ordenación por selección
		public static void seleccion(int A[]) {
			int i, j, menor, pos, tmp;
			for (i = 0; i < A.length - 1; i++) { // tomamos como menor el primero
				menor = A[i]; // de los elementos que quedan por ordenar
				pos = i; // y guardamos su posición
				for (j = i + 1; j < A.length; j++){ // buscamos en el resto
					if (A[j] < menor) { // del array algún elemento
						menor = A[j]; // menor que el actual
						pos = j;
					}
				}
				if (pos != i){ // si hay alguno menor se intercambia
					tmp = A[i];
					A[i] = A[pos];
					A[pos] = tmp;
				}
			}
		}
	}
