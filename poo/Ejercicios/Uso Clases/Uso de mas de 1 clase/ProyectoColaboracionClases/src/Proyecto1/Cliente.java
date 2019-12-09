/*

 */
package Proyecto1;


public class Cliente {
    //Atributos
  private String nombre;
  private int monto;
  
  //Constructor
  
  public Cliente(String nom){
      nombre = nom;
      monto = 0;
  }
  //Metodos
  public void depositar(int m){
      monto += m;
  }
  
  public void extraer(int m){
      monto -= m;
  }
  
  public int retornarMonto(){
      return monto;
  }
  
  public void imprimir(){
      System.out.println(nombre+" tiene depositado la suma de :"+ monto);
  }

    
}
