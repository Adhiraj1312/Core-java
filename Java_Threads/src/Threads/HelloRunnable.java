package Threads;

public class HelloRunnable implements Runnable {

	private String name;
	
	
	public HelloRunnable(String name ) {
		
		this.name = name;
		
	}
	public  void run() {
		
		for(int i = 1 ; i <= 10 ; i++) {
			
			System.out.println(i + " = " + name );
		}
	}
	
}
