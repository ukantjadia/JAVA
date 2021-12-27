// problem 04.3:
		// class_rect_04_3.java : Design a class named Rectangle to represent a recrangle. The class contains:
			// -Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height.
			// -A no-arg constructor that crates a default rectangle.
			// -a constructor that creates a rectangle with the specified width and height.
			// -A method named getArea()that returns the area of this rectangle.
			// -A method named getPerimeter() that returns the perimeter.
		 // Implement the class. Write a test program the creates two Rectangle obgects--one with width 4 and height 40 and the other with width 3.5 and height 35.9. Display the width,height,area and perimeter of each rectangle in this oreder.
class Rectangle 
{
	double width =1.0 , height = 1.0;
	Rectangle()
	{	}
	double getArea()
	{
		return width*height;
	}
	double getPerimeter()
	{
		double peri  = 2*(width+height);
		return peri;
	}
}
class impelement_Rectangle
{
	public static void main(String[] args)
	{
		Rectangle obj1 = new Rectangle();
		obj1.width = 4.0;
		obj1.height = 40.0;
		System.out.println("Area of the Rectangle is: "+obj1.getArea());
		System.out.println("Perimeter of the Rectangle is: "+obj1.getPerimeter());
		
		Rectangle obj2 = new Rectangle();
		obj2.width = 3.5;
		obj2.height = 35.9;
		System.out.println("Area of the Rectangle is: "+obj2.getArea());
		System.out.println("Perimeter of the Rectangle is: "+obj2.getPerimeter());
	}
}
	