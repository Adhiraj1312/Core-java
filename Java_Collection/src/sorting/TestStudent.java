package sorting;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Niraj", 89);
		Student s2 = new Student(2, "Yash", 34);
		Student s3 = new Student(3, "Arun", 67);
		Student s4 = new Student(4, "Anant", 99);
		Student s5 = new Student(5, "Sakshi", 75);
		Student s6 = new Student(6, "Neha", 76);
		
		List l = new ArrayList();
		
		
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		
		System.out.println(l);
		
		System.out.println("-----------by for each loop -------------");
		
	for(Object o : l) {
		
		System.out.println("List" + o);
		
	}
	
	
	}
	
}
