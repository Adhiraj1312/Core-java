package Threads;

public class TestHelloThread {

	public static void main(String[] args) {
		
		HelloThreads t1 = new HelloThreads("Adhiraj");
		
		HelloThreads t2 = new HelloThreads("Yash");
		
		t1.start();
		t2.start();
		
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(i + " = " + "Adhiraj");
		}
	}
	
}
