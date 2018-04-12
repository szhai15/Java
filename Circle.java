// Ex: The Circle and Cylinder Classes
// This exercise shall guide you through the important concepts in inheritance.
/*In this exercise, a subclass called Cylinder is derived from the superclass Circle as shown in the class diagram 
  (where an an arrow pointing up from the subclass to its superclass). 
  Study how the subclass Cylinder invokes the superclass' constructors (via super() and super(radius)) 
  and inherits the variables and methods from the superclass Circle. 
  You can reuse the Circle class that you have created in the previous exercise. 
  Make sure that you keep "Circle.class" in the same directory.
*/

public class Circle {
	private double radius;
	private String color;
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return Math.PI * (radius * radius);
	}
	
	public String toString() {
		String result = "radius : " + radius
				+ "\ncolor : " + color
				+ "\nbase area : " + this.getArea();
		return result;
	}
}



public class Cylinder extends Circle {
	private double height; 
	
	public Cylinder(double radius, String color, double height) {
		super(radius, color);
		this.height = height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return getArea() * height;
	}
	
//	Method overriding 
	public String toString() {
		String result = super.toString() 
				+ "\nvolume :" + this.getVolume();
		return result;
	}
}



public class TestCylinder {

	public static void main(String[] args) {
		Circle circle1 = new Circle(1.0, "black");
		Cylinder cylinder1 = new Cylinder(2.0, "red", 4.5);
		System.out.println("The circle's information: \n" + circle1.toString());
		System.out.println("The cylinder's information: \n" + cylinder1.toString());
	}
}
