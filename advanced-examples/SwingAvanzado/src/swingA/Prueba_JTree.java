package swingA;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.tree.*;

public class Prueba_JTree {

	public static void main(String[] args) {
		
		Ventana1 v1 = new Ventana1();
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v1.setVisible(true);

	}

}

class Ventana1 extends JFrame{
	
	public Ventana1() {
		
		setTitle("Arbol");
		setBounds(250, 200, 600, 600);
		
		DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Colombia");
		DefaultMutableTreeNode departamento = new DefaultMutableTreeNode("Cundinamarca");
		
		raiz.add(departamento);
		
		DefaultMutableTreeNode bogota = new DefaultMutableTreeNode("Bogota");
		
		departamento.add(bogota);
		
		DefaultMutableTreeNode suba = new DefaultMutableTreeNode("Suba");
		
		bogota.add(suba);
		
		DefaultMutableTreeNode bosa = new DefaultMutableTreeNode("Bosa");
		
		bogota.add(bosa);
		
		JTree arbol = new JTree(raiz);
		
		Panel p1 = new Panel(arbol);
		
		add(p1);
		
	}
	
}

class Panel extends JPanel{
	
	public Panel(JTree arbol) {
		
		setLayout(new BorderLayout());
		add(arbol,BorderLayout.NORTH);
	}
}
