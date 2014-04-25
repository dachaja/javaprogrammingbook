package chapter12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsClipEx extends JFrame{
	Container contentPane;
	public GraphicsClipEx() {
		setTitle("Cliping Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		ImageIcon icon = new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter11/beauty.jpg");
		Image img = icon.getImage();
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setClip(100, 20, 150, 150);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("Go Gator!!", 10, 150);
		}
	}
	
	public static void main(String[] args) {
		new GraphicsClipEx();
	}
}
