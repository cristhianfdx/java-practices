package hilos2;

public class Hilos2_2 {

	public static void main(String[] args) {
	
		Thread h1 = new HiloEjemplo("Hilo 1");
		Thread h2 = new HiloEjemplo("Hilo 2");
		h1.start();
		h2.start();
		
		

	}

}

class HiloEjemplo extends Thread{
	
	public HiloEjemplo(String nombre) {
		super(nombre);
	}
	
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			if(getName().equalsIgnoreCase("Hilo 1")) {
				System.out.println(i+" "+getName()+"<---");
			}else {
				System.out.println(i+" "+getName()+"--->");
			}
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
}
