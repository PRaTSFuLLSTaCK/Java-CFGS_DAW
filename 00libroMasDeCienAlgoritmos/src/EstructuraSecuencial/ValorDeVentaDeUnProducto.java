package EstructuraSecuencial;

public class ValorDeVentaDeUnProducto {
	
	public static void main (String [] args) {
		
		//Variables
		
		double vv;
		double igv, pv;
		
		//Entrada
		
		vv = Utilidades.teclado.leer_double("Introduzca el valor de venta del producto: ");
		
		//Proceso
		
		igv = vv * 0.19F;
		
		pv = vv + igv;
		
		//salida
		
		System.out.println("IGV: " + igv);
		
		System.out.println("Precio de venta: " + pv);
		
	}

}
