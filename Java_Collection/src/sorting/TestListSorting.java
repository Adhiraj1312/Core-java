package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListSorting {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add("adhi");
		l.add("Adhi");
		l.add("Lion");
		l.add("tiger");

		System.out.println("List before sorting: " + l);

		Collections.sort(l);

		System.out.println("List after sorting: " + l);
		
		System.out.println("--------------------------------------");

		Collections.shuffle(l);

		System.out.println("When we need the shuffel values: " + l);

	}
}