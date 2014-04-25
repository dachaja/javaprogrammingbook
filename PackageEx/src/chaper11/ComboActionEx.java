package chaper11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboActionEx extends JFrame{
	Container contentPane;
	String[] fruits = {"apple","banana","kiwi","mango"};
	ImageIcon[] images = {
		new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter11/apple.jpg"),
		new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter11/banana.jpg"),
		new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter11/kiwi.jpg"),
		new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter11/mango.jpg")
	};
	JLabel imgLabel = new JLabel(images[0]);
	
	public ComboActionEx() {
		setTitle("ComboBox example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JComboBox<String> strComboBox = new JComboBox<String>(fruits);
		strComboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
				
			}
		});
		
		contentPane.add(strComboBox);
		contentPane.add(imgLabel);
		
		setSize(300,250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComboActionEx();
	}
}
