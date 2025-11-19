package inheratance;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class TestPerson extends Person {

	public static void main(String[] args) throws ParseException {
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD"); 
		Businessman b = new Businessman();
		b.setName("Aditya");
		b.setIncome(10000.00);
		b.setAddress("Indore");
		b.setDob(sdf.parse("2000-05-12"));
		
		System.out.println(b.getDob());

		System.out.println("name of  businessma : " + b.getName());

		System.out.println("Address : " + b.getAddress());

		System.out.println("Businessman income : " + b.getIncome());

		System.out.println("----------Doctor---------------");

		Doctor d = new Doctor();

		d.setRegistrationNO("16516382583892");
		d.setName("Yash");
		d.setAddress("Pune");
		d.setDob(sdf.parse("2000-06-02"));

		System.out.println("Doctors registration number : " + d.getRegistrationNO());
		System.out.println("name : " + d.getName());
		System.out.println("address : " + d.getAddress());
		System.out.println(d.getDob());

		System.out.println("------------Student--------------");

		Student s = new Student();
		s.setName("Naman");
		s.setRollno("188255");
		s.setMarks(80);
		s.setAddress("Mumbai");
		s.setDob(sdf.parse("2000-04-07"));

		System.out.println("Roll NO : " + s.getRollno());
		System.out.println("Student marks" + s.getMarks());
		System.out.println("name : " + s.getName());
		System.out.println("address : " + s.getAddress());
		System.out.println(s.getDob());
	}
}
