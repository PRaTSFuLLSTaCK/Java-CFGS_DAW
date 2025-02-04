package iniciandoObjetos;

public class Start {

	public static void main(String[] args) {
		
		// va a suceder todo
		TelefonoMovil hueguei = new TelefonoMovil();
		hueguei.setCapacidad(34);
		hueguei.setMarca("Hueguei");
		hueguei.setModelo("Hacendado");
		hueguei.setPeso(123.0f);
		hueguei.setPulgadas(12.4f);
		
		
		
		
		
		
		Cliente marcos = new Cliente();
		marcos.setEdad(-4);
		marcos.setEdad(-4);

		marcos.setNombre("Marcos Fernandez");
		marcos.setTelefono("6464564564");
		
		
		
		
		int edadMarcos = marcos.getEdad();
		System.out.println("la edad de Marcos es "+edadMarcos);

		String nombre = marcos.getNombre();
		String telefono = marcos.getTelefono();
		
		System.out.println("Marcos se llama en realidad: "+nombre);
		System.out.println("Su telefono es: "+telefono);
		
		
		

		
		
		
		
		
		
		
		
	}

}
