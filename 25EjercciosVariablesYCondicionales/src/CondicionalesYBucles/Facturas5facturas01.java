package CondicionalesYBucles;

public class Facturas5facturas01 {

	public static void main(String[] args) {  

		int codigo;     // el código del artículo en cada factura     
		int litros;     // la cantidad de litros en cada factura    
		float precio;   // el precio por litro en cada factura

		float importe_factura;  // guardará el importe de la factura con la que estemos trabajando
		float facturacion_total;    // el importe de todas las facturas  
		int litros_cod1;            // el total de litros vendidos del producto 1 en todas las facturas

		int mas_600;                // contador que sirve para llevar la cuenta de cuantas facturas hay de más de 600 €

		facturacion_total = 0;  
		litros_cod1 = 0;   
		mas_600 = 0;

		for (int i=1;i<=5;i++)  
			
		{            
			System.out.println("Factura nº " + i); 

			System.out.print("código de producto: "); 

			codigo=Utilidades.Entrada.entero();        

			System.out.print("cantidad (litros): ");  

			litros=Utilidades.Entrada.entero();        

			System.out.print("precio (litro): ");  

			precio= (float)Utilidades.Entrada.real();

			importe_factura = litros*precio;

			facturacion_total += importe_factura;

			if (codigo == 1)    

				litros_cod1 += litros;

			if(importe_factura >= 600)   

				mas_600 ++;
		}

		System.out.println("\n\n\nResumen de ventas\n");    
		// facturación total    

		System.out.println("La facturación total es de: " +facturacion_total + "€");

		// litros del articulo 1   

		System.out.println("Ventas del producto 1: " + litros_cod1 + " litros");       

		// factura de mas de 600 euros     

		System.out.println("Factura superior a 600€: " + mas_600);  

	} 
}
