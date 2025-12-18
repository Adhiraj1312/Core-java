package Threads;

 	public class HelloThreads extends Thread {

	private String name ;
	
	public HelloThreads(String name ) {
		
		this.name = name ;
		
	}
	public void run() {
		
		for(int i = 1 ; i <= 10 ; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i + " = " + name);
		}
	}
	
}
