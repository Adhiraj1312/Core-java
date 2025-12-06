package list;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add("Adhi");
		l.add('a');
		l.add(45);
		l.add(9.0);
		l.add(true);

		System.out.println("Ptint l as normal" + l);

		System.out.println("to get the value " + l.get(3));

		System.out.println("to set some another value " + l.set(1, 'b'));

		System.out.println("to search form the index " + l.indexOf(45));

		System.out.println("to search form last index " + l.lastIndexOf('b'));
		
		System.out.println("to remove " + l.remove(1));
		
		System.out.println(l);

	}
}
