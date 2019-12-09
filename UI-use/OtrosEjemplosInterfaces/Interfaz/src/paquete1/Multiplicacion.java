
package paquete1;


public class Multiplicacion extends Operacion implements Interfaz{
    
    protected double mult;

    public Multiplicacion( double num1, double num2) {
        super(num1, num2);
    }    

    @Override
    public void RealizarOperacion() {
        
         mult = num1 * num2;
        System.out.println("Multiplicacion :"+mult);
        
    }    
}
