package procesador;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;
import javax.swing.text.*;

public class ProcesadorTexto {
	
	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Ventana extends JFrame{
	
	
	
	public Ventana() {
		setTitle("Procesador de texto");
		setBounds(400, 300, 550, 400);
		add(new PanelPrincipal());
		
	}
	
}

class PanelPrincipal extends JPanel{
	
	private JTextPane cuadro;
	private JMenu fuente,estilo,tamano;
	
	public PanelPrincipal() {
		
		setLayout(new BorderLayout());
		
		JPanel panelSec = new JPanel();
		panelSec.setLayout(new FlowLayout());
		
		//---------------MENU----------------------------
		JMenuBar barra = new JMenuBar();
		
		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		tamano = new JMenu("Tamaño");
		//-------------JMenuItem--------------------------
		generarSubMenu("Arial","fuente","Arial",9,10);
		generarSubMenu("Verdana","fuente","Verdana",9,10);
		generarSubMenu("Courier","fuente","Courier",9,10);
		
		generarSubMenu("Negrita","estilo","",Font.BOLD,10);
		generarSubMenu("Cursiva","estilo","",Font.ITALIC,10);
		
		generarSubMenu("12","tamano","",9,12);
		generarSubMenu("16","tamano","",9,16);
		generarSubMenu("20","tamano","",9,20);
		generarSubMenu("26","tamano","",9,26);
		//--------------Agregar JMenu a la barra---------
		barra.add(fuente);
		barra.add(estilo);
		barra.add(tamano);
		//-----------------------------------------------
		panelSec.add(barra);//Se agrega barra de menu al panel correspondiente		
		add(panelSec,BorderLayout.NORTH);//se agrega el panel secundario al panel principal
		
		cuadro = new JTextPane();
		add(cuadro,BorderLayout.CENTER);
	}
	
	public void generarSubMenu(String item,String Emenu,String tipoLetra,int style,int tamLetra) {
		
		JMenuItem elementoMenu = new JMenuItem(item);
		
		if (Emenu == "fuente") {
			fuente.add(elementoMenu);
			
			if (tipoLetra=="Arial") {
				
				elementoMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambio_fuente", "Arial"));				
			}
			else if (tipoLetra=="Verdana") {
				
				elementoMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambio_fuente", "Verdana"));	
			}
			else if (tipoLetra=="Courier") {
				
				elementoMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambio_fuente", "Courier"));	
				
			}
		}
		else if (Emenu == "estilo") {
			estilo.add(elementoMenu);
			
			if (style == Font.BOLD) {
				
				elementoMenu.addActionListener(new StyledEditorKit.BoldAction());				
			}
			else if (style == Font.ITALIC) {
				
				elementoMenu.addActionListener(new StyledEditorKit.ItalicAction());
			}
		}
		else if (Emenu=="tamano") {
			tamano.add(elementoMenu);
			
			if (tamLetra==12) {
				
				elementoMenu.addActionListener(new StyledEditorKit.FontSizeAction("cambio_tamano", 12));
			}
			
			else if (tamLetra==16) {
				
				elementoMenu.addActionListener(new StyledEditorKit.FontSizeAction("cambio_tamano", 16));
			}
			
			else if (tamLetra==20) {
				
				elementoMenu.addActionListener(new StyledEditorKit.FontSizeAction("cambio_tamano", 20));
			}
			
			else if (tamLetra==26) {
				
				elementoMenu.addActionListener(new StyledEditorKit.FontSizeAction("cambio_tamano", 26));
			}
		}		
	}
}
