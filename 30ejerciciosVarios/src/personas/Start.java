package personas;

public class Start {

	public static void main(String[] args) {
		
		
		Persona marcos = new Persona("Marcos Fernandez", 31, "98555333J",'G',70, 172);
		System.out.println(marcos);
		
		// preguntamos si es mayor de edad
		System.out.println("marcos es mayor de edad? "+marcos.esMayorDeEdad());
		
		// Marcos no tiene un sexo correcto. 
		// Usamos la operacion para cambiarlo a uno correcto
		marcos.comprobarSexo();
		System.out.println(marcos);
		
		
		// IMC
		System.out.println("IMC "+marcos.calcularIMC());
		
		
		
		// copia de persona
		Persona carlos = new Persona(marcos);
		System.out.println(carlos);
		
		

	}

}
