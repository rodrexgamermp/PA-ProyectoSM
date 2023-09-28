package interfaz;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import logica.Aliado;
import logica.Enemigo;
import logica.Historia;
import logica.Jugador;
import logica.Personaje;


public class Main {

	public static void main(String[] args) {
		String nombre = null;
		
		Historia sm = new Historia("Sailor Moon: Battle for Earth");
		Jugador jugador = new Jugador(null, null);
		
		Aliado moon = new Aliado("Usagi", "Moon", "¡Curación Lunar, Acción!", "¡Espiral del Corazón de la Luna!");
		Aliado mercury = new Aliado("Ami", "Mercury", "¡Burbujas Congelantes de Mercurio, Estallen!", "¡Fulgor del Agua de Mercurio!");
		Aliado mars = new Aliado("Rei", "Mars", "¡Que los Demonios se Dispersen!", "¡Mandala Ardiente!");
		Aliado jupiter = new Aliado("Makoto", "Jupiter", "¡Trueno de Júpiter, Resuena!", "¡Relámpago Centella de Júpiter!");
		Aliado venus = new Aliado("Minako", "Venus", "¡Beso de Amor y Belleza de Venus!", "¡Cadena del Amor de Venus!");
		
		//Enemigo eris = new Enemigo("Sailor Eris", "Eris", "¡Posesión fantasmal!", "¡Constelación del espectro de Eris!");
		//Enemigo ceres = new Enemigo("Sailor Ceres", "Ceres", "¡Ataque antigravedad!", "¡Vibración cósmica de Ceres!");
		//Enemigo humea = new Enemigo("Sailor Humea", "Humea", "¡Gotas envenenadas!", "¡Radiación tóxica de Humea!");
		Enemigo sun = new Enemigo("Sailor Sun", "Sun", "¡Reflejar!", "¡Tormenta de Calor Solar!");
		
		//menu
		
		JOptionPane.showMessageDialog(null, "Ya es casi la hora.\nTengo que irme ya...", "",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("")));
		JOptionPane.showMessageDialog(null, "", "",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("acto0.jpg")));
		JOptionPane.showMessageDialog(null, "Hoy es un día muy emocionante para todos:\nel rarísimo eclipse anular está a punto de ocurrir.\nAl igual que vos, muchos se están reuniendo\nen el Parque Yoyogi para presenciar el fenómeno.\nEn el camino, alguien acaba chocándote.", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("picnic.jpg")));
		
		sm.Decision1(jupiter, jugador);
		
		JOptionPane.showMessageDialog(null, venus.getNombre() + ":\nEso es lo que pasa cuando miras a los chicos.", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("minascold.jpg")));
		JOptionPane.showMessageDialog(null, jupiter.getNombre() + ":\nEs qué es exactamente mi tipo favorito...", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("makoshy.jpg")));
		JOptionPane.showMessageDialog(null, venus.getNombre() + ":\nMako, siempre dices eso...", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("minasus.jpg")));
		
		while (nombre == null || nombre.length() < 2 || !nomAlfabetico(nombre)) {
            try {
                nombre = (String) JOptionPane.showInputDialog(null, venus.getNombre() + ":\nAh, por cierto, ¿cómo te llamas?", "Ingresar un nombre para su personaje", JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("pjname.jpg")), null, null);

                if (nombre != null && nombre.length() < 2) {
                    JOptionPane.showMessageDialog(
                            null,
                            "El nombre debe contener al menos 2 caracteres alfabéticos.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                } else if (nombre != null && !nomAlfabetico(nombre)) {
                    JOptionPane.showMessageDialog(
                            null,
                            "El nombre debe consistir solo en letras.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            } catch (Exception e) {
                System.exit(0);
            }
        }
		
		Personaje earth = new Personaje(nombre, "Earth", "¡Semillas de la Tierra, germinen!", "¡Ventisca de pétalos de la Tierra!");
		
		JOptionPane.showMessageDialog(null, venus.getNombre() + ":\nMucho gusto, " + earth.getNombre() + ".\nYo soy Minako, pero puedes llamarme Mina.\nEsta es Makoto.", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("minaintro.jpg")));
		venus.setNombre("Mina");
		
		if (jupiter.getAfinidad()>3) {
			JOptionPane.showMessageDialog(null, jupiter.getNombre() + ":\nPuedes llamarme Mako.\n¡Oye, tengo una idea!", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("makointro.png")));
			jupiter.setNombre("Mako");
		} else {
			JOptionPane.showMessageDialog(null, jupiter.getNombre() + ":\nBueno, tenemos que irnos ahora.", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("makoglare.jpg")));
			JOptionPane.showMessageDialog(null, venus.getNombre() + ":\nEspera… ¿estás sola?", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("minatender.jpg")));
		}
		
		sm.Escena1(sm.Decision2(venus, jugador), earth);
		sm.Escena2(moon, mercury, mars, jupiter, venus, sun);
		sm.Decision3(jugador);
		sm.Escena3(earth, moon, sun);
		JOptionPane.showMessageDialog(null, "Luna:\nElige una Sailor Guerrera para enfrentar a Sailor Sun contigo.\nCada una tiene sus propios ataques.\nElige la mejor opción para enfrentarte a cada enemigo.", "Tutorial",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("smchoice.jpg")));
		sm.batallaTutorial(earth, moon, mercury, mars, jupiter, venus, sun, sm.decidirBatalla(jugador, earth, moon, mercury, mars, jupiter, venus, sun, sm.eligirAtaque(earth, moon, mercury, mars, jupiter, venus, sun)));
		sm.Escena4(mars, jupiter, sun);
		sm.finDemo(moon, mercury, mars, jupiter, venus);
	}


	

	

	

	
	private static boolean nomAlfabetico(String nombre) {
        return nombre.matches("[a-zA-Z]+");
    }

}

// JOptionPane.showMessageDialog(null, "", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("")));
// JOptionPane.showMessageDialog(null, + ":\n ", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("")));
