package chaper11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class ButtonImageEx extends JFrame{
	Container contentPane;
	public ButtonImageEx() {
		setTitle("ImageButton Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter11/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter11/rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter11/pressedIcon.gif");
		
		JButton btn = new JButton("call~~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		btn.setHorizontalAlignment(SwingConstants.LEFT);
		btn.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(btn);
		
		setSize(250, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ButtonImageEx();
	}
}
