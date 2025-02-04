package CodigoFuenteTema04;

public class Vehiculo {
	
	// atributos de instancia o de objeto
	private String color, modelo, matricula;
	
	// atributo de clase => no está asociado a ningún objeto,
	// solo hay una copia de ese atributo	
	static private int numero_de_vehiculos = 0;
	
	// constructor => se llama cuando se está creando el objeto con new()
	Vehiculo (String col, String mod, String mat) {
		color = col; modelo = mod; matricula = mat;
		// cada vez que se crea un coche se incrementa el número de coches
		numero_de_vehiculos ++;
	}
	
	// método de instancia => puede acceder a los atributos de un objeto	
	public void mostrar () {
		System.out.println ("Modelo: " + modelo + ", Color: " + color + 
		                     ", Matricula: " + matricula);	
	}
	
	// método de clase => NO puede acceder a los atributos de instancia
	//                 => si puede cambiar los atributos de clase
	//public static void  
	
	public static void main (String args[]) {
		// creación del objeto bolido de la clase Vehiculo
		Vehiculo bolido = 	new Vehiculo ("Rojo", "Ferrari Testarossa", "AL-3455-DC");
		
		bolido.mostrar(); // ver todos los atributos de bolido
		
		// creación del objeto cacharro de la clase Vehiculo
		Vehiculo cacharro = new Vehiculo ("Verde", "Seat 127", "MA-7755-EP");
		
		cacharro.mostrar(); // ver todos los atributos de bolido
		
	}
}


