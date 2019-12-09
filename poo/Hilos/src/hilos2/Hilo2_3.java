package hilos2;

public class Hilo2_3 {

	public static void main(String[] args) {
		
		Runnable r = new Hilos();
		Runnable r1 = new Hilos();
		Thread t = new Thread(r);
		Thread t1 = new Thread(r1);
		t.start();
		t1.start();

	}

}

class Hilos implements Runnable{

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
		
		
	}
	
	
	
}
