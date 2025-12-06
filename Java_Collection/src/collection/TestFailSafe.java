package collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestFailSafe {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add("Adhi");
		v.add("ash");
		v.add('a');
		v.add(46);
		v.add(9.7);
		v.add(true);

		System.out.println("Vector: " + v);

		Enumeration e = v.elements();

		v.add('b');

		while (e.hasMoreElements()) {

			Object o = e.nextElement();

			System.out.println(o);

		}

		System.out.println("Vector: " + v);

	}

}
