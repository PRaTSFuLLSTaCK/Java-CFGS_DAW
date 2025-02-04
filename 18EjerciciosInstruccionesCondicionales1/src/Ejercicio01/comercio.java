package Ejercicio01;

/*En un determinado comercio se realiza un descuento dependiendo del
precio de cada producto. Si el precio es inferior a 6 €, no se hace
descuento; si es mayor o igual a 6 € y menor que 60 €, se hace un
descuento del 5 por 100, y si es mayor o igual a 60 € , se hace un
descuento del 10 por 100. Realiza el algoritmo que lee el precio de un
producto y calcula y escribe su precio final.*/

public class comercio {
	public static void main (String [] args){
		float precio = 100, precio_final;
		int descuento;
	
	
		if (precio < 6) 
			// si el precio es menor de 6 € => dto 0
			descuento = 0;
		else
			if (precio < 60)
				// si el precio es mayor que 6 € y menor que 60=> dto 0
				descuento = 5;
			else
				// si el precio es >= 60 €
				descuento = 10;
				
		precio_final = precio - precio * descuento / 100;

		System.out.println ("El precio original " + precio);
		System.out.println ("El precio con descuento " + precio_final);		
	}
}