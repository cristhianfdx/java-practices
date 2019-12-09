package serializacion;
import java.io.*;
import java.util.*;

public class Serializacion {

	public static void main(String[] args) {
		
		Administrador jefe=new Administrador("Juan", 80000, 2005,12,15);
		
		jefe.setIncentivo(5000);
		
		
		Empleado[] personal=new Empleado[3];
		
		personal[0]=jefe;
		
		personal[1]=new Empleado("Ana", 25000, 2008, 10,1);
		
		personal[2]=new Empleado("Luis", 18000, 2012, 9,15);
		
		try {
			
			ObjectOutputStream escribiendo_objeto = new ObjectOutputStream(new FileOutputStream("C:/Users/Cristhian Alexander/Desktop/serializar/prueba.dat"));
			
			escribiendo_objeto.writeObject(personal);
			
			escribiendo_objeto.close();
			
			ObjectInputStream recuperando = new ObjectInputStream(new FileInputStream("C:/Users/Cristhian Alexander/Desktop/serializar/prueba.dat"));
			
			Empleado nuevoArray []= (Empleado[])recuperando.readObject();
			
			recuperando.close();
			
			for(Empleado e :nuevoArray) {
				
				System.out.println(e);
				
			}			
			recuperando.readObject();
			
		} catch (Exception e) {
			System.out.println("No hay archivo");
		}
	}

}

//-----------------------------------------------------------------------------------------------------------

class Empleado implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1859525275143132405L;

	public Empleado(String n, double s, int agno, int mes, int dia){
		
		nombre=n;
		
		sueldo=s;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);
		
		fechaContrato=calendario.getTime();
		
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	
	public void subirSueldo(double porcentaje){
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
		
	}
	
	public String toString(){
		
		return "El Nombre es =" + nombre + ",y su sueldo es =" + sueldo + ", fecha de contrato=" + fechaContrato;
		
	}

	private String nombre;
	
	private double sueldo;
	
	private Date fechaContrato;
	
}

//--------------------------------------------------------------------------------------------------------

class Administrador extends Empleado{
	

		/**
	 * 
	 */
	private static final long serialVersionUID = 1859525275143132405L;

		public Administrador(String n, double s, int agno, int mes, int dia){
			
			super(n,s,agno,mes,dia);
			
			incentivo=0;
			
		}
		
		public double getSueldo(){
			
			double sueldoBase=super.getSueldo();
			
			return sueldoBase + incentivo;
			
		}
		
		public void setIncentivo(double b){
			
			incentivo=b;
		}
		
		
		public String toString(){
			
			return super.toString() + " Incentivo=" + incentivo;
			
		}
	
		private double incentivo;
	
}
	

	
