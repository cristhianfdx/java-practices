package conectaBD;

import java.sql.*;


public class ConsultaPreparada {

	public static void main(String[] args) {
		
		
		
		try {
			
			//1- Establecer conexion con la BD
			
			Connection mi_conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			
			// preparar consulta
			
			PreparedStatement sentencia = mi_conexion.prepareStatement("SELECT * FROM PRODUCTOS WHERE SECCION=? AND PAISDEORIGEN=? ");
			
			//establecer sentencia
			
			sentencia.setString(1, "Deportes");
			sentencia.setString(2, "España");
			
			// ejecutar consulta 
			
			ResultSet rs = sentencia.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+" "+rs.getString(5));
			}
			rs.close();
			
		} catch (SQLException e) {
			
		}
		

	}

}
