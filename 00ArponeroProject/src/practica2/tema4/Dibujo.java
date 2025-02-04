package practica2.tema4;

import practica2.tema4.teclado;

// Creamos clase Dibujo
public class Dibujo {
	// Se define atributo caracter de tipo CHAR
	private char caracter;
	// Constructor Dibujo
	public Dibujo() {
		this.caracter = '*';
	}
	// Constructor Dibujo con par�metros
	public Dibujo(char caracter) {
		this.caracter = caracter;
	}
	// Definimos Getter para Caracter
	public char getCaracter() {
		return this.caracter;
	}
	// Definimos Setter para Caracter
	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}
	// Figura rect�ngulo con par�metros (variable entera BASE y variable entera ALTURA) hecha con dos bucles anidados
	public void rectangulo(int base, int altura) {
		// Para cada l�nea de la altura...
		for (int i = 0; i < altura; i++) {
			// ... Dibujamos la l�nea de la base.
			for (int j = 0; j < base; j++) {
				//Si i es 0 o i es -1, imprimir en pantalla sin salto de l�nea CARACTER
				if (i == 0 || i == altura - 1) {
					System.out.print(caracter);
				// En caso de que j sea 0 o j sea base -1, imprimir en pantalla sin salto de l�nea CARACTER
				} else if (j == 0 || j == base - 1) {
					System.out.print(caracter);
				// Si no, mostrar en pantalla sin salto de l�nea espacio en blanco
				} else {
					System.out.print(" ");
				}
			}
			// Saltamos a la siguiente l�nea
			System.out.println();
		}
	}
	// Figura tri�ngulo con par�metro (variable entera ALTURA) hecha con dos bucles anidados 
	public void triangulo(int altura) {
		// Para cada l�nea de la altura...
		for (int i = 0; i < altura; i++) {
			// ... Calculamos d�nde empieza a dibujarse el tri�ngulo.
			for (int j = 0; j < altura - i - 1; j++) {
				System.out.print(" ");
			}
			// Dibujamos los caracteres correspondientes a esa altura
			for (int j = 0; j < 2 * i + 1; j++) {
				if (i == altura - 1 || j == 0 || j == 2 * i) {
					System.out.print(caracter);
				} else {
					System.out.print(" ");
				}
			}
			// Saltamos a la siguiente l�nea
			System.out.println();
		}
	}
	// Figura rombo con par�metro (variable entera ALTURA) 
	public void rombo(int altura) {
		int x = 0;
		int y = 0;
		// Para cada l�nea de altura...
		for (int i = 0; i < altura; i++) {
			// ... Calculamos cu�ntos espacios hay que dibujar previamente
			x = Math.abs(2 - i) + 1;
			for (int j = 0; j < x ; j++) {
				System.out.print(" ");
			}
			// Calculamos la cantidad de caracteres a dibujar
			y = altura - 2 * (x - 1);
			for (int j = 0; j < y; j++) {
				System.out.print(caracter);
			}
			// Saltamos a la siguiente l�nea
			System.out.println();
		}
	}
	// Muestra un mensaje rodeado de caracteres
	public void mensaje(String cadena) {
		// Calculamos la longitud para el encuadre del mensaje
		int x = cadena.length() + 4;
		// Dibujamos la primera l�nea del marco
		for (int i = 0; i < x; i++) {
			System.out.print(caracter);
		}
		// Salto de l�nea
		System.out.println();
		// Dibuja el mensaje entre CARACTER
		System.out.println(caracter + " " + cadena + " " + caracter);
		// Dibuja la base del encuadre
		for (int i = 0; i < x; i++) {
			System.out.print(caracter);
		}
		// Salto de l�nea
		System.out.println();
	}
	// Programa principal
	public static void main(String[] args) {
		// Definimos objeto DIBUJO con constructor por defecto
		Dibujo asterisco = new Dibujo();
		// Definimos objeto DIBUJO con caracter #
		Dibujo almohadilla = new Dibujo('#');
		// Definimos objeto DIBUJO con caracter -
		Dibujo raya = new Dibujo('-');

		// Dibujamos figuras con objeto ASTERISCO (*)
		asterisco.triangulo(8);
		asterisco.rombo(5);
		asterisco.rectangulo(8, 5);
		asterisco.mensaje("Soy un asterisco");

		// Dibujamos figuras con objeto ALMOHADILLA (#)
		almohadilla.triangulo(7);
		almohadilla.rombo(5);
		almohadilla.rectangulo(5, 4);
		almohadilla.mensaje("Soy una almohadilla");

		// Dibujamos figuras con objeto RAYA (-)
		raya.triangulo(7);
		raya.rombo(5);
		raya.rectangulo(5, 4);
		raya.mensaje("Soy una raya");
		// Inicializamos OPCI�N a 0
		char opcion = 0;
		// Iniciamos un bucle de control
		do {
			// Recogemos la OPCI�N tras mostrar el men�
			opcion = menu();
			// Seg�n sea OPCI�N...
			switch (opcion) {
			case '1':
				// Establecemos CARACTER con el que dibujar
				char c = teclado.leer_caracter("Establece el car�cter de dibujo:");
				asterisco.setCaracter(c);
				break;
			case '2':
				// Muestra el CARACTER con el que se va a dibujar
				System.out.println(asterisco.getCaracter());
				break;
			case '3':
				// Mostramos un rect�ngulo personalizado
				int base = teclado.leer_entero("Introduzca la base:", 1, 20);
				int altura = teclado.leer_entero("Introduzca la altura:", 1, 20);
				asterisco.rectangulo(base, altura);
				break;
			case '4':
				// Mostramos un tri�ngulo personalizado
				int altura2 = teclado.leer_entero("Introduzca la altura:", 1, 20);
				asterisco.triangulo(altura2);
				break;
			case '5':
				// Mostramos un rombo personalizado
				int altura3 = teclado.leer_entero("Introduzca la altura:", 1, 20);
				asterisco.rombo(altura3);
				break;
			case '6':
				// Mostramos una cadena de mensaje
				String mensaje = teclado.leer_cadena2("Introduzca un mensaje:");
				asterisco.mensaje(mensaje);
				break;

			default:
				// Salimos del programa
				System.out.println("Fin del programa");
				break;
			}
			// No se sale del bucle mientras no sea 7
		} while (opcion != '7');
	}
	// M�todo que muestra un men� y recoge la opci�n por teclado
	public static char menu() {
		System.out.println("Programa para dibujar");
		System.out.println("1.- Establece el car�cter de dibujo");
		System.out.println("2.- Ver el car�cter de dibujo");
		System.out.println("3.- Rect�ngulo");
		System.out.println("4.- Tri�ngulo");
		System.out.println("5.- Rombo");
		System.out.println("6.- Mensaje");
		System.out.println("7.- Salir");

		char op = teclado.leer_caracter("Opci�n (1 al 7):", 49, 55);

		return op;
	}
}
