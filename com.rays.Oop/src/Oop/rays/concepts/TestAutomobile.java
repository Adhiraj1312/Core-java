package Oop.rays.concepts;

public class TestAutomobile {

	public static void main(String[] args) {

		Automobile a = new Automobile();

		a.setColour("Black");
		a.setSpeed(100);
		a.setMake("Kia");

		System.out.println("Colour :  " + a.getColour());
		System.out.println("Speed : " + a.getSpeed());
		System.out.println("Make : " + a.getMake());
		
		System.out.println(" Break : "  );
	}
}
