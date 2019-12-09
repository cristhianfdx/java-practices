
package paquete1;


public class Suma extends Operacion implements Interfaz {
    
    protected double sumar;

    public Suma( double num1, double num2) {
        super(num1, num2);
        
    }

           

    @Override
    public void RealizarOperacion() {
        sumar = num1 + num2;
        System.out.println("Suma :"+sumar);
    }
    
    
    
    
    
}
