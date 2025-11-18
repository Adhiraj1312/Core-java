package in.co.rays.basic;

public class LargestNumber {
	public static void main(String[] args) {
		int[] a = { 5, 10, 15, 20, 25, 15 };
		int largest = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			}
		}
		System.out.println("largest Number is: " + largest);
	}
}
