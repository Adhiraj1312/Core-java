package Polymorphism;

public class Shape {

	protected String colour;

	protected int boderwidth;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getBoderwidth() {
		return boderwidth;
	}

	public void setBoderwidth(int boderwidth) {
		this.boderwidth = boderwidth;
	}

	public void area() {
		System.out.println("Child class have no area ");
	}

	public static Shape getShape(int i) {

		if (i == 1) {
			return new Circle();
		}

		if (i == 2) {
			return new Rectangle();
		}

		if (i == 3) {
			return new Triangle();
		}
		
		return new Shape();

	}
}