package libre;
import javax.swing.*;

public class DisposicionLibre {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Ventana extends JFrame{
	
	public Ventana() {
		setTitle("Disposicion Libre");
		setBounds(300, 200, 600, 400);
		add(new Panel());		
	}
}

class Panel extends JPanel{
	
	public Panel() {
		
		setLayout(null);//Layout nulo disposcion libre
		
		JButton boton_1 = new JButton("Boton 1");
		boton_1.setBounds(500, 300, 120, 20);
		add(boton_1);		
	}
}
