package dll;

public class Personaje {
	
	private String nombre;
	private String planeta;
	private String poder1;
	private String poder2;

	public Personaje(String nombre, String planeta, String poder1, String poder2) {
		super();
		this.nombre = nombre;
		this.planeta = planeta;
		this.poder1 = poder1;
		this.poder2 = poder2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPlaneta() {
		return planeta;
	}

	public void setPlaneta(String planeta) {
		this.planeta = planeta;
	}

	public String getPoder1() {
		return poder1;
	}

	public void setPoder1(String poder1) {
		this.poder1 = poder1;
	}

	public String getPoder2() {
		return poder2;
	}

	public void setPoder2(String poder2) {
		this.poder2 = poder2;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", planeta=" + planeta + ", poder1=" + poder1 + ", poder2=" + poder2
				+ "]";
	}
	
	public void transformarse(boolean transformed) {
		if (transformed) {
			this.setNombre("Sailor " + this.getPlaneta());
		} else {
			if (this.getPlaneta().equals("Moon")) {
				this.setNombre("Usagi");
			} else if (this.getPlaneta().equals("Mercury")) {
				this.setNombre("Ami");
			} else if (this.getPlaneta().equals("Mars")) {
				this.setNombre("Rei");
			} else if (this.getPlaneta().equals("Jupiter")) {
				this.setNombre("Mako");
			} else if (this.getPlaneta().equals("Venus")) {
				this.setNombre("Mina");
			}
		}
	}

}
