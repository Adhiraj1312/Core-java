package String.rays.basic;

public class CountDigit {

	public static void main(String[] args) {

		String str = "go1og4le2";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println("input digit :" + str);

		System.out.println("Number of the digits" + count);
	}
}
