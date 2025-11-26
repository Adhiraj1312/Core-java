package Overriding;

public class Rectangle extends Shape {

	private int lenght;
	private int width;

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
public void area (int l , int w) {
	System.out.println("Area of Rectangle : " + (l*w));
}
}
