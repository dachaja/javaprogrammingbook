package chapter14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class ToolBarEx extends JFrame{
	Container contentPane;
	
	public ToolBarEx() {
		setTitle("ToolBar Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		setSize(400,200);
		setVisible(true);
	}
	
	void createToolBar() {
		JToolBar toolBar = new JToolBar("Kitae Menu");
		toolBar.setBackground(Color.LIGHT_GRAY);
		
		toolBar.add(new JButton("New"));
		toolBar.add(new JButton(new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter14/open.png")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter14/save.png")));
		toolBar.add(new JLabel("search"));
		toolBar.add(new JTextField("text field"));
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		toolBar.add(combo);
		
		contentPane.add(toolBar, BorderLayout.NORTH);
	}
	
	public static void main(String[] args) {
		new ToolBarEx();
	}
}
