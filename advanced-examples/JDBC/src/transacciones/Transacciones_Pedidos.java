package transacciones;

import java.sql.*;

public class Transacciones_Pedidos {
	
	

	public static void main(String[] args) {
		
		Connection mi_conex = null;
		
		try {
			
			mi_conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			
			mi_conex.setAutoCommit(false);
			
			Statement mi_Statement = mi_conex.createStatement();
			
			String instruccionSQL_1 = "INSERT INTO CLIENTES (CODIGOCLIENTE, EMPRESA, DIRECCION) VALUES ('CT84', 'EJEMPLO', 'P BOTANICO')";
			
			mi_Statement.executeUpdate(instruccionSQL_1);
			
			String instruccionSQL_2 = "INSERT INTO PEDIDOS (NUMERODEPEDIDO, CODIGOCLIENTE, FECHADEPEDIDO) VALUES ('82', 'CT84', '11/03/2000')";
			
			mi_Statement.executeUpdate(instruccionSQL_2);
			
			mi_conex.commit();
			
			System.out.println("DATOS INGRESADOS CORRECTAMENTE");
			
			
		} catch (Exception e) {
			
			try {
				mi_conex.rollback();				
				
				System.out.println("ERROR EN LA INSERCION DE DATOS :");
				
			} catch (SQLException e1) {	
				
				
				e1.printStackTrace();
			}		
		}
	}
}
