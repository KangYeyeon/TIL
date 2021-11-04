import javax.swing.*;
import java.awt.*;

public class turtle_8_1 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public turtle_8_1() {
		setTitle("거북이 8주차 문제1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		Image imga = new ImageIcon("images/a.jpg").getImage();
		Image imgb = new ImageIcon("images/b.jpg").getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(imga, 0, 0, getWidth(), getHeight()/2, this);
			g.drawImage(imgb, 0, getHeight()/2, getWidth(), getHeight()/2, this);
		}
	}
	
	public static void main(String [] args) {
		new turtle_8_1();
	}
}
