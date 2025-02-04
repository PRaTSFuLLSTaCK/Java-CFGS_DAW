package misMatrices;

public class MisMatrices {

	private int filas;
	private int columnas;
	
	private int datos[][];
	
	
	
	public MisMatrices(int filas,int columnas) {

		// guardo filas y columnas
		this.filas = filas;
		this.columnas = columnas;
		
		// reservo espacio para la matriz
		datos = new int[filas][columnas];
		
		// relleno con datos la matriz
		addDatos();
	}


	
	
	

	private void addDatos() {
		
		// recorro toda la matriz rellenando 
		// aleatoriamente
		for(int i=0;i<filas;i++) {
			
			for(int j=0;j<columnas;j++) {
				
				datos[i][j] = (int)(Math.random()*90)+10;
			}
		}
	}
	
	
	
	
	public void buscar(int numero) {
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				
				if(datos[i][j] == numero) {
					
					System.out.println("\nEncontrado el "+numero);
					System.out.println("Fila "+i+" Columna "+j);
				}
			}
		}		
	}
	
	
	
	
	public void imprimir() {
		
		for(int i=0;i<filas;i++) {
			
			System.out.print("f"+i+" |");
			for(int j=0;j<columnas;j++) {
				
				System.out.print(datos[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.print("___");
		for(int j=0;j<columnas;j++) {
			
			System.out.print("___");
		}
		System.out.println();
		System.out.print("    ");
		for(int j=0;j<columnas;j++) {
			
			System.out.print("c"+j+" ");
		}
	}
	
	
	
}
