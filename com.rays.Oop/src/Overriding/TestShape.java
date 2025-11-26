package Overriding;

public class TestShape {

	public static void main(String[] args) {

		Shape s1 = new Circle();
		
		Circle c = (Circle) s1;
		
		c.setColour("red");
		c.setBorderwidth(2);
		c.setRadius(2);
		
		System.out.println("colour of Circle : " +c.getColour());
		
		System.out.println("borderwidth of Circle : " +c.getBorderwidth());
		
		System.out.println("Radius of Circle : " + c.getRadius());
		
		c.area();
		
		
		System.out.println("--------------------Rectangle---------------------------");
	
		
		
		
		Shape s2 = new Rectangle();
		Rectangle r = (Rectangle) s2 ;
		
		r.setColour("red");
		r.setBorderwidth(2);
		r.setLenght(4);
		r.setWidth(8);
		
		
		System.out.println("Colour of Rectangle : " + r.getColour());
		
		System.out.println("Borderwidth of rectangle : "+ r.getBorderwidth());
		
		System.out.println("Length of Rectangle :" + r.getLenght());
		
		System.out.println("Width of Rectangle :" + r.getWidth());
		
		 r.area(4, 8);
		
		 
		 System.out.println("------------------Triangle---------------------");
		
	}
}
