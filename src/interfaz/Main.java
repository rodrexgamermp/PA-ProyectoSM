package interfaz;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import logica.Aliado;
import logica.Decision;
import logica.Enemigo;
import logica.Historia;
import logica.Jugador;
import logica.Personaje;


public class Main {

	public static void main(String[] args) {
		String nombre = null;
		String player = "", senshi = "", fighter = "";
		
		Historia sm = new Historia("Sailor Moon: Battle for Earth");
		Decision ds = new Decision(true);
		
		Aliado moon = new Aliado("Usagi", "Moon", "Tiara Lunar ¡Acción!", "¡Curación Lunar, Acción!");
		Aliado mercury = new Aliado("Ami", "Mercury", "¡Burbujas de Mercurio, Estallen!", "¡Fulgor del Agua de Mercurio!");
		Aliado mars = new Aliado("Rei", "Mars", "¡Mandala Ardiente!", "¡Que los Demonios se Dispersen!");
		Aliado jupiter = new Aliado("Mako", "Jupiter", "¡Trueno de Júpiter, Resuena!", "¡Ataque de hojas de Roble de Júpiter!");
		Aliado venus = new Aliado("Mina", "Venus", "¡Rayo Creciente de Venus!", "¡Cadena del Amor de Venus!");
		
		//Enemigo eris = new Enemigo("Sailor Eris", "Eris", "¡Posesión fantasmal!", "¡Constelación del espectro de Eris!");
		//Enemigo ceres = new Enemigo("Sailor Ceres", "Ceres", "¡Ataque antigravedad!", "¡Vibración cósmica de Ceres!");
		//Enemigo humea = new Enemigo("Sailor Humea", "Humea", "¡Gotas envenenadas!", "¡Radiación tóxica de Humea!");
		Enemigo bmoon = new Enemigo("Nyx", "Dark Moon", "atk1", "atk2");
		
		String pGender = ds.eligirGenero();
		Jugador jugador = new Jugador("Player", pGender);
		
		if (pGender.equals("Male")) {
			player = "playerm.png";
			senshi = "earthm.png";
			fighter = "earthmfight.png";
		} else {
			player = "playerf.png";
			senshi = "earthf.png";
			fighter = "earthffight.png";
		}
		
		sm.Intro1(jugador, moon, mercury, mars, jupiter, venus);
		ds.Decision1(jugador, moon, mercury, mars, jupiter, venus);
		ds.tutorialDecision(jugador, moon, mercury, mars, jupiter, venus, player);

		while (nombre == null || nombre.length() < 2 || !nomAlfabetico(nombre)) {
            try {
                nombre = JOptionPane.showInputDialog("Cual es el nombre de tu personaje?");

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

		Personaje earth = new Personaje(nombre, "Earth", "¡Semillas de la Tierra, germinen!", "¡Ventiscas espirales de la Tierra!");
		
		sm.Intro2(earth, jugador, moon, mercury, mars, jupiter, venus);
		sm.Escena1(jugador, moon, mercury, mars, jupiter, venus, earth, ds.Decision2(jugador, moon, mercury, mars, jupiter, venus), player);
		sm.Escena2(jugador, moon, mercury, mars, jupiter, venus, bmoon, earth);
		ds.Decision3(jugador, moon, mercury, mars, jupiter, venus);
		sm.Escena3(jugador, moon, mercury, mars, jupiter, venus, earth, bmoon, senshi);
		
		JOptionPane.showMessageDialog(null, "Luna:\nElige una Sailor Guerrera para enfrentar a Nyx contigo.\nCada una tiene sus propios ataques.\nElige la mejor opción para enfrentarte a cada enemigo.",
				"Tutorial",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("selectsailor.png")));
		
		ds.batallaTutorial(earth, jugador, moon, mercury, mars, jupiter, venus, bmoon, ds.decidirBatalla(earth, moon, mercury, mars, jupiter, venus, bmoon, ds.eligirAtaque(earth, moon, mercury, mars, jupiter, venus, bmoon)));
		sm.Escena4(jugador, moon, mercury, mars, jupiter, venus, bmoon);
		sm.finDemo(moon, mercury, mars, jupiter, venus);
	}


	
	private static boolean nomAlfabetico(String nombre) {
        return nombre.matches("[a-zA-Z]+");
    }

}
