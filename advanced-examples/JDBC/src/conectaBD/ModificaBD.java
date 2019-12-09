package conectaBD;
import java.sql.*;


public class ModificaBD {

	public static void main(String[] args) {
try {
			
			//1- Establecer conexion con la BD
			
			Connection mi_conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			
			//2- crear objeto Statament			
			
			Statement objetoStatament = mi_conexion.createStatement();
			
			String consultaSQL = "DELETE FROM PRODUCTOS WHERE CODIGOARTICULO = 'AR52'";
			
			// 3- EJECUTAR SQL
			
			objetoStatament.executeUpdate(consultaSQL);			
			
			
			
		} catch (Exception e) {
			
			System.out.println("Error :"+ e);
			
		}

	}

}
