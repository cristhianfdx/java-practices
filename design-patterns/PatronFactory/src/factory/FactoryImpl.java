package factory;

public class FactoryImpl implements Factory {

	public final static String AGUA = "agua";
	public final static String CAMPO = "campo";

	@Override
	public Moto crearMoto(String tipo, int ruedas) {
		switch (tipo) {
		case AGUA:
			return new MotoAgua(ruedas);
		case CAMPO:
			return new MotoCampo(ruedas);
		default:
			return null;
		}
	}

}
