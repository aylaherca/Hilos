package hiloPrioridad;

public class HiloPrioridad extends Thread{
	long c= 0;
	boolean seguir = true;

	public long getContador() {
		return c;	
	}

	public void parar() {
		seguir = false;
	}

	public void seguir() {
		while(seguir) {
			c++;
		}
	}



}
