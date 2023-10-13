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
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		String player = "", senshi = "", fighter = "";
		int opcion = 0;
		
		Connection cnx = new Conexion().conectar();
		Validador valid = new Validador();

		Historia sm = new Historia("Sailor Moon: Battle for Earth");
		Decision ds = new Decision(true);
		Jugador jugador = new Jugador(0, null, null, 0, 1);

		Personaje earth = new Personaje(null, "Earth", "¡Semillas de la Tierra, germinen!", "¡Ventiscas espirales de la Tierra!");
		Aliado moon = new Aliado("Usagi", "Moon", "Tiara Lunar ¡Acción!", "¡Curación Lunar, Acción!", 3);
		Aliado mercury = new Aliado("Ami", "Mercury", "¡Burbujas de Mercurio, Estallen!", "¡Fulgor del Agua de Mercurio!", 3);
		Aliado mars = new Aliado("Rei", "Mars", "¡Mandala Ardiente!", "¡Que los Demonios se Dispersen!", 3);
		Aliado jupiter = new Aliado("Mako", "Jupiter", "¡Trueno de Júpiter, Resuena!", "¡Ataque de hojas de Roble de Júpiter!", 3);
		Aliado venus = new Aliado("Mina", "Venus", "¡Rayo Creciente de Venus!", "¡Cadena del Amor de Venus!", 3);
		
		//Enemigo ceres = new Enemigo("Sailor Ceres", "Ceres", "¡Rocas afiladas de Ceres, dispersaos!", "¡Ondas gravitacionales de Ceres!");
		//Enemigo eris = new Enemigo("Sailor Eris", "Eris", "Estacas cristalinas de Eris, ¡congelad!", "¡Temible tormenta de nieve de Eris!");
		//Enemigo humea = new Enemigo("Sailor Humea", "Humea", "¡Ciclón perforador de Humea, devastación!", "¡Proyección astral de Humea!");
		Enemigo bmoon = new Enemigo("Nyx", "Dark Moon", "Eclipse anular, ¡manifiéstate!", "¡Ondas sonoras de la Luna Oscura!");
		
		//menu = new game, load game, biografia(proximamente), cambiar nombre, borrar usuario, salir
		
		String []menu= {"Nueva Partida" , "Cargar Partida", "Salir"};
		String []seguir= {"Vamos!" , "Descansar un poco."};
		
		opcion = JOptionPane.showOptionDialog(null, "Iniciar", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
		
		if (opcion==0) {
			valid.arNuevoJugador(jugador);
			valid.arAltaAfinidad(jugador);
		} else if (opcion==1) {
			LinkedList<Jugador> usuarios = valid.arCargarProgreso();
			String []partidas = new String[usuarios.size()];
			
			for (Jugador jugadores : usuarios) {
				partidas[usuarios.indexOf(jugadores)]=jugadores.getNombre();	
			}
			
			String cargarPartida = (String) JOptionPane.showInputDialog(
			        null,
			        "Elegir un jugador para cargar partida:",
			        "Cargar Partida",
			        JOptionPane.QUESTION_MESSAGE,
			        null,
			        partidas,
			        partidas[0]
			);
			
			for (Jugador jugadores : usuarios) {
				if (cargarPartida.equals(jugadores.getNombre())) {
					jugador.setId(jugadores.getId());
					jugador.setNombre(jugadores.getNombre());
					jugador.setGenero(jugadores.getGenero());
					jugador.setKarma(jugadores.getKarma());
					jugador.setProgreso(jugadores.getProgreso());
				}
			}
			
			LinkedList<Aliado> afinidades = valid.arCargarAfinidad(jugador);
			
			mercury.setAfinidad(afinidades.get(0).getAfinidad());
			mars.setAfinidad(afinidades.get(1).getAfinidad());
			jupiter.setAfinidad(afinidades.get(2).getAfinidad());
			venus.setAfinidad(afinidades.get(3).getAfinidad());
			
		} else {
			System.exit(0);
		}
		
		if (jugador.getGenero().equals("Male")) {
			player = "playerm.png";
			senshi = "earthm.png";
			fighter = "earthmfight.png";
		} else {
			player = "playerf.png";
			senshi = "earthf.png";
			fighter = "earthffight.png";
		}
		
		System.out.println(jugador.getId());
		System.out.println(jugador.getNombre());
		System.out.println(jugador.getGenero());
		System.out.println(jugador.getKarma());
		System.out.println(jugador.getProgreso());
		System.out.println(mercury.getAfinidad());
		System.out.println(mars.getAfinidad());
		System.out.println(jupiter.getAfinidad());
		System.out.println(venus.getAfinidad());
		
		switch (jugador.getProgreso()) {
		case 1: //Llegada al Parque Yoyogi
			sm.Intro1(jugador, moon, mercury, mars, jupiter, venus);
			ds.Decision1(jugador, moon, mercury, mars, jupiter, venus);
			ds.tutorialDecision(jugador, moon, mercury, mars, jupiter, venus, player);
			valid.arNombre(jugador);
			jugador.setProgreso(2);
			valid.arModProgreso(jugador);
		
		case 2: //Mina se presenta
			sm.Intro2(earth, jugador, moon, mercury, mars, jupiter, venus);		
			sm.Escena1(jugador, moon, mercury, mars, jupiter, venus, earth, ds.Decision2(jugador, moon, mercury, mars, jupiter, venus), player);
			jugador.setProgreso(3);
			valid.arModProgreso(jugador);

			opcion = JOptionPane.showOptionDialog(null, "Continuar?", "Proxima Seccion", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, seguir, seguir[0]);
			
			if (opcion==1) {
				System.exit(0);
			}
			
		case 3: //Llegada de Nyx
			sm.Escena2(jugador, moon, mercury, mars, jupiter, venus, bmoon, earth);
			ds.Decision3(jugador, moon, mercury, mars, jupiter, venus);
			jugador.setProgreso(4);
			valid.arModProgreso(jugador);
			
		case 4: //Surge Tuxedo Mask
			sm.Escena3(jugador, moon, mercury, mars, jupiter, venus, earth, bmoon, player, fighter);
			jugador.setProgreso(5);
			valid.arModProgreso(jugador);

		case 5: //Batalla Tutorial
			JOptionPane.showMessageDialog(null, "Luna:\nElige una Sailor Guerrera para enfrentar a Nyx contigo.\nCada una tiene sus propios ataques.\nElige la mejor opción para enfrentarte a cada enemigo.",
					"Tutorial",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("selectsailor.png")));			
			ds.batallaTutorial(earth, jugador, moon, mercury, mars, jupiter, venus, bmoon, ds.decidirBatalla(jugador, earth, moon, mercury, mars, jupiter, venus, bmoon, ds.eligirAtaque(earth, moon, mercury, mars, jupiter, venus, bmoon)));
			jugador.setProgreso(6);
			valid.arModProgreso(jugador);
			
		case 6: //Fin acto 0
			sm.Escena4(jugador, moon, mercury, mars, jupiter, venus, bmoon);
			
			//update seccion
			
			opcion = JOptionPane.showOptionDialog(null, "Continuar?", "Fin del acto 0", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, seguir, seguir[0]);
			
			if (opcion==1) {
				System.exit(0);
			}
		default:
			break;
		}
		


	}
}
