package factory;

public class Main {

	public static void main(String[] args) {
		String tipoMoto = "campo";
		int numRuedas = 2;
		
		Factory factory = new FactoryImpl();
		Moto moto = factory.crearMoto(tipoMoto, numRuedas);
		System.out.println("Es una moto de "+ moto.getRuedas() + " ruedas");

	}

}
