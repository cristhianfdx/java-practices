package hilos2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cronometro {

	public static void main(String[] args) {
		
		Ventana v1 = new Ventana();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}

class Ventana extends JFrame{	
	
	private static final long serialVersionUID = 1L;

	public Ventana(){
		
		setTitle("Cronometro");
		setSize(228, 120);
		setLocationRelativeTo(null);
		//Panel p1 = new Panel();
		add(new Panel());
	}	
	
}

class Panel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private JButton inicio,fin;
	static private boolean inicioHilo = true;
	static private boolean runHilo = false;
	JLabel Etime;
	static private int hora = 0,minuto = 0,segundo = 0;
	
	public Panel(){		
		
		Etime = new JLabel("00:00:00");
		Etime.setFont(new Font("Verdana",Font.PLAIN,30));
		add(Etime);
		
		JPanel panel2=new JPanel();
		inicio = new JButton("Inicio");
		fin = new JButton("Fin");
		
		inicio.addActionListener(new Eventos());
		fin.addActionListener(new Eventos());
		
		panel2.add(inicio);
		panel2.add(fin);
		
		add(panel2,BorderLayout.SOUTH);		
	}

	private class Eventos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==inicio) {
				if (runHilo == false) {
					inicioHilo=true;
					runHilo=true;
					iniciarHiloCrono();
				}				
			}
			else if(e.getSource()==fin) {
				runHilo = false;
				inicioHilo = false;
			}			
		}
		
		private void iniciarHiloCrono() {
			
			if (inicioHilo==true) {
				
				Runnable r = new HilosC(Etime);
				Thread t = new Thread(r);
				t.start();				
			}			
		}
	}
	
	private class HilosC implements Runnable{
		
		JLabel etiqueta;
		
		public HilosC(JLabel label) {
			this.etiqueta=label;
		}
		
		@Override
		public void run() {
			
			try {
				
				int x =0;
				
				while (Panel.inicioHilo) {
					Thread.sleep(1000);
					ejecutarCronometro(x);
					x++;					
				}
				
			} catch (Exception e) {
				
				System.out.println("excepcion en el hilo"+e);
			}			
		}
		
		public void ejecutarCronometro(int x) {
			System.out.println(Thread.currentThread().getName());
			Panel.segundo++;
			
			if(Panel.segundo>59) {
				Panel.segundo=0;
				Panel.minuto++;
				
				if (Panel.minuto>59) {
					Panel.minuto=0;
					Panel.hora++;
				}
			}
			
			String txtSeg = "";
			String txtMin = "";
			String txtHora = "";
			
			
			if(Panel.segundo<10) {
				txtSeg="0"+Panel.segundo;
			}else {
				txtSeg=""+Panel.segundo;
			}
			
			if(Panel.minuto<10) {
				txtMin="0"+Panel.minuto;
			}else {
				txtMin=""+Panel.minuto;
			}
			
			if(Panel.hora<10) {
				txtHora="0"+Panel.hora;
			}else {
				txtHora=""+Panel.hora;
			}
			
			String reloj = txtHora+":"+txtMin+":"+txtSeg;
			
			etiqueta.setText(reloj);
			
		}
		
	}
}






