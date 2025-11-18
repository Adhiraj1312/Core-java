package opp.rays.basic;

public class Arthemetic {

	public void sum(int a, int b) {

		System.out.println(a + b);

	}

	public void substract(int a, int b) {

		System.out.println(a - b);

	}

	public void multiplaction(int a, int b) {

		System.out.println(a * b);

	}

	public void divde(int a, int b) {

		System.out.println(a / b);

	}

	public int getMaxNo(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public int getMinNO(int a, int b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}

	public String getFullName(String firstname, String lastname) {
		return firstname + " " + lastname;

	}

	public String EvenOrOdd(int a) {
		if(a%2==0) {
			return "Even";
			}
		else {
			return "Odd";
		}
	}
}
