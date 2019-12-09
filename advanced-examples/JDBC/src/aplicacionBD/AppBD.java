package aplicacionBD;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class AppBD {

	public static void main(String[] args) {
		
		Ventana v1= new Ventana();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Ventana extends JFrame{	
	
	private static final long serialVersionUID = 1L;
	
	private JTextArea campo_texto;
	private JComboBox combo_seccion, combo_paises;
	private JButton consulta;
	Connection mi_conex;
	
	private PreparedStatement envia_consultaSeccion;
	private final String consulta_seccion = "SELECT NOMBREARTICULO, PRECIO, SECCION, PAISDEORIGEN FROM PRODUCTOS WHERE SECCION =?";
	
	private PreparedStatement envia_consultapaises;
	private final String consulta_paises = "SELECT NOMBREARTICULO, PRECIO, SECCION, PAISDEORIGEN FROM PRODUCTOS WHERE PAISDEORIGEN=?";
	
	private PreparedStatement envia_consultaAmbos;
	private final String consulta_ambos = "SELECT NOMBREARTICULO, PRECIO, SECCION, PAISDEORIGEN FROM PRODUCTOS WHERE SECCION =? AND PAISDEORIGEN=?";
	
	public Ventana() {
		
		setTitle("Consulta BBDD");
		setBounds(200, 100, 350,320);
		
		JPanel panel_p = new JPanel();
		panel_p.setLayout(new BorderLayout());
		
		combo_seccion = new JComboBox();
		combo_seccion.setEditable(false);
		combo_seccion.addItem("Todos");
		
		combo_paises = new JComboBox();
		combo_paises.setEditable(false);
		combo_paises.addItem("Todos");
		
		JPanel panel_sec = new JPanel();
		
		panel_sec.add(combo_seccion);
		panel_sec.add(combo_paises);
		
		panel_p.add(panel_sec,BorderLayout.NORTH);
		
		campo_texto = new JTextArea(4,50);
		
		panel_p.add(campo_texto, BorderLayout.CENTER);
		
		
		JPanel panel_b = new JPanel();
		consulta = new JButton("Consulta");
		panel_b.add(consulta);		
				
		consulta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
								
				ejecutaConsulta();				
			}
		});
		
		
		panel_p.add(panel_b, BorderLayout.SOUTH);
		
		add(panel_p);
		
		//Conexion BD
		
		try {
			
			mi_conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			
			Statement objeto_sentencia = mi_conex.createStatement();
			
			//CARGAR COMBOBOX SECCIONES
			
			String consulta = "SELECT DISTINCTROW SECCION FROM PRODUCTOS";
			
			ResultSet rs = objeto_sentencia.executeQuery(consulta);
			
			while (rs.next()) {
				
				combo_seccion.addItem(rs.getString(1));
			}
			
			rs.close();
			
			//CARGAR COMBOBOX PAISES
			
			String consulta_2 = "SELECT DISTINCTROW PAISDEORIGEN FROM PRODUCTOS";
			
			rs = objeto_sentencia.executeQuery(consulta_2);
			
			while (rs.next()) {
				
				combo_paises.addItem(rs.getString(1));
			}
			
			rs.close();				
			
		} catch (Exception e) {
			
		}	
	}
	
	private void ejecutaConsulta() {
		
		ResultSet rs = null;
		
		try {
			
			campo_texto.setText("");
			
			String seccion = (String)combo_seccion.getSelectedItem();
			
			String paises = (String)combo_paises.getSelectedItem();
			
			if (!seccion.equals("Todos")&& paises.equals("Todos")) {
				
				envia_consultaSeccion = mi_conex.prepareStatement(consulta_seccion);
				
				envia_consultaSeccion.setString(1, seccion);
				
				rs = envia_consultaSeccion.executeQuery();
				
			}else if(seccion.equals("Todos")&& ! paises.equals("Todos")) {
				
				envia_consultapaises = mi_conex.prepareStatement(consulta_paises);
				
				envia_consultapaises.setString(1, paises);
				
				rs = envia_consultapaises.executeQuery();				
				
			}else if (!seccion.equals("Todos")&& !paises.equals("Todos")) {
				
				envia_consultaAmbos = mi_conex.prepareStatement(consulta_ambos);
				
				envia_consultaAmbos.setString(1, seccion);
				
				envia_consultaAmbos.setString(2, paises);
				
				rs = envia_consultaAmbos.executeQuery();	
				
			}
							
			
			
			while (rs.next()) {
				
				campo_texto.append(rs.getString(1));
				
				campo_texto.append(" , ");
				
				campo_texto.append(rs.getString(2));
				
				campo_texto.append(" , ");
				
				campo_texto.append(rs.getString(3));
				
				campo_texto.append(" , ");
				
				campo_texto.append(rs.getString(4));
				
				campo_texto.append("\n");
				
			}			
			
		} catch (Exception e) {
			
		}		
	}	
}


	



