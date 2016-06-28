import java.io.*;
public class WritingFile {
	 public static void main(String args[]) throws IOException
	   {
		 InputStreamReader cin = null;
		 FileOutputStream out = null; 
		 try{
			 out = new FileOutputStream("output.txt");
			 cin = new InputStreamReader(System.in);
			 System.out.println("Enter character, 'q' to quit");
			 char c = ' ';
			 
			 while(c !='q'){
				 c = (char) cin.read();
				 //if (c != q)
				//make an array and loop through so q will not show up on output.txt
				 int d = (int) c;	
				 out.write(d);
				 // System.out.print(c);
			 }
			 }finally {
				 if (cin !=null){
					 cin.close();
				 }
				 if ( out != null)
				 {
					 out.close();
				 }
		 }
	   }
}
