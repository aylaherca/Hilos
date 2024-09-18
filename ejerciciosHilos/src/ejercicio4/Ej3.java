package ejercicio4;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Persona personaRunnable = new Persona();
		
		Thread persona1 = new Thread(personaRunnable);
		persona1.start();
		
		Thread persona2 = new Thread(personaRunnable);
		persona2.start();

	}

}
