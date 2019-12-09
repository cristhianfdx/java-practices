package clasepropia;

public class ClaseGen <T> {

	private T primero;
	
	public ClaseGen() {
		primero = null;
	}
	
	public void setPrimero(T nuevo_valor) {
		primero = nuevo_valor;
	}
	
	public T getPrimero() {
		return primero;
	}

}
