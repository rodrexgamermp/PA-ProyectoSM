package dll;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import bll.Validador;

public class Decision {
	
	private boolean buena;

	public Decision(boolean buena) {
		super();
		this.buena = buena;
	}

	public boolean isBuena() {
		return buena;
	}

	public void setBuena(boolean buena) {
		this.buena = buena;
	}

	@Override
	public String toString() {
		return "Decision [buena=" + buena + "]";
	}
	
	Validador valid = new Validador();
	
	public boolean Decision1(Jugador jugador, Aliado moon, Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus, Enemigo enemigo) {
		String[] respuesta = {"Todo bien, no te preocupes.", "¡Ten más cuidado!"};
		
		 int opcion = JOptionPane.showOptionDialog(
		            null,
		            jupiter.getNombre() + ":\nLo siento. ¿Estás bien?",
		            "Decision",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.PLAIN_MESSAGE,
		            null,
		            respuesta,
		            respuesta[0]
		        );

		        if (opcion == 0) {
		        	jupiter.modAfinidad(true);
		        	valid.arModStatus(jugador, jupiter, enemigo);
		        	JOptionPane.showMessageDialog(null, jupiter.getNombre() + ":\nAh, me alegro. Estaba distraída…", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("makogd.png")));
		        	return true;
		        } else {
		        	jupiter.modAfinidad(false);
		        	valid.arModStatus(jugador, jupiter, enemigo);
		        	JOptionPane.showMessageDialog(null, jupiter.getNombre() + ":\nTampoco es para tanto. Estaba distraída…", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("makobd.png")));
		        	return false;
		        }

	}
	
	public void tutorialDecision(Jugador jugador, Aliado moon, Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus, String icoPlayer) {
		JOptionPane.showMessageDialog(null, "Tutorial:\nAcabas de tomar una decisión.\nVea los íconos en la parte superior de la pantalla.\nTe señalan si tus elecciones fueron"
				+ " buenas o no\ny cómo esto afecta tu nivel de afinidad con cada una\nde las chicas: Usagi, Ami, Rei, Mako y Mina.\nTus decisiones cambian el curso de la historia..", 
				"Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource(icoPlayer)));
		JOptionPane.showMessageDialog(null, venus.getNombre() + ":\nEso es lo que pasa cuando miras a los chicos.", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("Mina.png")));
		JOptionPane.showMessageDialog(null, jupiter.getNombre() + ":\nEs qué es exactamente mi tipo favorito...", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("Mako.png")));
		JOptionPane.showMessageDialog(null, venus.getNombre() + ":\nMako, siempre dices eso...\nAh, por cierto, ¿cómo te llamas?", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("Mina.png")));
	}
	
	public boolean Decision2(Jugador jugador, Aliado moon, Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus, Enemigo enemigo) {	
		String[] respuesta = {"¡Me encantaría!", "Sería genial, pero…"};
		
		 int opcion = JOptionPane.showOptionDialog(
		            null,
		            venus.getNombre() + ":\n¿No te gustaría venir con nosotros?",
		            "Decision",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.PLAIN_MESSAGE,
		            null,
		            respuesta,
		            respuesta[0]
		        );

		        if (opcion == 0) {
		        	venus.modAfinidad(true);
		        	valid.arModStatus(jugador, venus, enemigo);
		        	JOptionPane.showMessageDialog(null, venus.getNombre() + ":\n¡Entonces vámonos!\nNuestros amigos ya nos están esperando.", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("minagd.png")));
		            return true;
		        } else {
		        	venus.modAfinidad(false);
		        	valid.arModStatus(jugador, venus, enemigo);
		        	JOptionPane.showMessageDialog(null, venus.getNombre() + ":\nOh, ya debes tener otros planes.\nTodo bien entonces. ¡Nos vemos por ahí!", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("minabd.png")));
		            return false;
		        }

	}
	
	public void Decision3(Jugador jugador, Aliado moon, Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus) {
		String[] respuesta = {"Busca alguna manera de ayudar.", "Mejor no involucrarse, no hay nada que hacer."};
		
		 int opcion = JOptionPane.showOptionDialog(
		            null,
		           "¿Que haces?",
		            "Decision",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.PLAIN_MESSAGE,
		            null,
		            respuesta,
		            respuesta[0]
		        );

		        if (opcion == 0) {
		        	jugador.calcularKarma(true, 1);
		        	valid.arModKarma(jugador);
		        	JOptionPane.showMessageDialog(null, "Recoges una piedra para arrojarla al enemigo, pero antes de que puedas hacerlo,\nuna rosa roja cruza el cielo y golpea a Nyx, provocando que libere a Sailor Moon.\nTe das cuenta de que acaba de aparecer un joven con esmoquin y máscara.", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("tmaskfight.png")));
		        } else {
		        	jugador.calcularKarma(false, 1);
		        	valid.arModKarma(jugador);
		        	JOptionPane.showMessageDialog(null, "Afortunadamente, una rosa roja cruza el cielo y golpea a Nyx,\nprovocando que ésta libere a Sailor Moon.\nTe das cuenta de que acaba de aparecer un joven con esmoquin y máscara.", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("tmaskfight.png")));
		        }

	}

}