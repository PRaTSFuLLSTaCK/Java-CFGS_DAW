package iniciandoObjetos;

public class Cliente {

	private String nombre;
	private int edad;
	private String telefono;

	
	public void setEdad(int laEdad) {
		
		if((laEdad>18)&&(laEdad<100)) {
			edad = laEdad;
		}
	}
	
	public void setNombre(String miNombre) {
		nombre = miNombre;
	}
	
	public void setTelefono(String miTelefono) {
		telefono = miTelefono;
	}
	

	public int getEdad() {
		
		return edad;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	
	public String getTelefono() {
		return telefono;
	}
	
	
	
	
	
	
	
	
}
