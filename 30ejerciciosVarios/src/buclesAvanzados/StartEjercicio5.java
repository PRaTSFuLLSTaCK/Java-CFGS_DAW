package buclesAvanzados;

public class StartEjercicio5 {

	public static void main(String[] args) {
		
		
		// leer puntuaje
		int puntuaje = 7;
		int cuantas = 0;
		
		// recorrer los dados mirando si suman el puntuaje
		// si lo suman, lo imprimo (o lo cuento)
		if(puntuaje>12) {
			
			System.out.println("combinaciones imposibles");
		}
		else {
			
			for(int dado1=1;dado1<=6;dado1++) {
				
				for(int dado2=1;dado2<=6;dado2++) {
					
					if(dado1+dado2==puntuaje) {
						
						System.out.println("[D1]"+dado1+" [D2]"+dado2);
						cuantas++;
					}
				}
			}
			System.out.println("Han sido "+cuantas+" combinaciones");
		}

				
		
		
		

	}

}
