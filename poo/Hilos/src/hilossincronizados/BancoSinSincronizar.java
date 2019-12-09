package hilossincronizados;

import java.util.concurrent.locks.*;


public class BancoSinSincronizar {

	public static void main(String[] args) {
		
		Banco b1 = new Banco();
		
		for (int i = 0; i < 100; i++) {
			
			EjecutarTransferencias r = new EjecutarTransferencias(b1, i, 2000);
			Thread t = new Thread(r);
			t.start();
			
		}
	}
}

class Banco{
	
	private final double[] cuentas;
	//private Lock cierre = new ReentrantLock();
	
	public Banco() {
		cuentas= new double[100];
		
		for (int i = 0; i < cuentas.length; i++) {
			
			cuentas[i] = 2000;
		}
	}
	
	public synchronized void transferencia(int cuentaOrigen,int cuentaDestino,double cantidad) throws InterruptedException {
		
		//cierre.lock();
		
		//try {
		
		/*if (cuentas[cuentaOrigen]<cantidad) {//evalua que el saldo no sea menor a la transferencia
			return;
		}*/
		
		while(cuentas[cuentaOrigen]<cantidad) {
			wait();
		}
		
		System.out.println(Thread.currentThread().getName());
		
		cuentas[cuentaOrigen] -= cantidad;//Dinero que sale de la cuenta origen
		
		System.out.printf("%10.2f de %d para %d",cantidad,cuentaOrigen,cuentaDestino);
		
		cuentas[cuentaDestino]+=cantidad;
		
		System.out.printf("  Saldo total : %10.2f %n",getsaldoTotal());
		
		notifyAll();
		/*}finally {
			
			//cierre.unlock();
		}*/
		
	}
	
	public double getsaldoTotal() {
		
		double sumaCuentas=0;
		
		for(double a:cuentas) {
			sumaCuentas+=a;
		}
		
		return sumaCuentas;
	}	
}

class EjecutarTransferencias implements Runnable{
	
	private Banco banco;
	private int de_cuenta;
	private double cantidad_max;
	
	public EjecutarTransferencias(Banco b, int cuentaO, double max ) {
		banco = b;
		de_cuenta= cuentaO ;
		cantidad_max = max;
	}

	@Override
	public void run() {
		
		try {
		while(true) {
			
			int destino = (int)(Math.random()*100);
			
			double cantidad = cantidad_max*Math.random();
			
			banco.transferencia(de_cuenta, destino, cantidad);
			
			Thread.sleep((int)Math.random()*10);
			
		}
		}catch (InterruptedException e) {
			
		}
	}	
}
