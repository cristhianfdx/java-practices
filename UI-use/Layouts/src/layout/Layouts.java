package layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class Layouts {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Ventana extends JFrame{
	
	public Ventana() {
		setTitle("Layouts");
		setVisible(true);
		setBounds(500, 200, 600, 450);
		Panel panel = new Panel();
		Panel2 panel2 = new Panel2();	
		
		add(panel,BorderLayout.NORTH);
		
		add(panel2,BorderLayout.SOUTH);		
	}
}


class Panel extends JPanel{
	
	public Panel() {
		//setLayout(new FlowLayout(FlowLayout.CENTER,70,100));
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JButton("Amarillo"));
		add(new JButton("Azul"));		
	}
}

class Panel2 extends JPanel{
	
	public Panel2() {
		
		setLayout(new BorderLayout(10,10));
		
		add(new JButton("Rojo"),BorderLayout.WEST);
		add(new JButton("Verde"),BorderLayout.EAST);
		add(new JButton("Naranja"),BorderLayout.CENTER);
		
	}
	
}
