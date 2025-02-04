package VariablesYCondicionales;

public class NumeroCapicua02 {

	public static void main(String[] args) {   

		int num;        

		int dm, um, c, d, u;        

		boolean capicua = false; // suponemos que el número no es capicúa

		// 9 9 . 9 9 9  a cada guarismo lo llamaremos:        

		//dm um  c d u: dm (decenas de millar), um:(unidades de millar)       

		//              c: (centenas), d: (decenas), u: (unidades)        

		// En esta versión haremos que el número 121 ó el 33 sea visto como capicúa.        

		// La idea es no tener en cuenta los ceros por la derecha.        

		System.out.print("Introduzca un número entre 0 y 99.999: ");        

		num=Utilidades.Entrada.entero();        

		// unidad        

		u = num % 10;        

		num = num / 10;

		// decenas       

		d = num % 10;        

		num = num / 10;        

		// centenas        

		c = num % 10;        

		num = num / 10;        

		// unidades de millar        

		um = num % 10;        

		num = num / 10;        

		// decenas de millar        

		dm = num;        

		//si el número tiene 5 cifras (dm, um, c, d, u)        

		if (dm == u && um == d)            

			capicua = true;        

		//si el número tiene 4 cifras (0, um, c, d, u)        

		if (dm == 0 && um == u && c == d)            

			capicua = true;                

		//si el número tiene 3 cifras (0, 0, c, d, u)        

		if (dm == 0 && um==0 && c == u)            

			capicua = true;                

		//si el número tiene 2 cifras (0, 0, 0, d, u)        

		if (dm == 0 && um == 0 && c == 0 && d == u)            

			capicua = true;                

		// se entiende que un número de una cifra no es capicúa        

		if (capicua)            

			System.out.println ("el número es capicúa");

		else           

			System.out.println ("el número NO es capicúa");

	}

}
