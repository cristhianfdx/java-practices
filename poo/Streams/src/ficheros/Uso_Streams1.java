package ficheros;
import java.io.*;

public class Uso_Streams1 {

	public static void main(String[] args) {
		Leer_Fichero lee = new Leer_Fichero();
		lee.leer();

	}

}

class Leer_Fichero {
	
	public void leer() {
		try {
			ubicacion = new FileReader("C:/Users/Cristhian Alexander/Desktop/prueba.txt");
			int c = 0;
			
			while (c != -1) {
				c = ubicacion.read();
				char letra = (char)c;
				System.out.print(letra);				
			}
			ubicacion.close();
			
			
		} catch (IOException e) {			
			System.out.println("No se encuentra el archivo");
		}
		
	}
	
	//atributos
	FileReader ubicacion;
	
}
