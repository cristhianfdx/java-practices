package usodefile;

import java.io.File;

public class Eliminar {

	public static void main(String[] args) {
		File ruta = new File("C:"+File.separator+"Users"+File.separator+"Cristhian Alexander"+File.separator+"Desktop"+File.separator+"serializar"+File.separator+"probando.txt");
		ruta.delete();
	}

}
