package multiple;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class EventosMult {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		v1.setVisible(true);
	}
}

class Ventana extends JFrame{
	
	public Ventana() {
		
		setBounds(300, 100, 600, 450);
		
		add(new Panel());		
	}
}

class Panel extends JPanel{
	
	public Panel() {
		
				
		Oyente AcAmarillo = new Oyente("Amarillo", new ImageIcon("src/multiple/iconoamarillo.png"), Color.YELLOW);
		Oyente AcAzul = new Oyente("Azul", new ImageIcon("src/multiple/iconoazul.png"), Color.BLUE);
		Oyente AcRojo = new Oyente("Rojo", new ImageIcon("src/multiple/iconorojo.png"), Color.RED);
		
		add(new JButton(AcAmarillo));
		add(new JButton(AcAzul));
		add(new JButton(AcRojo));
		
		InputMap mapaIn= getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);//se crea un mapa
		
		KeyStroke teclaAm = KeyStroke.getKeyStroke("ctrl A");//se crea combinacion de teclas
		mapaIn.put(teclaAm, "fondoAm");//Asignar combinacion de teclas al objeto
		ActionMap mapaAccion = getActionMap();
		mapaAccion.put("fondoAm", AcAmarillo);//Asignar objeto a la accion
		
		KeyStroke teclaAz = KeyStroke.getKeyStroke("ctrl S");//se crea combinacion de teclas
		mapaIn.put(teclaAz, "fondoAz");//Asignar combinacion de teclas al objeto
		ActionMap mapaAccion2 = getActionMap();
		mapaAccion2.put("fondoAz", AcAzul);//Asignar objeto a la accion
		
		KeyStroke teclaRj = KeyStroke.getKeyStroke("ctrl D");//se crea combinacion de teclas
		mapaIn.put(teclaRj, "fondoRj");//Asignar combinacion de teclas al objeto
		ActionMap mapaAccion3 = getActionMap();
		mapaAccion3.put("fondoRj", AcRojo);//Asignar objeto a la accion
		
		
		
	}	
	private class Oyente extends AbstractAction{
		
		public Oyente(String nombre,Icon ic,Color colorBoton) {
			
			putValue(Action.NAME, nombre);//agregar el nombre del boton
			putValue(Action.SMALL_ICON, ic);//agregar icono al boton
			putValue(Action.SHORT_DESCRIPTION, "poner la ventana de color "+" "+nombre);
			putValue("color_fondo", colorBoton);				
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			Color c = (Color)getValue("color_fondo");
			setBackground(c);
			
		}	
	}
}


