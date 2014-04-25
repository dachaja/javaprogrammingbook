package chapter14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class ToolTipEx extends JFrame{
	Container contentPane;
	public ToolTipEx() {
		setTitle("ToolTip Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		setSize(400, 150);
		setVisible(true);
	}
	
	void createToolBar() {
		JToolBar bar = new JToolBar("Kitae Menu");
		bar.setBackground(Color.LIGHT_GRAY);
		JButton newBtn = new JButton("New");
		newBtn.setToolTipText("Create new file");
		bar.add(newBtn);
		
		JButton openBtn = new JButton(new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter14/open.png"));
		openBtn.setToolTipText("open new file");
		bar.add(openBtn);
		bar.addSeparator();
		
		JButton saveBtn = new JButton(new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter14/save.png"));
		saveBtn.setToolTipText("save new file");
		bar.add(saveBtn);
		
		bar.add(new JLabel("search"));
		
		JTextField tf = new JTextField("text field");
		tf.setToolTipText("search the text");
		bar.add(tf);
		contentPane.add(bar, BorderLayout.NORTH);
		
	}
	
	public static void main(String[] args) {
		new ToolTipEx();
	}
}
