package practica;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

import javax.swing.*;
import java.util.*;

public class Ventana extends JFrame {
	
	
	public Ventana() {
		setTitle("Prueba de diálogos con JOptionPane");
		setBounds(300, 200, 600, 450);
		
		JPanel panel_grid = new JPanel();		
		panel_grid.setLayout(new GridLayout(2, 3));
		
		//-------------------------------------------------------------------------------------------
		String box1 []  = {"Mensaje","Confirmar","Opcion","Entrada"};
		
		p_tipo = new PanelBotones("Tipo", box1);
		
		panel_grid.add(p_tipo);		
		add(panel_grid);
		//-----------------------------------------------------------------------------------------
		String box2 []  = {"ERROR_MESSAGE","INFORMATION_MESSAGE","WARNING_MESSAGE","QUESTION_MESSAGE","PLAIN_MESSAGE"};
		
		p_mensaje = new PanelBotones("Tipo de Mensaje",box2);
		
		panel_grid.add(p_mensaje);		
		add(panel_grid);
		
		//-----------------------------------------------------------------------------------------		
		String box3 []  = {"Cadena","Icono","Componente","Otros","Object []"};
				
		p_mensaje2 = new PanelBotones("Mensaje",box3);
				
		panel_grid.add(p_mensaje2);		
		add(panel_grid);
				
		//-----------------------------------------------------------------------------------------
		String box4 []  = {"DEFAULT_OPTION","YES_NO_OPTION","YES_NO_CANCEL_OPTION","OK_CANCEL_OPTION"};
		
		p_confirmar = new PanelBotones("Confirmar",box4);
				
		panel_grid.add(p_confirmar);		
		add(panel_grid);
				
		//-----------------------------------------------------------------------------------------
		String box5 []  = {"String[]","Icon[]","Object[]"};
		
		p_opcion = new PanelBotones("Opcion",box5);
				
		panel_grid.add(p_opcion);		
		add(panel_grid);
				
		//-----------------------------------------------------------------------------------------
		String box6 []  = {"Campo de texto","Combo"};
		
		p_entrada = new PanelBotones("Entrada",box6);
				
		panel_grid.add(p_entrada);		
		add(panel_grid);
		
		//-----------------------------------------------------------------------------------------
		
		//Panel inferior
		JPanel panelmostrar = new JPanel();
		JButton mostrar = new JButton("Mostar");
		
		mostrar.addActionListener(new AccionMostrar());
		
		panelmostrar.add(mostrar);
		add(panelmostrar,BorderLayout.SOUTH);
		
		add(panel_grid,BorderLayout.CENTER);
		
		
	}
	//-----------------------METODO-GENERA-TIPO-MENSAJE--------------------------------------------
	public int generaTipoMensaje() {
		
		String s = p_mensaje.capturarSeleccion();
		
		if(s.equals("ERROR_MESSAGE")) {
			return JOptionPane.ERROR_MESSAGE;
		}
		else if(s.equals("INFORMATION_MESSAGE")) {
			return JOptionPane.INFORMATION_MESSAGE;
		}
		else if (s.equals("QUESTION_MESSAGE")) {
			return JOptionPane.QUESTION_MESSAGE;
		}
		else if(s.equals("PLAIN_MESSAGE")) {
			return JOptionPane.PLAIN_MESSAGE;
		}
		else if(s.equals("WARNING_MESSAGE")) {
			return JOptionPane.WARNING_MESSAGE;
		}
		
		return 20;
	}
	//-----------------------METODO-GENERA-MENSAJE-ELEGIDO-----------------------------------------
	
	public Object generaMensaje() {
		
		String s = p_mensaje2.capturarSeleccion();
		
		if(s.equals("Cadena")) {
			return cadena;
		}
		else if(s.equals("Icono")) {
			return icono;
		}
		else if(s.equals("Componente")) {
			return componente;
		}
		else if(s.equals("Otros")) {
			return fecha;
		}
		else if(s.equals("Object []")) {
			return new Object[]{cadena,icono,componente,fecha};
		}
		return null;
	}	
	//---------------------------METODO-GENERA-TIPO-CONFIRMACION---------------------------------
	public int generaConfirmacion() {
		String s = p_confirmar.capturarSeleccion();
		
		if(s.equals("DEFAULT_OPTION")) {
			return JOptionPane.DEFAULT_OPTION;
		}
		else if(s.equals("YES_NO_OPTION")) {
			return JOptionPane.YES_NO_OPTION;
		}
		else if (s.equals("YES_NO_CANCEL_OPTION")) {	
			return JOptionPane.YES_NO_CANCEL_OPTION;
		}
		else if (s.equals("OK_CANCEL_OPTION")) {
			return JOptionPane.OK_CANCEL_OPTION;			
		}
		
		return 50;
	}
	//--------------------------METODO-GENERA-TIPO-OPCION---------------------------------------------------
	public Object [] generaTipoOpcion() {
		
		String s = p_opcion.capturarSeleccion();
		
		if(s.equals("String[]")) {
			return new String[] {"Amarillo","Azul","Rojo"};
		}
		else if (s.equals("Icon[]")) {
			return new Icon[] {new ImageIcon("src/practica/imagen/iconos/iconoamarillo.png"),new ImageIcon("src/practica/imagen/iconos/iconoazul.png"),new ImageIcon("src/practica/imagen/iconos/iconorojo.png")};
		}
		else if (s.equals("Object[]")) {
			return new Object[]{cadena,icono,componente,fecha};
		}
		
		return null;
	}
	//--------------------------METODO-GENERA-TIPO-ENTRADA--------------------------------------------------
	
	public Object[] generaTipoEntrada() {
		String s = p_entrada.capturarSeleccion();
		
		if(s.equals("Combo")) {
			return new String[] {"Amarillo","Azul","Rojo"};
		}
		return null;
	}
	
	//---------------------------EVENTOS--------------------------------------------------------------------
	private class AccionMostrar implements ActionListener{			
			

		@Override
		public void actionPerformed(ActionEvent e) {			
			
			if(p_tipo.capturarSeleccion().equals("Mensaje")) {
				
				JOptionPane.showMessageDialog(Ventana.this, generaMensaje(), "Titulo", generaTipoMensaje());				
			}
			else if(p_tipo.capturarSeleccion().equals("Confirmar")) {
				
				JOptionPane.showConfirmDialog(Ventana.this, generaMensaje(),"Titulo",generaConfirmacion(),generaTipoMensaje());
			}
			else if (p_tipo.capturarSeleccion().equals("Opcion")) {
				
				JOptionPane.showOptionDialog(Ventana.this, generaMensaje(), "titulo", generaConfirmacion(),generaTipoMensaje(),null,generaTipoOpcion(),null);
			}
			else if(p_tipo.capturarSeleccion().equals("Entrada")) {
				
				JOptionPane.showInputDialog(Ventana.this, generaMensaje(), "Titulo", generaTipoMensaje(),null,generaTipoEntrada(),null);
			}			
		}
	}
	//----------------------------------------------------------------------------------------------
	//-----------------------------ELEMENTO-TIPO-COMPONENTE-----------------------------------------
	private class Panel extends JPanel{		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D)g;
			Rectangle2D rectangulo = new Rectangle2D.Double(0,0,getWidth(),getHeight());
			g2.setPaint(new Color(0, 255,0));
			g2.fill(rectangulo);
		}
	}		
	//----------------------------------------------------------------------------------------------
	//Atributos Accion
	private Icon icono = new ImageIcon("src/practica/imagen/iconoA.png");
	private String cadena = "Probando cuadros JOPtionPane" ;
	private Component componente = new Panel();
	private Date fecha = new Date();		
	//----------------------------------------------------------------------------------------------
	//Atributos interfaz grafica
	private PanelBotones p_tipo,p_mensaje,p_mensaje2,p_confirmar,p_opcion,p_entrada;
	//----------------------------------------------------------------------------------------------

}


