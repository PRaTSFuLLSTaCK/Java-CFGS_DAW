package ClaseYObjeto;

public class PrincipehPunteh {
	
	public static void main  (String [] args) {
		
		Punto p = new Punto (5, 5);
		
		System.out.println(p.getX());
		System.out.println(p.getY());
		System.out.println(p);
		
		double x = 0;
		p.setX(x);
		p.setX(x);
		
		System.out.println(p);
		
		Punto p2 = new Punto (1,2);
		
		System.out.println(p.distancia(p2));
		
		Punto pm = p.puntoMedio(p2);
		System.out.println(pm);
	}

}
