package dll;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
	
	Connection cnx;

public Connection conectar() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectosm","root","");
		//JOptionPane.showMessageDialog(null, "System connected");
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "System failed: " + e);
	}
	return cnx;
	}
}