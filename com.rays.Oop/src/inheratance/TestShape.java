package inheratance;

public class TestShape {

	public static void main(String[] args) {

		Circle c = new Circle();

		c.setRadius(3);
		c.setBoderwidth(2);
		c.setColour("red");

		System.out.println(c.getRadius());
		System.out.println(c.getColour());
		System.out.println(c.getBoderwidth());
		c.area(4);

		System.out.println("---------Rectangle--------------");

		Rectangle r = new Rectangle();

		r.setLength(4);
		r.setWidth(6);
		r.setColour("Black");
		r.setBoderwidth(3);

		System.out.println("Length : " + r.getLength());
		System.out.println("Width  : " + r.getWidth());
		System.out.println("colour : " + r.getColour());
		System.out.println("borderwidth : " + r.getBoderwidth());
		r.area(4, 6);

		System.out.println("---------Triangle--------------");

		Triangle t = new Triangle();

		t.setBase(2);
		t.setHeight(6);
		t.setColour("Blue");
		t.setBoderwidth(4);

		System.out.println("Base : " + t.getBase());
		System.out.println("Height  : " + t.getHeight());
		System.out.println("colour : " + t.getColour());
		System.out.println("borderwidth : " + t.getBoderwidth());

		t.area(6, 2);
	}
}
