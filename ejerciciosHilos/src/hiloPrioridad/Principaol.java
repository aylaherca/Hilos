package hiloPrioridad;

public class Principaol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HiloPrioridad h1 = new HiloPrioridad();
		HiloPrioridad h2 = new HiloPrioridad();
		HiloPrioridad h3 = new HiloPrioridad();
		
		h1.setPriority(Thread.MAX_PRIORITY);
		h2.setPriority(Thread.NORM_PRIORITY);
		h3.setPriority(Thread.MIN_PRIORITY);
		
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
		
		System.out.println("h1 (max priority): " + h1.getContador());
		System.out.println("h2 (norm priority): " + h2.getContador());
		System.out.println("h3 (min priority): " + h3.getContador());
		
		
		
		
	}

}
