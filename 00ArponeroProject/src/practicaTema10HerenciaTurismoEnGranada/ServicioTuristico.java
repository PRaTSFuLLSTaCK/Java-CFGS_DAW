package practicaTema10HerenciaTurismoEnGranada;

// TODO: Auto-generated Javadoc
/**
 * The Class ServicioTuristico.
 */
public abstract class ServicioTuristico {
	
	/** The ticket contratado. */
	protected Ticket ticketContratado;
	
	/**
	 * Instantiates a new servicio turistico.
	 *
	 * @param ticket the ticket
	 */
	public ServicioTuristico(Ticket ticket) {
		this.ticketContratado = ticket;
	}
	
	/**
	 * Calcular precio.
	 *
	 * @return the float
	 */
	public abstract float calcularPrecio();
	
}
