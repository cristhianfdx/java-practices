package hilossincronizados;



public class Hilo1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		HilosVarios h1 = new HilosVarios("Hilo 1");
		HilosVarios h2 = new HilosVarios("Hilo 2");
		
		h1.start();
		h1.join();
		h2.start();
		h2.join();
	}

}

class HilosVarios extends Thread{
	
	public HilosVarios(String msg) {
		super(msg);
	}
	
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Ejecutando "+getName());
		}
	}
	
}
