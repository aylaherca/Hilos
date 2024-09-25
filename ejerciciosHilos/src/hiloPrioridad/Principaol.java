package hiloPrioridad;

public class Principaol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HiloPrioridad h1 = new HiloPrioridad();
		HiloPrioridad h2 = new HiloPrioridad();
		HiloPrioridad h3 = new HiloPrioridad();
		
		h1.setPriority(10);
		h2.setPriority(5);
		h3.setPriority(1);
		
		h1.start();
		h2.start();
		h3.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		h1.parar();
		h2.parar();
		h3.parar();
		
		
		
	}

}
