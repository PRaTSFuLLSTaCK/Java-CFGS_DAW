package EstructuraSelectivaSimpleYDoble;

public class DescuentoRestaurante02 {
	
	public static void main (String [] args) {
		
		//constantes
		
				final double D1 = 0.1F;
				final double D2 = 0.2F;
				final double D3 = 0.3F;
				final double IGV = 0.19F;
				
				//variables
				
				double c, md, migv, p;
				
				//entrada
				
				c = Utilidades.teclado.leer_double("Introduzca el coste de la factura: ");
				
				//proceso
				
				if (c > 200) {
					
					md = c * D3;
					
				} else {
					
					if (c > 100) {
						
						md = c * D2;
						
					}else {
						
						md = c * D1;
						
					}
				}
				
				migv = (c - md) * IGV;
				p = c - md + migv;
				
				//salida
				
				System.out.println("El descuento de la factura es: " + md);
				System.out.println("El impuesto IGV de la factura es: " + migv);
				System.out.println("El importe de la factura es: " + p);
				
		
	}

}
