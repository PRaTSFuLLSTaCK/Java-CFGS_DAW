package CadenasDeCaracteres;

public class QuitarEspaciosEnBlanco {
	
	public static void main(String[] args) {
		
		String f1, f2 = "", t;
		int i, p;
		
		//entrada
		
		f1 = Utilidades.teclado.leer_cadena2("Introduzca la frase: ");
		
		//proceso
		
		p = 0;
		
		f1 = f1.trim();
		
		for (i = 0; i < f1.length (); i++) {
			
			if ( f1.substring(i, i + 1) .equals(" ")) {
				
				t = f1.substring(p, i);
				p = i + 1;
				f2 = f2 + t;
				
			}
			
		}
		
		t = f1.substring(p, i);
		
		f2 = f2 + t;
		
		//salida
		
		System.out.println("La frase sin espacios es: " + f2);
		
	}

}
