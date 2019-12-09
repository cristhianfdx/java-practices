package metodogenerico;

public class MetodoGenerico {

	public static void main(String[] args) {
		
		String nombre []= {"Cristhian","Alexander","Chava"};
		
		String elementos = MisMatrices.getElementos(nombre);
		
		System.out.println(elementos);
		
		Integer numeros []= {1,2,3,4,5};
		
		System.out.println(MisMatrices.getElementos(numeros));

	}

}

class MisMatrices{
	
	public static <T> String getElementos(T [] arreglo) {		
		return "El array tiene "+ arreglo.length+" elementos";
	}
	
}
