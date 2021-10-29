import javax.swing.*;
import java.awt.*;

public class turtle_7_1 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public turtle_7_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(100, 100);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.YELLOW);
			g.drawLine(10, 10, 30, 30);
		}
	}
	
	public static void main(String [] args) {
		new turtle_7_1();
	}
}


