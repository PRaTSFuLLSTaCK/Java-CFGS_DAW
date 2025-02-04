package ClaseYObjeto;

public class Asignatura {
	
	private String nombre;
	
	private int nota;
	
	public Asignatura (String nombre, int nota) {
		
		this.nombre = nombre;
		this.nota = nota;
	}
	
	
	public Asignatura (Asignatura a) {
		
		this.nombre = a.nombre;
		this.nota = a.nota;
	}
	
	public void setNota (int nota) {
		
		this.nota = nota;
	}
	
	public int getNota () {
		
		return this.nota;
	}
	
	public String getNombre () {
		
		return this.nombre;
	}
	
	public String calificacion () {
		
		return this.nota>= 60 ? "APROBADO" : "SUSPENSO" ;
	}
	
}