package vectoresEspeciales;

public class VectorEspecial {

	
	
	private int datos[];
	private int contador;
	private int valorMinimo; 
	private int cuantosPares;
	
	
	
	
	/**
	 * Constructor que permite inicializar el objeto con
	 * un vector del tamaño indicado y lo rellena
	 * de forma aleatoria
	 * 
	 * @param tamanio
	 */
	public VectorEspecial(int tamanio) {
		
		if(tamanio<1) {
			tamanio = 1;
		}
		
		datos = new int[tamanio];
		contador = 0;
		valorMinimo = 100000;
		cuantosPares = 0;
	}
	

	
	
	
	public void add(int dato) {
		
		// si hay sitio
		if(contador<datos.length) {
			
			// inserto e incremento el tamaño
			datos[contador] = dato;
			contador++;

			// resto de operaciones de las que no
			// soy responsable
			calcularSiEsMinimo(dato);
			mirarSiEsPar(dato);
		}
	}





	private void mirarSiEsPar(int dato) {
		// miro si es par
		if(dato%2==0) {
			
			cuantosPares++;
		}
	}





	private void calcularSiEsMinimo(int dato) {
		// miro si es minimo
		if(dato<valorMinimo) {
			
			valorMinimo = dato;
		}
	}
	
	
	
	
	
	/**
	 * 
	 */
	public void imprimir() {
		
		System.out.println("Aqui caben "+datos.length+" elementos");
		System.out.println("Hay "+contador+" elementos");
		
		for(int i=0;i<contador;i++) {
			
			System.out.print(datos[i] +" ");
		}
		System.out.println();
		System.out.println();
	}	
	
	
	
	
	
	/**
	 * Devuelve el valor maximo del vector recorriendolo
	 * @return
	 */
	public int getValorMaximo() {
		
		int maximo = -100000;
		
		if(contador>0) {
			
			maximo = datos[0];
		}
	
		// recorrer el vector
		for(int i=1;i<contador;i++) {
			
			// mirar y comparar con el maximo
			if(datos[i]>maximo) {
				
				maximo = datos[i];
			}
		}
		return maximo;
		
	}
	
	
	
	
	/**
	 * Devuelve el valor minimo directamente
	 * @return
	 */
	public int getValorMinimo() {
		
		return valorMinimo;
	}
	
	
	
	
	/**
	 * Devuelve cuantos son pares de manera directa
	 * @return
	 */
	public int getCuantosPares() {
		
		return cuantosPares;
	}
	
	
	
	
	
	public void addOrdenado(int dato) {
		
		if(contador<datos.length) {
		
			int donde = buscar(dato);
			abrirHueco(donde);

			// añado
			contador++;
			datos[donde] = dato;
		}
	}



	private void abrirHueco(int hueco) {
		
		for(int i=contador;i>hueco;i--) {
			
			datos[i] = datos[i-1];
		}
	}





	/**
	 * Busca un hueco en el vector donde iría el dato
	 * @param dato
	 * @return
	 */
	private int buscar(int dato) {
		
		int donde = 0;
		
		while((datos[donde]<dato)&&(donde<contador)) {
			
			donde++;
		}
		
		return donde;
	}





	public VectorEspecial combinar(VectorEspecial elOtroVector) {
		
		VectorEspecial combinado = new VectorEspecial(contador+elOtroVector.contador);
		
		int ojoEnV1 = 0;
		int ojoEnV2 = 0;
		
		for (int i=0; i<combinado.datos.length; i++) {
			
			if(ojoEnV1==this.contador) {
				
				combinado.datos[i] = elOtroVector.datos[ojoEnV2];
				ojoEnV2++;
			}
			else if(ojoEnV2==elOtroVector.contador) {
				
				combinado.datos[i] = this.datos[ojoEnV1];
				ojoEnV1++;
			}
			else if(this.datos[ojoEnV1]>elOtroVector.datos[ojoEnV2]) {
				
				combinado.datos[i] = elOtroVector.datos[ojoEnV2];
				ojoEnV2++;
			}
			else {
				
				combinado.datos[i] = this.datos[ojoEnV1];
				ojoEnV1++;
			}
			
		}
		combinado.contador = combinado.datos.length;
		
		return combinado;
	}
	
	
	
	
	
}
