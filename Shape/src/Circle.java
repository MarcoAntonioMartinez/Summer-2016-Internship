
public class Circle extends Shape {
	private int radius;
	public Circle(String newColor, int newRadius)
	{
	  super(newColor);
	  radius = newRadius;
	}
	
	@Override
	public Double get_area() {
		// TODO Auto-generated method stub
		
		return 3.14 * (radius * radius);
	}

	public void print()
	{
		super.print();
		System.out.println("circle: " + "radius " + radius + ", " + "area " + get_area());
	}
	
}
