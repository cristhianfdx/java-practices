package procedimientos_almacenado;
import java.sql.*;
import javax.swing.JOptionPane;

public class Proc_parametros {

	public static void main(String[] args) {
		
		double nPrecio = Double.parseDouble(JOptionPane.showInputDialog("Introduce precio"));
		String n_articulo = JOptionPane.showInputDialog("Introduce nombre articulo");
		
		
		try {
			 Connection mi_conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			 
			 CallableStatement sentencia_pro = mi_conex.prepareCall("{CALL ACTUALIZAR_PROD (?,?)}"); 
			 
			 sentencia_pro.setDouble(1, nPrecio);
			 sentencia_pro.setString(2, n_articulo);
			 
			 sentencia_pro.executeQuery();
			 
			 System.out.println("Actualizacion ok");
			 
		} catch (Exception e) {
			
		}

	}

}
