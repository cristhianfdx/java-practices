package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Uso_Buffers {

	public static void main(String[] args) {
		Leer_Fichero2 leerbuffer = new Leer_Fichero2();
		leerbuffer.leer();

	}

}

class Leer_Fichero2 {
	
	public void leer() {
		try {
			ubicacion = new FileReader("C:/Users/Cristhian Alexander/Desktop/prueba.txt");
			BufferedReader mibuffer = new BufferedReader(ubicacion);
			
			String linea = "";
			
			while (linea != null) {
				
				linea = mibuffer.readLine();
				
				if(linea !=null) {
				System.out.println(linea);
				}
			}
			ubicacion.close();
			
			
		} catch (IOException e) {			
			System.out.println("No se encuentra el archivo");
		}
		
	}
	
	//atributos
	FileReader ubicacion;
	
}
