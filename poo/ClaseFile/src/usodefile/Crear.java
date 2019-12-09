package usodefile;

import java.io.*;

public class Crear {

	public static void main(String[] args) {
		
		File ruta = new File("C:"+File.separator+"Users"+File.separator+"Cristhian Alexander"+File.separator+"Desktop"+File.separator+"serializar"+File.separator+"probando.txt");
		//ruta.mkdirs();// crear carpeta
		
		String archivo_destino = ruta.getAbsolutePath();
		
		try {
			ruta.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		Escribiendo accede_es = new Escribiendo();
		accede_es.escribir(archivo_destino);
	}
}

class Escribiendo {
	
	public  void escribir(String ruta_archivo) {
		
		String frase = "Ejemplo de File";
		
		try {
			FileWriter escri = new FileWriter(ruta_archivo);
			
			for(int i =0 ; i <frase.length() ;i++) {
				
				escri.write(frase.charAt(i));
				
			}
			
			escri.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
}
