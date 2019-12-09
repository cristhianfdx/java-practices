
package paquete1;


public class Multiplicacion extends Operacion{

    public Multiplicacion(double n1, double n2) {
        super(n1, n2);
    }

    @Override
    public void RealizaOPeracion() {
        res = n1*n2;
        System.out.println("Multiplicacion:"+res);
    }
    
}
