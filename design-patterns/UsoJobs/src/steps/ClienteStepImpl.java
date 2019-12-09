package steps;

public class ClienteStepImpl implements ClienteStep {

	private String cliente;

	public ClienteStepImpl(Builder builder) {
		this.cliente = builder.cliente;
	}

	@Override
	public String execute() {
		return "Cliente creado: " + cliente;
	}

	public static Builder newBuilder() {
		return new Builder();
	}

	public static final class Builder {
		
		private String cliente;

		private Builder() {
			super();
		}

		public Builder cliente(String cliente) {
			this.cliente = cliente;
			return this;
		}

		public ClienteStepImpl build() {
			return new ClienteStepImpl(this);
		}
	}

}
