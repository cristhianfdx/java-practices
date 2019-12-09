package abstractfactory;

public class CreadorFabrica {
	
	public static FabricaAbstracta getFabrica(boolean esRedondo) {
		
		if(esRedondo) {
			return new  FabricaCirculos();
		}else {
			return new FabricaRectangulos();
		}
		
	}

}
