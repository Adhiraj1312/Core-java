package Exception;

public class TestArthematicWithTryAndCatch {

	public static void main(String[] args) {
		
		int a = 10 ;
		int b = 0 ;
		
		try {
			int c  = a/b;    // (Arthematic exception)
			System.out.println(c);
		}
		catch(ArithmeticException e){
		e.printStackTrace();
		}
		System.out.println("program is finish");
	}
}
