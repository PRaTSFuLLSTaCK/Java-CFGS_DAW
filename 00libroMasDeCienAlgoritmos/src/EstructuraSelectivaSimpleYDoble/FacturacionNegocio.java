package EstructuraSelectivaSimpleYDoble;

public class FacturacionNegocio {
	
	public static void main (String [] args) {
		
		//constantes
		
		final double DESCG = 0.15F;
		final double DESCA = 0.2F;
		final double RECG = 0.1F;
		final double RECA = 0.05F;
		
		//variables
		
		double mc, m, tp;
		char tc, fp;
		String r;
		
		//entrada
		
		mc = Utilidades.teclado.leer_double("Introduzca el coste de su compra: ");
		tc = Utilidades.teclado.leer_caracter("Introduzca el tipo de cliente: ");
		fp = Utilidades.teclado.leer_caracter("Que forma de pago va a utilizar: ");
		
		//proceso
		
		if (tc == 'G') {
			
			if (fp == 'C') {
				
				m = mc * DESCG;
				tp = mc - m;
				r = "DESCUENTO DEL 15%";
				
			} else {
				
				m = mc * RECG;
				tp = mc + m;
				r = "RECARGO DEL 10%";
				
			}
			
		} else {
			
			if (fp == 'C') {
				
				m = mc * DESCA;
				tp = mc - m;
				r = "DESCUENTO DEL 20%";
				
			} else {
				
				m = mc * RECA;
				tp = mc + m;
				r = "RECARGO DEL 5%";
				
			}
			
		}
		
		//salida
		
		System.out.println(r + ": " + m);
		System.out.println("Total a pagar: " + tp);
		
	}

}
