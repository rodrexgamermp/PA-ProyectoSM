package dll;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Batalla {
	
	private int id;

	public Batalla(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Batalla [id=" + id + "]";
	}
	
	public void tutorial(Personaje earth, Jugador jugador, Aliado moon, Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus, Enemigo enemigo, boolean victoria) {
		if (victoria) {
			JOptionPane.showMessageDialog(null, "Luna: Su elección fue satisfactoria, por lo que pudiste atacar al enemigo.\nEsto lo debilita, haciendo más fácil derrotarlo o salvarlo.", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("luna.png")));
			JOptionPane.showMessageDialog(null, "Tuxedo Mask:\nEs el fin.", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("tmask.png")));
			JOptionPane.showMessageDialog(null, enemigo.getNombre() + ":\nTienes razón. Es el fin,\npero no para mí.", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("darkmoon.png")));			
		} else {
			JOptionPane.showMessageDialog(null, "Luna: Su elección no fue satisfactoria, por lo que no pudiste atacar al enemigo.\nAnaliza al enemigo y el poder de cada Sailor Guerrera\npara tomar la mejor decisión y debilitar al enemigo.", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("luna.png")));
			JOptionPane.showMessageDialog(null, enemigo.getNombre() + ":\nAhora es demasiado tarde...", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("darkmoon.png")));
		}
	}
	
	public String eligirAtaque(Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus) {
		String[] respuesta = {mercury.getNombre(), mars.getNombre(), jupiter.getNombre(), venus.getNombre()};
		int poder;
		Aliado aliado = null;

		 int opcion = JOptionPane.showOptionDialog(
		            null,
		           "¿Que Sailor Guerrera eliges para luchar contigo?",
		            "Batalla",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.PLAIN_MESSAGE,
		            null,
		            respuesta,
		            respuesta[0]
		        );

		 if (opcion == 0) {
			aliado = mercury;
		} else if (opcion == 1) {
			aliado = mars;
		} else if (opcion == 2) {
			aliado = jupiter;
		} else {
			aliado = venus;
		} 
		 
		 String[] poderes = {aliado.getPoder1(), aliado.getPoder2(), "Eligir otra Sailor"};
			poder = JOptionPane.showOptionDialog(
		            null,
		           "¿Que poder quieres usar?",
		            "Batalla",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.PLAIN_MESSAGE,
		            null,
		            poderes,
		            poderes[0]
		        );
			
			if (poder == 2) {
				return "none";
			} else {
				return aliado.usarPoder(poder);
			}	
	}
	
	public boolean definirGanador(Enemigo enemigo, String atke, String atka) {
		int luz = 1, oscuridad = 2, normal = 3, agua = 4, fuego = 5, tierra = 6, aire = 7, planta = 8, eletricidad = 9, hielo = 10, atkaliado = 0, atkenemigo = 0;
		String animacionAliado = "", animacionEnemigo = "";
		
		if (atka.equals("¡Burbujas Congelantes de Mercurio, Estallen!")) {
			animacionAliado = "mercatk1.png";
		} else if (atka.equals("¡Fulgor del Agua de Mercurio!")) {
			animacionAliado = "mercatk2.png";
		} else if (atka.equals("¡Mandala Ardiente!")) {
			animacionAliado = "marsatk1.png";
		} else if (atka.equals("¡Que los Demonios se Dispersen!")) {
			animacionAliado = "marsatk2.png";
		} else if (atka.equals("¡Trueno de Júpiter, Resuena!")) {
			animacionAliado = "jupatk1.png";
		} else if (atka.equals("¡Ataque de hojas de Roble de Júpiter!")) {
			animacionAliado = "jupatk2.png";
		} else if (atka.equals("¡Rayo Creciente de Venus!")) {
			animacionAliado = "venusatk1.png";
		} else if (atka.equals("¡Cadena del Amor de Venus!")) {
			animacionAliado = "venusatk2.png";
		}
		
		if (enemigo.getPlaneta().equals("Dark Moon")) {
			animacionEnemigo = "dmoonfight.png";
		} else if (enemigo.getPlaneta().equals("Ceres")) {
			animacionEnemigo = "ceresfight.png";
		} else if (enemigo.getPlaneta().equals("Eris")) {
			animacionEnemigo = "erisfight.png"; 
		} else if (enemigo.getPlaneta().equals("Humea")) {
			animacionEnemigo = "humeafight.png"; 
		}
		
		JOptionPane.showMessageDialog(null, atka, "Tu aliado ataca con:", JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource(animacionAliado)));
		JOptionPane.showMessageDialog(null, atke, "El enemigo contra ataca con:", JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource(animacionEnemigo)));
		
		atkaliado = this.cargarPoderAliado(atka);
		atkenemigo = this.cargarPoderEnemigo(atke);
		
		if (atkaliado==normal && atkenemigo==luz || atkaliado==luz && atkenemigo==oscuridad || atkaliado==luz && atkenemigo==aire || atkaliado==agua && atkenemigo==tierra || atkaliado==agua && atkenemigo==fuego || atkaliado==hielo && atkenemigo==aire || atkaliado==hielo && atkenemigo==planta || atkaliado==hielo && atkenemigo==agua || atkaliado==fuego && atkenemigo==planta || atkaliado==fuego && atkenemigo==hielo || atkaliado==fuego && atkenemigo==oscuridad || atkaliado==eletricidad && atkenemigo==aire || atkaliado==eletricidad && atkenemigo==agua || atkaliado==eletricidad && atkenemigo==oscuridad || atkaliado==planta && atkenemigo==tierra || atkaliado==planta && atkenemigo==eletricidad || atkaliado==tierra && atkenemigo==fuego || atkaliado==tierra && atkenemigo==eletricidad || atkaliado==tierra && atkenemigo==luz || atkaliado==aire && atkenemigo==fuego || atkaliado==aire && atkenemigo==tierra || atkaliado==oscuridad && atkenemigo==normal || atkaliado==oscuridad && atkenemigo==tierra || atkaliado==oscuridad && atkenemigo==planta) {
			JOptionPane.showMessageDialog(null, "El poder de tu aliado se mostró más fuerte.");
			return true;
		} else if(atkenemigo==normal && atkaliado==luz || atkenemigo==luz && atkaliado==oscuridad || atkenemigo==luz && atkaliado==aire || atkenemigo==agua && atkaliado==tierra || atkenemigo==agua && atkaliado==fuego || atkenemigo==hielo && atkaliado==aire || atkenemigo==hielo && atkaliado==planta || atkenemigo==hielo && atkaliado==agua || atkenemigo==fuego && atkaliado==planta || atkenemigo==fuego && atkaliado==hielo || atkenemigo==fuego && atkaliado==oscuridad || atkenemigo==eletricidad && atkaliado==aire || atkenemigo==eletricidad && atkaliado==agua || atkenemigo==eletricidad && atkaliado==oscuridad || atkenemigo==planta && atkaliado==tierra || atkenemigo==planta && atkaliado==eletricidad || atkenemigo==tierra && atkaliado==fuego || atkenemigo==tierra && atkaliado==eletricidad || atkenemigo==tierra && atkaliado==luz || atkenemigo==aire && atkaliado==fuego || atkenemigo==aire && atkaliado==tierra || atkenemigo==oscuridad && atkaliado==normal || atkenemigo==oscuridad && atkaliado==tierra || atkenemigo==oscuridad && atkaliado==planta) {
			JOptionPane.showMessageDialog(null, "El poder del enemigo superó tu aliado.");
			return false;
		} else {
			JOptionPane.showMessageDialog(null, "Los poderes se anularon.");
			return false;
		}
	}
	
	private int cargarPoderAliado(String aliado) {
		if (aliado.equals("¡Burbujas Congelantes de Mercurio, Estallen!")) {
			return 10;
		} else if (aliado.equals("¡Fulgor del Agua de Mercurio!")) {
			return 4;
		} else if (aliado.equals("¡Mandala Ardiente!")) {
			return 5;
		} else if (aliado.equals("¡Que los Demonios se Dispersen!")) {
			return 1;
		} else if (aliado.equals("¡Trueno de Júpiter, Resuena!")) {
			return 9;
		} else if (aliado.equals("¡Ataque de hojas de Roble de Júpiter!")) {
			return 8;
		} else if (aliado.equals("¡Rayo Creciente de Venus!")) {
			return 1;
		} else if (aliado.equals("¡Cadena del Amor de Venus!")) {
			return 3;
		} else {
			return 0;
		}
	}
	
	private int cargarPoderEnemigo(String enemigo) {
		if (enemigo.equals("Eclipse anular, ¡manifiéstate!")) {
			return 5;
		} else if (enemigo.equals("¡Ondas sonoras de la Luna Oscura!")) {
			return 2;
		} else if (enemigo.equals("¡Rocas afiladas de Ceres, dispersaos!")) {
			return 6;
		} else if (enemigo.equals("¡Ondas gravitacionales de Ceres!")) {
			return 6;
		} else if (enemigo.equals("Estacas cristalinas de Eris, ¡congelad!")) {
			return 10;
		} else if (enemigo.equals("¡Aurora Resplandeciente de Eris!")) {
			return 1;
		} else if (enemigo.equals("¡Ciclón perforador de Humea, devastación!")) {
			return 7;
		} else if (enemigo.equals("¡Proyección astral de Humea!")) {
			return 2;
		} else {
			return 0;
		}
	}
	
}
