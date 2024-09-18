package ejercicio1;

public class Hilo extends Thread{
	
	public void run() {

		for(int i = 0; i < 1001; i++) {

			System.out.println(i);
			try {
				Thread.sleep(10); //hacemos que mas o menos vayan a la vez
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
