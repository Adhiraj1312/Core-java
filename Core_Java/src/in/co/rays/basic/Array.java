package in.co.rays.basic;

public class Array {
	public static void main (String [] args) {
		int [] a = { 5, 10 , 15 , 20 , 25 , 30};
		System.out.println("length of a is: " + a.length);
		System.out.println(a[0] + ", " + a[1] + " ," + a[2]);
		System.out.println(a[0] + a[1] + a[2]);
		
		
		System.out.println("----------");
		
		
		for (int i = 0; i < 7; i++ ) {
			System.out.println(a[i]);
			
			
		}
		
	}

}
