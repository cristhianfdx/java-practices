package focoventana;

import java.awt.event.*;

import javax.swing.*;

public class FocoVent extends JFrame implements WindowFocusListener {
	
	FocoVent ventana1;
	FocoVent ventana2;

	public static void main(String[] args) {
		FocoVent v = new FocoVent();		
		v.iniciar();

	}
	
	public void iniciar() {
		
		ventana1 = new FocoVent();
		ventana2 = new FocoVent();
		
		ventana1.setVisible(true);
		ventana1.setBounds(50, 100, 600, 350);
		ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ventana2.setVisible(true);
		ventana2.setBounds(700, 100, 600, 350);
		ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ventana1.addWindowFocusListener(this);
		ventana2.addWindowFocusListener(this);
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		
		if(e.getSource()== ventana1) {
			ventana1.setTitle("Tengo el foco");
		}else {
			ventana2.setTitle("Tengo el foco");
		}
		
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		if(e.getSource()== ventana1) {
			ventana1.setTitle(" ");
		}else {
			ventana2.setTitle(" ");
		}
		
	}

}
