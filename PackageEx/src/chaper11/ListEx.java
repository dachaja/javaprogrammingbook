package chaper11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListEx extends JFrame{
	Container contentPane;
	String[] fruits = {"apple","banana","kiwi","mango","pear","peach","berry","strawberry","blackberry"};
	ImageIcon[] images = { new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter11/icon1.png"),
			new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter11/icon2.png"),
			new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter11/icon3.png"),
			new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter11/icon4.png")
	};
	public ListEx() {
		setTitle("List Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JList<String> strList = new JList<String>(fruits);
		contentPane.add(strList);
		
		JList<ImageIcon> imageList = new JList<ImageIcon>();
		imageList.setListData(images);
		contentPane.add(imageList);
		
		JList<String> scrollList = new JList<String>(fruits);
		contentPane.add(new JScrollPane(scrollList));
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ListEx();
	}
}
