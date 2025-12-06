package set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TaskSet {

	public static void main(String[] args) {

		SortedSet s = new TreeSet();

		s.add("one");
		s.add("two");
		s.add("Three");

		for (Object o : s) {
			System.out.println(o);
		}
		System.out.println(s.first()); // to get the first element

		System.out.println("-------------------------");

		System.out.println(s.last()); // to get the last element
	}

}
