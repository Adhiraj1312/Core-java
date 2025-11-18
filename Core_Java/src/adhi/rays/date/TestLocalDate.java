package adhi.rays.date;

import java.time.LocalDate;

public class TestLocalDate {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();

		System.out.println(now);

		System.out.println(now.getDayOfMonth());

		System.out.println(now.getDayOfYear());

		System.out.println(now.getYear());

		System.out.println(now.getMonth());

		System.out.println(now.getDayOfWeek());

	
		
		System.out.println("----------------------");

		LocalDate dob = LocalDate.of(2002, 12, 27);

		
		System.out.println(dob.getDayOfMonth());
		
		
		System.out.println(dob.getDayOfWeek());
		
		
		System.out.println(dob.getDayOfYear());
		
		
		System.out.println(dob.getMonth());
		
		
		System.out.println(dob.getYear());
		
		
		
		
		
	}
}
