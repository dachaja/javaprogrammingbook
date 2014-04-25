package chapter12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsColorFontEx extends JFrame{
	Container contentPane;
	public GraphicsColorFontEx() {
		setTitle("Color, Font Graphics Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(350, 450);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawString("I love Java", 30, 30);
			g.setColor(new Color(255,0,0));
			g.setFont(new Font("Arial",Font.ITALIC,30));
			g.drawString("How much?", 30, 60);
			g.setColor(new Color(0x00ff00ff));
			for (int i = 0; i < 5; i++) {
				g.setFont(new Font("Jokerman", Font.ITALIC, i*10));
				g.drawString("This much!", 30, 60+i*60);
			}
		}
	}
	
	public static void main(String[] args) {
		new GraphicsColorFontEx();
	}
}
