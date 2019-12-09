package mipropiolayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.*;

public class LayoutPropio {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Ventana extends JFrame{
	
	public Ventana() {
		setTitle("Mi Layout");
		setBounds(300, 200,300, 250);
		add(new Panel());
	}
}

class Panel extends JPanel{
	
	public Panel() {
		
		setLayout(new MiLayout());
		
		JLabel nombre = new JLabel("Nombre:");
		JLabel apellido = new JLabel("Apellido:");
		JTextField c_nombre = new JTextField();
		JTextField c_apellido = new JTextField();		
		
		add(nombre);		
		add(c_nombre);
		add(apellido);
		add(c_apellido);
	}
	
}

class MiLayout implements LayoutManager{
	
	private int x = 20;
	private int y = 20;	
	
	@Override
	public void layoutContainer(Container micontenedor) {
		
		int contador = 0;//cuantos elementos llevamos agregados en un momento determinado
		int n = micontenedor.getComponentCount(); //cuantos elementos llevamos agregados en total
		
		for (int i = 0; i < n; i++) {
			
			contador++;
			Component c = micontenedor.getComponent(i);
			c.setBounds(x, y, 100, 20);
			x+=100;
			
			if(contador % 2 == 0) {
				x = 20;
				y += 40;
			}			
		}		
	}

	@Override
	public void addLayoutComponent(String name, Component comp) {
		
		
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		
		return null;
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		
		
	}
	
}