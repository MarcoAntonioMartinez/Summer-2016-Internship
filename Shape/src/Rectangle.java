
public class Rectangle extends Shape {
	private int height;
	private int width;
	@Override
	public Double get_area() {
		// TODO Auto-generated method stub
		return 1.00 * height * width;
	}
	public Rectangle(String newColor, int newHeight, int newWidth)
	{
		super(newColor);
		height = newHeight;
		width = newWidth;
	}
	public void print()
	{
		super.print();
		System.out.print( "rectangle: " + "height "+ height + ", "  + "width " + width + ", " + "area " + get_area());
	}
}
