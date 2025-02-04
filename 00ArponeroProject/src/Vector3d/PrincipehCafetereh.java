package Vector3d;

public class PrincipehCafetereh {

	public static void main(String[] args) {
		
		Cafetera c = new Cafetera ();
		
		System.out.println(c);
		
		System.out.println("Modificando cantidad actual...");
		
		c.setCantidadActual(8000);
		
		System.out.println(c);
		
		System.out.println("Modificando cantidad maxima: ");
		
		c.setCantidadMaxima(1500);
		
		System.out.println("Sirviendo taza de 25 c.c: ");
		
		c.servirTaza(25);
		
		System.out.println(c);
		
		System.out.println("Vaciando cafetera...");
		
		c.vaciarCafetera();
		
		System.out.println(c);
		
		System.out.println("Agregar cafe: ");
		
		c.agregarCafe(100);
		
		System.out.println(c);
		
		System.out.println("Llenando cafetera...");
		
		c.llenarCafetera();
		
		System.out.println(c);
		
		System.out.println("Pos eso, funcionamiento co-erecto");

	}

}
