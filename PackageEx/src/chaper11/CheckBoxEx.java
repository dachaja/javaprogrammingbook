package chaper11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame {
	Container contentPane;
	public CheckBoxEx() {
		setTitle("checkbox example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter11/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter11/selectedCherry.jpg");
		
		JCheckBox apple = new JCheckBox("apple");
		JCheckBox pear = new JCheckBox("pear", true);
		JCheckBox cherry = new JCheckBox("cherry", cherryIcon);
		
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		
		contentPane.add(apple);
		contentPane.add(pear);
		contentPane.add(cherry);
		
		setSize(250, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CheckBoxEx();
	}
}
