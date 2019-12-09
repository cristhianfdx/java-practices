package abstractfactory;

public class Main {

	public static void main(String[] args) {
		FabricaAbstracta fabricaAbstracta = CreadorFabrica.getFabrica(false);		
		Forma forma = fabricaAbstracta.getForma("RECTANGULO");
		forma.dibujar();
		
		FabricaAbstracta fabricaAbstracta1 = CreadorFabrica.getFabrica(true);		
		Forma forma1 = fabricaAbstracta1.getForma("CIRCULO");
		forma1.dibujar();

	}

}
