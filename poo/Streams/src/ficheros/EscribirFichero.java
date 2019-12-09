package ficheros;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {

	public static void main(String[] args) {
		Escribiendo es1 = new Escribiendo();
		es1.escribir();
	}
}

class Escribiendo{
	
	public void escribir() {
		
		String frase = "Esto es una prueba de escritura 2";
		
		try {
			
		FileWriter escribo = new FileWriter("C:/Users/Cristhian Alexander/Desktop/prueba1.txt",true);
		
		for (int i = 0; i < frase.length(); i++) {
			escribo.write(frase.charAt(i));
			
		}
		
		escribo.close();
				
		} catch (IOException e) {
			
			System.out.println("No se encuentra archivo");
		}
	}
}
