package modelo;
import java.sql.*;

public class EjecutarConsulta {	
	
	private Conexion mi_conex;
	private ResultSet rs ;
	PreparedStatement envia_consultaseccion;
	PreparedStatement envia_consultapais;
	PreparedStatement envia_consultaAmbos;
	private final String consulta_seccion="SELECT NOMBREARTICULO, PRECIO, SECCION, PAISDEORIGEN FROM PRODUCTOS WHERE SECCION =?";
	private final String consulta_paises="SELECT NOMBREARTICULO, PRECIO, SECCION, PAISDEORIGEN FROM PRODUCTOS WHERE PAISDEORIGEN =?";
	private final String consulta_ambos="SELECT NOMBREARTICULO, PRECIO, SECCION, PAISDEORIGEN FROM PRODUCTOS WHERE SECCION = ? AND PAISDEORIGEN =?";
	
	public EjecutarConsulta() {
		
		mi_conex = new Conexion();
		
	}
	
	public ResultSet filtraBD(String seccion, String pais){
		
		Connection conecta = mi_conex.genConexion();
		rs = null;
		
		try {
			
			if (!seccion.equals("Todos")&& pais.equals("Todos")) {
				
				envia_consultaseccion = conecta.prepareStatement(consulta_seccion);
				
				envia_consultaseccion.setString(1, seccion);
				
				rs = envia_consultaseccion.executeQuery();
				
				;
				
			}else if(seccion.equals("Todos")&& ! pais.equals("Todos")) {
				
				envia_consultapais = conecta.prepareStatement(consulta_paises);
				
				envia_consultapais.setString(1, pais);
				
				rs = envia_consultapais.executeQuery();	
				
				
			}else if (!seccion.equals("Todos")&& !pais.equals("Todos")) {
				
				envia_consultaAmbos = conecta.prepareStatement(consulta_ambos);
				
				envia_consultaAmbos.setString(1, seccion);
				
				envia_consultaAmbos.setString(2, pais);
				
				rs = envia_consultaAmbos.executeQuery();	
				
			}
		} catch (Exception e) {
			
		}
		
		
		return rs;
	}	
}
