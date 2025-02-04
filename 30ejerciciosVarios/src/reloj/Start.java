package reloj;

public class Start {

	public static void main(String[] args) {
		
		
		/*
		 * 
		 * CREO DIFERENTES EJEMPLOS DE RELIJES Y OPERACIONES PARA PROBAR
		 * LO QUE HEMOS PROGRAMADO EN LA CLASE RELOJ
		 * 
		 * 
		 */
		Reloj reloj1 = new Reloj();
		reloj1.setHoraReal(21, 50, 23);
		
		Reloj reloj2 = new Reloj(23,12,50);
		/*
		reloj2.setHoras(23);
		reloj2.setMinutos(12);
		reloj2.setSegundos(50);
		 */
		
		Reloj relojCopiado = new Reloj(reloj1);
		
		
		Reloj unSegundoDespues = reloj2.addSegundo2Reloj();
		
		// pruebo la suma
		Reloj suma = reloj1.sumar(reloj2);
		
		
		System.out.println(reloj1);
		System.out.println(reloj2);
		System.out.println(suma);
		
	}
}
