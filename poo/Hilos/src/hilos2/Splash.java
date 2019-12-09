package hilos2;

import java.awt.Font;

import javax.swing.*;

public class Splash {

	public static void main(String[] args) {
		GenerarSplash g1 = new GenerarSplash();
		g1.setVisible(true);
		//g1.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);

	}

}

class GenerarSplash extends JDialog{
	
	private static final long serialVersionUID = 1L;
	
	private JLabel splashScreen;
	private JProgressBar barraP;
	private JLabel porcentaje,porcentaje2;
	
	public GenerarSplash() {
		iniciar();
		setSize(300, 150);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
	}
	
	public void iniciar() {
		
		splashScreen = new JLabel("Splash Screen");
		splashScreen.setFont(new Font("Tahoma",Font.PLAIN,18));
		splashScreen.setBounds(49,11,147,32);
		getContentPane().add(splashScreen);
		
		barraP = new JProgressBar();
		barraP.setBounds(26, 54, 229, 32);
		getContentPane().add(barraP);
		
		porcentaje = new JLabel("%0");
		porcentaje.setFont(new Font("Tahoma", Font.PLAIN, 14));
		porcentaje.setBounds(206, 23, 46, 14);
		getContentPane().add(porcentaje);
		
		porcentaje2 = new JLabel("%0");
		porcentaje2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		porcentaje2.setBounds(26, 97, 264, 14);
		getContentPane().add(porcentaje2);
		setUndecorated(true);
		iniciarHilo();
	}
	
	public void iniciarHilo() {
		
		Thread hilo = new Thread(new Runnable() {
		int x = 0;
		String cad=".";
			
			@Override
			public void run() {
				
			 try {
				 
				 while(x<100) {
					 barraP.setValue(x);
					 porcentaje.setText(x+"%");
					 porcentaje2.setText(cad+x+"%");
					 x+=2;
					 cad+=".";					 
					 Thread.sleep(100);
					 
					 if (x==100) {
						System.exit(0);
					}					 
				 }
				
			} catch (Exception e) {
				// TODO: handle exception
			}	
				
			}
		});
		
		hilo.start();
		
	}
	
}
