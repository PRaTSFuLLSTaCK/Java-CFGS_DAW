package EntornosDeDesarrollo;

public class Estudiante implements Comparable<Estudiante>{
	
	private int dni;
	private int sexo;
	private int trabaja;
	private double sueldo;
	
	public Estudiante(int dni, int sexo, int trabaja, double sueldo) {
		this.dni = dni;
		this.sexo = sexo;
		this.trabaja = trabaja;
		this.sueldo = sueldo;
	}

	public int getSexo() {
		return sexo;
	}

	public int getTrabaja() {
		return trabaja;
	}

	public double getSueldo() {
		return sueldo;
	}
	
	public String toString() {
		return this.dni+": "+(sexo==1 ? "Masculino" : "Femenino")+", "
				+(trabaja==1 ? "Si trabaja" : "No trabaja")+", "+
				"Sueldo="+this.sueldo+"�";
	}

	@Override
	public int compareTo(Estudiante o) {
		return Double.compare(this.sueldo, o.sueldo);
	}
	
	

}
