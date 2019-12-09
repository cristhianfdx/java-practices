package modelo;
import java.sql.*;

public class Conexion {
	
	Connection mi_conexion = null;
	
	public Conexion() {
		
	}
	
	public Connection genConexion() {
		
		try {
			
			mi_conexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			
		} catch (Exception e) {
			
		}
		
		return mi_conexion;
	}
}
