package practica2.tema4;

import practica2.tema4.teclado;

public class Numerodelasuerte {
	public static void main(String[] args) {
		
		char opcion = 'o';
		
		//Comenzamos con un bucle el cual se va a repetir siempre que queramos (opcion para repetir s, S
		
		do {
			
			int dia = teclado.leer_entero("Introduzca d�a de nacimiento: ", 1, 31);//Controlamos que introduzcamos bien los dias del mes
			int mes = teclado.leer_entero("Introduzca mes de nacimiento: ", 1, 12);//Controlamos que introduzacamos bien el mes
			int anio = teclado.leer_entero("Introduzca a�o de nacimiento: ", 1900, 10000);//Controlamos que ponemos el año de forma correcta
			int resultado = fechaCorrecta(dia, mes, anio);//Creamos la variable resultado y le asignamos lo que nos devuelva la clase fechaCorrecta
			
			if (resultado == 0) { //condicion para revisar si hay que rectificar algun dato 
				System.out.println(numeroSuerte(dia, mes, anio));
			}else {
				switch (resultado) {
				case -1:
					System.out.println("Introduce bien el d�a: ");//Solicitamos de nuevo introducir el dato correcto
					break;
				case -2:
					System.out.println("Introduce bien el mes: ");//Solicitamos de nuevo introducir el dato correcto
					break;
				case -3:
					System.out.println("Introduce bien el a�o: ");//Solicitamos de nuevo introducir el dato correcto
					break;
				}
			}
			opcion = teclado.leer_caracter("�Deseas calcular otro n�mero de la suerte? S/N");//Solicitamos si queremos introducir otra fecha para calcular
		} while (opcion == 's' || opcion == 'S');
	}	
		
		public static int sumaDigitos (int num) {//en este metodo sumamos los digitos que hemos calculado, para sacar el numero de la suerte
			int suma = 0;
			while (num >= 10) {
				while (num != 0) {
				suma += num%10;
				num /= 10;
			}
			num = suma;
			suma = 0;
		}
		return num;//devolvemos el resultado
	}
		public static boolean bisiesto (int anio) {//en este metodo controlamos si el año es bisiesto
			return anio%4 == 0 && (anio%100!=0 || anio%400==0);
		}
		public static int fechaCorrecta (int dia, int mes, int anio) {
			
// Los hemos filtrado bajo par�metros permitidos y ya no son necesarios
//			if (dia < 1 || dia > 31) return -1;
//			if(mes < 1 || mes > 12) return -2;
//			if (anio < 0) return -3;
// Los hemos filtrado bajo par�metros permitidos y ya no son necesarios
			
			switch (mes) {
			case 4:
			case 6:	
			case 9:
			case 11:
				if(dia > 30) return -1;
			case 2:
				//Aqui llamamos al metodo bisiesto para verificar que en caso de ser Febrero no sobrepase los dias 
				if(bisiesto(anio) && dia>29) return -1;
				if(!bisiesto(anio)&& dia > 28) return -1;
			}
			return 0;
		}
		
		//En este medoto imprimimos en pantalla el resultado de los valores que hemos introducido
		
		public static int numeroSuerte (int dia, int mes, int anio) {
			if (fechaCorrecta(dia, mes, anio) == 0) {
				int sum = dia*1000000+mes*10000+anio;
				System.out.print("Tu numero de la suerte es: ");
				return sumaDigitos(sum);
		}
		return -1;
	}
}
