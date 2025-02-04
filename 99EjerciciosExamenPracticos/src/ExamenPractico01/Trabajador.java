package ExamenPractico01;

/*Implementa una clase Trabajador con los siguientes atributos y métodos:
 Atributos privados: nombre, edad, categoría, antigüedad.
 Constantes static públicas. Determinan los diferentes tipos de categorías y 
antigüedad de un empleado disponibles en el sistema:
 CAT_EMPLEADO. Valor 0
 CAT_ENCARGADO. Valor 1
 CAT_DIRECTIVO. Valor 2
 ANT_NOVATO. Valor 0
 ANT_MADURO. Valor 1
 ANT_EXPERTO. Valor 2
 Trabajador(String nombre, int edad, int categoria, int antigüedad). 
Constructor de la clase que inicializa los atributos de la misma. 
Comprobará que la categoría y la antigüedad sean correctos, si no lo son se lanzará la 
excepción IllegalArgumentException. (0.75 puntos)
 Métodos públicos consulta/cambia de cada uno de los atributos. 
Se debe comprobar la validez de los atributos y lanzar la excepción correspondiente 
si hay algún valor incorrecto. (0.5 puntos)
 public double calcularSueldo(). Devuelve el sueldo del empleado calculado a partir 
de su antigüedad y categoría profesional. La forma de calcular el sueldo del empleado 
será de acuerdo a la siguiente tabla (0.75 puntos):*/

public class Trabajador {
	// constantes públicas estáticas
	public static final int CAT_EMPLEADO = 0;
	public static final int CAT_ENCARGADO = 1;
	public static final int CAT_DIRECTIVO = 2;
	public static final int ANT_NOVATO = 0;
	public static final int ANT_MADURO = 1;
	public static final int ANT_EXPERTO = 2;
	//atributos privados
	private String nombre;
	private int edad;
	private int categoria;
	private int antigüedad;
	/**
	* Crea el objeto Trabajador, si existe algún error en la categoría o la
	* antigüedad se lanza la excepción IllegalArgumentException. Como el
	* enunciado no lo expecifica, no es necesario comprobar el resto de parámetros
	* @param nombre
	* @param edad
	* @param categoria
	* @param antigüedad
	*/
	public Trabajador(String nombre, int edad, int categoria, int antigüedad) {
		if (comprobarCategoria(categoria) && comprobarAntigüedad(antigüedad)) {
			this.nombre = nombre;
			this.edad = edad;
			this.categoria = categoria;
			this.antigüedad = antigüedad;
		}
		else{
			throw new IllegalArgumentException("Categoría o antigüedad incorrectos");
		}
	}
	public int getAntigüedad() {
		return antigüedad;
	}
	public void setAntigüedad(int antigüedad) {
		if(comprobarAntigüedad(antigüedad))
			this.antigüedad = antigüedad;
		else{
			throw new IllegalArgumentException("Antigüedad incorrecta");
		}
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		if(comprobarCategoria(categoria))
			this.categoria = categoria;
		else
			throw new IllegalArgumentException("Categoria incorrecta");
		}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double calcularSueldo() {
		double sueldo=0;
		switch(this.categoria){
		case CAT_EMPLEADO:
			sueldo+=sueldo*0.15;
			break;
		case CAT_ENCARGADO:
			sueldo+=sueldo*0.35;
			break;
		case CAT_DIRECTIVO:
			sueldo+=sueldo*0.60;
			break;
		}
		switch(this.antigüedad){
		case ANT_NOVATO:
			sueldo+=150;
			break;
		case ANT_MADURO:
			sueldo+=300;
			break;
		case ANT_EXPERTO:
			sueldo+=600;
			break;
		}
		return sueldo;
	}
	private boolean comprobarCategoria(int categoria){
		boolean check=true;
		if(categoria<CAT_EMPLEADO || categoria>CAT_DIRECTIVO)
			check=false;
		return check;
		}
		private boolean comprobarAntigüedad(int antigüedad){
			boolean check=true;
			if(antigüedad<ANT_NOVATO || antigüedad>ANT_EXPERTO)
				check=false;
			return check;
		}
	}