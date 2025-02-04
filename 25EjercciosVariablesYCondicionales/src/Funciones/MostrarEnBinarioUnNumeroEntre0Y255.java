package Funciones;

public class MostrarEnBinarioUnNumeroEntre0Y255 {

	static void binario(int num)    {
		int t[];    // en t guardaremos los dígitos binarios  
		int cont;

		t = new int [8];    // un número en binario entre 0 y 255 tiene 8 bits

		if (num<0 || 255<num)    

			System.out.println("Número fuera de rango (0..255)");     

		else       

		{           

			cont =0; 

			if (num==0)

			{           

				t[cont]=0;

				cont++;  

			}
			// iremos dividiendo y cogiendo el resto 

			while(num!=0)           

			{               

				t[cont] =num%2;  
				num =num/2;  
				cont++;   

			}

			System.out.println("En binario: ");

			// como t tiene los dígitos en orden inverso

			for (int i=cont-1;i>=0;i--) 

				System.out.print(t[i]);

			System.out.println("");    

		}
	}

	public static void main(String[] args) {  

		int num;

		System.out.print("Introduzca un numero (0..255): "); 
		num=Utilidades.Entrada.entero();

		binario(num);  

	} 

}



