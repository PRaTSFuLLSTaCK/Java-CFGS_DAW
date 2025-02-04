package Prog_Tarea02;

/*6.- Diseña un programa Java que cree un tipo enumerado para los meses del año. El programa debe
realizar las siguientes operaciones:

• Crear una variable m del tipo enumerado y asignarle el mes de marzo. Mostrar por pantalla
su valor.*/

/**
*
* @author José Luis
* @class enumerado
* @description crear una variable de tipo enumerado
*/
public class Ejercicio06 {
   public enum Meses{Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre};
   public static void main(String args[]){ // Comienza la clase main
       Ejercicio06.Meses m;
       m = Meses.Marzo;
       System.out.println("El valor de la variable 'm' es "+ m);
   } // Cierre de main
   
} // Cierre de la clase
