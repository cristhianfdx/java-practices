package transacciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Transaccion_Producto {

	public static void main(String[] args) {
		
Connection mi_conex = null;
		
		try {
			
			mi_conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			
			mi_conex.setAutoCommit(false);
			
			Statement mi_Statement = mi_conex.createStatement();
			
			String instruccionSQL_1 = "DELETE FROM PRODUCTOS WHERE PAISDEORIGEN = 'ITALIA' ";			
			String instruccionSQL_2 = "DELETE FROM PRODUCTOS WHERE PRECIO > 300";			
			String instruccionSQL_3 = "UPDATE PRODUCTOS SET PRECIO = PRECIO * 1.15";
			
			boolean ejecutar = ejecutarTransaccion();
			
			if(ejecutar) {
				
				mi_Statement.executeUpdate(instruccionSQL_1);
				mi_Statement.executeUpdate(instruccionSQL_2);			
				mi_Statement.executeUpdate(instruccionSQL_3);
				
				mi_conex.commit();	
				
				System.out.println("Transaccion correcta");
				
			}else {
				
				System.out.println("No se realizo ningun cambio en la Base de Datos");
			}
			
			
			
		}catch (Exception e) {
			
			try {
				mi_conex.rollback();
				System.out.println("Error no se realizo cambio en la BD");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}

	}
	
	public static boolean ejecutarTransaccion() {
		
		String ejecucion = JOptionPane.showInputDialog("Desea ejecutar la transaccion");
		
		if (ejecucion.equals("Si")) {
			
			return true;
		}else {
			
			return false;
			
		}		
	}
}
