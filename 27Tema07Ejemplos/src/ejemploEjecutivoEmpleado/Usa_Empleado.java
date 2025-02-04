package ejemploEjecutivoEmpleado;

public class Usa_Empleado {

	public static void main (String args[]) {
		
		// Crear 3 empleados con los 2 constructores de la clase
		
		// constructor por defecto
		Empleado emp1 = new Empleado ();
		emp1.set_nombre ("Abelardo García García");
		emp1.set_sueldo (700);
		
		// constructor con argumentos		
		Empleado emp2 = new Empleado ("Fernando Gómez Serrano", 1100);
		
		// Mostrar los datos de los dos empleados anteriores
		System.out.println ("\n" + emp1.toString());
		System.out.println ("\n" + emp2);  // no hace falta poner toString()		
		
		
		// Crear 3 ejecutivos con los 3 constructores que posee la clase
		// 1.) Constructor por defecto
		Ejecutivo jefe1 = new Ejecutivo( );
		jefe1.set_nombre ("Pedro Pérez Ramírez");
		jefe1.asignarPresupuesto(3000);
		jefe1.set_sueldo (1700);
		jefe1.aumentarSueldo(10);		
		
		// 2.) constructor 2
		Ejecutivo jefe2 = new Ejecutivo( "Armando Guerra Segura", 1000);
		jefe2.asignarPresupuesto(1500);
		jefe2.aumentarSueldo(5);
		
		// 3.) constructor 3
		Ejecutivo jefe3 = new Ejecutivo( "María Fernández López", 2000, 5000);
		jefe3.aumentarSueldo(20);
		
		// Mostrar los datos de todos los ejecutivos
		System.out.println ("\n" + jefe1.toString());
		System.out.println ("\n" + jefe2.toString());
		System.out.println ("\n" + jefe3); // no hace falta poner toString()
		
		
		// Mostrar el número total de empleados
		System.out.println ("\nEl número total de empleados es: " + Empleado.get_contador() );
		
		// Fijate lo que ocurre si intentas acceder desde un objeto de la superclase
		// a un método que esté solo definido en la subclase o clase que hereda de la superclase
		Empleado curri = new Empleado ( "Esteban Comex Plota" , 100) ;
		//  da error si descomentas la siguiente línea
		/* curri.asignarPresupuesto(5000);  */

		

	}
}
