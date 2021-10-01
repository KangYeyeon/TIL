import javax.swing.*;
import java.awt.*;

public class turtle_3_5 extends JFrame {
	public turtle_3_5() {
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("Hello"));
	
		setSize(100,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new turtle_3_5();
	}
}
