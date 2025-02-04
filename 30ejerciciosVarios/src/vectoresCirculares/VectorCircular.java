package vectoresCirculares;

public class VectorCircular {

	private int[] datos;
	private int donde;
	
	
	public VectorCircular() {
		
		datos = new int[7];
		donde = 0;
	}
	
	
	
	public void imprimir() {
		
		for(int i=0;i<datos.length;i++) {
			
			System.out.print(datos[i]+" ");
		}
		System.out.println();
	}
	
	
	
	public void add(int valor) {
		
		datos[donde] = valor;
		donde++;
		
		if(donde == datos.length) {
			
			donde = 0;
		}
	}
	
	
	
	public int buscar(int numero) {
		
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
	
	
	
}
