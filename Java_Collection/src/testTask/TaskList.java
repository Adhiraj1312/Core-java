package testTask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskList {

	public static void main(String[] args) {

		Collection c1 = new ArrayList();

		c1.add("adhi");
		c1.add("ram");
		c1.add('a');
		c1.add(4.4);
		c1.add(true);
		c1.add("ram");
		c1.add(true);

		System.out.println("c1: " + c1);
		
		Set s = new HashSet(c1);
		
		System.out.println("set :" +s);
		
		List l = new ArrayList(s);
		
		System.out.println("Now in List: " + l);

	

	}
}
