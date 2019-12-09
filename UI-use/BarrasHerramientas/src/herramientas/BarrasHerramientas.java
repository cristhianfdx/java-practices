package herramientas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BarrasHerramientas {

	public static void main(String[] args) {
		
		Ventana v1 = new Ventana();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Ventana extends JFrame{
	
	public Ventana () {
		setTitle("Barra de Herramientas");
		setBounds(400, 200, 550, 350);
		add(new Panel());
	}	
	
	private class Panel extends JPanel{
		
		public Panel () {
			
			setLayout(new BorderLayout());
			
			Acciones cAmarillo = new Acciones("Amarillo",new ImageIcon("src/imagenes/iconoamarillo.png"),Color.YELLOW);
			Acciones cAzul = new Acciones("Azul",new ImageIcon("src/imagenes/iconoazul.png"),Color.BLUE);
			Acciones cRojo = new Acciones("Rojo",new ImageIcon("src/imagenes/iconorojo.png"),Color.RED);		
			
			JMenuBar barra = new JMenuBar();
			
			JMenu menu = new JMenu("Color");
			
			menu.add(cAmarillo);
			menu.add(cAzul);			
			menu.add(cRojo);	
					
			barra.add(menu);
			
			setJMenuBar(barra);//metodo de la clase JFrame			
						
			JToolBar barraH = new JToolBar();
			
			barraH.add(cAmarillo);
			barraH.add(cAzul);
			barraH.addSeparator();//separador
			barraH.add(cRojo);
			
			add(barraH,BorderLayout.NORTH);			
		}
		
		private class Acciones extends AbstractAction{
			
			public Acciones(String nombre,Icon icono,Color colorB) {
				
				putValue(Action.SMALL_ICON,icono);
				putValue(Action.SHORT_DESCRIPTION, "Poner la ventana de color "+" "+nombre);
				putValue("color", colorB);
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Color c= (Color)getValue("color");
				setBackground(c);
				
			}
			
		}
	}
}


