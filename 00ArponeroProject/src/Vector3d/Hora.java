package Vector3d;

public class Hora {
	private int horas;
	private int minutos;
	private int segundos;
	
	public Hora() {
		this(0, 0, 0);
	}

	public Hora(int horas, int minutos, int segundos) {
		valida(horas, minutos, segundos);
	}
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		if(horas < 0) {
			this.horas = 0;
		}else if (horas > 23) {
			this.horas = 23;
		}else {
			this.horas = horas;
		}
		if (minutos < 0) {
			this.minutos = 0;
		}else if (minutos > 59) {
			this.segundos = 59;
		}else {
			this.segundos = segundos;
		}
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	private void valida(int horas, int minutos, int segundos) {
		setHoras(horas);
		setMinutos(minutos);
		setSegundos(segundos);
	}
	public int aSegundos() {
		return this.horas*3600 + this.minutos*60 + this.segundos;
	}
	public static Hora deSegundos(long segundos) {
		int h = ((int) (segundos / 3600) % 24);
		int m = (int) ((segundos % 3600)) / 60;
		int s = (int) (segundos % 60);
		Hora hora = new Hora(h, m, s);
		return hora;
	}
	
	public String toString() {
		String s = "";
		if(this.horas < 10) {
			s+="0";
		}
		s += this.horas + ":";
		if (this.minutos < 10) {
			s += "0";
		}
		s += this.minutos + ":";
		if (this.segundos < 10) {
			s += "0";
		}
		s += this.segundos;
		return  String.format("%02d:%02d:%02d", this.horas, this.minutos, this.segundos);
	}
	
	public void escribir12() {
		System.out.printf("%02d:%02d:%02d", this.horas%12, this.minutos, this.segundos);
		System.out.println(this.horas >= 12 ? " pm" : " am");
	}
}
