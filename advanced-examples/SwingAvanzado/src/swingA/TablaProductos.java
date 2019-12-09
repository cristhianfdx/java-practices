package swingA;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class TablaProductos {

	public static void main(String[] args) {
		
		VentanaTable vx = new VentanaTable();
		vx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vx.setVisible(true);

	}

}

class VentanaTable extends JFrame{
	
	private JComboBox nombresTabla;
	private DatabaseMetaData datosBD;
	private ResultSet rs;
	private Connection conex;
	private Statement sentencia;
	private GeneraTabla modelo;
	
	public VentanaTable() {
		
		setTitle("Tabla Productos");
		setBounds(250, 100, 800, 400);
		
		JPanel superior = new JPanel();
		
		nombresTabla = new JComboBox();		
		
		try {
			
			conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/cursosql", "root", "");
			
			datosBD = conex.getMetaData();
			
			rs = datosBD.getTables(null, null, null, null);
			
			while(rs.next()) {
				
				nombresTabla.addItem(rs.getString("TABLE_NAME"));
				
			}
			
		} catch (Exception e) {
			
		}
		
		nombresTabla.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String tabla_selec =(String)nombresTabla.getSelectedItem();
				
				String consulta = "SELECT * FROM "+ tabla_selec;
				
				try {
					sentencia= conex.createStatement();
					
					rs = sentencia.executeQuery(consulta);
					
					modelo = new GeneraTabla(rs);
					
					JTable tabla = new JTable(modelo);
					
					add(new JScrollPane(tabla));
					
					validate();
					
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}				
			}
		});
		
		superior.add(nombresTabla);
		
		add(superior,BorderLayout.NORTH);
		
	}
	
}

class GeneraTabla extends AbstractTableModel{
	
	private ResultSet rs_registro;
	private ResultSetMetaData rsData;
	
	public GeneraTabla(ResultSet rt) {
		
		rs_registro = rt;
		
		try {
			rsData = rs_registro.getMetaData();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}	

	@Override
	public int getColumnCount() {
		
		try {
			return rsData.getColumnCount();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int getRowCount() {
		
		try {
			 rs_registro.last();
			 
			 return rs_registro.getRow();
		} catch (Exception e) {
			return 0;
		}		
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		
		try {
			
			rs_registro.absolute(arg0+1);
			
			return rs_registro.getObject(arg1+1);
			
		} catch (Exception e) {
			
			return null;
		}		
	}
	
	public String getColumnName(int c) {
		
		try {
			
			return rsData.getColumnName(c+1);
			
		} catch (Exception e) {
			return null;
		}
		
		
	}
}
