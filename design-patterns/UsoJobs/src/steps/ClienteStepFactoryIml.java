package steps;

public class ClienteStepFactoryIml implements ClienteStepFactory {
	
	@Override
	public ClienteStep create(String nombre) {		
		return ClienteStepImpl.newBuilder()
				.cliente(nombre)
				.build();
	}

}
