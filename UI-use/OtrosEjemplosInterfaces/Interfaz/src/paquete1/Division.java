
package paquete1;


public class Division extends Operacion implements Interfaz{
    
    protected double div;

    public Division(double num1, double num2) {
        super(num1, num2);       
    }  

    @Override
    public void RealizarOperacion() {
         div = (num1 / num2);
        System.out.println("Division :"+div);
    }
    
}
