package personas;

public class Persona {

	
	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private int peso;
	private int altura;
	
	
	
	
	/*
	 * ***************************
	 * ***************************
	 * ***************************
	 * ***************************
	 * 	C O N S T R U C T O R E S
	 * ***************************
	 * ***************************
	 * ***************************
	 */
	
	
	public Persona(String nombre, int edad, String DNI, char sexo, int peso, int altura) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;		
	}

	
	public Persona (Persona p) {
		
		this.nombre = p.nombre;
		this.edad = p.edad;
		this.DNI = p.DNI;
		this.sexo = p.sexo;
		this.peso = p.peso;
		this.altura = p.altura;			
	}
	
	
	
	
	
	// Operaciones
	
	
	private void generaDNI() {
		
		int numero = (int)Math.random()*10; // entre 0-9
		
		DNI = "";
		
		// hacemos 8 veces el acoplamiento de un numero al DNI
		for(int i=0;i<8;i++) {
			
			// acoplamos el numero calculado
			DNI += ""+numero;
			// generamos otro nuevo
			numero = (int)Math.random()*10;
		}
	}
	
	
	
	/**
	 * 
	 * @return true si es mayor de edad; falso en otro caso
	 */
	public boolean esMayorDeEdad() {
		
		if(edad>=18) {
			
			return true;
		}
		else return false;
	}
	
	
	
	/**
	 *  No deviuleve nada, solo hace la comprobación y si no es correcto
	 *  hace el cambio
	 */
	public void comprobarSexo() {
		
		// Si el sexo NO ES 'H' o 'M' lo cambiamos a 'M'
		if(!((sexo=='H')||(sexo=='M'))) {
			
			sexo = 'M';
		}
	}
	
	
	
	
	
	/**
	 * Calcula el IMC
	 * @return
	 */
	public int calcularIMC() {
		
		int valorIMC;
		
		// calculamos el IMC
		valorIMC = peso/(altura*altura);
		
		// devolvemos el valor apropiado
		if(valorIMC<20) return -1;
		else if((valorIMC>=20)&&(valorIMC<=25)) return 0;
		else return 1;
		
	}
	
	
	
	
	
	
	
	/*
	 * **********************************
	 * **********************************
	 * **********************************
	 * **********************************
	 * 	S E T T E R S   Y   G E T T E R S
	 * **********************************
	 * **********************************
	 * **********************************
	 */
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	
	
	
	
	
}
