package aplicacion_metaData;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.filechooser.*;


public class AplicacionUniversal {

	public static void main(String[] args) {
		
		Ventana v1 = new Ventana();
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v1.setVisible(true);
	}

}

class Ventana extends JFrame{
	
	public Ventana() {
		
		setBounds(300, 100, 700, 700);
		add(new Panel_Principal());
		
	}	
}

class Panel_Principal extends JPanel{
	
	private JComboBox comboTablas;
	private JTextArea areaInfo;
	private Connection mi_conex;
	private FileReader leer_archivo;
	
	public Panel_Principal() {
		
		setLayout(new BorderLayout());
		
		comboTablas = new JComboBox();
		comboTablas.setEditable(false);
		
		conectarBD();
		genTablas();
		
		comboTablas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String nom_tabla= (String)comboTablas.getSelectedItem();
				
				mostrarInfoTabla(nom_tabla);
				
			}
		});
		
		areaInfo = new JTextArea();
		
		add(areaInfo,BorderLayout.CENTER);
		add(comboTablas, BorderLayout.NORTH);		
	}
	
	public void conectarBD() {
		
		mi_conex = null;
		String datos [] = new String [3];
		String ruta;		
		
		try {			
			
			
			leer_archivo = new FileReader("D:/PROYECTOS/PROGRAMACION/CURSOS/JAVA/APLICACION METADATOS/datos_config.txt");
			
		}catch (IOException e) {
			
			JOptionPane.showMessageDialog(this, "Archivo incorrecto");
			
			JFileChooser buscar = new JFileChooser();
			
			FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo .txt", "txt");
			
			buscar.setFileFilter(filtro);		
			
			int returnVal = buscar.showOpenDialog(this);
			
			if (returnVal == JFileChooser.APPROVE_OPTION) {					
				
				try {
					leer_archivo = new FileReader(buscar.getSelectedFile().getAbsolutePath());
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}
			
		}
			try {
				
				BufferedReader mibuffer = new BufferedReader(leer_archivo);
				
				for (int i = 0; i < datos.length; i++) {
					
					datos[i] = mibuffer.readLine();
					
				}
				
				mi_conex = DriverManager.getConnection(datos[0], datos[1], datos[2]);
				
				leer_archivo.close();
				
			} catch (Exception e) {
				
			}			
		}
	
	public void genTablas() {
		
		ResultSet rs = null;
		
		try {
			
			DatabaseMetaData datos = mi_conex.getMetaData();
			
			rs = datos.getTables(null, null, null, null);
			
			while (rs.next()) {
				
				comboTablas.addItem(rs.getString("TABLE_NAME"));
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void mostrarInfoTabla(String tabla) {
		
		ArrayList<String> campos = new ArrayList<String>();
		
		String consulta ="SELECT * FROM "+ tabla;
		
		try {
			
			areaInfo.setText("");
			
			Statement mi_state = mi_conex.createStatement();
			
			ResultSet mi_rs = mi_state.executeQuery(consulta);
			
			ResultSetMetaData datos = mi_rs.getMetaData();
			
			for (int i = 1; i < datos.getColumnCount(); i++) {
				
				campos.add(datos.getColumnLabel(i));
				
			}
			
			while (mi_rs.next()) {
				
				for (String n_campo : campos) {
					
					areaInfo.append(mi_rs.getString(n_campo)+ " , ");
					
				}
				
				areaInfo.append("\n");
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}		
	}	
}
