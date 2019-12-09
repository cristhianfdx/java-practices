package box;

import java.awt.*;
import javax.swing.*;

public class DisposicionEnCaja {

	public static void main(String[] args) {
		
		Ventana v1 = new Ventana();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Ventana  extends JFrame{
	
	public Ventana() {
		
		setTitle("Disposicion en caja");
		setBounds(400, 200, 200, 200);
		JLabel nombre = new JLabel("Nombre:");
		JTextField text1 = new JTextField(10);
		text1.setMaximumSize(text1.getPreferredSize());
		
		Box cajaH1 = Box.createHorizontalBox();
		cajaH1.add(nombre);
		cajaH1.add(Box.createHorizontalStrut(10));
		cajaH1.add(text1);
		
		JLabel pass = new JLabel("Contraseña:");
		JPasswordField text2 = new JPasswordField(10);
		text2.setMaximumSize(text2.getPreferredSize());
		
		Box cajaH2 = Box.createHorizontalBox();
		cajaH2.add(pass);
		cajaH2.add(Box.createHorizontalStrut(10));
		cajaH2.add(text2);
		
		JButton btnOk = new JButton("OK");
		JButton btncancel = new JButton("Cancelar");
		
		Box cajaH3 = Box.createHorizontalBox();
		cajaH3.add(btnOk);		
		cajaH3.add(Box.createGlue());
		cajaH3.add(btncancel);		
		
		Box cajaV = Box.createVerticalBox();
		cajaV.add(cajaH1);
		//cajaV.add(Box.createVerticalStrut(20));
		cajaV.add(cajaH2);
		//cajaV.add(Box.createVerticalStrut(20));
		cajaV.add(cajaH3);
				
		add(cajaV);				
	}	
}
