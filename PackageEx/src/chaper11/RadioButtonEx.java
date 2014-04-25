package chaper11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame{
	Container contentPane;
	public RadioButtonEx() {
		setTitle("RadioButton Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter11/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter11/selectedCherry.jpg");
		
		ButtonGroup g = new ButtonGroup();
		
		JRadioButton apple = new JRadioButton("apple");
		JRadioButton pear = new JRadioButton("pear", true);
		JRadioButton cherry = new JRadioButton("cherry", cherryIcon);
		
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		contentPane.add(apple);
		contentPane.add(pear);
		contentPane.add(cherry);
		
		setSize(250,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RadioButtonEx();
	}
}
