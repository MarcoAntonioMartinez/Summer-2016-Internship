import java.awt.*;
import javax.swing.*;

public class MyDrawPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g)
	{
		g.setColor(Color.orange);
	//	g.fillRect(20, 50, 100, 100);
		g.fillOval(20, 50, 50, 50);
	}
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//}
