/*Leer 5 numeros por teclado, almacenarlos en un arreglo y a continuacion realizar el promedio de los numeros positivos, promedio
de numeros negativos y contar el numero de ceros ingresados*/
package arreglos_promedio;
import java.util.Scanner;
public class Arreglos_promedio {

   
    public static void main(String[] args) {
       Scanner entrada= new Scanner(System.in);
       float arreglo_num[] = new float[5];
       int contar_ceros = 0,contar_pos = 0,contar_neg = 0;
       float promedio_pos,promedio_neg,suma_pos = 0,suma_neg = 0;
       
        //Guardar numeros en el arreglo
        
        for (int i = 0; i < 5;i++){
            System.out.print("Ingrese el numero de la posicion"+" "+i+" "+"del arreglo :");
            arreglo_num[i]=entrada.nextFloat();
            
            if(arreglo_num[i] == 0){
                contar_ceros++;
                
            }
            if(arreglo_num[i] > 0){
                contar_pos++;
                suma_pos+=arreglo_num[i];
                
            }
            
            if (arreglo_num[i]<0){
                contar_neg++;
                suma_neg+=arreglo_num[i];
            }
                                              
                
        }
        if (contar_pos == 0){
                System.out.println("Error no se puede realizar el promedio de positivos");
            }else{
                 promedio_pos = suma_pos/contar_pos;
                  System.out.println("El promedio de postivos es: "+ promedio_pos);
            }
            
             if (contar_neg == 0){
                System.out.println("Error no se puede realizar el promedio de negativos");
            }else{
               promedio_neg = suma_neg/contar_neg;
               System.out.println("El promedio de negativos es: "+ promedio_neg);
            }
        
        
        System.out.println("El numero de ceros es: "+contar_ceros);
    }
    
}
