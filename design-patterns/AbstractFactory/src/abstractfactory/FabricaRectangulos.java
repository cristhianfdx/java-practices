package abstractfactory;

public class FabricaRectangulos extends FabricaAbstracta {

	@Override
	Forma getForma(String tipoForma) {
		if(tipoForma.equalsIgnoreCase("RECTANGULO")) {
			return new Rectangulo();
		}
		return null;
	}

}
