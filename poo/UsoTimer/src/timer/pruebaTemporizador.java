package timer;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;


public class pruebaTemporizador {

	public static void main(String[] args) {
		
		
		DameHora oyente = new DameHora();//se invoca la clase oyente
		Timer miTimer = new Timer(5000,oyente);//se instacia la clase Timer que permite relaizar retardos en la ejecuacion de un porgrama
		//Parametros tiempo en ms, activa un ActionEvent cada 5 s
		miTimer.start();
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		System.exit(0);
	}
}

class DameHora implements ActionListener{//Clase oyente

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Date ahora = new Date();//Se innstancia la clase Date, que proporcional la fecha y hora actual
		System.out.println("La hora cada 5 seg es:"+" "+ahora);
	}
	
}
