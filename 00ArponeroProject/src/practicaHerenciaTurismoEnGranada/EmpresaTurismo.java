package practicaHerenciaTurismoEnGranada;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * The Class EmpresaTurismo.
 */
public class EmpresaTurismo {
	
	/** The tickets. */
	private static Ticket[] tickets;//DECLARACION DEL ARRAY TICKETS
	
	/** The num tickets. */
	private static int numTickets;//DECLARACION DE LA VARIABLE QUE CONTABILIZARA EL NUMERO DE TICKETS
	
	/** The tmp. */
	private static Ticket tmp;//DECLARACION DE UNA VARIABLE AUXILIAR DE TIPO TICKET PARA TEMPORARLEMENTE CONTENER LOS VALORES NECESARIOS PARA CREAR UN TICKET

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		inicializar();//LLAMAMOS AL METODO EN EL CUAL INICIALIZAMOS EL ARRAY Y EL NUMERO DE TICKETS
		do {
			menu();//LLAMAMOS AL METODO QUE NOS VA A IMPRIMIR EL MENU PRINCIPAL DE LA APLICACION
			int opcion = elegirOpcionMenu();//DECLARAMOS VARIABLE PARA GUARDAR LA OPCION QUE QUERAMOS REALIZAR Y LLAMAMOS AL METODO elegirOpcionMenu PARA PODER EJECUTAR LA OPCION DESEADA
			ejecutarOpcionMenu(opcion);//UNA VEZ SELECCIONAMOS LA OPCION, LLAMAMOS AL METODO ejecutarOpcionMenu EN LA CUAL EJECUTAMOS LA OPCION QUE HEMOS SELECCIONADO
		} while (true);// ESTO ES UN BUCLE INFINITO, SOLO SALDREMOS DEL PROGRAMA  MARCANDO LA OPCION 8 COMO DETALLA EL METODO menu
	}
	
	/**
	 * Inicializar. METODO POR EL QUE INICIALIZAMOS EL ARRAY TICKET EL CUAL CONTRENDRA 100 POSICIONES EN ESTE CASO
	 */
	private static void inicializar() {
		tickets = new Ticket[100];
		numTickets = 0;//INICIALIZAMOS  EL NUMERO DE TICKETS A 0
	}
	
	/**
	 * Menu.
	 */
	private static void menu() {
		System.out.println("======================================");
		System.out.println("           MENU");
		System.out.println("======================================");
		System.out.println("1.- Crea Ticket");
		System.out.println("2.- Visualizar n�mero de tickets");
		System.out.println("3.- Visualizar n�mero de actividades");
		System.out.println("4.- Visualizar n�mero de excursiones");
		System.out.println("5.- Visualizar un ticket");
		System.out.println("6.- Modificar un ticket");
		System.out.println("7.- Borrar un ticket");
		System.out.println("8.- Salir");
		System.out.println("======================================");
	}
	
	/**
	 * Elegir opcion menu.
	 *
	 * @return DEVOLVEMOS UN VALOR ENTERO VALIDO PARA QUE EL METODO ejecutarOpcionMenu PUEDA EFECTUAR LA OPCION DESEADA
	 */
	private static int elegirOpcionMenu() {
		
		return teclado.leer_entero_error("Elija un opci�n: ", "ERROR: No es una opcion valida", 1, 8);//CONTROLAMOS QUE LA OPCION SIEMPRE SEA LA QUE INDICA EL MENU DEL METODO menu
	}
	
	/**
	 * Ejecutar opcion menu.
	 *
	 * @param opcion ESTE METODO EJCUTARA SEGUN TENGA UN VALOR LA VARIABLE opcion LA CUAL PASA POR PARAMETRO
	 */
	private static void ejecutarOpcionMenu(int opcion) {
		switch (opcion) {
		case 1:
			crearTicket();//LLAMADA AL METODO crearTicket
			break;
		case 2:
			numeroTickets();//LLAMADA AL METODO numeroTickets
			break;
		case 3:
			numeroActividades();//LLAMADA AL METODO numeroActividades
			break;
		case 4:
			numeroExcursiones();//LLAMADA AL METODO numeroExcursiones
			break;
		case 5:
			visualizarTicket();//LLAMADA AL METODO visualizarTicket
			break;
		case 6:
			modificarTicket();//LLAMADA AL METODO modificarTicket
			break;
		case 7:
			borrarTicket();//LLAMADA AL METODO borrarTicket
			break;
		default://SOLO NOS QUEDA LA OPCION 8 LA CUAL INDICA LA OPCION SALIR, SI opcion TIENE ESE VALOR MANDAREMOA AVISO DE SALIDA Y SALDREMOS DEL PROGRAMA
			System.out.println("Fin del programa");
			System.exit(0);//METODO POR EL QUE SALIMOS DEL PROGRAMA
		}
	}

	/**
	 * Crear ticket. METODO POR EL CUAL CREAMOS UN TICKET
	 */
	private static void crearTicket() {
		int opcion = -1;//INICIALIZAMOS VARIABLE
		do {
			menuTicket();//LLAMAMOS AL MENU TICKET
			opcion = elegirOpcionMenuTicket();//ASIGNAMOS UN VALOR A LA VARIABLE OPCION QUE CORRESPONDE A LAS OPCIONES QUE NOS MUESTRA EL METODO menuTicket 
			ejecutarOpcionMenuTicket(opcion);//EJECUTAMOS LA OPCION QUE HEMOS SELECCIONADO
		} while (opcion == 1 || opcion == 2);//ESTO SE REPETIRA EN BUCLE MIENTRAS OPCION SEA 1 O 2
		
	}

	/**
	 * Numero tickets.
	 */
	private static void numeroTickets() {
		System.out.println("N�mero de tickets: "+numTickets);//METODO QUE NOS MUESTRA EL NUMERO DE TICKETS
	}

	/**
	 * Numero actividades.
	 */
	private static void numeroActividades() {//MUESTRA EL NUMERO DE ACTIVIDADES QUE TENEMOS AÑADIDAS A NUESTROS TICKETS
		int cont = 0;
		for (int i = 0; i < numTickets; i++) {
			Ticket aux = tickets[i];
			for (int j = 0; j < aux.getNumServicios(); j++) {
				ServicioTuristico aux2 = aux.getServicios()[j];
				if(aux2 instanceof Actividad) {
					cont++;
				}
			}
		}
		System.out.println("N�mero de Actividades: "+cont);
	}

	/**
	 * Numero excursiones.
	 */
	private static void numeroExcursiones() {//MUESTRA EL NUMERO DE EXCURSIONES QUE TENEMOS AÑADIDAS EN NUESTROS TICKETS
		int cont = 0;
		for (int i = 0; i < numTickets; i++) {
			Ticket aux = tickets[i];
			for (int j = 0; j < aux.getNumServicios(); j++) {
				ServicioTuristico aux2 = aux.getServicios()[j];
				if(aux2 instanceof Visita) {
					cont++;
				}
			}
		}
		System.out.println("N�mero de excursiones: "+cont);
		
	}

	/**
	 * Visualizar ticket. METODO POR EL QUE VISUALIZAMOS EL CONTENIDO DE UN TICKET SELECCIONADO
	 */
	private static void visualizarTicket() {
		int idTicket = teclado.leer_entero_error("Introduzca el identificador del ticket: ", "Debe introducir un identificador v�lido", 1, Integer.MAX_VALUE); 
		for (int i = 0; i < numTickets; i++) {
			if(tickets[i].getIdTicket() == idTicket) {
				System.out.println(tickets[i]);
				return;
			}
		}
		System.out.println("No se encuentra el ticket con identificador "+idTicket+" en nuestro sistema");
		
	}

	/**
	 * Modificar ticket. METODO POR EL CUAL MODIFICAMOS UN TICKET SELECCIONADO
	 * 
	 * POR PASOS:
	 * 		PRIMER PASO: SOLICITAMOS QUE NOS INDIQUE LA idTicket DEL TICKET QUE QUIERE MODIFICAR
	 * 		SEGUNDO PASO: INIVIALZAMOS UNA VARIABLE TIPO Ticket a NULL PARA PORTER
	 * 		TERCER PASO: EN EL BUCLE LO QUE VAMOS A HACER ES VER SI HAY ALGUN TICKET CON ESA idTicket SI LO HAY GUARDAREMOS SU CONTENIDO EN LA VARIABLE ticket Y SALDREMOS DEL BUCLE
	 * 		CUARTO PASO: SINO HA ENCONTRADO NINGUN TICKET, NOS MOSTRARA UN MENSAJE DE QUE NO HAY NINGUN TICKET CON ESA idTicket Y SALDRA DEL METODO
	 * 		QUINTO PASO: SI HA ENCONTRADO UN TICKET CON ESA idTicket LLAMARA AL METODO ejecutarOpcionMenuModificarTicket Y LE PASARA LA OPCION SELECCIONADA Y EL CONTENIDO DE ESE TICKET
	 */
	private static void modificarTicket() {
		
		menuModificarTicket();//LLAMADA AL MENU MODIFICAR TICKET
		
		int opcion = elegirOpcionModificarTicket();//LLAMADA EL METODO QUE NOS VA A DEVOLVER LA OPCION QUE HEMOS SELECCIOANDO DEL MENU QUE NOS MUESTRA EL METODO menuModificarTicket
		
		int idTicket = teclado.leer_entero_error("Introduzca el identificador del ticket: ", "Debe introducir un identificador v�lido", 1, Integer.MAX_VALUE); // PRIMER PASO
		
		Ticket ticket = null;//SEGUNDO PASO
		
		for (int i = 0; i < numTickets; i++) { //TERCER PASO
			if(tickets[i].getIdTicket() == idTicket) {
				ticket = tickets[i];
				break;
			}
		}
		
		//PASO CUATRO
		
		if(ticket == null) {
			System.out.println("No se encuentra el ticket con identificador "+idTicket+" en nuestro sistema");
			return;
		}
		
		ejecutarOpcionMenuModificarTicket(opcion, ticket);//QUINTO PASO
	}

	/**
	 * Borrar ticket. METODO POR EL CUAL BORRAMOS UN TICKET CREADO
	 * 
	 * POR PASOS:
	 * 		PRIMER PASO: SOLICITAMOS QUE NOS INDIQUE LA idTicket DEL TICKET QUE QUIERE ELIMINAR
	 * 		SEGUNDO PASO: INIVIALZAMOS UNA VARIABLE posicion
	 * 		TERCER PASO: EN EL BUCLE LO QUE VAMOS A HACER ES VER SI HAY ALGUN TICKET CON ESA idTicket SI LO HAY GUARDAREMOS SU POSICION EN LA VARIABLE posicion Y SALDREMOS DEL BUCLE
	 * 		CUARTO PASO: SINO HA ENCONTRADO NINGUN TICKET, NOS MOSTRARA UN MENSAJE DE QUE NO HAY NINGUN TICKET CON ESA idTicket Y SALDRA DEL METODO
	 * 		QUINTO PASO: SI HA ENCONTRADO UN TICKET CON ESA idTicket NOS SOLICITARA SI QUEREMOS CONFIRMAR LA ELIMINACION DEL TICKET
	 * 		SEXTO PASO: SI HEMOS CONFIRMADO LA ELIMINACION DEL TICKET MOVEREMOS DESDE LA POSICION DEL TICKET LOS TICKETS QUE SE ENCUENTREN A LA DERECHA DE ESTE PARA DE ESTA FORMA 
	 * 					SUSTITUIR LOS VALORES DEL TICKET QUE QUERIAMOS ELIMINAR POR EL SIGUIENTE TICKET, EN RESUMEN VAMOS SUSTITUYENDO LOS TICKETS UNO A UNO DESDE EL QUE QUEREMOS
	 * 					ELIMINAR HASTA EL ULTIMO QUE TENGAMOS CREADO
	 * 		SEPTIMO PASO: EL ULTIMO TICKET AL ESTAR DUPLICADO  LO ASIGNAMOS A NULL
	 * 		OCTAVO PASO: DECREMENTAMOS EN 1 EL NUMERO DE TICKETS CREADOS
	 */
	private static void borrarTicket() {
		
		int idTicket = teclado.leer_entero_error("Introduzca el identificador del ticket: ", "Debe introducir un identificador v�lido", 1, Integer.MAX_VALUE); //PRIMER PASO
		
		int posicion = -1;//SEGUNDO PASO 
		
		for (int i = 0; i < numTickets; i++) {//TERCER PASO
			if(tickets[i].getIdTicket() == idTicket) {
				posicion = i;
				break;
			}
		}
		if(posicion == -1) {//CUARTO PASO
			System.out.println("No se encuentra el ticket con identificador "+idTicket+" en nuestro sistema");
			return;
		}
		
		int opcion = teclado.leer_entero_error("Seguro que quiere borrar este ticket? 1.Si, 2.No", "Debe introducir una opcion v�lida", 1, 2);//QUINTO PASO
		
		if(opcion == 1) {//SEXTO PASO
			for (int i = posicion; i < numTickets-1; i++) {
				tickets[i] = tickets[i+1];
			}
			tickets[numTickets-1] = null;//SEPTIMO PASO
			
			numTickets--;//OCTAVO PASO
			
			System.out.println("Se ha eliminado correctamente el ticket "+idTicket);//MOSTRAMOS MENSAJE DE CONFIRMACION DE ELIMINACION DEL TICKET
		}
		
	}

	/**
	 * Menu ticket. NOS MUESTRA EL MENU DE CREACION DEL TICKET
	 */
	private static void menuTicket() {
		System.out.println("======================================");
		System.out.println("          MENU TICKET");
		System.out.println("======================================");
		System.out.println("1.- Crear Ticket");
		System.out.println("2.- Contratar m�s servicios");
		System.out.println("3.- Imprimir ticket");
		System.out.println("4.- Salir sin grabar");
		System.out.println("======================================");
	}

	/**
	 * Elegir opcion menu ticket.
	 *
	 * @return ESTE METODO NOS DEVUELVE SOLICITA Y DEVUELVE LA OPCION QUE ELIJAMOS DEL MENU TICKET QUE NOS MUESTRA EL METODO menuTicket
	 */
	private static int elegirOpcionMenuTicket() {
		
		return teclado.leer_entero_error("Elija un opci�n: ", "ERROR: No es una opcion valida", 1, 4);
		
	}

	/**
	 * Ejecutar opcion menu ticket.
	 *
	 * @param opcion ESTE METODO EJECUTA LA OPCION QUE HEMOS ELEGIDO DEL MENU TICKET 
	 */
	private static void ejecutarOpcionMenuTicket(int opcion) {
		switch (opcion) {
		case 1:
			nuevoTicket();//LLAMADA AL METODO POR EL QUE CREAMOS UN NUEVO TICKET
			break;
		case 2:
			agregarServicios(tmp);//LLAMADA AL METODO AL QUE LE AGREGAMOS AL TICKET ABIERTO UN NUEVO SERVICIO
			break;
		case 3:
			imprimirYGuardar();//LLAMADA AL METODO POR EL QUE MOSTRAMOS EL TICKET QUE ESTAMOS AÑADIENDO Y LO GUARDAMOS
			break;
		default:
			salirSinGuardar();//LLAMADA AL METODO QUE SALE SIN GUARDAR EL TICKET QUE ESTAMOS MODIFICANDO
		}
	}

	/**
	 * Nuevo ticket. METODO POR EL QUE CREAMOS UN NUEVO TICKET
	 */
	private static void nuevoTicket() {
		
		if(tmp != null) {//AQUI CONTROLAMOS QUE NO TENGAMOS NINGUN TICKET ABIERTO
			System.out.println("Ya existe un ticket creado");
			return;
		}
		System.out.println("======================================");
		System.out.println("          NUEVO TICKET");
		System.out.println("======================================");
		Date fecha = crearFecha();//LLAMADA AL METODO PARA AÑADIR LA FECHA AL TICKET
		String nombre = crearNombre();//LLAMADA AL METODO PARA AÑADIR UN NOMBRE AL TICKET
		int dni = crearDni();//LLAMADA AL METODO PARA AÑADIR EL DNI AL TICKET
		short numAdultos = crearNumAdultos();//LLAMADA AL METODO PARA AÑADIR EL NUMERO DE ADULTOS
		short numNinos = crearNumNinos();//LLAMADA AL METODO PARA AÑADIR EL NUMERO DE NIÑOS
		
		tmp = new Ticket(fecha, nombre, dni, numAdultos, numNinos);// ASIGNACIO A UNA VARIABLE TEMPORAL DE LOS CAMPOS RECIEN RELLENADOS
		tmp.addServicio(new VisitaGranada(tmp, true));//A ESTE TICKET LE AÑADIMOS COMO SERVICIO BASE UNA VISITA A GRANADA
	}

	/**
	 * Agregar servicios.
	 *
	 * @param ticket MODULO EN EL QUE MOSTRAMOS EL MENU PARA AÑADIR LOS SERVICIOS AL TICKET QUE TENEMOS ABIERTO
	 */
	private static void agregarServicios(Ticket ticket) {
		
		if(ticket == null) {//SI NO HAY NINGUN TICKET ABIERTO  SALDRA ESTE MENSAJE Y VOLVERA AL MENU ANTERIOR
			System.out.println("Es necesario crear previamente el ticket");
			return;
		}
		
		//MOSTRAMOS EL MENU PARA AÑADIR SERVICIOS AL TICKET
		
		System.out.println("======================================");
		System.out.println("       CONTRATAR M�S SERVICIOS");
		System.out.println("======================================");
		System.out.println("1.- Visita a Granada");
		System.out.println("2.- Visita a la Alhambra");
		System.out.println("3.- Visita al Generalife");
		System.out.println("4.- Visita Museo Federico Garc�a Lorca");
		System.out.println("5.- Bajada en Canoa por el Genil");
		System.out.println("6.- Senderismo Sierra Nevada");
		System.out.println("7.- Volver");
		
		int opcion = teclado.leer_entero_error("Elija opci�n: ", "Seleccione una opci�n v�lida", 1, 7);//CONTROLAMOS QUE SE ELIJA UNA OPCION DEL MENU
		
		//PARTE DEL CODIGO POR EL QUE REVISAMOS QUE UNA VEZ SELECCIONADA LA OPCION SE AÑADA LOS COMPLEMENTOS DE LA MISMA
		
		boolean flag = false;
		if(opcion >= 1 && opcion <=4) {
			flag = teclado.leer_entero_error("Quiere que sea una visita guiada (1.Si, 2.No): ", "Seleccione una opci�n v�lida", 1, 2) == 1;
		}else if(opcion >= 5 && opcion <=6) {
			flag = teclado.leer_entero_error("Quiere que sea un nivel principiante (1.Si, 2.No): ", "Seleccione una opci�n v�lida", 1, 2) == 1;
		}
		
		switch (opcion) {//CODIGO DONDE AÑADIMOS EL SERVICIO QUE HEMOS SELECCIONADO
		
		case 1: 
			
			ticket.addServicio(new VisitaGranada(ticket, flag)); 
			break;
			
		case 2: 
			ticket.addServicio(new VisitaAlhambra(ticket, flag)); 
			break;
			
		case 3: 
			ticket.addServicio(new VisitaGeneralife(ticket, flag)); 
			break;
			
		case 4: 
			ticket.addServicio(new VisitaLorca(ticket, flag)); 
			break;
			
		case 5: 
			ticket.addServicio(new BajadaCanoa(ticket, flag)); 
			break;
			
		case 6: 
			ticket.addServicio(new SenderismoSierraNevada(ticket, flag)); 
			break;
			
		default:
			break;
		}
		
	}

	/**
	 * Imprimir Y guardar. METODO POR EL QUE IMPRIMIMOS EL CONTENIDO DEL TICKET Y LO GUARDAMOS
	 */
	private static void imprimirYGuardar() {
		
		if(tmp == null) {//SI NO HAY NINGUN TICKET ABIERTO  SALDRA ESTE MENSAJE Y VOLVERA AL MENU ANTERIOR
			System.out.println("Es necesario crear previamente el ticket");
			return;
		}
		
		System.out.println(tmp);//IMPRIMIMOS POR PANTALLA EL TICKET
		tickets[numTickets] = tmp;//GUARDAMOS EL TICKET
		numTickets++;//INCREMENTAMOS EL NUMERO DE TICKEST EN UNO
		tmp = null;//VOLVEMOS A PONER A NULL EL TICKET TEMPORAL QUE UTILIZAMOS 
	}

	/**
	 * Salir sin guardar.METODO POR EL QUE SALIMOS DE LA CREACION DEL TICKET Y ELIMINAMOS ESOS DATOS
	 */
	private static void salirSinGuardar() {
		
		tmp = null;//VOLVEMOS A PONER A NULL EL TICKET TEMPORAL QUE UTILIZAMOS 
		System.out.println("No se ha guardado el ticket.");//EVIAMOS MENSAJE DE NO GUARDADO DE TICKET
	}

	/**
	 * Crear nombre.
	 *
	 * @return METODO PRO EL CUAL SOLICITAMOS EL NOMBRE PARA ASIGNAR AL TICKET, 
	 */
	private static String crearNombre() {
		
		String nombre = null;//INICIALIZAMOS LA VARIABLE NOMBRE A NULO
		
		do {//ENTRAMOS EN UN BUCLE DONDE REVISAMOS QUE SEA CORRECTA LA INTRODUCCION DEL NOMBRE, EN ELLA CONTROLAMOS QUE TENGA SOLO CARACTERES ALFABETICOS
			
			nombre = teclado.leer_cadena2("Introduzca el nombre: ");
			nombre = nombre.trim();//ELIMINAMOS LOS ESPACIOS QUE CONTENGA DICHA CADENA 
			if(nombre.isEmpty()) {//CONTROLAMOS QUE NO SE INTRODUZCA UNA CADENA VACIA 
				System.out.println("El nombre no puede estar vac�o");
			}else if(nombre.split("[^a-zA-Z��]").length>1) {//REVISAMOS QUE LOS CARATERES SEAN LETRAS Y SI LA LOGITUD ES MENOR ENVIAMOS MENSAJE DE QUE CONTIENE
															//CARACTERES NO PERMITIDOS
				System.out.println("El nombre contiene caracteres no permitidos");
			}else break;//SI TODO ESTA CORRECTO SALIMOS DEL BUCLE
			
		} while (true);
		return nombre;//DEVOLVEMOS EL NOMBRE EN FORMATO CORRECTO
	}

	/**
	 * Crear dni.
	 *
	 * @return METODO POR EL QUE SOLICITAMOS QUE NOS INTRODUZCA UN DNI
	 */
	private static int crearDni() {
		int dni = teclado.leer_entero_error("Introduzca el dni: ", "Debe introducir un dni v�lido", 0, 99999999);
		return dni;
	}

	/**
	 * Crear fecha.
	 *
	 * @return METODO POR EL QUE SOLICITAMOS UNA FECHA PARA EL TICKET
	 */
	private static Date crearFecha() {
		
		int ano = teclado.leer_entero_error("Introduzca el a�o: ", "Debe introducir un a�o v�lido", 2020, 2050);//SOLICITAMOS UN AÑO
		int mes = teclado.leer_entero_error("Introduzca el mes: ", "Debe introducir un mes v�lido", 1, 12);//SOLICITAMOS UN MES
		
		int maxDia = 31;//INICIALIZAOS LA VARIABLE DIA AL VALOR MAXIMO QUE PUEDE TOMAR
		
		switch (mes) {//CONTROLAMOS EN ESTE SWITCH EL VALOR MAXIMO DE LA VARIABLE YA QUE DEPENDE EL MES PUEDE TOMAR UN VALOR MAXIMO DISTINTO
		case 4:
		case 6:
		case 9:
		case 11: maxDia = 30;
			break;
		case 2:
			if(esBisiesto(ano)) {//CONTROLAMOS EN EL CASO DE FEBRERO SI ES BISIESTO O NO LLAMANDO AL METODO CREADO PARA ESE FIN
				maxDia = 29;
			}else {
				maxDia = 28;
			}
			break;
		}
		
		//AHORA SOLICITAMOS QUE NOS INTRODUZCA EL DIA PARA LA FECHA Y CONTROLAMOS QUE SEA UN VALOR CORRECTO
		
		int dia = teclado.leer_entero_error("Introduzca el d�a: ", "Debe introducir un d�a v�lido", 1, maxDia);
		
		Date fecha;
		try {
			fecha = new SimpleDateFormat("dd/MM/yyyy").parse(dia+"/"+mes+"/"+ano);//EN ESTE SEGMENTO TE CODIGO LE DAMOS FORMATO A LA FECHA INTRODUCIDA
		} catch (ParseException e) {
			return null;
		}
		return fecha;//DEVOLVEMOS LA FECHA
	}

	/**
	 * Crear num adultos.
	 *
	 * @return METODO POR EL QUE SOLICITAMOS EL NUMERO DE ADULTOS DEL TICKET
	 */
	private static short crearNumAdultos() {
		short numAdultos = (short) teclado.leer_entero_error("Introduzca el n�mero de adultos:" , "Debe introducir un numero entero valido", 1, Short.MAX_VALUE);
		return numAdultos;//DEVOLVEMOS EL NUMERO DE ADULTOS
	}

	/**
	 * Crear num ninos.
	 *
	 * @return METODO POR EL QUE SOLICITAMOS EL NUMERO DE NIÑOS DEL TICKET
	 */
	private static short crearNumNinos() {
		short numNinos = (short) teclado.leer_entero_error("Introduzca el n�mero de ni�os:" , "Debe introducir un numero entero valido", 0, Short.MAX_VALUE);
		return numNinos;//DEVOLVEMOS EL NUMERO DE NIÑOS
	}

	/**
	 * Es bisiesto.
	 *
	 * @param ano EN ESTE METODO REVISAMOS QUE EL AÑO ES BISIESTO O NO 
	 * @return true, if successful
	 */
	private static boolean esBisiesto(int ano) {
	//		Es bisiesto si es divisible entre 4.
	//		Pero no es bisiesto si es divisible entre 100.
	//		Pero si es bisiesto si es divisible entre 400.
			return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
		}

	/**
	 * Agregar servicios ticket.
	 *
	 * @param ticket EN ESTE METODO AÑADIMOS SERVICIOS AL TICKET QUE TENEMOS ABIERTO
	 */
	private static void agregarServiciosTicket(Ticket ticket) {
		agregarServicios(ticket);
	}

	/**
	 * Borrar servicios ticket.
	 *
	 * @param ticket EN ESTE TICKET ELIMINASOS SERVICIOS AL TICKET QUE TENEMOS ABIERTO
	 */
	private static void borrarServiciosTicket(Ticket ticket) {
		if(ticket.getNumServicios() == 0) {//CONTROLAMOS SI TIENE O NO SERVICIOS POR DEFECTO SIEMPRE VA A TENER 1 VISITA A GRANADA
			System.out.println("Este ticket no tiene servicios contratados");
			return;
		}
		System.out.println("Servicios contratados en este ticket:");//MOSTRAMOS LOS SERVICIOS QUE TIENE CONTRATADOS
		for (int i = 0; i < ticket.getNumServicios(); i++) {
			System.out.println((i+1)+".- "+ticket.getServicios()[i].toString());
		}
		
		//SOLICITAMOS INDICAR EL NUMERO DE SERVICIO QUE VAMOS A ELIMINAR
		int opcion = teclado.leer_entero_error("Elija un opci�n: ", "ERROR: No es una opcion valida", 1, ticket.getNumServicios());
		ticket.deleteServicio(opcion-1);//LLAMAMOS AL METODO deleteServicio PARA ELIMINAR EL SERVICIO
		
		System.out.println("Eliminaci�n realizada con exito");//ENVIAMOS MENSAJE DE CONFIRMACION DE ELIMINACION DEL SERVICIO
	}

	/**
	 * Menu modificar ticket. //METODO QUE MUESTRA EL MENU PARA MODIFICAR UN TICEKT
	 */
	private static void menuModificarTicket() {
		System.out.println("======================================");
		System.out.println("         MODIFICAR TICKET");
		System.out.println("======================================");
		System.out.println("1.- Modificar fecha");
		System.out.println("2.- Modificar nombre");
		System.out.println("3.- Modificar dni");
		System.out.println("4.- Modificar n�mero de adultos");
		System.out.println("5.- Modificar n�mero de ni�os");
		System.out.println("6.- Agregar servicios");
		System.out.println("7.- Borrar servicios");
		System.out.println("8.- Salir");
		System.out.println("======================================");
		
	}

	/**
	 * Elegir opcion modificar ticket.
	 *
	 * @return the int METODO POR EL CUAL SOLICITAMOS ELEGIR UNA OPCION DEL MENU MODIFICAR TICKET 
	 */
	private static int elegirOpcionModificarTicket() {
		return teclado.leer_entero_error("Elija un opci�n: ", "ERROR: No es una opcion valida", 1, 8);
	}

	/**
	 * Ejecutar opcion menu modificar ticket.
	 *
	 * @param opcion the opcion 
	 * @param ticket the ticket
	 * 
	 * EN ESTE METODO EJECUTAMOS LA OPCION QUE HEMOS SELECCIONADO EN EL METODO elegirOpcionModificarTicket
	 */
	private static void ejecutarOpcionMenuModificarTicket(int opcion, Ticket ticket) {
		
		switch (opcion) {//LLAMADA A LOS METODOS SEGUN EL VALOR DE OPCION Y LE PASAMOS EL TICKET QUE HEMOS SELECCIONADO PARA EDITARLO
		case 1:
			modificarFechaTicket(ticket);
			break;
		case 2:
			modificarNombreTicket(ticket);
			break;
		case 3:
			modificarDniTicket(ticket);
			break;
		case 4:
			modificarNumAdultosTicket(ticket);
			break;
		case 5:
			modificarNumNinosTicket(ticket);
			break;
		case 6:
			agregarServiciosTicket(ticket);
			break;
		case 7:
			borrarServiciosTicket(ticket);
			break;
		default:
			break;
		}
		
	}

	/**
	 * Modificar nombre ticket.
	 *
	 * @param ticket the ticket
	 */
	private static void modificarNombreTicket(Ticket ticket) {//METODO DE MODIFICACION DEL NOMBRE DEL TICKET
		ticket.setNombre(crearNombre());
	}

	/**
	 * Modificar dni ticket.
	 *
	 * @param ticket the ticket
	 */
	private static void modificarDniTicket(Ticket ticket) {//METODO DE MODIFICACION DEL DNI DEL TICKET
		ticket.setDni(crearDni());
	}

	/**
	 * Modificar fecha ticket.
	 *
	 * @param ticket the ticket
	 */
	private static void modificarFechaTicket(Ticket ticket) {//METODO DE MODIFICACION DE LA FECHA DEL TICKET
		ticket.setFechaContratacion(crearFecha());
	}

	/**
	 * Modificar num adultos ticket.
	 *
	 * @param ticket the ticket
	 */
	private static void modificarNumAdultosTicket(Ticket ticket) {//METODO DE MODIFICACION DE LOS ADULTOS DEL TICKET
		ticket.setNumAdultos(crearNumAdultos());
	}

	/**
	 * Modificar num ninos ticket.
	 *
	 * @param ticket the ticket
	 */
	private static void modificarNumNinosTicket(Ticket ticket) {//METODO DE MODIFICACION DE LOS NIÑOS DEL TICKET
		ticket.setNumNinos(crearNumNinos());
	}

}
