
package paquete1;


public class Resta extends Operacion implements Interfaz {
    protected double resta;

    public Resta(double num1, double num2) {
        super(num1, num2); 
    }   

    @Override
    public void RealizarOperacion() {
        resta = num1 - num2;
        System.out.println("Resta :"+resta);
    }    
}
