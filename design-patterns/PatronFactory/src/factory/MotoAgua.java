package factory;

public class MotoAgua implements Moto {
	
	int ruedas;
	
	public MotoAgua(int ruedas) {
		this.ruedas = ruedas;
	}

	@Override
	public int getRuedas() {		
		return this.ruedas;
	}

}
