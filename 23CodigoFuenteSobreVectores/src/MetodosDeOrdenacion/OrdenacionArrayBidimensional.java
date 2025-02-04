package MetodosDeOrdenacion;

import java.util.Scanner;

public class OrdenacionArrayBidimensional {
	
	static int j,i, n, m,t=0;

	public static void main(String[] args) {
		
		int n=Utilidades.teclado.leer_entero("introduce las filas");//pide las filas

		int m=Utilidades.teclado.leer_entero("introduce las columnas");//pide las columnas
				
				
		
		int mat[][]=new int [n][m];
		
		for ( i=0;i<n;i++){
			
			for( j=0;j<m;j++){
				
				mat[i][j]=Utilidades.teclado.leer_entero("introduce el numero en la pocision  "+i+"  "+j);//pide el nnumero				
			}
		}
		
		for ( i=0;i<n;i++){//imprime la matriz como ingresaste los datos
			for( j=0;j<m;j++){
				System.out.print(mat[i][j]+"	");
			}
			System.out.println("");
		}
		
		for( i=0; i < n; i++){//ordena la matriz de abajo hacia arriba
			
			for( j=0;j< m; j++){
				
				for(int x=0; x < n; x++){
					
					for(int y=0; y <m; y++){
						if(mat[i][j] > mat[x][y]){
							
							t = mat[i][j];
							mat[i][j] = mat[x][y];
							mat[x][y] = t;
						
						}
					}
				}
			}
		}
		
		System.out.println("******************************************************");
		
		System.out.println("***La matriz ordenada queda de la siguiente forma: ***");
		
		for ( i=mat.length-1;i>=0;i--){//imprime la matriz ascendentemente
		    for( j=mat[0].length-1;j>=0;j--){
		        System.out.print(mat[i][j]+"    ");
		    }
		    System.out.println("");
		}

	}

}


