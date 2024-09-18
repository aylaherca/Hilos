package ejercicio2;

public class Hilo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {

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
