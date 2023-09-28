package logica;

public class Aliado extends Personaje implements Poder {

	private int afinidad;

	public Aliado(String nombre, String planeta, String poder1, String poder2) {
		super(nombre, planeta, poder1, poder2);
		this.afinidad = 3;
	}

	public int getAfinidad() {
		return afinidad;
	}

	public void setAfinidad(int afinidad) {
		this.afinidad = afinidad;
	}

	@Override
	public String toString() {
		return "Aliado [afinidad=" + afinidad + "]";
	}

	@Override
	public String usarPoder(int atacar) {		
		if (atacar==0) {
			return this.getPoder1();
		} else {
			return this.getPoder2();
		}
	}
	
	public void modAfinidad(boolean buenaDecision) {
		if (buenaDecision) {
			this.setAfinidad(this.getAfinidad()+1);
		} else {
			this.setAfinidad(this.getAfinidad()-1);
		}
	}
	
}
