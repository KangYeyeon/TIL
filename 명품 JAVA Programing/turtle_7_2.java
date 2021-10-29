import javax.swing.*;
import java.awt.*;

public class turtle_7_2 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public turtle_7_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(100, 100);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawRect(10, 15, 20, 10);
			g.drawOval(10, 15, 20, 10);
		}
	}
	
	public static void main(String [] args) {
		new turtle_7_2();
	}
}


