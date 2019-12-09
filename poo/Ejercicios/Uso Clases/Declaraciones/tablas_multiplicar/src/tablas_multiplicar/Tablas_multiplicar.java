/**/
package tablas_multiplicar;
import java.util.Scanner;

public class Tablas_multiplicar {
    
    public void IngresoValor(){
        Scanner leer = new Scanner(System.in);
        int num;
        
        do{
            System.out.print("Ingrese un valor : ");
            num = leer.nextInt();
            
            if (num != -1) {
                calcular(num);
                
            }
        }while (num!=-1);
    }
    
    public void calcular(int n){
        for (int i = n; i <= n*10; i=i+n) {
            System.out.println(i+" - ");
        }
    }
    
    
    public static void main(String[] args) {
        Tablas_multiplicar tabla;
        tabla = new Tablas_multiplicar();
        tabla.IngresoValor();
    }
    
}
