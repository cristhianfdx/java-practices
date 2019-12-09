/*
 Crear un programa que pèrmita guardar los nombres de 5 operarios y sus sueldos respectivos, imprimir el sueldo mayor y el nombre del
operario
 */
package vector2;
import java.util.Scanner;


public class Vector2 {
    private Scanner teclado;
    private String nombres [];
    private float sueldos [];
    
    public void IngresoDatos(){
        teclado = new Scanner(System.in);
        nombres = new String [5];
        sueldos = new float [5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print(String.format("Ingrese el nombre del operario # %d :", i+1));
            nombres [i] = teclado.next();
            System.out.print("Ingrese el sueldo :");
            sueldos[i] = teclado.nextInt();
            System.out.println(" ");
                    
        }
    }
    
    public void SueldoMayor(){
        float mayor = sueldos[0];
        int pos = 0;
        
        for (int i = 0; i < 5; i++) {
            if (sueldos[i] > mayor) {
                mayor = sueldos[i];
                pos = i;
            }
        }
        System.out.print(String.format("El empleado con el sueldo mayor es : %s\n", nombres[pos]));
        System.out.print(String.format("Tiene un sueldo de : %.2f", mayor));
    }
    
    public static void main(String[] args) {
        Vector2 operario = new Vector2();
        operario.IngresoDatos();
        operario.SueldoMayor();
    }
    
}
