package JuegoDeFechas;

import java.util.Date;
import java.util.concurrent.TimeUnit;
 
public class incrementarFecha {
 
	public static void main(String[] args) {
 
		Date someDate = new Date();
		Date newDate = new Date(someDate.getTime() + TimeUnit.DAYS.toMillis( 1 ));
		System.out.println("Manana sera: "+newDate);
 
		newDate = new Date(someDate.getTime() + TimeUnit.DAYS.toMillis( -1 ));
		System.out.println("Ayer fue: "+newDate);
 
		newDate = new Date(someDate.getTime() + TimeUnit.HOURS.toMillis( -1 ));
		System.out.println("Hace una hora: "+newDate);
 
		newDate = new Date(someDate.getTime() + TimeUnit.MINUTES.toMillis( -10 ));
		System.out.println("Hace 10 minutos: "+newDate);
	}
}