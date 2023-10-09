package dll;

public class Enemigo extends Personaje implements Poder {
	
	private int salud;

	public Enemigo(String nombre, String planeta, String poder1, String poder2) {
		super(nombre, planeta, poder1, poder2);
		this.salud = 3;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	@Override
	public String toString() {
		return "Enemigo [salud=" + salud + "]";
	}

	@Override
	public String usarPoder(int atacar) {
		atacar = (int) (Math.random() * 2);
		
		if (atacar==0) {
			return this.getPoder1();
		} else {
			return this.getPoder2();
		}
		
	}
	
	public void Convertirse(Jugador jugador) {
		jugador.calcularKarma(true, 3);
	}
	
	public void Rendirse(Jugador jugador) {
		jugador.calcularKarma(false, 3);
	}

}
