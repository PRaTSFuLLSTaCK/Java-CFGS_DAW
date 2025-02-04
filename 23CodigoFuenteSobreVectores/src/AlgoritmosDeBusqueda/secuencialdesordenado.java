package AlgoritmosDeBusqueda;

import java.util.Scanner;

public class secuencialdesordenado {
	
	public void buscar()
	{
		
		Scanner leer=new Scanner(System.in);
		int i=0;
		boolean bandera=false;
		int x;
		int v[]= new int[10];
		for(int c=0;c<v.length;c++){
			System.out.println("introduce los datos del arreglo");
			v[c]=leer.nextInt();
		}
		
		System.out.println("introduzca elemento a buscar");
		x=leer.nextInt();
		
		do{
			if(v[i]==x)
			{
				bandera=true;
			}
			else {
				bandera=false;
			}
			i++;
		}while(i<v.length && bandera==false);
		
		if(bandera==true){
			System.out.println("el elemento esta en la posicion "+ i);
		}
		else if(bandera==false){
			System.out.println("el elemento no esta en la lista");
		}
	}
}