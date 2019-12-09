package leerbytes;
import java.io.*;

public class Leer_Escribir {

	public static void main(String[] args) {
		
		int contador = 0;
		int datos_in []=new int[52038];
		try {
			
			FileInputStream leer = new FileInputStream("C:/Users/Cristhian Alexander/Desktop/leerimagen/imagenA.jpg");
			boolean final_A = false;
			
			
			while (!final_A ) {
				
				int byte_entrada = leer.read();
				
				if (byte_entrada != -1)	{			
					datos_in[contador]=byte_entrada;					
				}
				else {
					final_A = true;	
				}		
				
				System.out.println(datos_in[contador]);
				contador++;
			}
			
			leer.close();
			
		} catch (IOException e) {}
		
		System.out.print("numero de bytes:"+contador);
		
		crearArchivo(datos_in);

	}
	
	public static void crearArchivo(int datos_nuevo_archivo[]) {
		try {
			
			FileOutputStream nuevo = new FileOutputStream("C:/Users/Cristhian Alexander/Desktop/leerimagen/imagenA_copia1.jpg");
			
			for(int i=0 ; i < datos_nuevo_archivo.length;i++) {
				nuevo.write(datos_nuevo_archivo[i]);
			}
			
			nuevo.close();
			
		} catch (IOException e) {}
	}

}
