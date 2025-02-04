package ejercicioBasicoDePOO09;

///////////////////////////////////////////////////////////////////////////////////////////
//Clase Persona
///////////////////////////////////////////////////////////////////////////////////////////

/*
 * 
 * Crea una clase Persona con los siguientes atributos: nombre, dirección, códigoPostal, ciudad y fechaNacimiento.
 * 
El atributo fechaNacimiento es un objeto de la clase Fecha creada en esta entrada.

Las clases Persona y Fecha tienen por tanto una relación de composición.

 * A la clase Fecha que ya tenemos le añadiremos un método boolean esMayorQue(Fecha f) que nos será útil en este ejercicio.
 *  
 * Este método devuelve true si la fecha que contiene el objeto es mayor que la fecha que recibe como parámetro y false en caso contrario.
 * 
La clase Persona contendrá los siguientes métodos:

Constructor

Métodos get y set

Método boolean esMayorDeEdad() que devuelve true si la persona es mayor de edad y false en caso contrario. 

Para sabre si la persona es mayor de edad se comparará la fecha de nacimiento con la fecha actual obtenida del sistema.
 * 
 */

import java.util.Calendar;

public class Persona {

	private String nombre;
	private String direccion;
	private int codigoPostal;
	private String ciudad;
	private Fecha fechaNacimiento;

	//Constructor por defecto
	public Persona() {
		fechaNacimiento = new Fecha();
	}

	//Métodos get y set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fecha) {
		fechaNacimiento.setDia(fecha.getDia());
		fechaNacimiento.setMes(fecha.getMes());
		fechaNacimiento.setAño(fecha.getAño());
	}

	//Método para mostrar los datos de las personas según el formato pedido
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: ");
		sb.append(nombre);
		sb.append("\nFecha de Nacimiento: ");
		sb.append(fechaNacimiento);
		sb.append("\nDireccion: ");
		sb.append(direccion);
		sb.append("\n");
		sb.append(codigoPostal);
		sb.append("\n");
		sb.append(ciudad);
		sb.append("\n");
		return sb.toString();
	}

	//Método que comprueba si la persona es mayor de edad
	public boolean esMayorDeEdad() {
		Calendar hoy = Calendar.getInstance();
		int añoActual = hoy.get(Calendar.YEAR);
		int mesActual = hoy.get(Calendar.MONTH) + 1;
		int diaActual = hoy.get(Calendar.DAY_OF_MONTH);
		if (añoActual - fechaNacimiento.getAño() > 18) {
			return true;
		} else if (añoActual - fechaNacimiento.getAño() == 18 &&
				mesActual > fechaNacimiento.getMes()) {
			return true;
		} else if (añoActual - fechaNacimiento.getAño() == 18 &&
				mesActual == fechaNacimiento.getMes() &&
				diaActual >= fechaNacimiento.getDia()) {
			return true;
		}
		return false;
	}
} //Final de la clase Persona
