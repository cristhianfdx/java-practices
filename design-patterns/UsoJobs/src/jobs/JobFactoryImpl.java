package jobs;

import steps.ClienteStepFactory;

public class JobFactoryImpl implements JobFactory {
	
	private ClienteStepFactory clienteStepFactory;
	
	@Override
	public Job create(String cliente) {		
		return JobImpl.newBuilder()
				.clienteStepFactory(clienteStepFactory)
				.cliente(cliente)
				.build();
	}

}
