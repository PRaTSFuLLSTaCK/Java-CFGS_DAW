package EntornosDeDesarrollo;

import java.util.Arrays;

import utilidades.teclado;

public class MainEncuesta {

	public static void main(String[] args) {
		Estudiante[] array = solicitarDatos();
		double porcentajeHombres = porcentajeH(array);
		double porcentajeMujeres = porcentajeM(array);
		double[] resultadoH = hombresTrabajan(array);
		double[] resultadoM = mujeresTrabajan(array);
		System.out.println("Porcentaje de hombres de la Universidad: "+porcentajeHombres+"%");
		System.out.println("Porcentaje de mujeres de la Universidad: "+porcentajeMujeres+"%");
		System.out.println("Porcentaje de hombres que trabajan de la Universidad: "+resultadoH[0]+"%");
		System.out.println("Sueldo medio de hombres que trabajan de la Universidad: "+resultadoH[1]+"�");
		System.out.println("Porcentaje de mujeres que trabajan de la Universidad: "+resultadoM[0]+"%");
		System.out.println("Sueldo medio de mujeres que trabajan de la Universidad: "+resultadoM[1]+"�");
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	private static double[] mujeresTrabajan(Estudiante[] array) {
		double[] res = new double[2]; //0 %, 1 sueldo
		double cont = 0;
		double contM = 0;
		double suma = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i].getSexo() == 2) {
				contM++;
				if(array[i].getTrabaja() == 1) {
					cont++;
					suma += array[i].getSueldo();
				}
			}
		}
		res[0] = cont / contM * 100; 
		res[1] = suma / cont;
		return res;
	}

	private static double[] hombresTrabajan(Estudiante[] array) {
		double[] res = new double[2]; //0 %, 1 sueldo
		double cont = 0;
		double contH = 0;
		double suma = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i].getSexo() == 1) {
				contH++;
				if(array[i].getTrabaja() == 1) {
					cont++;
					suma += array[i].getSueldo();
				}
			}
		}
		res[0] = cont / contH * 100; 
		res[1] = suma / cont;
		return res;
	}

	private static double porcentajeM(Estudiante[] array) {
//		double cont = 0;
//		for (int i = 0; i < array.length; i++) {
//			if(array[i].getSexo() == 2) {
//				cont++;
//			}
//		}
//		return cont / array.length * 100;
		return 100 - porcentajeH(array);
	}

	private static double porcentajeH(Estudiante[] array) {
		double cont = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i].getSexo() == 1) {
				cont++;
			}
		}
		return cont / array.length * 100;
	}

	private static Estudiante[] solicitarDatos() {
		int n = teclado.leer_entero("Introduzca el numero de encuestados", 0, 50);
		Estudiante[] array = new Estudiante[n];
		for (int i = 0; i < array.length; i++) {
			int dni = teclado.leer_entero("Introduzca el dni");
			int sexo = teclado.leer_entero("Introduzca sexo (1. Masculino, 2. Femenino)", 1, 2);
			int trabaja = teclado.leer_entero("Introduzca si trabaja (1. Si trabaja, 2. No trabaja)", 1, 2);
			double sueldo = 0;
			if(trabaja == 1) {
				sueldo = teclado.leer_double("Introduzca el sueldo ");
			}
			Estudiante e = new Estudiante(dni, sexo, trabaja, sueldo);
			array[i] = e;
		}
		return array;
	}
	
	

}
