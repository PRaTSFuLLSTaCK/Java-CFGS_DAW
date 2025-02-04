package HerenciaCocheVehiculo;



public class Vehiculo {

	public Vehiculo() {
		// TODO Apéndice de constructor generado automáticamente
	}
	
	private String matricula;
	private String modelo;
	private String marca;
	protected int kilometros;
	



	public Vehiculo (String matricula, String modelo, String marca, int kilometros) {

		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
		this.kilometros = kilometros;
	}




	public String getMatricula() {
		return matricula;
	}




	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}




	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public int getKilometros() {
		return kilometros;
	}




	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + ", kilometros="
				+ kilometros + "]";
	}
	
	

}
