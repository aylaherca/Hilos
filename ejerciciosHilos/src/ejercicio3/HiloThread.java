package ejercicio3;

public class HiloThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hilo hilo1 = new Hilo();
		hilo1.start();

		Hilo hilo2 = new Hilo();
		hilo2.start();

		while(hilo1.isAlive() && hilo2.isAlive()) {


			System.out.println("Hilo 1 alive: " + hilo1.isAlive());
			System.out.println("Hilo 2 alive: " + hilo2.isAlive());
		}
		if(hilo1.isAlive() == false && hilo2.isAlive() == false) {
			System.out.println("los hilos han terminado");
		}

	}

}
