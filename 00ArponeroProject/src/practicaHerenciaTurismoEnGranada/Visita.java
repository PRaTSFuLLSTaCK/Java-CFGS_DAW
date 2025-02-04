package practicaHerenciaTurismoEnGranada;

// TODO: Auto-generated Javadoc
/**
 * The Class Visita.
 */
public abstract class Visita extends ServicioTuristico{
	
	/** The visita guiada. */
	protected boolean visitaGuiada;
	
	/**
	 * Instantiates a new visita.
	 *
	 * @param ticket PASAMOS EL TICKET DONDE VAMOS A ACTUALIZAR SI LA VISITA ES GUIADA O NO
	 * @param visitaGuiada PASAMOS ESTE PARAMETRO PARA POSTERIORMENTE PODER CALCULAR EL PRECIO DEL SERVICIO
	 * 
	 */
	public Visita(Ticket ticket, boolean visitaGuiada) {
		super(ticket);
		this.visitaGuiada = visitaGuiada;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return "Visita guiada: "+(this.visitaGuiada ? "Si" : "No");
	}

}
