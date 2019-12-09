/*Problema 1
Se tiene la siguiente informacion:
- Nombres de 4 empleados
- Ingresos en concepto de sueldo, cobrado por cada empleado, en los ultimos 3 meses.

Crear un programa para:
- Realizar el ingreso de la informacion mencionada
- Hacer un vector que contenga el ingreso acumulado en sueldos en los utlimos 3 meses para cada empleado
- Mostrar en pantalla el total pagado en sueldos a todos los empleados en los ultimos 3 meses
 */
package problema1;
import java.util.Scanner;
public class Problema1 {
    private Scanner leer;
    private String [] empleados;
    private int [][] sueldos;
    private int [] sueldostotal;
    
    public void ingreso(){
        leer = new Scanner(System.in);
        empleados = new String[4];
        sueldos = new int [4][3];
        System.out.println("Ingreso de datos\n");
        //Ingreso simultaneo de datos
        for (int i = 0; i < 4; i++) {
            System.out.print("["+i+"]"+"Ingrese nombre de empleado :");
            empleados[i] = leer.next();
            for (int j = 0; j < 3; j++) {
                System.out.print("["+i+"]"+"["+j+"]"+"Ingrese sueldo :");
                sueldos [i][j] = leer.nextInt();
            }
        }
    }
    
    public void Sumasueldos(){
        sueldostotal = new int [4];
        for (int i = 0; i < 4; i++) {
            int suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += sueldos[i][j];
            }
            sueldostotal[i] = suma;
        }
    }
    
    public void TotalEmpleado(){
        System.out.println("Total de sueldos por empleado :");
        for (int i = 0; i < sueldostotal.length; i++) {
            System.out.println(empleados[i]+" : "+sueldostotal[i]);
        }
    }
    
    public static void main(String[] args) {
        Problema1 matriz = new Problema1();
        
        matriz.ingreso();
        matriz.Sumasueldos();
        matriz.TotalEmpleado();
    }
    
}
