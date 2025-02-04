package examen2TrimestreDeProgramacion;

import java.util.Arrays;

public class Furgoneta {
	
	private String descripcion;
	
	private String matricula;
	
	private String trabajador;
	
	private double kilometros;
	
	private int paquetes;
	
	private Main[] furgoneta;
	
	public double valoracionf = 0;

	public Furgoneta(String descripcion, String matricula,String trabajador, double kilometros, int paquetes) {
		
		this.descripcion = descripcion;
		this.matricula = matricula;
		this.furgoneta = new Main[20];
		this.kilometros = 0;
		this.paquetes = 0;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(String trabajador) {
		this.trabajador = trabajador;
	}

	public double getKilometros() {
		return kilometros;
	}

	public void setKilometros(double kilometros) {
		this.kilometros = kilometros;
	}

	public int getPaquetes() {
		return paquetes;
	}

	public void setPaquetes(int paquetes) {
		this.paquetes = paquetes;
	}

	public Main[] getFurgoneta() {
		return furgoneta;
	}

	public void setFurgoneta(Main[] furgoneta) {
		this.furgoneta = furgoneta;
	}
	
	@Override
	public String toString() {
		return "Furgoneta [descripcion=" + descripcion + ", matricula=" + matricula + ", trabajador=" + trabajador
				+ ", kilometros=" + kilometros + ", paquetes=" + paquetes + ", furgoneta=" + Arrays.toString(furgoneta)
				+ ", valoracionf=" + valoracionf + "]";
	}

	public double valorar () {
		
		
		
		return valoracionf;
		
		
	}

}
