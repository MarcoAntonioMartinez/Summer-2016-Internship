
public class Main {

	public static void main(String[] args)
	{
		Circle circle= new Circle("green", 10);
		Rectangle rectangle = new Rectangle("red", 8, 6);
		Triangle triangle = new Triangle("yellow", 8, 4);
		
		circle.print();
		rectangle.print();
		triangle.print();
		
	}
}
