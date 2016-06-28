
import java.util.Scanner;

public class UserInput {
	 public static void main(String args[]) 
	   {
		 Scanner input = null;
		 try{
         input = new Scanner(System.in);
		 
		 String first_name;
		 System.out.print("Enter your first name:");
		 first_name=input.next();
		 
		 System.out.println("You are " + first_name);
		 }
		 //close the scanner object
		 finally{
			 if(input!=null)
				 input.close();
		 }
	   }
		 
}
