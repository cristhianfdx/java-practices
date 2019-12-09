package checkbox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

public class MenuCheckBox {

	public static void main(String[] args) {
		
		Ventana v1 = new Ventana();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Ventana extends JFrame{
	
	public Ventana() {
		setTitle("Menu CheckBox");
		setBounds(400, 200, 550, 400);		
		add(new Panel());
	}
	
}

class Panel extends JPanel{
	
	public Panel() {
		
		setLayout(new BorderLayout());
		
		JMenuBar barra= new JMenuBar();
		
		JMenu archivo = new JMenu("Archivo");
		JMenu editar = new JMenu("Editar");
		JMenu opciones = new JMenu("Opciones");
		
		JCheckBoxMenuItem guardar = new JCheckBoxMenuItem("Guardar");
		JCheckBoxMenuItem guardar_como = new JCheckBoxMenuItem("Guardar como");
		
		ButtonGroup grupo = new ButtonGroup();
		JRadioButtonMenuItem copiar = new JRadioButtonMenuItem("Copiar",false);
		JRadioButtonMenuItem cortar= new JRadioButtonMenuItem("Cortar",false);
		
		archivo.add(guardar);
		archivo.add(guardar_como);
		
		grupo.add(copiar);
		grupo.add(cortar);
		editar.add(copiar);
		editar.add(cortar);
		
		barra.add(archivo);
		barra.add(editar);
		barra.add(opciones);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(new FlowLayout());
		panel_2.add(barra);
		
		add(panel_2,BorderLayout.NORTH);
		
	}
}