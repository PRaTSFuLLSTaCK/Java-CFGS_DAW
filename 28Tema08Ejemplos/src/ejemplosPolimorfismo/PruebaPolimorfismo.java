package ejemplosPolimorfismo;

// Fig. 10.1: PruebaPolimorfismo.java
// Asignación de referencias a la superclase y la subclase, a
// variables de la superclase y la subclase.

public class PruebaPolimorfismo  
{
   public static void main( String args[] ) 
   {
      // asigna la referencia a la superclase a una variable de la superclase
      EmpleadoPorComision3 empleadoPorComision = new EmpleadoPorComision3( 
         "Sue", "Jones", "222-22-2222", 10000, .06 );                    

      // asigna la referencia a la subclase a una variable de la subclase
      EmpleadoBaseMasComision4 empleadoBaseMasComision = 
         new EmpleadoBaseMasComision4( 
         "Bob", "Lewis", "333-33-3333", 5000, .04, 300 );         

      // invoca a toString en un objeto de la superclase, usando una variable de la superclase
      System.out.printf( "%s %s:\n\n%s\n\n", 
         "Llamada a toString de EmpleadoPorComision3 con referencia de superclase ",
         "a un objeto de la superclase", empleadoPorComision.toString() );

      // invoca a toString en un objeto de la subclase, usando una variable de la subclase 
      System.out.printf( "%s %s:\n\n%s\n\n", 
         "Llamada a toString de EmpleadoBaseMasComision4 con referencia",
         "de subclase a un objeto de la subclase", 
         empleadoBaseMasComision.toString() );

		/* El polimorfismo ocurre cuando un programa invoca a un método de una subclase a través de una
		 * variable de la superclase (que apunta a un objeto de la subclase); en tiempo de ejecución, 
		 * se hace una llamada a la versión correcta del método de la subclase, 
		 * con base en el tipo de la referencia almacenada en la variable de la superclase.*/
		 
		 
      // variable de la superclase (empleadoPorComision2) que apunta 
      // a un objeto de la subclase empleadoBaseMasComision
      EmpleadoPorComision3 empleadoPorComision2 = empleadoBaseMasComision;
         
      // POLIMORFISMO: Ejemplo 1
      // invoca a toString en un objeto de la subclase, 
      // usando una variable de la superclase que apunta a un objeto de la superclase     
      // Esto se puede hacer porque el método toString() está definido tanto en la superclase EmpleadoPorComision3
      // como en la subclase EmpleadoBaseMasComision4        
      System.out.printf( "%s %s:\n\n%s\n", 
         "Llamada a toString de EmpleadoBaseMasComision4 con referencia de superclase",
         "a un objeto de la subclase", empleadoPorComision2 ); // no hace falta poner empleadoPorComision2.toString()
         
      
      // POLIMORFISMO: Ejemplo 2
      // otro ejemplo más: se puede invocar al método ingresos() 
      // usando una variable de la superclase que apunta a un objeto de la superclase
      // se puede hacer porque el método ingresos() está en la superclase y la subclase
      System.out.println ("\n Ingresos del empleado: " + empleadoPorComision2.obtenerPrimerNombre() +
                          " = " + empleadoPorComision2.ingresos() );
                          
                          
      // MAL => DA ERROR DE COMPILACIÓN SI DESCOMENTAS LAS LÍNEAS DE CÓDIGO DE MÁS ABAJO
      // usando una variable de la superclase que apunta a un objeto de la superclase,
      // no se puede llamar a un método que esté en la subclase pero no esté en la superclase
      // por ejemplo el método obtenerSalarioBase()      
      
      /* System.out.println ("\n SalarioBase de: " + empleadoPorComision2.obtenerPrimerNombre() +
                          " = " + empleadoPorComision2.obtenerSalarioBase() ); */
      
      
      
      
   } // fin de main
} // fin de la clase PruebaPolimorfismo

/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigación y prueba de las teorías y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garantía de      *
 * ningún tipo, expresa o implícita, en relación con estos programas o    *
 * con la documentación contenida en estos libros. Los autores y el       *
 * editor no serán responsables en ningún caso por los daños consecuentes *
 * en conexión con, o que surjan de, el suministro, desempeño o uso de    *
 * estos programas.                                                       *
 *************************************************************************/
