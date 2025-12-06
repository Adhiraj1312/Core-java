package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String [] args) {
		
		List l = new ArrayList();
		
		l.add("Adhi");
		l.add('d');
		l.add(56);
		l.add(true);
		l.add("Yash");
		
		System.out.println("List" + l);
		

		Iterator it = l.iterator();
		
		while(it.hasNext()) {                    // it.Hasnext(); used to check the value and it passes "ture or False". 
			
			Object o = it.next();              //it.next(); to return the vlaue like this is Object 
			
			System.out.println(o);
			
			it.remove();                        // it.remove(); to remove the value from the list when the value comes out and got print.
		}
		
		System.out.println("list: " +	l);
		
	}
	
}
