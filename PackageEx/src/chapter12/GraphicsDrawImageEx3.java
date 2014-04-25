package chapter12;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawImageEx3 extends JFrame{
	Container contentPane;
	public GraphicsDrawImageEx3() {
		setTitle("drawImage Example3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		ImageIcon icon = new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter11/beauty.jpg");
		Image img = icon.getImage();
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img, 20, 20, 250, 100, 100, 50, 200, 200, this);
		}
	}
	
	public static void main(String[] args) {
		new GraphicsDrawImageEx3();
	}
}
