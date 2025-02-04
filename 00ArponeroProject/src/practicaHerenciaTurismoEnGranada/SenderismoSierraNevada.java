package practicaHerenciaTurismoEnGranada;

// TODO: Auto-generated Javadoc
/**
 * The Class SenderismoSierraNevada.
 */
public class SenderismoSierraNevada extends Actividad{

	/**
	 * Instantiates a new senderismo sierra nevada.
	 *
	 * @param ticket the ticket
	 * @param principiantes the principiantes
	 */
	public SenderismoSierraNevada(Ticket ticket, boolean principiantes) {
		super(ticket, principiantes);
	}

	/**
	 * Calcular precio.
	 *
	 * @return the float
	 */
	@Override
	public float calcularPrecio() {//CALCULAMOS EL PRECIO DEL SERVICIO
		return ticketContratado.getNumAdultos() * 5  
				+ ticketContratado.getNumNinos() * 5
				+ (principiantes ? 0 : 5);
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return "SENDERISMO SIERRA NEVADA\n" + super.toString();
	}

}
