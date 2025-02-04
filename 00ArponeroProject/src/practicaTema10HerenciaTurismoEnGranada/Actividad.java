package practicaTema10HerenciaTurismoEnGranada;

/**
 * The Class Actividad.
 */
public abstract class Actividad extends ServicioTuristico{
	
	/** The principiantes. */
	protected boolean principiantes;
	
	/**
	 * Instantiates a new actividad.
	 *
	 * @param ticket PASAMOS EL TICKET DONDE VAMOS A ACTUALIZAR SI LA ACTIVIDAD ES PRINCIPIANTE O EXPERTO
	 * @param principiantes PASAMOS EL VALOR DEL PARAMETRO PRINCIPINATES PARA POSTERIORMENTE AÑADIRLO AL SERVICIO QUE QUEREMOS AGREGAR AL TICKET
	 */
	public Actividad(Ticket ticket, boolean principiantes) {
		super(ticket);
		this.principiantes = principiantes;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return "Actividad: "+(this.principiantes ? "Principiante" : "Experto");
	}

}
