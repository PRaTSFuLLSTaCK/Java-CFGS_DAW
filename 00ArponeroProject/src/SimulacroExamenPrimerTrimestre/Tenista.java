package SimulacroExamenPrimerTrimestre;

public class Tenista {
	
	
	private String nombre;
	private String apellidos;
	private int puntosATP;
	
	public Tenista () {
		
	}
	
	public Tenista (String nombre1, String apellidos1, int puntosATP1) {
		
		this.nombre = nombre1;
		this.apellidos = apellidos1;
		this.puntosATP = puntosATP1;
		
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getPuntosATP() {
		return puntosATP;
	}

	public void setPuntosATP(int puntosATP) {
		this.puntosATP = puntosATP;
	}
	
	public void verDatosTenista () {
		
		System.out.println("Nombre = "+this.nombre);
		System.out.println("Apellidos = "+this.apellidos);
		System.out.println("Puntos ATP= "+this.puntosATP);
		
	}

	public static void main (String [] args) {
		
		Tenista t1 = new Tenista ("Jose Mnauel", "Martos", 0);
		Tenista t2 = new Tenista ("Inma", "Desastre", 1500);
		Tenista Nadal = new Tenista ();
		
		Nadal.setNombre ("Rafael");
		Nadal.setApellidos ("Nadal");
		t1.verDatosTenista ();
		t2.verDatosTenista ();
		Nadal.verDatosTenista();
		
	}

}
