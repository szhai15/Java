package week_6;

public class Polygon 
{
	public int height;
	public int width;
	public int sides;
	
	public void set_values(int a, int b)
	{
		height = a;
		width = b;
	}
	
	public int sides()
	{
		return sides;
	}
	
	public void interior_angles()
	{
		System.out.println("The interior angles = " + ((sides - 2) * 180));
	}
}

public class Rectangle extends Polygon 
{
	public double area()
	{
		return (height * width);
	}
}

public class Triangle extends Polygon 
{
	public double area()
	{
		return(height * width / 2);
	}
	
	public int sides()
	{
		return sides = 3;
	}
	
	public void interior_angles()
	{
		System.out.println("The interior angles of triangle = " + ((sides - 2) * 180));
	}
}

public class MainClass {

	public static void main(String[] args)
	{
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();
		
		rectangle.set_values(10, 20);
		triangle.set_values(30, 50);
		
		System.out.println("The area of the rectangle = " + rectangle.area());
		System.out.println("The area of the triangle = " + triangle.area());

		Polygon polygon = new Triangle();
		(polygon).sides();
		polygon.interior_angles();
	}

}
