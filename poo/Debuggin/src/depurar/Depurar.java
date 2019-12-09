package depurar;
import javax.swing.JOptionPane;;

public class Depurar {

	public static void main(String[] args) {
		 int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de elementos del arreglo"));
		 int arreglo_aleatorios [] = new int [elementos];
		 
		 for (int i = 0; i < arreglo_aleatorios.length; i++) {
			 
			arreglo_aleatorios[i]= (int)(Math.random()*100);
						
		}
		 
		 for (int i : arreglo_aleatorios) {
			System.out.println(i);
		}

	}

}
