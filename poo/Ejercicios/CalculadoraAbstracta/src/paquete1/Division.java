
package paquete1;


public class Division extends Operacion{

    public Division(double n1, double n2) {
        super(n1, n2);
    }

    @Override
    public void RealizaOPeracion() {
        res = n1 /n2;
        System.out.println("Division:"+res);
    }
    
    
}
