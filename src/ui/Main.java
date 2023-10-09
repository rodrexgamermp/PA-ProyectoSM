package ui;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import bll.Validador;
import dll.Aliado;
import dll.Conexion;
import dll.Decision;
import dll.Enemigo;
import dll.Historia;
import dll.Jugador;
import dll.Personaje;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) {
		String player = "", senshi = "", fighter = "";
		
		Connection cnx = new Conexion().conectar();
		Validador valid = new Validador();

		Historia sm = new Historia("Sailor Moon: Battle for Earth");
		Decision ds = new Decision(true);
		Jugador jugador = new Jugador(0, null, null);

		Personaje earth = new Personaje(null, "Earth", "¡Semillas de la Tierra, germinen!", "¡Ventiscas espirales de la Tierra!");
		Aliado moon = new Aliado("Usagi", "Moon", "Tiara Lunar ¡Acción!", "¡Curación Lunar, Acción!");
		Aliado mercury = new Aliado("Ami", "Mercury", "¡Burbujas de Mercurio, Estallen!", "¡Fulgor del Agua de Mercurio!");
		Aliado mars = new Aliado("Rei", "Mars", "¡Mandala Ardiente!", "¡Que los Demonios se Dispersen!");
		Aliado jupiter = new Aliado("Mako", "Jupiter", "¡Trueno de Júpiter, Resuena!", "¡Ataque de hojas de Roble de Júpiter!");
		Aliado venus = new Aliado("Mina", "Venus", "¡Rayo Creciente de Venus!", "¡Cadena del Amor de Venus!");
		
		//Enemigo ceres = new Enemigo("Sailor Ceres", "Ceres", "¡Ataque antigravedad!", "¡Vibración cósmica de Ceres!");
		//Enemigo eris = new Enemigo("Sailor Eris", "Eris", "¡Posesión fantasmal!", "¡Constelación del espectro de Eris!");
		//Enemigo humea = new Enemigo("Sailor Humea", "Humea", "¡Gotas envenenadas!", "¡Radiación tóxica de Humea!");
		Enemigo bmoon = new Enemigo("Nyx", "Dark Moon", "Eclipse anular, ¡manifiéstate!", "¡Ondas sonoras de la Luna Oscura!");
		
		//menu = new game, load game, biografia, borrar usuario, salir
		
		valid.arNuevoJugador(jugador);
		//nuevo progreso
		
		if (jugador.getGenero().equals("Male")) {
			player = "playerm.png";
			senshi = "earthm.png";
			fighter = "earthmfight.png";
		} else {
			player = "playerf.png";
			senshi = "earthf.png";
			fighter = "earthffight.png";
		}

		sm.Intro1(jugador, moon, mercury, mars, jupiter, venus);
		//update seccion
		ds.Decision1(jugador, moon, mercury, mars, jupiter, venus);
		//update decision
		//update afinidad
		ds.tutorialDecision(jugador, moon, mercury, mars, jupiter, venus, player);

		valid.arNombre(jugador);

		sm.Intro2(earth, jugador, moon, mercury, mars, jupiter, venus);
		
		/*
		sm.Escena1(jugador, moon, mercury, mars, jupiter, venus, earth, ds.Decision2(jugador, moon, mercury, mars, jupiter, venus), player);
		//update decision
		//update afinidad
		sm.Escena2(jugador, moon, mercury, mars, jupiter, venus, bmoon, earth);
		ds.Decision3(jugador, moon, mercury, mars, jupiter, venus);
		//update decision
		//update karma
		sm.Escena3(jugador, moon, mercury, mars, jupiter, venus, earth, bmoon, player, fighter);
		
		JOptionPane.showMessageDialog(null, "Luna:\nElige una Sailor Guerrera para enfrentar a Nyx contigo.\nCada una tiene sus propios ataques.\nElige la mejor opción para enfrentarte a cada enemigo.",
				"Tutorial",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("selectsailor.png")));
		
		ds.batallaTutorial(earth, jugador, moon, mercury, mars, jupiter, venus, bmoon, ds.decidirBatalla(earth, moon, mercury, mars, jupiter, venus, bmoon, ds.eligirAtaque(earth, moon, mercury, mars, jupiter, venus, bmoon)));
		//update decision
		//update afinidad
		sm.Escena4(jugador, moon, mercury, mars, jupiter, venus, bmoon);
		//update seccion
		//update acto
		*/

	}
}
