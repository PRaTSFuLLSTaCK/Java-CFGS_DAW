package ejercicioBasicoDePOO13;

public class Futbolista extends SeleccionFutbol {

	   private int dorsal;
	   private String demarcacion;

	   // constructor, getter y setter

	   public Futbolista(int i, String string, String string2, int j, int k, String string3) {
		// TODO Apéndice de constructor generado automáticamente
	}

	@Override
	   public void entrenamiento() {
	      System.out.println("Realiza un entrenamiento (Clase Futbolista)");
	   }

	   @Override
	   public void partidoFutbol() {
	      System.out.println("Juega un Partido (Clase Futbolista)");
	   }

	   public void entrevista() {
	      System.out.println("Da una Entrevista");
	   }
	}
