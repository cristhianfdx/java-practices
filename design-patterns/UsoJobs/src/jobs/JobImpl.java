package jobs;

import steps.ClienteStepFactory;

public class JobImpl implements Job {

	private ClienteStepFactory clienteStepFactory;
	private String cliente;

	public JobImpl(Builder builder) {
		clienteStepFactory = builder.clienteStepFactory;
	}

	public static Builder newBuilder() {
		return new Builder();
	}

	@Override
	public String execute() {		
		return crearCliente();
	}

	private String crearCliente() {
		return clienteStepFactory.create(cliente).execute();
	}

	public static final class Builder {

		private ClienteStepFactory clienteStepFactory;
		private String cliente;

		private Builder() {
			super();
		}

		public Builder clienteStepFactory(ClienteStepFactory clienteStepFactory) {
			this.clienteStepFactory = clienteStepFactory;
			return this;
		}

		public Builder cliente(String cliente) {
			this.cliente = cliente;
			return this;
		}

		public JobImpl build() {
			return new JobImpl(this);
		}
	}
}
