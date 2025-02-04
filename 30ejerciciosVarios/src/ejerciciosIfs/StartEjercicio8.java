package ejerciciosIfs;

public class StartEjercicio8 {

	public static void main(String[] args) {

		
		int numero = 3434;
		
		int unidades = numero%10;
		int decenas = numero/10%10;
		int centenas = numero/100%10;
		int unidadesMillar = numero/1000%10;
		
		System.out.println(numero);
		
		int numeroReves = unidades*1000+decenas*100+centenas*10+unidadesMillar;
		
		System.out.println(numeroReves);
		
	}

}