package modelo;
import java.sql.*;

public class CargarCombos {
	
	public Conexion mi_conex;
	public ResultSet rs;
	public ResultSet rp;
	
	public CargarCombos() {
		
		mi_conex = new Conexion();
	}
	
	public String ejecutaConsulta() {
		
		Productos mi_producto = null;
		
		Connection accesoBD = mi_conex.genConexion();
		
		//Crear consulta
		
		try {
			
			Statement secciones = accesoBD.createStatement();
			Statement paises = accesoBD.createStatement();
			
			rs = secciones.executeQuery("SELECT DISTINCTROW SECCION FROM PRODUCTOS");
			rp = paises.executeQuery("SELECT DISTINCTROW PAISDEORIGEN FROM PRODUCTOS");
			
			mi_producto = new Productos();
			
			mi_producto.setSeccion(rs.getString(1));
			mi_producto.setSeccion(rp.getString(1));
						
			rs.close();
			rp.close();
			accesoBD.close();
			
		} catch (Exception e) {
			
		}
		
		return mi_producto.getSeccion();
		
	}

}
