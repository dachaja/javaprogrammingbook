package chapter12;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicesDrawImageEx2 extends JFrame{
	Container contentPane;
	public GraphicesDrawImageEx2() {
		setTitle("drawImage Example 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		ImageIcon icon = new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter11/icon1.png");
		Image img = icon.getImage();
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}
	
	public static void main(String[] args) {
		new GraphicesDrawImageEx2();
	}
}
