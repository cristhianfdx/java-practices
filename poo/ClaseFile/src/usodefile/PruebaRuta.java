package usodefile;
import java.io.*;

public class PruebaRuta {

	public static void main(String[] args) {
		
		/*File archivo = new File("bin");
		System.out.println(archivo.getAbsolutePath());
		System.out.println(archivo.exists());*/
		
		File ruta = new File("C:"+File.separator+"Users"+File.separator+"Cristhian Alexander"+File.separator+"Desktop"+File.separator+"serializar");
		System.out.println(ruta.getAbsolutePath());
		String [] contenido = ruta.list();
		
		for(int i = 0 ;i< contenido.length;i++) {
			
			System.out.println(contenido[i]);
			
			File carpeta = new File(ruta.getAbsolutePath(),contenido[i]);
			
			if(carpeta.isDirectory()) {
				
				String [] subcarpeta = carpeta.list();
				
				for (int j = 0; j < subcarpeta.length; j++) {
					System.out.println(subcarpeta[j]);
				}
			}
			
			
			
		}
		
		

	}

}
