package examen2TrimestreDeProgramacion;

import java.util.Arrays;


public class Transporte {
	
	private String descripcion;
	
	private String matricula;
	
	private String trabajador;
	
	private double kilometros;
	
	private Servicio[] transporte;

	public Transporte(String descripcion, String matricula,String trabajador, double kilometros ) {
		
		this.descripcion = descripcion;
		this.matricula = matricula;
		this.transporte = new Servicio[20];
		this.kilometros = 0;
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

	public Servicio[] getTransporte() {
		return transporte;
	}

	public void setTransporte(Servicio[] transporte) {
		this.transporte = transporte;
	}

	public String toString() {
		return "Transporte [descripcion=" + descripcion + ", matricula=" + matricula + ", trabajador=" + trabajador
				+ ", kilometros=" + kilometros + ", transporte=" + Arrays.toString(transporte) + "]";
	}
	
	

}
