package uso_metadatos;


import java.sql.*;

public class MetaResultados {

	public static void main(String[] args) {
		
		
		mostrarInfoTabla();

	}	
	
	static void mostrarInfoTabla() {
		
		Connection mi_conexion = null;
		ResultSet rs = null;
		
		try {
			
			mi_conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			
			//Obtener Meta Datos
			
			DatabaseMetaData datos = mi_conexion.getMetaData();
			
			//Mostrar Informacion Tablas
			
			System.out.println("Lista de Tablas");
			
			rs = datos.getTables(null, null, null, null);
			
			while(rs.next()) {
				
				System.out.println(rs.getString("TABLE_NAME"));
				
			}
			
			//Lista de columnas
			
			System.out.println("");
			
			System.out.println("Campos de Productos");
			
			
			rs = datos.getColumns(null, null, "productos", null);
			
			while(rs.next()) {
				
				System.out.println(rs.getString("COLUMN_NAME"));
				
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			
			try {
				mi_conexion.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
}
