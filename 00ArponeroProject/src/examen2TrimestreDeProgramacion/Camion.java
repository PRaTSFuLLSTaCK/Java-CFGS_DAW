package examen2TrimestreDeProgramacion;

import java.util.Arrays;

public class Camion {
		
		private String descripcion;
		
		private String matricula;
		
		private String trabajador;
		
		private double kilometros;
		
		private double kilos;
		
		private Main[] camion;
		
		public double valoracionc = 0;

		public Camion(String descripcion, String matricula,String trabajador, double kilometros, double kilos) {
			
			this.descripcion = descripcion;
			this.matricula = matricula;
			this.camion = new Main[20];
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

		public double getKilos() {
			return kilos;
		}

		public void setKilos(double kilos) {
			this.kilos = kilos;
		}

		public Main[] getCamion() {
			return camion;
		}

		public void setCamion(Main[] camion) {
			this.camion = camion;
		}

		public double getValoracion() {
			return valoracionc;
		}

		public void setValoracion(double valoracion) {
			this.valoracionc = valoracion;
		}

		@Override
		public String toString() {
			return "Camion [descripcion=" + descripcion + ", matricula=" + matricula + ", trabajador=" + trabajador
					+ ", kilometros=" + kilometros + ", kilos=" + kilos + ", camion=" + Arrays.toString(camion)
					+ ", valoracion=" + valoracionc + "]";
		}
		
		
}


			

