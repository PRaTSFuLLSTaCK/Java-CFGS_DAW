package practicaTema10HerenciaTurismoEnGranada;

// TODO: Auto-generated Javadoc
/**
 * The Class VisitaAlhambra.
 */
public class VisitaAlhambra extends Visita{

	/**
	 * Instantiates a new visita alhambra.
	 *
	 * @param ticket the ticket
	 * @param visitaGuiada the visita guiada
	 */
	public VisitaAlhambra(Ticket ticket, boolean visitaGuiada) {
		super(ticket, visitaGuiada);
	}

	/**
	 * Calcular precio.
	 *
	 * @return the float
	 */
	@Override
	public float calcularPrecio() {//CALCULAMOS EL PRECIO DEL SERVICIO
		return ticketContratado.getNumAdultos() * 20 
				+ ticketContratado.getNumNinos() * 10
				+(visitaGuiada ? 10 : 0);
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return "VISITA ALHAMBRA\n" + super.toString();
	}
	
	
	
	

}
