package Abstraction;

public class businessman extends Person implements richman , socialworker{

	public static void main(String[] args) {
		
		
	}

	@Override
	public void helptoOthers() {
	
		System.out.println("helping others ....");
		
	}

	@Override
	public void charity() {
		
		System.out.println("charity ......");
		
	}

	@Override
	public void earnmoney() {
		
		System.out.println("earn money ..........");
		
	}

	@Override
	public void donation() {
		
		System.out.println("gives donation.......");
		
	}

	@Override
	public void party() {
		
		System.out.println("went for party ............");
		
		
		
		
		
	}
}
