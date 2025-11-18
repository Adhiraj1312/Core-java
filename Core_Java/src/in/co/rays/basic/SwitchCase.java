package in.co.rays.basic;

public class SwitchCase {
	public static void main(String[] args) {
		int number = 8;
		switch (number) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 8:
			System.out.println("Eight");
			break;
		default:
			System.out.println("other number");
		}
	}
}
