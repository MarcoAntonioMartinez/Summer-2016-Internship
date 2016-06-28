import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleGUI2 implements ActionListener {
	JFrame frame;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleGUI1 gui = new SimpleGUI1();
		gui.go();
	}

	public class MyDrawPanel extends JPanel {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void paintComponent(Graphics g)
		{
			g.setColor(Color.orange);
			g.fillRect(20, 50, 100, 100);
		}
	}
	public void go()
	{
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Change colors");
		button.addActionListener((ActionListener) this);
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.setSize(300,300);
		frame.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent event) 
	{
		frame.repaint();
	}


		
}

