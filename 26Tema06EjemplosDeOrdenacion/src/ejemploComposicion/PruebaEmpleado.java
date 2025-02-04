package ejemploComposicion;

public class PruebaEmpleado 
{
   public static void main( String args[] )
   {
      Fecha nacimiento = new Fecha( 24, 7, 1979 );
      Fecha contrato = new Fecha( 3, 12, 2008 );
      Empleado currante = new Empleado ( "Pedro", "Pérez García", nacimiento, contrato );

      System.out.println( currante ); 
      
      // es igual que ejecutar la instrucción anterior
      System.out.println( currante.toString() );       
      
   } // fin main
} // fin clase PruebaEmpleado


