package practica1.tema4;

public class JugadorBasket {
	
	//declaracion de los atributos de la clase jugador basket
	
	private String nombre;
	private String puesto;
	private int dorsal;
	private int puntos;
	
	public JugadorBasket () {//crear el constructor sin argumentos
		
		//inicializacion de las variables
		
		this.nombre = "";
		this.puesto = "";
		this.dorsal = 0;
		this.puntos = 0;
		
		setNombre(nombre);
		setPuesto(puesto);
		setdorsal(dorsal);
		setpuntos(puntos);
		
	}
	
	//crear un constructor con artumentos
	
	public JugadorBasket (String nombre, String puesto, int dorsal, int puntos) {
		
		//inicializo con los argumentos las variables del constructor
		
		this.nombre = nombre;
		this.puesto = puesto;
		this.dorsal = dorsal;
		this.puntos = puntos;
		
	}
	
	//metodo que no devuelve nada solo imprime los datos del jugador por consola
	
	public void datosJugador () {
		
	//Imprimimos los datos de los jugadores en pantalla.
		
		System.out.println("Nombre: "+ this.nombre);
		System.out.println("Puesto: "+ this.puesto);
		System.out.println("Dorsal: "+ this.dorsal);
		System.out.println("Puntos: "+ this.puntos);
		
	}
	
	//Este metodo nos suma los putnos de un jugador
	
	public void sumaPuntos (int puntos) {
		
		this.puntos+= puntos;  //+= es para incrementar esos puntos con la cantidad que le pasamos
		
	}
	
	public void setNombre (String nombre) {
		
		this.nombre = nombre;
	}
	
	public void setPuesto (String puesto) {
		
		this.puesto = puesto;
	}
	
	public void setdorsal (int dorsal) {
		
		//se controla que el numero de dorsal no sea ni menor que 1 ni mayor que 50
		
		if (dorsal < 1) {
			
			this.dorsal = 1;
		} else if (dorsal > 50) {
			
			this.dorsal = 50;
		}else {
			
			this.dorsal = dorsal;
			
		}
		
	}

	public void setpuntos (int puntos) {
		
		//se controla que no se introducan cantidades negativas
	
		if (puntos < 0 ) {
			
			this.puntos = 0;
			
		}else {
			
			this.puntos = puntos;
			
		}
	}
	
	public static void main(String[] args) {
		
		//introducimos los valores de 4 jugadores
		
		JugadorBasket j1 = new JugadorBasket("telelu", "Pivot", 4, 400);
		
		JugadorBasket j2 = new JugadorBasket("nefertiti", "base", 5, 400);
		
		JugadorBasket j3 = new JugadorBasket("chicho", "alero", 30, 400);
		
		JugadorBasket j4 = new JugadorBasket("Pau", "ratatata", 9, 400);
		
		//llamada a la clase para imprimir los datos en consola
		
		j1.datosJugador();
		j2.datosJugador();
		j3.datosJugador();
		j4.datosJugador();
		
		//sumamos los puntos a los jugadores.
		
		j1.sumaPuntos(120);
		j2.sumaPuntos(200);
		j3.sumaPuntos(33);
		j4.sumaPuntos(600);
		
		//imprimimos de nuevo los valores actualizados de los jugadores.
		
		j1.datosJugador();
		j2.datosJugador();
		j3.datosJugador();
		j4.datosJugador();
		
	}

}













