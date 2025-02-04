package reloj;

public class Reloj {

	
	/*
	 * Atributos de la clase 
	 */
	private int horas;
	private int minutos;
	private int segundos;
	
	
	

	public Reloj() {
		
		horas = 12;
		minutos = 0;
		segundos = 0;
	}
	
	
	
	public Reloj(int horas,int minutos,int segundos) {
		
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	
	public Reloj(Reloj copia) {
		
		this.horas = copia.horas;
		this.minutos = copia.minutos;
		this.segundos = copia.segundos;
	}
	
	
	
	
	
	
	/**
	 * Establece, en una sola operacion, la horas, minutos y segundos de un reloj
	 * @param horas
	 * @param minutos
	 * @param segundos
	 */
	public void setHoraReal(int horas, 
							int minutos, 
							int segundos) {
		
		// preguntamos si todos los atributos que se pretenden
		// establecer cumplen con las exigencias
		if((horas>=0)&&(horas<24)
			&&(minutos>=0)&&(minutos<60)
			&&(segundos>=0)&&(segundos<60)) {
		
			// si las cumplen, se cambian todos los valores
			this.horas = horas;
			this.minutos = minutos;
			this.segundos =segundos;
		}
	}
	
	
	
	/*
	 * 
	 * G E T T E R S
	 * 
	 */
	public int getHoras() {
		return horas;
	}
	public int getMinutos() {
		return minutos;
	}
	public int getSegundos() {
		return segundos;
	}
	
	
	
	/*
	 * 
	 * S E T T E R S
	 * 
	 * Se han protegido para que no permiten valores anormales
	 * 
	 */
	public void setHoras(int horas) {
		if((horas>=0)&(horas<24)) {
			this.horas = horas;
		}
	}
	public void setMinutos(int minutos) {
		if((minutos>=0)&(minutos<60)) {
			this.minutos=minutos;
		}
	}
	public void setSegundos(int segundos) {
		if((segundos>=0)&(segundos<60)) {
			this.segundos=segundos;
		}
	}
	
	
	
	
	/**
	 * Esta operación añade un segundo al propio Reloj
	 * No devuelve nada, los cambios se realizan en el propio Reloj
	 * 
	 */
	public void addSegundo() {
	
		// realizo la suma de los segundo 
		// y la posible corrección de valores
		// afecta a los atributos del propio reloj
		segundos++;
		if(segundos==60) {
			segundos = 0;
			minutos++;
			if(minutos==60) {
				minutos = 0;
				horas++;
				if(horas==24) {
					horas=0;
				}
			}
		}
	}
	
	
	
	/**
	 * Realiza cambios en un reloj que será devuelto
	 * Parav ello usa variable extra que permitirán rear un nuevo Reloj
	 * 
	 * @return
	 */
	public Reloj addSegundo2Reloj() {
		
		int segundos = this.segundos;
		int minutos = this.minutos;
		int horas = this.horas;
		
		// realizo la suma de los segundo 
		// y la posible corrección de valores
		segundos++;
		if(segundos==60) {
			segundos = 0;
			minutos++;
			if(minutos==60) {
				minutos = 0;
				horas++;
				if(horas==24) {
					horas=0;
				}
			}
		}
		
		// Creo un nuevo Reloj que voy a devolver
		Reloj nuevoReloj = new Reloj();
		// le coloco los valores que debe tener
		nuevoReloj.horas=horas;
		nuevoReloj.minutos=minutos;
		nuevoReloj.segundos=segundos;
		
		// lo devuelvo
		return nuevoReloj;
	}


	
	
	public Reloj sumar(Reloj otro) {
		
		int segundos = this.segundos + otro.segundos;
		int minutos = this.minutos + otro.minutos;
		int horas = this.horas + otro.horas;
		
		if(segundos>59) {
			
			segundos-=60;
			minutos++;
		}
		if(minutos>59) {
			
			minutos-=60;
			horas++;
		}
		
		
		Reloj resultado = new Reloj();
		resultado.segundos = segundos;
		resultado.minutos = minutos;
		resultado.horas = horas;
		
		return resultado;
	}
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public String toString() {
		return "Reloj [horas=" + horas + ", minutos=" + minutos + ", segundos=" + segundos + "]";
	}	
	
	
	
	

	
	
	
	
	
}
