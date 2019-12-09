/*Desarrolla un programa que permita cargar 5 nombres de personas y sus edades respectivas, luego realizar la carga por teclado de
todos los datos, imprimir los nombres de las personas mayores de edad (>= 18 años)
  */
package vectorparalelo;
import java.util.Scanner;

public class VectorParalelo {
private Scanner teclado;
private String [] nombres;
private int [] edades;

    public void guardarDatos(){
        teclado = new Scanner(System.in);
        nombres = new String [5];
        edades = new int [5];
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.print((i+1)+". Ingrese nombre :");
            nombres[i]= teclado.next();
            
            System.out.print("Ingrese Edad :");
            edades[i] = teclado.nextInt();
            System.out.println(" ");            
        }
    }
    
    public void mayorEdad(){
        System.out.println("Personas mayores de edad :");
        for (int i = 0; i < nombres.length; i++) {
            if (edades[i] >= 18) {
                System.out.println(nombres[i]);
            }
            
        }
    }
    
    public static void main(String[] args) {
        VectorParalelo persona = new VectorParalelo();
        persona.guardarDatos();
        persona.mayorEdad();
    }
    
}
