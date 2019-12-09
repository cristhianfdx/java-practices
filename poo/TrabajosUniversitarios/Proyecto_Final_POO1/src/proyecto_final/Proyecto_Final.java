/*Arreglo Bidimensional de 4Xn 
 * fila1: contiene los factoriales de los numeros segun su numero de columna
 * fila2: lanzamiento parabolico
 * fila3: sucesión fibonacci
 * fila4: funcion seno*/
package proyecto_final;
import java.util.Scanner;
import java.math.*;

  public class Proyecto_Final {
             
    public static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int Num_columnas;
               
        Num_columnas = Ingreso_Columnas();
        Guardar_Datos(Num_columnas);
        
        
    }
    
    //Funcion que permite capturar por teclado el numero de columnas que desea el usuario
    public static int Ingreso_Columnas(){
        int N_columnas;
        System.out.print("Ingrese el numero de columnas para la matriz: ");
        N_columnas = leer.nextInt();
        
        while(N_columnas <= 0){
            System.out.println("Error en el dato ingresado");
            System.out.print("Ingrese el numero de columnas para la matriz: ");
            N_columnas = leer.nextInt(); 
        }
        System.out.println(" ");
        
       return N_columnas;
    }
    //Funcion que guarda los Factoriales en un arreglo
    public static void Guardar_Datos(int n){
        double arregloFac [];
        arregloFac = new double [n+1];
        
         double arregloSen [];
        arregloSen = new double [n+1];
        
         double arregloFib [];
        arregloFib = new double [n+1];
        
        int i = 1;
        int j = 1;
        int k = 1;
        int Numero;
                
        while(i <= n){
            Numero = i;
            arregloFac [i] = Generar_Factoriales(Numero);
            i++;
        }
        
        for ( i = 1; i <= n; i++) {
            System.out.print(String.format("[%.0f]", arregloFac[i]));
        }
        System.out.println(" ");
             
        while(k <= n){
            Numero = k;
            arregloFib [k] = Generar_Fibonacci(Numero);
            k++;
        }
        
        for (k = 1; k <=n; k++) {
           System.out.print(String.format("[%.0f]", arregloFib[k])); 
        }
         System.out.println(" ");
         
          while(j <= n){
            Numero = j;
            arregloSen[j] = Generar_Seno(Numero);
            j++;
        }
        for (j = 1; j <= n; j++) {
            System.out.print(String.format("[%.3f]", arregloSen[j]));
        }
        System.out.println(" ");
    }
    
   //Funcion que genera el Factorial de un numero n 
    public static double Generar_Factoriales(int num){
       
       double factorial = 1;
       
       while(num != 0){
           factorial = factorial * num;
           num--;           
       }       
       return factorial;
    }
    //Funcion que genera la funcion seno de un numero n
    public static double Generar_Seno(int n){
        double OpSeno = 0;
        
        for (int posicion = 1; posicion <= n; posicion++) {
            OpSeno = Math.sin(posicion*(3.141592654/180));
        }
        return OpSeno;
    }
    //Funcion que genera el enesimo termino de la sucesion fibonacci
    public static double Generar_Fibonacci(int n){
        double termino_1 = -1;
        double termino_2 = 1;
        double Serie = 0;
        
        for (int i = 1; i <= n; i++) {
            
            Serie = termino_1 + termino_2;
            
            termino_1 = termino_2;
            termino_2 = Serie;
        }
        
        return Serie;
    }
    
}