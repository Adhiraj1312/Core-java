package inheratance;

public class Circle extends Shape {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void area(int r) {
		System.out.println("Area of Circle : " +  3.14*(r*r));
	}
}
