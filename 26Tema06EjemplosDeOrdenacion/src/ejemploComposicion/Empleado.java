package ejemploComposicion;

public class Empleado 
{
   private String primerNombre;
   private String apellidos;
   // ejemplo de composición => fechaNacimiento es un objeto de otra clase: Fecha
   private Fecha fechaNacimiento;
   // ejemplo de composición => fechaContratacion es un objeto de otra clase: Fecha
   private Fecha fechaContratacion;

   // constructor 
   public Empleado ( String nombre, String apellidos2, Fecha fechaCumple, Fecha fechaContrato )
   {
      primerNombre = nombre;
      apellidos = apellidos2;
      fechaNacimiento = fechaCumple;
      fechaContratacion = fechaContrato;
   } // fin constructor


   // redefine el método toString
   // convierte empleado a formato String
   public String toString()
   {
      return String.format( "%s, %s  Contratado: %s  Fecha de Nacimiento: %s", 
         apellidos, primerNombre, fechaContratacion, fechaNacimiento );
   } // fin toString
   
} // fin clase Empleado
