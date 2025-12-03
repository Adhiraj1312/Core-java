package collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {
		Collection c = new ArrayList();

		c.add(45);
		c.add("Adhi");
		c.add('a');
		c.add(3.5);
		c.add(true);

		System.out.println(c);

		System.out.println("Size of c :" + c.size());

		System.out.println("-------------------------------");

		for (Object o : c) {
			System.out.println(o);
		}

		System.out.println("----------------------------------");

		System.out.println(c.contains(78));

		System.out.println(c.contains('a'));

		System.out.println(c.contains(2.3));

		System.out.println(c.remove(78));

		System.out.println(c.remove('a'));

		System.out.println(c.remove(2.3));

		System.out.println("Size of c : " + c.size());

	}
}
