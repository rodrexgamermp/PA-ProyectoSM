package bll;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import dll.Conexion;
import dll.Jugador;

public class Validador {
	
	Connection cnx = new Conexion().conectar();
	PreparedStatement fetch;
	ResultSet decode;
	
	public boolean arNuevoJugador(Jugador jugador) {
		int idGenerado = 0, generoElegido = 0;
		
		String[] generos = {"Chico", "Chica", "Lo que sea"};
		
		 int opGender = JOptionPane.showOptionDialog(
		            null,
		            "¿Quieres jugar como chico o chica?",
		            "Eligir genero",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.PLAIN_MESSAGE,
		            null,
		            generos,
		            generos[0]
		        );
		
		 if (opGender==0) {
			jugador.setGenero("Male");
			generoElegido = 1;
		} else if (opGender==1) {
			jugador.setGenero("Female");
			generoElegido = 2;
		} else {
			int decidir = (int) (Math.random() * 2);
			if (decidir==0) {
				jugador.setGenero("Male");
				generoElegido = 1;
			} else {
				jugador.setGenero("Female");
				generoElegido = 2;
			}
		}
		try {
            String sql = "INSERT INTO `jugador`(`genero`) VALUES (?)";
            fetch = cnx.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
    		fetch.setInt(1, generoElegido);
    		fetch.executeUpdate();
    		decode = fetch.getGeneratedKeys();
	    		if (decode.next()) {
	                idGenerado = decode.getInt(1);
	            }
	    		jugador.setId(idGenerado);
    		return true;
		} catch (Exception e) {
			return false;
		}
		
		//try catch nuevo progreso
	}
	
	public boolean arNombre(Jugador jugador) {
		String nombre = null;
		
		while (nombre == null || nombre.length() < 2 || nombre.length() > 20 || !nomAlfabetico(nombre)) {
		    try {
		        nombre = JOptionPane.showInputDialog("Cual es el nombre de tu personaje?");

		        if (nombre != null) {
		            if (nombre.length() < 2) {
		                JOptionPane.showMessageDialog(
		                        null,
		                        "El nombre debe contener al menos 2 caracteres alfabéticos.",
		                        "Error",
		                        JOptionPane.ERROR_MESSAGE
		                );
		            } else if (nombre.length() > 20) {
		                JOptionPane.showMessageDialog(
		                        null,
		                        "El nombre no debe tener más de 20 caracteres.",
		                        "Error",
		                        JOptionPane.ERROR_MESSAGE
		                );
		            } else if (!nomAlfabetico(nombre)) {
		                JOptionPane.showMessageDialog(
		                        null,
		                        "El nombre debe consistir solo en letras.",
		                        "Error",
		                        JOptionPane.ERROR_MESSAGE
		                );
		            }
		        }
		        jugador.setNombre(nombre);
		    } catch (Exception e) {
		        System.exit(0);
		    }
		}
			try {
	            String sql = "UPDATE `jugador` SET `nomJugador`=? WHERE `idJugador`=?";
	    		fetch = cnx.prepareStatement(sql);
	    		fetch.setString(1, jugador.getNombre());
	    		fetch.setInt(2, jugador.getId());
	    		fetch.executeUpdate();
	    		return true;
			} catch (Exception e) {
				return false;
			} 
	}
	
	public void arModProgreso(Jugador jugador, int acto, int seccion) {
		
	}
	
	public void arBajaJugador(Jugador jugador) {
		
	}
	
	private static boolean nomAlfabetico(String nombre) {
        return nombre.matches("[a-zA-Z]+");
    }

}
