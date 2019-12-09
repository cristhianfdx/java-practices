
package paquete1;


public class Operaciones {
    private int num1;
    private int num2;

    public int getNum1() {
        num1 = 3;        
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    
    public void sumar(){
        
        int suma = num1 +num2;
        
        System.out.println("La suma es :"+suma);
    }
    
}
