package collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumerator {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add("Adhi");
		v.add('a');
		v.add(47);
		v.add(8.9);
		v.add(true);

		System.out.println("Vector: " + v);

		Enumeration e = v.elements();

		while (e.hasMoreElements()) {

			Object o = e.nextElement();

			System.out.println(o);

		}

		System.out.println("Vector: " + v);

	}

}
