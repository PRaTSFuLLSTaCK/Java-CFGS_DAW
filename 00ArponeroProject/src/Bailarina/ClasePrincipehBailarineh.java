package Bailarina;

public class ClasePrincipehBailarineh {
	
	public static void main (String [] args) {
		
		bailarina [] cuerpo = new bailarina [5];
		
		bailarina irene = new bailarina("Irene", 60.99, 187, true);
		bailarina paca = new bailarina("paca", 60.99, 187, true);
		bailarina pepa = new bailarina("pepa", 60.99, 187, false);
		bailarina jertru = new bailarina("jertru", 60.99, 187, true);
		bailarina furgencia = new bailarina("furgencia", 60.99, 187, false);
		
		cuerpo [0] = irene;
		cuerpo [4] = furgencia;
		cuerpo [1] = pepa;
		cuerpo [3] = jertru;
		cuerpo [2] = paca;
		
		for (int i = 0; i < cuerpo.length; i++) {
			
			System.out.println("Bailarina " + (i + 1) + " " + cuerpo [i]);
			
		}
		
		double pMax = Double.MIN_VALUE;
		int pos = -1;
		
		for (int i = 0; i < cuerpo.length; i++) {
			
			if (cuerpo [i].getPeso() > pMax) {
				
				pMax = cuerpo [i].getPeso();
				
				pos = i;
				
			}
			
		}
		
		cuerpo [pos] = null;
		
		for (int i = 0; i < cuerpo.length; i++) {
			
			System.out.println("Bailarina " + (i + 1) + " " + cuerpo [i]);
			
		}
		
	}

}
