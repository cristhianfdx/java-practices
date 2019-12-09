package conectaBD;
import java.sql.*;

public class ConexBD {

	public static void main(String[] args) {
		
		try {
			
			//1- Establecer conexion con la BD
			
			Connection mi_conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			
			//2- crear objeto Statament			
			
			Statement ObjetoStatament = mi_conexion.createStatement();
			
			//3- Ejecutar instruccion SQl
			
			ResultSet mi_ResulSet = ObjetoStatament.executeQuery("SELECT * FROM PRODUCTOS");
			
			//4- recorrer o leer el ResulSet
			
			while (mi_ResulSet.next()) {
				
				System.out.println(mi_ResulSet.getString(1)+ " "+ mi_ResulSet.getString(2)+ " "
									+ mi_ResulSet.getString(3)+" "+ mi_ResulSet.getDouble("PRECIO")+
									" "+ mi_ResulSet.getDate(5));
				
			}
			
			
		} catch (Exception e) {
			
			System.out.println("Error :"+ e);
			
		}
	}
}
