package Alumnos;

public class Alumno {

	
	private String nombre = null;
	private String ciudad = null;
	private static Alumno alumno = null;
	
	private Alumno() {
		
		nombre = "Juan";
		ciudad = "Oviedo";
	}
	
	
	public static Alumno getAlumno() {
		
		if(alumno==null) {
			
			alumno = new Alumno();
		}
		return alumno;
	}

	
	
	
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public static void setAlumno(Alumno alumno) {
		Alumno.alumno = alumno;
	}


	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", ciudad=" + ciudad + "]";
	}
	
	
	
	
}
