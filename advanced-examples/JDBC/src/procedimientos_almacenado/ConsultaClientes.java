package procedimientos_almacenado;

import java.sql.*;

public class ConsultaClientes {

	public static void main(String[] args) {
		
		try {
			 Connection mi_conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			 
			 CallableStatement sentencia_pro = mi_conex.prepareCall("CALL MUESTRA_CLIENTES"); 
			 
			 ResultSet rs = sentencia_pro.executeQuery();
			 
			 while (rs.next()) {
				 
				 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
				
			}
			 rs.close();
			 
		} catch (Exception e) {
			
		}

	}

}
