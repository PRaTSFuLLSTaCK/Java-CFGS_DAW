package matricesDinamicas;

public class matricesDinamicas {

	private int filas;
	private int columnas;
	private int[][] datos;
	

	
	
	public matricesDinamicas(int filas,int columnas) {
		
		this.filas = filas;
		this.columnas = columnas;
		
		datos = new int[filas][columnas];
		
		rellenarAleatoriamente();
	}
	
	
	
	private void rellenarAleatoriamente() {
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				
				datos[i][j] = ((int)(Math.random()*9)+1); // entre 1 y 9 incluidos
			}
		}
	}
	
	
	
	
	public void imprimir() {
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				
				System.out.print(datos[i][j]+" ");
			}
			System.out.println();
		}
	}

	


	public void addColumna(int hueco) {
		
		// crear una matriz con una columna mas
		int[][] datosAmpliados = new int [filas][columnas+1];
		
		
		// copiar las columnas anteriores al hueco
		for(int i=0;i<filas;i++) {
			for(int j=0;j<hueco;j++) {
				
				datosAmpliados[i][j] = datos[i][j];
			}
		}		
		
		
		// copiar las columnas posteriores al hueco
		for(int i=0;i<filas;i++) {
			for(int j=hueco;j<columnas;j++) {
				
				datosAmpliados[i][j+1] = datos[i][j];
			}
		}			
		
		
		// rellenar la columna vacia con la media de las de al lado
		for(int i=0;i<filas;i++) {
			
			if(hueco==0) {
				
				datosAmpliados[i][hueco] = datosAmpliados[i][hueco+1]/2;
			}
			else if(hueco==columnas) {
			
				datosAmpliados[i][hueco] = datosAmpliados[i][hueco-1]/2;
			}
			else {
				datosAmpliados[i][hueco] = (datosAmpliados[i][hueco-1]+datosAmpliados[i][hueco+1])/2;
			}
		}		
		
		// transmision de la informacion
		datos = datosAmpliados;
		columnas++;
		
		
		
		
		
	}
	
	
}
