
package ClasesYObjetos;

public class ClasePoo {
    //Atributos
    String nombre;
    int edad;
    
    //Metodo
    public static void main (String [] args){
        
        ClasePoo ALUMNO = new ClasePoo();//Crear objeto "Tiene todos los atributos de la clase -ClasePoo-
        
        //Dando valores a los atributos
        ALUMNO.nombre = "Cristhian Forero";
        ALUMNO.edad = 28;
        
        System.out.println("EL nombre del alumno es:"+" "+ALUMNO.nombre);
        System.out.println("La edad del alumno es :"+" "+ALUMNO.edad);
        
        
        
        
    }
    
}
