package EntornosDeDesarrollo;

import java.util.*;

class Principal{
	public static void main(String [] args){
		int [] vector = new int[10]; //Declaramos el array de enteros de 10 elementos
		int aux;
		Scanner teclado=new Scanner(System.in);
		//Relenamos el array-------------------------------------------------------------------------------------
		System.out.println("*********    RELLENEMOS EL VECTOR   ***********");
		for(int i=0; i<vector.length; i++){
			System.out.print("Dame vector["+i+"]= ");
			vector[i]=teclado.nextInt();
		}
		//Mostramos el vector original--------------------------------------------------------------------------
		System.out.println("\n---------  El vector antes del orden es: --------------\n");
		System.out.print("( ");
		for(int i=0; i<vector.length; i++){
			System.out.print(" "+vector[i]);
		}
		System.out.println(" )");
		//Ordenemos el vector-----------------------------------------------------------------------------------
		for(int i=0; i<vector.length; i++){
			for(int j=i+1; j<vector.length; j++){
				if(vector[i]>vector[j]){
					aux=vector[j];
					vector[j]=vector[i];
					vector[i]=aux;
				}
			}
		}
		//Mostramos el vector Ordenado---------------------------------------------------------------------------
		System.out.println("\n\n---------  El vector Ordenado es es: --------------\n");
		System.out.print("( ");
		for(int i=0; i<vector.length; i++){
			System.out.print(" "+vector[i]);
		}
		System.out.println(" )");
	}

}