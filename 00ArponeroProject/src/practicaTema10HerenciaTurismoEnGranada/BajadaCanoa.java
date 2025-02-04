package practicaTema10HerenciaTurismoEnGranada;

/**
 * The Class BajadaCanoa.
 */
public class BajadaCanoa extends Actividad{

	/**
	 * Instantiates a new bajada canoa.
	 *
	 * @param ticket PASAMOS EL TICKET DONDE VAMOS A ACTUALIZAR SI LA ACTIVIDAD ES PRINCIPIANTE O EXPERTO
	 * @param principiantes PASAMOS EL VALOR DEL PARAMETRO PRINCIPINATES PARA POSTERIORMENTE AÑADIRLO AL SERVICIO QUE QUEREMOS AGREGAR AL TICKE
	 */
	public BajadaCanoa(Ticket ticket, boolean principiantes) {
		super(ticket, principiantes);
	}

	/**
	 * Calcular precio. EN ESTE METODO CALCULAMOS EL PRECIO DEL SERVICIO
	 *
	 * @return DEVOLVEMOS EL PRECIO QUE HEMOS CALCULADO EN EL METODO calcularPrecio
	 */
	@Override
	public float calcularPrecio() {
		return ticketContratado.getNumAdultos() * 15  
				+ ticketContratado.getNumNinos() * 15
				+ (principiantes ? 5 : 10);
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return "BAJADA CANOA\n" + super.toString();
	}
}
