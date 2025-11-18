package String.rays.basic;

public class Vowles {

	public static void main(String[] args) {

		String str = " google ";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if ('a' == str.charAt(i)) {
				count++;
			}

			if ('e' == str.charAt(i)) {
				count++;
			}

			if ('i' == str.charAt(i)) {
				count++;
			}

			if ('o' == str.charAt(i)) {
				count++;
			}

			if ('u' == str.charAt(i)) {
				count++;
			}
		}
	}
}
 