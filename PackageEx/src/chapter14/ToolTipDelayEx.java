package chapter14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ToolTipManager;

public class ToolTipDelayEx extends JFrame{
	Container contentPane;
	
	public ToolTipDelayEx() {
		setTitle("ToolTip Delay Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel cherryLabel = new JLabel(new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chaper11/cherry.jpg"));
		cherryLabel.setToolTipText("How do you like a cherry image.");
		
		JLabel appleLabel = new JLabel(new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chaper11/apple.jpg"));
		appleLabel.setToolTipText("How do you like an apple image.");
		
		contentPane.add(cherryLabel);
		contentPane.add(appleLabel);
		
		ToolTipManager m = ToolTipManager.sharedInstance();
		m.setInitialDelay(0);
		m.setDismissDelay(10000);
		
		setSize(400, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ToolTipDelayEx();
	}
}
