package EstructuraSelectivaMultiple;

public class PrecioProductoYCalidad {
	
	public static void main (String [] args) {
		
		//variables
		
		int c, p, precio = 0;
		
		//entrada
		
		c = Utilidades.teclado.leer_entero("Puede indicar la calidad que desea para su producto: ", 1, 3);
		
		p = Utilidades.teclado.leer_entero("Puede indicar el producto que desea para su pedido: ", 1, 3);
		
		//proceso
		
		switch (c) {

		case 1:
			switch (p) {

			case 1:

				precio = 5000;
				break;

			case 2:

				precio = 4500;
				break;


			case 3:

				precio = 4000;
				break;
			}

		case 2:
			switch (p) {

			case 1:

				precio = 4500;
				break;

			case 2:

				precio = 4000;
				break;


			case 3:

				precio = 3500;
				break;
			}

		case 3:
			switch (p) {

			case 1:

				precio = 4000;
				break;

			case 2:

				precio = 3500;
				break;


			case 3:

				precio = 3000;
				break;
			}

		}
		
		//salida
		
		System.out.println("El precio del producto es: " + precio);

	}

}
