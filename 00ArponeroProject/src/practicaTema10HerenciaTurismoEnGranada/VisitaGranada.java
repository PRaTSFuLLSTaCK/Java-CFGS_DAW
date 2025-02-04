package practicaTema10HerenciaTurismoEnGranada;

// TODO: Auto-generated Javadoc
/**
 * The Class VisitaGranada.
 */
public class VisitaGranada extends Visita{

	/**
	 * Instantiates a new visita granada.
	 *
	 * @param ticket the ticket
	 * @param visitaGuiada the visita guiada
	 */
	public VisitaGranada(Ticket ticket, boolean visitaGuiada) {
		super(ticket, visitaGuiada);
	}

	/**
	 * Calcular precio.
	 *
	 * @return the float
	 */
	@Override
	public float calcularPrecio() {//CALCULAMOS EL PRECIO DEL SERVICIO
		return ticketContratado.getNumAdultos() * 10 + ticketContratado.getNumNinos() * 5;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return "VISITA GRANADA\n" + super.toString();
	}
	
	
	

}
