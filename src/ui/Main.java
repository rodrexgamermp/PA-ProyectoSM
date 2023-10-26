package ui;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import bll.Validador;
import dll.Aliado;
import dll.Batalla;
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
		int opcion = 10;
		
		Connection cnx = new Conexion().conectar();
		Validador valid = new Validador();

		Historia sm = new Historia("Sailor Moon: Battle for Earth");
		Decision ds = new Decision(true);
		Batalla bt = new Batalla(0);
		Jugador jugador = new Jugador(0, null, null, 0, 1);

		Personaje earth = new Personaje(null, "Earth", "¡Semillas de la Tierra, germinen!", "¡Ventiscas espirales de la Tierra!");
		Aliado moon = new Aliado("Usagi", "Moon", "Tiara Lunar ¡Acción!", "¡Curación Lunar, Acción!", 3);
		Aliado mercury = new Aliado("Ami", "Mercury", "¡Burbujas Congelantes de Mercurio, Estallen!", "¡Fulgor del Agua de Mercurio!", 3);
		Aliado mars = new Aliado("Rei", "Mars", "¡Mandala Ardiente!", "¡Que los Demonios se Dispersen!", 3);
		Aliado jupiter = new Aliado("Mako", "Jupiter", "¡Trueno de Júpiter, Resuena!", "¡Ataque de hojas de Roble de Júpiter!", 3);
		Aliado venus = new Aliado("Mina", "Venus", "¡Rayo Creciente de Venus!", "¡Cadena del Amor de Venus!", 3);
		
		Enemigo ceres = new Enemigo("Sailor Ceres", "Ceres", "¡Rocas afiladas de Ceres, dispersaos!", "¡Ondas gravitacionales de Ceres!", 2, "Enemigo", 0);
		Enemigo eris = new Enemigo("Sailor Eris", "Eris", "Estacas cristalinas de Eris, ¡congelad!", "¡Aurora Resplandeciente de Eris!", 2, "Enemigo", 0);
		Enemigo humea = new Enemigo("Sailor Haumea", "Humea", "¡Ciclón perforador de Humea, devastación!", "¡Proyección astral de Humea!", 3, "Enemigo", 0);
		Enemigo dmoon = new Enemigo("Nyx", "Dark Moon", "Eclipse anular, ¡manifiéstate!", "¡Ondas sonoras de la Luna Oscura!", 4, "Enemigo", 0);
		
		String []menu= {"Nueva Partida" , "Cargar Partida", "Cambiar Nombre", "Borrar Usuario", "Salir"};
		String []confirmacion= {"Si", "No"};
		
		do {

			opcion = JOptionPane.showOptionDialog(null, "Iniciar", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
			
			if (opcion==0) {
				valid.arNuevoJugador(jugador);
				valid.arAltaAfinidad(jugador);
				
			} else if (opcion==1) {
				cargarJugador(jugador, valid);
				cargarAfinidad(jugador, valid, mercury, mars, jupiter, venus);
				cargarEnemigos(jugador, valid, ceres, eris, humea, dmoon);
	
			} else if (opcion==2) {
				cargarJugador(jugador, valid);			
				if (valid.arNombre(jugador)) {
					JOptionPane.showMessageDialog(null, "Nombre actualizado!");
				}
				opcion = 10;
				
			} else if (opcion==3) {
				cargarJugador(jugador, valid);	
				opcion = JOptionPane.showOptionDialog(null, "Estás seguro?", "Borrar usuario", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, confirmacion, confirmacion[0]);
				if (opcion==0 && valid.arBajaJugador(jugador)) {
					JOptionPane.showMessageDialog(null, "Usuario borrado!");
				} else {
					JOptionPane.showMessageDialog(null, "El usuario no se borró.");
				}
				opcion = 10;
				
			} else {
				System.exit(0);
			}
		
		} while (opcion==10);
		
		if (jugador.getGenero().equals("Male")) {
			player = "playerm.png";
			senshi = "earthm.png";
			fighter = "earthmfight.png";
		} else {
			player = "playerf.png";
			senshi = "earthf.png";
			fighter = "earthffight.png";
		}
		
		System.out.println("ID: " + jugador.getId());
		System.out.println("NAME: " + jugador.getNombre());
		System.out.println("GENDER: " + jugador.getGenero());
		System.out.println("KARMA: " + jugador.getKarma());
		System.out.println("CHECKPOINT: " + jugador.getProgreso());
		System.out.println("☿: " + mercury.getAfinidad());
		System.out.println("♂: " + mars.getAfinidad());
		System.out.println("♃: " + jupiter.getAfinidad());
		System.out.println("♀: " + venus.getAfinidad());
		System.out.println("Ceres: S-" + ceres.getSalud() + " A-" + ceres.getConfianza() + " C-" + ceres.getCondicion());
		System.out.println("Eris: S-" + eris.getSalud() + " A-" + eris.getConfianza() + " C-" + eris.getCondicion());
		System.out.println("Humea: S-" + humea.getSalud() + " A-" + humea.getConfianza() + " C-" + humea.getCondicion());
		System.out.println("Dark Moon: S-" + dmoon.getSalud() + " A-" + dmoon.getConfianza() + " C-" + dmoon.getCondicion());
		
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
	
				opcion = JOptionPane.showOptionDialog(null, "Continuar?", "Proxima Seccion", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, confirmacion, confirmacion[0]);
				
				if (opcion==1) {
					System.exit(0);
				}
				
			case 3: //Llegada de Nyx
				sm.Escena2(jugador, moon, mercury, mars, jupiter, venus, dmoon, earth);
				ds.Decision3(jugador, moon, mercury, mars, jupiter, venus);
				jugador.setProgreso(4);
				valid.arModProgreso(jugador);
				
			case 4: //Surge Tuxedo Mask
				sm.Escena3(jugador, moon, mercury, mars, jupiter, venus, earth, dmoon, player, fighter);
				jugador.setProgreso(5);
				valid.arModProgreso(jugador);
	
			case 5: //Batalla Tutorial
				moon.transformarse(true); mercury.transformarse(true); mars.transformarse(true); jupiter.transformarse(true); venus.transformarse(true);
				JOptionPane.showMessageDialog(null, "Luna:\nElige una Sailor Guerrera para enfrentar\na Nyx contigo. Cada una tiene sus propios\nataques. Elige la mejor opción para\nenfrentarte a cada enemigo.", "Tutorial",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("selectsailor.png")));							
				bt.tutorial(earth, jugador, moon, mercury, mars, jupiter, venus, dmoon, bt.definirGanador(dmoon, dmoon.usarPoder((int) (Math.random() * 2)), bt.eligirAtaque(mercury, mars, jupiter, venus)));
				jugador.setProgreso(6);
				valid.arModProgreso(jugador);
				//dowhile nas proximas batalhas
				
			case 6: //Fin acto 0
				sm.Escena4(jugador, moon, mercury, mars, jupiter, venus, earth, dmoon);
				jugador.setProgreso(6);
				valid.arModProgreso(jugador);	
				opcion = JOptionPane.showOptionDialog(null, "Continuar?", "Fin del acto 0", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, confirmacion, confirmacion[0]);
				if (opcion==1) {
					System.exit(0);
				}
		default:
			break;
		}
		


	}
	
	private static void cargarJugador(Jugador jugador, Validador valid) {
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
	}
	
	private static void cargarAfinidad(Jugador jugador, Validador valid, Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus) {
		LinkedList<Aliado> afinidades = valid.arCargarAfinidad(jugador);
		
		mercury.setAfinidad(afinidades.get(0).getAfinidad());
		mars.setAfinidad(afinidades.get(1).getAfinidad());
		jupiter.setAfinidad(afinidades.get(2).getAfinidad());
		venus.setAfinidad(afinidades.get(3).getAfinidad());
	}
	
	private static void cargarEnemigos(Jugador jugador, Validador valid, Enemigo ceres, Enemigo eris, Enemigo humea, Enemigo dmoon) {
		LinkedList<Enemigo> enemigos = valid.arCargarEnemigos(jugador);
		
		ceres.setConfianza(enemigos.get(0).getConfianza());
		ceres.setSalud(enemigos.get(0).getSalud());
		ceres.setCondicion(enemigos.get(0).getCondicion());
		
		eris.setConfianza(enemigos.get(1).getConfianza());
		eris.setSalud(enemigos.get(1).getSalud());
		eris.setCondicion(enemigos.get(1).getCondicion());
		
		humea.setConfianza(enemigos.get(2).getConfianza());
		humea.setSalud(enemigos.get(2).getSalud());
		humea.setCondicion(enemigos.get(2).getCondicion());
		
		dmoon.setConfianza(enemigos.get(3).getConfianza());
		dmoon.setSalud(enemigos.get(3).getSalud());
		dmoon.setCondicion(enemigos.get(3).getCondicion());	
	}
}
