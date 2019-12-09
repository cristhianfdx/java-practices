package silders;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.*;
import javax.swing.event.ChangeListener;

public class UsoSliders {

	public static void main(String[] args) {
		
		Ventana v1 = new Ventana();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class Ventana extends JFrame{
	
	public Ventana() {
		
		setBounds(200,200,500,350);		
		Panel panel_1 = new Panel();
		add(panel_1);
		
	}
}

class Panel extends JPanel{
	
	public Panel() {
		
		//String lista[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		JSpinner spinner= new JSpinner(new SpinnerNumberModel(5,0,10,1){//Calse interna anonima			

			public Object getNextValue() {
				return super.getPreviousValue();
			}
			
			public Object getPreviousValue() {
				return super.getNextValue();
			}			
		});
		
		Dimension d = new Dimension(150, 20);
		spinner.setPreferredSize(d);
		add(spinner);		
	}	
}




