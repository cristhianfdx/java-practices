package uso_metadatos;

import java.sql.*;

public class MetaRelativosBD {

	public static void main(String[] args) {
		
		mostrarInfo_BD();		

	}
	
	static void mostrarInfo_BD() {
		
		Connection mi_conexion = null;
		
		try {
			
			mi_conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			
			//Obtener Meta Datos
			
			DatabaseMetaData datos = mi_conexion.getMetaData();
			
			//Mostrar Informacion
			
			System.out.println("Gestor BD :"+" "+ datos.getDatabaseProductName());
			
			System.out.println("Version Gestor BD :"+" "+ datos.getDatabaseProductVersion());
			
			System.out.println("Driver de Conexion :"+" "+ datos.getDriverName());
			
			System.out.println("Version Driver de Conexion :"+" "+ datos.getDriverVersion());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				mi_conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
