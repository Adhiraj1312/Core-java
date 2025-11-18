package Oop.rays.concepts;
import java.util.Date;
public class TestPerson {

	public static void main(String [] args) {
		
		Date d = new Date ();
		Encuplation p = new Encuplation();
		
		p.setName("Adhi");
		p.setDob(d);
		p.setAddress("indore");
		
		
		System.out.println("p name : " + p.getName() );
		
		System.out.println("p dob : " + p.getDob());
	   	System.out.println("p address : " + p.getAddress());
		
	}
}
