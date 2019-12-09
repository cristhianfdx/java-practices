package imagenesmenu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class MenuImagenes {
	
	public static void main(String[] args) {
		
		Ventana v1 = new Ventana();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}

class Ventana extends JFrame{
	
	public Ventana() {
		setBounds(300,200,550,400);
		setTitle("Menu con Imagenes");
		add(new PanelPrincipal());		
	}
}

class PanelPrincipal extends JPanel{
	
	public PanelPrincipal() {
		
		setLayout(new BorderLayout());		
		
		JMenuBar barra = new JMenuBar();
		//-----------------------------------------------------
		JMenu archivo = new JMenu("Archivo");
		
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardar_como = new JMenuItem("Guardar como");
		//------------------------------------------------------
		JMenu edicion = new JMenu("Edición");
		
		JMenuItem copiar = new JMenuItem("Copiar",new ImageIcon("src/iconos/copiar.gif"));
		JMenuItem cortar = new JMenuItem("Cortar",new ImageIcon("src/iconos/cortar.gif"));
		JMenuItem pegar = new JMenuItem("Pegar",new ImageIcon("src/iconos/pegar.gif"));
		
		JMenu opciones= new JMenu("Opciones");
		
		JMenuItem opcion_1 = new JMenuItem("Opcion 1");
		JMenuItem opcion_2 = new JMenuItem("Opcion 2");		
		//------------------------------------------------------
		JMenu herramientas = new JMenu("Herramientas");
		
		JMenuItem generales = new JMenuItem("Generales");
		//------------------------------------------------------				
		archivo.add(guardar);
		archivo.add(guardar_como);
		//------------------------------------------------------
		edicion.add(copiar);
		edicion.add(cortar);
		edicion.add(pegar);
		edicion.addSeparator();
		edicion.add(opciones);		
		opciones.add(opcion_1);
		opciones.add(opcion_2);
		//------------------------------------------------------
		herramientas.add(generales);
		//------------------------------------------------------
		barra.add(archivo);
		barra.add(edicion);
		barra.add(herramientas);		
		//------------------------------------------------------
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(new FlowLayout());
		
		panel_2.add(barra);
		
		add(panel_2,BorderLayout.NORTH);
	}
}
