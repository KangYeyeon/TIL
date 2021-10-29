import javax.swing.*;
import java.awt.*;

public class turtle_7_3 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public turtle_7_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(100, 100);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			int [] x = {10, 5, 15};
			int [] y = {10, 15, 20};
			g.fillPolygon(x, y, 3);
		}
	}
	
	public static void main(String [] args) {
		new turtle_7_3();
	}
}


