package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFailFast {

	public static void main(String [] args) {
		
		
		List l = new ArrayList();
		
		l.add("adhi");
		l.add('a');
		l.add(46);
		l.add(9.7);
		l.add(true);
		
		System.out.println("list: " + l);

		System.out.println("----Iterator----");

		Iterator it = l.iterator();

		l.add("Sita");                                // Fail Fast

		while (it.hasNext()) {
			// it.remove();                           // java.lang.IllegalStateException
			Object o = it.next();
			System.out.println("elements: " + o);
			it.remove();                             // remove from collection
		}

		System.out.println("list: " + l);
		
		l.add("Sita");
		System.out.println("list: " + l);

	}
		
		
	}


