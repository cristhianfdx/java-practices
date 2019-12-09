package emergente;
import javax.swing.*;


public class MenuEmergente {
	
	public static void main(String[] args) {
		
		Ventana v1 = new Ventana();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}

class Ventana extends JFrame{
	
	public Ventana() {
		
		setTitle("Menu emergente");
		setBounds(400, 200, 500, 350);
		add(new Panel());
	}
}

class Panel extends JPanel{
	
	public Panel() {
		
		JPopupMenu menu_emergente = new JPopupMenu();
		
		JMenuItem opcion1 = new JMenuItem("Opcion 1");
		JMenuItem opcion2 = new JMenuItem("Opcion 2");
		JMenuItem opcion3 = new JMenuItem("Opcion 3");		
		JMenuItem opcion4 = new JMenuItem("Opcion 4");		
				
		menu_emergente.add(opcion1);
		menu_emergente.add(opcion2);
		menu_emergente.add(opcion3);		
		menu_emergente.add(opcion4);		
				
		setComponentPopupMenu(menu_emergente);
		
	}
}
