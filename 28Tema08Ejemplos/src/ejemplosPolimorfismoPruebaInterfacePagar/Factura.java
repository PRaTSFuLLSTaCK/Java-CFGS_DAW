package ejemplosPolimorfismoPruebaInterfacePagar;

// Fig. 10.12: Factura.java
// La clase Factura implementa a PorPagar.

public class Factura implements PorPagar
{
   private String numeroPieza; 
   private String descripcionPieza;
   private int cantidad;
   private double precioPorArticulo;

   // constructor con cuatro argumentos
   public Factura( String pieza, String descripcion, int cuenta, 
      double precio )
   {
      numeroPieza = pieza;
      descripcionPieza = descripcion;
      establecerCantidad( cuenta ); // valida y almacena la cantidad
      establecerPrecioPorArticulo( precio ); // valida y almacena el precio por art�culo
   } // find el constructor de Factura con cuatro argumentos

   // establece el n�mero de pieza
   public void establecerNumeroPieza( String pieza )
   {
      numeroPieza = pieza;  
   } // fin del m�todo establecerNumeroPieza

   // obtener n�mero de pieza
   public String obtenerNumeroPieza()
   {
      return numeroPieza;
   } // fin del m�todo obtenerNumeroPieza

   // establece la descripci�n
   public void establecerDescripcionPieza( String descripcion )
   {
      descripcionPieza = descripcion;
   } // fin del m�todo establecerDescripcionPieza

   // obtiene la descripci�n
   public String obtenerDescripcionPieza()
   {
      return descripcionPieza;
   } // fin del m�todo obtenerDescripcionPieza

   // establece la cantidad
   public void establecerCantidad( int cuenta )
   {
      cantidad = ( cuenta < 0 ) ? 0 : cuenta; // cantidad no puede ser negativa
   } // fin del m�todo establecerCantidad

   // obtener cantidad
   public int obtenerCantidad()
   {
      return cantidad;
   } // fin del m�todo obtenerCantidad

   // establece el precio por art�culo
   public void establecerPrecioPorArticulo( double precio )
   {
      precioPorArticulo = ( precio < 0.0 ) ? 0.0 : precio; // valida el precio
   } // fin del m�todo establecerPrecioPorArticulo

   // obtiene el precio por art�culo
   public double obtenerPrecioPorArticulo()
   {
      return precioPorArticulo;
   } // fin del m�todo obtenerPrecioPorArticulo

   // devuelve representaci�n String de un objeto Factura
   public String toString()
   {
      return String.format( "%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
         "factura", "numero de pieza", obtenerNumeroPieza(), obtenerDescripcionPieza(), 
         "cantidad", obtenerCantidad(), "precio por articulo", obtenerPrecioPorArticulo() );
   } // fin del m�todo toString

   // m�todo requerido para realizar el contrato con la interfaz PorPagar
   public double obtenerMontoPago() 
   {
      return obtenerCantidad() * obtenerPrecioPorArticulo(); // calcula el costo total
   } // fin del m�todo obtenerMontoPago
} // fin de la clase Factura


/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigaci�n y prueba de las teor�as y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garant�a de      *
 * ning�n tipo, expresa o impl�cita, en relaci�n con estos programas o    *
 * con la documentaci�n contenida en estos libros. Los autores y el       *
 * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de    *
 * estos programas.                                                       *
 *************************************************************************/

