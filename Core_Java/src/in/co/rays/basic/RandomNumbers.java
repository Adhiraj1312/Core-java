package in.co.rays.basic;

import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.print("five random numbers between 1 to 100");
		for (int i = 0; i < 5; i++) {
			int a = r.nextInt(100);
			System.out.println(a);
		}
	}
}
