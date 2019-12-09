
package paquete1;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static Scanner leer = new Scanner(System.in);
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    
    public static void main(String[] args) {
       //Llenar poligono
       LlenarPoligono();
       
       //Mostrar datos
       Mostrar();      
       
    }
    
    public static void LlenarPoligono(){
        int opcion;
        char respuesta;
        
        do{
            System.out.println("Digite que poligono desea :");
            System.out.println("1. Triangulo");
            System.out.println("2. Rectangulo");
            System.out.print("Opcion :");
            opcion = leer.nextInt();
            while(opcion <1 || opcion >2){
            System.out.print("Opcion :");
            opcion = leer.nextInt();
            }
            
            switch(opcion){
                case 1://Lenar Triangulo
                    LlenarTriangulo();
                    break;
                case 2://Llenar rectangulo
                    LlenarRectangulo();
                    break;
            }
            
            System.out.print("Desea ingresar otro poligono ...(s/n):");
            respuesta = leer.next().charAt(0);
        }while(respuesta == 's' || respuesta =='S' );
    }
    
    public static void LlenarTriangulo(){
        double lado1,lado2,lado3;
        System.out.print("Digite el lado 1 del triangulo:");
        lado1=leer.nextDouble();
        System.out.print("Digite el lado 2 del triangulo:");
        lado2=leer.nextDouble();
        System.out.print("Digite el lado 3 del triangulo:");
        lado3=leer.nextDouble();
        
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        //Guardamos un triangulo dentro del arreglo de poligonos
        poligono.add(triangulo);
    }
    
    public static void LlenarRectangulo(){
        double lado1,lado2;
        System.out.print("Digite el lado 1 del rectangulo:");
        lado1=leer.nextDouble();
        System.out.print("Digite el lado 2 del rectangulo:");
        lado2=leer.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        
        poligono.add(rectangulo);
        
    }
    
    public static void Mostrar(){
        for(Poligono poli :poligono){
            System.out.println(poli.toString());
            System.out.println("Area:"+poli.area());
            System.out.println("");
        }
    }
}
