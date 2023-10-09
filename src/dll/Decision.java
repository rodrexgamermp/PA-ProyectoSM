package dll;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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
	
	public String eligirAtaque(Personaje earth, Aliado moon, Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus, Enemigo enemigo) {
		String[] respuesta = {mercury.getNombre(), mars.getNombre(), jupiter.getNombre(), venus.getNombre()};
		int poder;

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
			String[] poderes = {mercury.getPoder1(), mercury.getPoder2()};
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
			return mercury.usarPoder(poder);
		} else if (opcion == 1) {
			String[] poderes = {mars.getPoder1(), mars.getPoder2()};
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
			return mars.usarPoder(poder);
		} else if (opcion == 2) {
			String[] poderes = {jupiter.getPoder1(), jupiter.getPoder2()};
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
			return jupiter.usarPoder(poder);
		} else {
			String[] poderes = {venus.getPoder1(), venus.getPoder2()};
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
			return venus.usarPoder(poder);
			} 
	}

	public boolean decidirBatalla(Personaje earth, Aliado moon, Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus, Enemigo enemigo, String poder) {
		String poderTierra = "earthatk1.png";
		if (enemigo.getPlaneta().equals("Dark Moon") && poder.equals(mercury.getPoder1())) {
			JOptionPane.showMessageDialog(null, "", poder,  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("mercatk1.png")));
			JOptionPane.showMessageDialog(null, "El ataque de burbujas de Sailor Mercury es ineficaz contra Nyx", "Resultado",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("")));
			mercury.modAfinidad(false);
        	return false;
		} else if (enemigo.getPlaneta().equals("Dark Moon") && poder.equals(mercury.getPoder2())) {
			JOptionPane.showMessageDialog(null, "", poder,  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("mercatk2.png")));
			JOptionPane.showMessageDialog(null, "El ataque de agua de Sailor Mercury distrae a Nyx.\nEs tu turno!", "Resultado",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("")));
			JOptionPane.showMessageDialog(null, "", earth.getPoder1(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource(poderTierra)));
			mercury.modAfinidad(true);
        	return true;
		} else if (enemigo.getPlaneta().equals("Dark Moon") && poder.equals(mars.getPoder1())) {
			JOptionPane.showMessageDialog(null, "", poder,  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("marsatk1.png")));
			JOptionPane.showMessageDialog(null, "El ataque de fuego de Sailor Mars es rechazado por Nyx.", "Resultado",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("")));
			mars.modAfinidad(false);
        	return false;
		} else if (enemigo.getPlaneta().equals("Dark Moon") && poder.equals(mars.getPoder2())) {
			JOptionPane.showMessageDialog(null, "", poder,  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("marsatk2.png")));
			JOptionPane.showMessageDialog(null, "El ataque de Sailor Mars hace que Nyx se contraiga.\n¡Es tu turno!", "Resultado",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("")));
			JOptionPane.showMessageDialog(null, "", earth.getPoder1(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource(poderTierra)));
			mars.modAfinidad(true);
        	return true;
		} else if (enemigo.getPlaneta().equals("Dark Moon") && poder.equals(jupiter.getPoder1())) {
			JOptionPane.showMessageDialog(null, "", poder,  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("jupatk1.png")));
			JOptionPane.showMessageDialog(null, "El ataque de Sailor Júpiter paraliza a Nyx.\n¡Es tu turno!", "Resultado",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("")));
			JOptionPane.showMessageDialog(null, "", earth.getPoder1(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource(poderTierra)));
			jupiter.modAfinidad(true);
        	return true;
		} else if (enemigo.getPlaneta().equals("Dark Moon") && poder.equals(jupiter.getPoder2())) {
			JOptionPane.showMessageDialog(null, "", poder,  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("jupatk2.png")));
			JOptionPane.showMessageDialog(null, "El ataque de Sailor Júpiter no fue tan fuerte contra Nyx.", "Resultado",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("")));
			jupiter.modAfinidad(false);
        	return false;
		} else if (enemigo.getPlaneta().equals("Dark Moon") && poder.equals(venus.getPoder1())) {
			JOptionPane.showMessageDialog(null, "", poder,  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("venusatk1.png")));
			JOptionPane.showMessageDialog(null, "El ligero ataque de Sailor Venus es absorbido por Nyx.", "Resultado",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("")));
			venus.modAfinidad(false);
        	return false;
		} else if (enemigo.getPlaneta().equals("Dark Moon") && poder.equals(venus.getPoder2())) {
			JOptionPane.showMessageDialog(null, "", poder,  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("venusatk2.png")));
			JOptionPane.showMessageDialog(null, "El ataque de Sailor Venus restringe los movimientos de Nyx.\n¡Es tu turno!", "Resultado",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("")));
			JOptionPane.showMessageDialog(null, "", earth.getPoder1(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource(poderTierra)));
			venus.modAfinidad(true);
        	return true;
		} else {
		return false;
		}
	}
	
	public void batallaTutorial(Personaje earth, Jugador jugador, Aliado moon, Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus, Enemigo enemigo, boolean victoria) {
		if (victoria) {
			JOptionPane.showMessageDialog(null, "Luna: Su elección fue satisfactoria, por lo que pudiste atacar al enemigo.\nEsto lo debilita, haciendo más fácil derrotarlo o salvarlo.", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("luna.png")));
			JOptionPane.showMessageDialog(null, "Tuxedo Mask:\nEs el fin.", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("tmask.png")));
			JOptionPane.showMessageDialog(null, enemigo.getNombre() + ":\nTienes razón. Es el fin,\npero no para mí.", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("darkmoon.png")));			
		} else {
			JOptionPane.showMessageDialog(null, "Luna: Su elección no fue satisfactoria, por lo que no pudiste atacar al enemigo.\nAnaliza al enemigo y el poder de cada Sailor Guerrera\npara tomar la mejor decisión y debilitar al enemigo.", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("luna.png")));
			JOptionPane.showMessageDialog(null, enemigo.getNombre() + ":\nAhora es demasiado tarde...", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("darkmoon.png")));
		}
	}
	
	public boolean Decision1(Jugador jugador, Aliado moon, Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus) {
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
		        	JOptionPane.showMessageDialog(null, jupiter.getNombre() + ":\nAh, me alegro. Estaba distraída…", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("makogd.png")));
		        	return true;
		        } else {
		        	jupiter.modAfinidad(false);
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
	
	public boolean Decision2(Jugador jugador, Aliado moon, Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus) {	
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
		        	JOptionPane.showMessageDialog(null, venus.getNombre() + ":\n¡Entonces vámonos!\nNuestros amigos ya nos están esperando.", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("minagd.png")));
		            return true;
		        } else {
		        	venus.modAfinidad(false);
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
		        	JOptionPane.showMessageDialog(null, "Recoges una piedra para arrojarla al enemigo, pero antes de que puedas hacerlo,\nuna rosa roja cruza el cielo y golpea a Nyx, provocando que libere a Sailor Moon.\nTe das cuenta de que acaba de aparecer un joven con esmoquin y máscara.", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("tmaskfight.png")));
		        } else {
		        	jugador.calcularKarma(false, 1);
		        	JOptionPane.showMessageDialog(null, "Afortunadamente, una rosa roja cruza el cielo y golpea a Nyx,\nprovocando que ésta libere a Sailor Moon.\nTe das cuenta de que acaba de aparecer un joven con esmoquin y máscara.", "Karma: " + jugador.getKarma() + " | Afinidad: ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Decision.class.getResource("tmaskfight.png")));
		        }

	}

}