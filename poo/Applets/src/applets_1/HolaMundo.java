package applets_1;

import javax.swing.*;

public class HolaMundo extends JApplet {
	
	@Override
	public void init() {
		
		JLabel mensaje = new JLabel("Hola Mundo");
		add(mensaje);
	}
}
