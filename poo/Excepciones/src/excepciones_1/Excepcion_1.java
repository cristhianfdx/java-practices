package excepciones_1;
import javax.swing.*;

public class Excepcion_1 {

	public static void main(String[] args) {
		
		int [] matriz = new int [5];
		
		matriz[0]=5;
		matriz[1]=38;
		matriz[2]=-15;
		matriz[3]=92;
		matriz[4]=71;
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println(" Posicion " + i +" = "+matriz[i]);
			
		}
		
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
		System.out.println(" Hola " + nombre + " Tienes "+ edad + "años"+ " El programa finalizo su ejecucion");

	}

}
