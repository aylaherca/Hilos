package ejercicio4;

public class Persona implements Runnable{
	
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println("operacion " + i);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
