package logica;

public class Jugador {
	
	private String nombre;
	private String genero;
	private int karma;
	
	public Jugador(String nombre, String genero) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.karma = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getKarma() {
		return karma;
	}

	public void setKarma(int karma) {
		this.karma = karma;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", genero=" + genero + ", karma=" + karma + "]";
	}
	
	public void calcularKarma(boolean buenaDecision, int valor) {

		if (buenaDecision==true) {
			this.setKarma(this.getKarma()+valor);
		} else {
			this.setKarma(this.getKarma()-valor);
		}
		
	}

}
