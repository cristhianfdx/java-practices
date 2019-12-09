package procesadortexto;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;

public class ProcesadorDeTextox {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Ventana extends JFrame{
	
	public Ventana () {
		setBounds(400, 200, 550, 400);
		Panel panel_1 = new Panel();
		add(panel_1);			
	}
}

class Panel extends JPanel{
	private JMenuBar barra;
	private JTextPane cuadro;
	private JMenu fuente,estilo,tamano;
	private Font letra;
		
	public Panel() {
		
		setLayout(new BorderLayout());
		
		JPanel panel_2= new JPanel();
		panel_2.setLayout(new FlowLayout());
		
		barra = new JMenuBar();
		
		//---------------MENU--------------------------
		fuente = new JMenu("Fuente");				
		estilo = new JMenu("Estilo");			
		tamano = new JMenu("Tamaño");
		//---------------------------------------------
		GenMenu("Arial", "Fuente", "Arial", 9, 10);
		GenMenu("Verdana", "Fuente", "Verdana", 9, 10);
		GenMenu("Courier", "Fuente", "Courier", 9, 10);
		
		GenMenu("Negrita", "Estilo", "", Font.BOLD, 10);
		GenMenu("Cursiva", "Estilo", "", Font.ITALIC, 10);
		
		GenMenu("12", "Tamaño", "", 9, 12);
		GenMenu("18", "Tamaño", "", 9, 18);
		GenMenu("20", "Tamaño", "", 9, 20);
		GenMenu("24", "Tamaño", "", 9, 24);		
		//---------------------------------------------		
		barra.add(fuente);
		barra.add(estilo);
		barra.add(tamano);		
		//-------------AGREGAR AL PANEL---------------		
		panel_2.add(barra);	
		
		add (panel_2,BorderLayout.NORTH);
		
		cuadro = new JTextPane();
		//JScrollPane panel_scroll = new JScrollPane(cuadro);		
		add(cuadro,BorderLayout.CENTER);
				
	}
	
	public void GenMenu(String marcaItem,String menu,String tipoLetra, int style,int tam) {
		
		JMenuItem elemento_menu = new JMenuItem(marcaItem);
		
		if(menu == "Fuente") {
			fuente.add(elemento_menu);
			
			if(tipoLetra=="Arial") {
				elemento_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiar_letra", "Arial"));
			}
			else if(tipoLetra=="Verdana") {
				elemento_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiar_letra", "Verdana"));
			}
			else if(tipoLetra=="Courier") {
				elemento_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiar_letra", "Courier"));
			}
		}
		else if(menu == "Estilo"){
			estilo.add(elemento_menu);
			if(style == Font.ITALIC) {
				
				elemento_menu.addActionListener(new StyledEditorKit.ItalicAction());
				
			}
			else if(style == Font.BOLD) {
				
				elemento_menu.addActionListener(new StyledEditorKit.BoldAction());
			}
			
		}
		else if (menu == "Tamaño") {
			tamano.add(elemento_menu);
			elemento_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambiar_tamano", tam));
		}		
	}	
}
