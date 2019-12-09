package practica;

import javax.swing.*;

public class PanelBotones extends JPanel {
	
	private ButtonGroup grupo;
	
	public PanelBotones(String titulo,String [] opciones) {
		
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		grupo = new ButtonGroup();
		
		for (int i = 0; i < opciones.length; i++) {
			
			JRadioButton r_boton = new JRadioButton(opciones [i]);
			
			r_boton.setActionCommand(opciones[i]);
			
			add(r_boton);
			
			grupo.add(r_boton);
			
			r_boton.setSelected(i==0);
		}
		
	}
	
	public String capturarSeleccion() {
		
		ButtonModel botonSel = grupo.getSelection();		
		String nombre_boton = botonSel.getActionCommand();
		
		return nombre_boton;		
	}

}
