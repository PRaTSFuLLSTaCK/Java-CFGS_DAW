package borradoVectores;

public class MiVector {

	private int[] datos;
	private int cuantos;
	
	
	public MiVector() {
		
		datos = new int[30];
		cuantos = 0;
	}
	
	
	
	/**
	 * 
	 * @param numero
	 * @return
	 */
	public int add(int numero) {
		
		if(cuantos<30) {
			
			datos[cuantos] = numero;
			cuantos++;
		}
		
		return (cuantos-1);
	}
	
	
	
	
	/**
	 * 
	 * @param numero
	 * @return
	 */
	public int del(int numero) {
		
		int donde = buscar(numero);
		if(donde!=-1) {

			cerrarHueco(donde);
			
		}
		
		return donde;
	}
	
	
	
	
	
	
	
	
	
	
	
	private void cerrarHueco(int donde) {

		cuantos--;
		for(int i=donde;i<cuantos;i++) {
			
			datos[i] = datos[i+1];
		}
	}



	
	
	
	
	private int buscar(int numero) {
		
		int i=0;
		boolean encontrado = false;
		
		while((encontrado==false)&&(i<datos.length)) {
			
			if(datos[i]==numero) {
				
				// encontrado
				encontrado = true;
			}
			else i++;
		}
		// si no lo encuentro, cambio lo que vale la i 
		// para devolver -1
		if(encontrado==false) i=-1;
		
		return i;		
	}
	
	
	
	
	
	
	
	
	
	public void imprimir() {
		
		System.out.println("los 30");
		for (int i = 0; i < datos.length; i++) {
			
			System.out.print(datos[i]+ " ");
		}
		
		System.out.println("\n\n\nlos que realmente importan");
		for (int i = 0; i < cuantos; i++) {
			
			System.out.print(datos[i]+ " ");
		}
	}
	
	
	
	
	
	
}
