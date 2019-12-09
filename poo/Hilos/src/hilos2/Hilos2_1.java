package hilos2;
import java.util.*;
import java.awt.*;

public class Hilos2_1 {

	public static void main(String[] args) throws InterruptedException{
		Thread hilo1 = new Proceso_hilo("proceso_1");
		Thread hilo2 = new Proceso_hilo("proceso_2");
		
		hilo1.start();
		hilo1.join();		
		hilo2.start();
		hilo2.join();

	}

}

class Proceso_hilo extends Thread{

	public Proceso_hilo(String msg) {
		super(msg);
	}
	
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i+" "+this.getName());
		}
		
		System.out.println("Fin HILO");
		
	}
	
}
