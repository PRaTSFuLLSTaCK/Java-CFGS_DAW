package BuclesAnidados;

public class DibujarCuadrado {

	public static void main(String[] args) {  

		int n; // tamaño del lado   

		int fila, col;

		System.out.print ("Lado del cuadrado: ");    

		n = Utilidades.Entrada.entero();

		for (fila=1; fila<=n; fila++)    

		{           

			for (col=1; col<=n; col++)   

				System.out.print ("* ");  

			System.out.println ("");    

		}   

	} 

}
