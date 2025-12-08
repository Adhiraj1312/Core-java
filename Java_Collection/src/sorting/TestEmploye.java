package sorting;

import java.util.ArrayList;
import java.util.List;

public class TestEmploye {

	public static void main(String[] args) {
		
		String Yash;
		Employe e1 = new Employe(1, "Yash", 10000);
		Employe e2 = new Employe(2, "Anant" , 60000);
		Employe e3 = new Employe(3, "Arun" , 50000);
		Employe e4 = new Employe(4, "Sakshi" , 40000);
		Employe e5 = new Employe(5, "Riddhi" , 30000);
		Employe e6 = new Employe(6, "Neha" , 20000);
		
		List l = new ArrayList();
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		l.add(e6);
		
		System.out.println("List " + l);
		
		System.out.println("--------------using foreach to print-------------------");
		
		for(Object o : l) {
			System.out.println(l);
			
		}
		
		System.out.println("--------------------");
	}
	
}
