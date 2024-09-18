package ejercicio2;

public class HiloRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hilo hiloRunnable = new Hilo();
		Thread hilo1 = new Thread(hiloRunnable);
		hilo1.start();
		
		//Hilo hiloRunnable2 = new Hilo();
		Thread hilo2 = new Thread(hiloRunnable);
		hilo2.start();
		
		while(hilo1.isAlive() && hilo2.isAlive()) {
			System.out.println("Hilo 1 alive: " + hilo1.isAlive());
			System.out.println("Hilo 2 alive: " + hilo2.isAlive());
		}
		//System.out.println("hilo1 e hilo2 han terminado");				
				

	}

}
