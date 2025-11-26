package Polymorphism;

public class TestPolymorphismArray {

	public static void main(String[] args) {
		
		
		Shape [] s = new Shape[3];
		
		System.out.println("Length of the Array : " + s.length);
		
		s[0] = new Circle();
		
		s[1] = new Rectangle();
		
		s[2] = new Triangle();
		
		Circle c = (Circle) s[0];
		
		c.setColour("red");
		c.setRadius(4);
		
		
		
		System.out.println("-----------Rectangle--------------");
		
		Rectangle r =(Rectangle) s[1];
		
		r.setColour("Black");
		r.setLength(4);
		r.setWidth(8);
		
		
		
		System.out.println("-------------Triangle-----------------");
		
		
		Triangle t = (Triangle)s[2];
		
		t.setColour("Yellow");
		t.setBase(4);
		t.setHeight(6);
		
		for(int i = 0 ; i<s.length ; i++) {
			s[i].area();
		}
		
	}
}
