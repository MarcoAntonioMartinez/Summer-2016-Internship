
public abstract class Shape 
{
 private String color; 
 public Shape(String newColor)
 {
	 color = newColor;
 }
 
 public void print()
 {
	 System.out.println(color);
 }
 public abstract Double get_area();
 
}
