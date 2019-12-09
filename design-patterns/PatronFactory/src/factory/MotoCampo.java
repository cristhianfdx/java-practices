package factory;

public class MotoCampo implements Moto {

	int ruedas;

	public MotoCampo(int ruedas) {
		this.ruedas = ruedas;
	}

	@Override
	public int getRuedas() {		
		return this.ruedas;
	}

}
