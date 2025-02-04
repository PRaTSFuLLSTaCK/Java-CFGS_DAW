package examen2TrimestreDeProgramacion;

import java.util.Arrays;

public class Trabajador {
	
	
	private String nombre;
	
	private String NIF;
	
	private double salario;
	
	private Main[] trabajador;
	
	public Trabajador( String nombre, String NIF, double salario) {//CONSTRUCTOR 
		
		this.nombre = nombre;
		this.NIF = NIF;
		this.trabajador = new Main[20];
		this.salario = 0;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Main[] getServicio() {
		return trabajador;
	}

	public void setServicio(Main[] servicio) {
		this.trabajador = servicio;
	}
	
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", NIF=" + NIF + ", salario=" + salario + ", servicio="
				+ Arrays.toString(trabajador) + "]";
	}
		
}
	
	
	
	


