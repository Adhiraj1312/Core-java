package Overriding;

public class Shape {

	private String colour;
	private int borderwidth;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getBorderwidth() {
		return borderwidth;
	}

	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	public void area() {
		System.out.println("Child class have no area ");
	}
}
