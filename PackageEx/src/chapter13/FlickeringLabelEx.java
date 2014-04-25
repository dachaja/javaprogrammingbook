package chapter13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlickeringLabelEx extends JFrame {
	public FlickeringLabelEx() {
		setTitle("FlickeringLabel Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel fLabel = new FlickeringLabel("Blink");
		JLabel label = new JLabel("Non Blink");
		
		FlickeringLabel fLabel2 = new FlickeringLabel("Blink here.");
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		setSize(300, 1500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlickeringLabelEx();
	}
}


