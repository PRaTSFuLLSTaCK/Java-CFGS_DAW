package ejemplosPolimorfismo;

// Fig. 9.13: EmpleadoBaseMasComision4.java
// La clase EmpleadoBaseMasComision4 hereda de EmpleadoPorComision3 y
// accede a los datos private de EmpleadoPorComision3's a través de los
// métodos public de EmpleadoPorComision3.

public class EmpleadoBaseMasComision4 extends EmpleadoPorComision3
{
   private double salarioBase; // salario base por semana

   // constructor con seis argumentos
   public EmpleadoBaseMasComision4( String nombre, String apellido, 
      String nss, double ventas, double tarifa, double salario )
   {
      super( nombre, apellido, nss, ventas, tarifa );
      establecerSalarioBase( salario ); // valida y almacena el salario base
   } // fin del constructor de EmpleadoBaseMasComision4 con seis argumentos
   
   // establece el salario base
   public void establecerSalarioBase( double salario )
   {
      salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
   } // fin del método establecerSalarioBase

   // devuelve el salario base
   public double obtenerSalarioBase()
   {
      return salarioBase;
   } // fin del método obtenerSalarioBase

	@Override
	// Redefine el método ingresos de la superclase
   // calcula los ingresos
   public double ingresos()
   {
      return obtenerSalarioBase() + super.ingresos();
   } // fin del método ingresos

   // devuelve representación String de EmpleadoBaseMasComision4
   public String toString()
   {
      return String.format( "%s %s\n%s: %.2f", "con sueldo base", 
         super.toString(), "sueldo base", obtenerSalarioBase() );
   } // fin del método toString
} // fin de la clase EmpleadoBaseMasComision4


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
