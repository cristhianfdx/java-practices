package slider;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class Ejemplo_Slider {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Ventana extends JFrame{
	
	public Ventana() {
		
		setBounds(400, 200, 600, 400);
		Lamina lamina_1 = new Lamina();
		add(lamina_1);
		
	}
}

class Lamina extends JPanel{
	
	private JLabel rotulo;
	private JSlider deslizador;
		
	public Lamina(){
		
		setLayout(new BorderLayout());
		rotulo = new JLabel("Probado Sliders en Java ");
		add(rotulo,BorderLayout.CENTER);
		
		deslizador = new JSlider(8,56,12);
		
		deslizador.setMajorTickSpacing(16);
		deslizador.setMinorTickSpacing(2);		
		deslizador.setPaintLabels(true);
		deslizador.setFont(new Font("Verdana",Font.ITALIC,12));
		deslizador.setPaintTicks(true);
		deslizador.setSnapToTicks(true);
		
		deslizador.addChangeListener(new EventoSlider());
		
		JPanel panel_slider = new JPanel();
		
		panel_slider.add(deslizador);
		
		
		add(panel_slider, BorderLayout.NORTH);
		
	}
	
	private class EventoSlider implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			
			rotulo.setFont(new Font("Verdana",Font.PLAIN,deslizador.getValue()));
		}
		
	}
}
