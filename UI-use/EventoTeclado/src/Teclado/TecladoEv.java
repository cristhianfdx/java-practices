package Teclado;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TecladoEv {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Ventana extends JFrame{
	
	public Ventana() {
		setVisible(true);
		setBounds(400, 100, 600, 450);
		addKeyListener(new EventoT());;
		
	}
}

class EventoT implements KeyListener{
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		
		System.out.println(e.getKeyCode());
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		char letra = e.getKeyChar();
		
		System.out.println("La tecla pulsada es :"+" "+letra);
		
	}

	
	
}
