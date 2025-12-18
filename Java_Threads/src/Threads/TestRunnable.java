package Threads;

public class TestRunnable {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new HelloRunnable("Adhiraj"));
		
		Thread t2 = new Thread(new HelloRunnable("yash"));
		
		t1.start();
		t2.start();
		
	}
	
}
