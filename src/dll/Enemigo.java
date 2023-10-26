package dll;

public class Enemigo extends Personaje implements Poder {
	
	private int salud;
	private String condicion;
	private int confianza;

	public Enemigo(String nombre, String planeta, String poder1, String poder2, int salud, String condicion,
			int confianza) {
		super(nombre, planeta, poder1, poder2);
		this.salud = salud;
		this.condicion = condicion;
		this.confianza = confianza;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public String getCondicion() {
		return condicion;
	}

	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}

	public int getConfianza() {
		return confianza;
	}

	public void setConfianza(int confianza) {
		this.confianza = confianza;
	}
	
	@Override
	public String toString() {
		return "Enemigo [salud=" + salud + ", condicion=" + condicion + ", confianza=" + confianza + "]";
	}

	@Override
	public String usarPoder(int atacar) {
		if (atacar==0) {
			return this.getPoder1();
		} else {
			return this.getPoder2();
		}
		
	}
	
	public void convertirse(Jugador jugador) {
		this.setCondicion("Aliado");
		jugador.calcularKarma(true, 3);
	}
	
	public void rendirse(Jugador jugador) {
		this.setCondicion("Curado");
		jugador.calcularKarma(true, 3);
	}
	
	public void irse(Jugador jugador) {
		this.setCondicion("Derrotado");
		jugador.calcularKarma(false, 3);
	}

}
