package Ejercicio03;

//Algoritmo que lee como datos de entrada una fecha expresada en día
//(1…31), mes (1…12) y año (en número) y nos dice la fecha que será al
//ía siguiente. Se supondrá que febrero tendrá siempre 28 días.

public class fecha_dia_despues {
	public static void main (String args []) {
		int dia=30, mes=4, anio=2011, diasmes;
		
		// averigua los días que tiene el mes actual		
		switch (mes) {
			case 4: case 6: case 9: case 11: diasmes=30; break;
			case 2: diasmes=28; break;
			default: diasmes=31;			
		} 
		// incrementamos la fecha en un día
		dia ++;
		
		// comprobar si hemos pasado de mes
		if (dia > diasmes) {
			// nos colocamos en el dia 1 del mes siguiente
			dia = 1;
			mes ++;
			
			//comprobar si hemos pasado de año
			if (mes == 13) {
				// Estamos a 1 de enero del año siguiente
				anio ++;
				mes = 1;
				dia = 1;
			}
		}
		
		System.out.println ("La fecha al día siguiente es: " + dia + "/" + mes + "/" + anio);
	}
	
}