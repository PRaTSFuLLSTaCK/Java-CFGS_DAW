package ejercicioBasicoDePOO13;

public class Entrenador extends SeleccionFutbol {

	   private int idFederacion;

	   // constructor, getter y setter
	

	public Entrenador(int i, String string, String string2, int j, int k) {
		// TODO Apéndice de constructor generado automáticamente
	}

	@Override
	   public void entrenamiento() {
	      System.out.println("Dirige un entrenamiento (Clase Entrenador)");
	   }

	   @Override
	   public void partidoFutbol() {
	      System.out.println("Dirige un Partido (Clase Entrenador)");
	   }

	   public void planificarEntrenamiento() {
	      System.out.println("Planificar un Entrenamiento");
	   }
	}
