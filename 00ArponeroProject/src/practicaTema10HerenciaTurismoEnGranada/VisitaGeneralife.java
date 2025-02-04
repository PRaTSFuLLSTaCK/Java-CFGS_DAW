package practicaTema10HerenciaTurismoEnGranada;

// TODO: Auto-generated Javadoc
/**
 * The Class VisitaGeneralife.
 */
public class VisitaGeneralife extends Visita{

	/**
	 * Instantiates a new visita generalife.
	 *
	 * @param ticket the ticket
	 * @param visitaGuiada the visita guiada
	 */
	public VisitaGeneralife(Ticket ticket, boolean visitaGuiada) {
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
				+ ticketContratado.getNumNinos() * 5
				+(visitaGuiada ? 10 : 0);
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return "VISITA GENERALIFE\n" + super.toString();
	}
	
	
	
	

}