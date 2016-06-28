
public class Triangle extends Shape {
	private int height;
	private int base;
	
	@Override
	public Double get_area() {
		// TODO Auto-generated method stub
		return 1.00 * (height * base)/2;
	}
	public Triangle(String newColor, int newHeight, int newBase)
	{
		super(newColor);
		height = newHeight;
		base = newBase;
	}
	public void print()
	{
		super.print();
		System.out.println("triangle, " + "height " + height + ", " + "base " + base + ", "  + "area " + get_area());
	}
}
