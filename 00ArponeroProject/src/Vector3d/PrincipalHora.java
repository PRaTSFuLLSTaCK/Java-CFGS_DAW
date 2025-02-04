package Vector3d;

public class PrincipalHora {

	public static void main(String[] args) {
		Hora h1 = new Hora(18, 25, 57);
		System.out.println(h1);
		int hora = utilidades.teclado.leer_entero("Introduzca la hora: ");
		int minutos = utilidades.teclado.leer_entero("Introduzca los minutos: ");
		int segundos = utilidades.teclado.leer_entero("Introduzca los segundos: ");
		h1.setHoras(hora);
		h1.setMinutos(minutos);
		h1.setSegundos(segundos);
		
		System.out.println("Hora modificada");
		System.out.println(h1);
		System.out.println("En segundos son: " +h1.aSegundos());
		
		long segundos2 = utilidades.teclado.leer_entero("Introduzca la hora en segundos: ");
		Hora h2 = Hora.deSegundos(segundos2);
		System.out.println(h2);
		
		System.out.println(h1);
		h1.escribir12();
		System.out.println(h2);
		h2.escribir12();
		
	}
}
