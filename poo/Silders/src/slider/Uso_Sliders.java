package slider;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Uso_Sliders {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Ventana extends JFrame{
	
	public Ventana() {
		setBounds(300,200,600,450);
		Panel panel_1 = new Panel();
		add(panel_1);
	}
}

class Panel extends JPanel{
	
	public Panel() {
		
		JSlider control = new JSlider(0,100,50);
		control.setMajorTickSpacing(25);
		control.setMinorTickSpacing(5);		
		control.setPaintTicks(true);
		control.setFont(new Font("Serif", Font.ITALIC, 12));
		control.setPaintLabels(true);
		control.setSnapToTicks(true);
		add(control);
	}
}
