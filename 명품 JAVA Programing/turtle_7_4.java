import javax.swing.*;
import java.awt.*;

public class turtle_7_4 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public turtle_7_4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(200, 200);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillArc(20,20,100,100,90,120);
			g.setColor(Color.BLUE);
			g.fillArc(20,20,100,100,210,120);
			g.setColor(Color.YELLOW);
			g.fillArc(20,20,100,100,330,120);
		}
	}
	
	public static void main(String [] args) {
		new turtle_7_4();
	}
}


