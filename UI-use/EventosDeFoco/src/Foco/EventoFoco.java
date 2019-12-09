package Foco;

import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

public class EventoFoco {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Ventana extends JFrame{
	
	public Ventana() {
		setVisible(true);
		setBounds(400,200,500,350);
		add(new Panel());
	}
}

class Panel extends JPanel{
	
	JTextField cuadro1;
	JTextField cuadro2;
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setLayout(null);//Invalida el layout para colocar los elementos dentro del panel donde yo desee
		cuadro1 = new JTextField();//Se instancia la clase JTextField para poder crear un campo de texto
		cuadro2 = new JTextField();
		
		cuadro1.setBounds(120,10,150,20);//Posicionar y dar tamaño en el panel
		cuadro2.setBounds(120,50,150,20);
		
		add(cuadro1);
		add(cuadro2);
		
		FocoO focus1 = new FocoO();
		cuadro1.addFocusListener(focus1);
	}
	
	private class FocoO implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			
			
		}

		@Override
		public void focusLost(FocusEvent e) {	
			
			//System.out.println("El cuadro 1 pierde el foco");
			
			String email = cuadro1.getText();//Capturar el texto al interior del cuadro
			boolean comprobacion = false;
			
			for (int i = 0; i < email.length(); i++) {
				
				if(email.charAt(i)== '@') {
					comprobacion = true;
				}				
			}
			
			if(comprobacion==true) {
				System.out.println("Email correcto");				
			}else {
				System.out.println("Email Incorrecto");
			}
			
		}		
	}
}

