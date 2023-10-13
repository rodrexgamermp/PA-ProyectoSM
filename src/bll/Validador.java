package bll;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import dll.Aliado;
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
			JOptionPane.showMessageDialog(null, "query failed: " + e);
			return false;
		}	
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
		            } else if (nomRepetido(nombre)) {
	                    JOptionPane.showMessageDialog(
	                            null,
	                            "El nombre ya está en uso. Por favor, elija otro.",
	                            "Error",
	                            JOptionPane.ERROR_MESSAGE
	                    );
	                    nombre=null;
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
				JOptionPane.showMessageDialog(null, "query failed: " + e);
				return false;
			} 
	}
	
	private boolean nomRepetido(String nombre) {
	    try {
	        String sql = "SELECT COUNT(*) FROM `jugador` WHERE `nomJugador`=?";
	        fetch = cnx.prepareStatement(sql);
	        fetch.setString(1, nombre);
	        ResultSet resultados = fetch.executeQuery();
	        if (resultados.next()) {
	            int count = resultados.getInt(1);
	            return count > 0;
	        }
	    } catch (Exception e) {
	    	JOptionPane.showMessageDialog(null, "query failed: " + e);
	    }
	    return false;
	}
	
	public void arAltaAfinidad(Jugador jugador) {
		
		try {
            String sql = "INSERT INTO `afinidad`(`personaje`, `jugador`) VALUES (?,?)";
            fetch = cnx.prepareStatement(sql);
            
            int[] personajes = {3, 4, 5, 6};
            
            for (int personaje : personajes) {
                fetch.setInt(1, personaje);
                fetch.setInt(2, jugador.getId());
                fetch.executeUpdate();
            }
    		
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "query failed: " + e);
		}	
		
	}
	
	public void arModAfinidad(Jugador jugador, Aliado personaje) {
		try {
			int personajeId = 0;

			if (personaje.getPlaneta().equals("Mercury")) {
	            personajeId = 3;
	        } else if (personaje.getPlaneta().equals("Mars")) {
	            personajeId = 4;
	        } else if (personaje.getPlaneta().equals("Jupiter")) {
	            personajeId = 5;
	        } else if (personaje.getPlaneta().equals("Venus")) {
	            personajeId = 6;
	        }
			
	        String sql = "UPDATE `afinidad` SET `cantidad` = ? " +
	                     "WHERE `jugador` = ? AND `personaje` = ?";
	        fetch = cnx.prepareStatement(sql);
	        fetch.setInt(1, personaje.getAfinidad());
	        fetch.setInt(2, jugador.getId());
	        fetch.setInt(3, personajeId);
	        fetch.executeUpdate();
	    } catch (Exception e) {
	    	JOptionPane.showMessageDialog(null, "query failed: " + e);
	    }
	}
	
	public void arModKarma(Jugador jugador) {
		try {	
	        String sql = "UPDATE `jugador` SET `karma`=? WHERE idJugador=?";
	        fetch = cnx.prepareStatement(sql);
	        fetch.setInt(1, jugador.getKarma());
	        fetch.setInt(2, jugador.getId());
	        fetch.executeUpdate();
	    } catch (Exception e) {
	    	JOptionPane.showMessageDialog(null, "query failed: " + e);
	    }	
	}
	
	public LinkedList<Jugador> arCargarProgreso() {
		LinkedList<Jugador> jugadores = new LinkedList<Jugador>();
		String nombre = "", genero = "";
		int id = 0, gender = 0, karma = 0, progreso = 0;
		
		try {
			String sql = "SELECT * FROM `jugador`";
			fetch = cnx.prepareStatement(sql);
			ResultSet resultados  = fetch.executeQuery();
	    	while (resultados.next()) {
				id = resultados.getInt(1);
				nombre = resultados.getString(2);
				karma = resultados.getInt(3);
				gender = resultados.getInt(4);
				progreso = resultados.getInt(5);
	    	
	    	if (gender==1) {
	    		genero = "Male";
			} else {
				genero = "Female";
			}
	
	    	jugadores.add(new Jugador(id, nombre, genero, karma, progreso));
	    	
	    	}
	    	
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "query failed: " + e);
		}
		
		return jugadores;
	}

	public LinkedList<Aliado> arCargarAfinidad(Jugador jugador) {
	    LinkedList<Aliado> afinidades = new LinkedList<Aliado>();

	    try {
	        String sql = "SELECT a.cantidad, a.personaje FROM `afinidad` a " +
	                     "INNER JOIN `personaje` p ON a.personaje = p.idPersonaje " +
	                     "WHERE a.jugador = ?";
	        fetch = cnx.prepareStatement(sql);
	        fetch.setInt(1, jugador.getId());
	        ResultSet resultados = fetch.executeQuery();

	        while (resultados.next()) {
	            int cantidad = resultados.getInt(1);
	            int personajeId = resultados.getInt(2);

	            if (personajeId==3) {
	            	afinidades.add(new Aliado("Ami", "Mercury", "atk1", "atk2", cantidad));
				} else if (personajeId==4) {
					afinidades.add(new Aliado("Rei", "Mars", "atk1", "atk2", cantidad));
				} else if (personajeId==5) {
					afinidades.add(new Aliado("Mako", "Jupiter", "atk1", "atk2", cantidad));
				} else if (personajeId==6) {
					afinidades.add(new Aliado("Mina", "Venus", "atk1", "atk2", cantidad));
				}

	        }
	    } catch (Exception e) {
	    		JOptionPane.showMessageDialog(null, "query failed: " + e);
	    }

	    return afinidades;
	}
	
	public void arModProgreso(Jugador jugador) {
		try {	
	        String sql = "UPDATE `jugador` SET `progreso`=? WHERE idJugador=?";
	        fetch = cnx.prepareStatement(sql);
	        fetch.setInt(1, jugador.getProgreso());
	        fetch.setInt(2, jugador.getId());
	        fetch.executeUpdate();
	    } catch (Exception e) {
	    	JOptionPane.showMessageDialog(null, "query failed: " + e);
	    }	
	}
	
	public void arBajaJugador(LinkedList<Jugador> jugadores) {
			
		
	}
	
	private static boolean nomAlfabetico(String nombre) {
        return nombre.matches("[a-zA-Z]+");
    }

}
