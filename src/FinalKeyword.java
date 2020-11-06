
// This code will not get executed , it will give complilation errror as the subclass
// are trying to override the area() method in superclass which was declared as final.

abstract class Shape{
	final void area() {
		System.out.println("Area of shape");
	}
}

class Circle extends Shape{
	void area() {
		System.out.println("Area of circle");
	}
}

class Rectangle extends Shape{
	void area() {
		System.out.println("Area of rectangle");
	}
}

public class FinalKeyword{
	public static void main(String args[]) {
		Shape s;
		s = new Circle();
		s = area();
		s = new Rectangle();
		s = area();	
	}
}