package practicaHerenciaTurismoEnGranada;

// TODO: Auto-generated Javadoc
/**
 * The Class VisitaLorca.
 */
public class VisitaLorca extends Visita{

	/**
	 * Instantiates a new visita lorca.
	 *
	 * @param ticket the ticket
	 * @param visitaGuiada the visita guiada
	 */
	public VisitaLorca(Ticket ticket, boolean visitaGuiada) {
		super(ticket, visitaGuiada);
	}

	/**
	 * Calcular precio.
	 *
	 * @return the float
	 */
	@Override
	public float calcularPrecio() {//CALCULAMOS EL PRECIO DEL SERVICIO
		return ticketContratado.getNumAdultos() * 10 
				+ ticketContratado.getNumNinos() * 10
				+(visitaGuiada ? 5 : 0);
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return "VISITA LORCA\n" + super.toString();
	}
	
	
	
	

}