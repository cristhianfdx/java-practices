package abstractfactory;

public class FabricaCirculos extends FabricaAbstracta {

	@Override
	Forma getForma(String tipoForma) {
		if(tipoForma.equalsIgnoreCase("CIRCULO")) {
			return new Circulo();
		}
		return null;
	}

}
