package principal;

import javax.swing.*;
import vista.InterfazGrafica;

public class Ejecucion_MVC {

	public static void main(String[] args) {
		
		InterfazGrafica ventana = new InterfazGrafica();		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}
}
