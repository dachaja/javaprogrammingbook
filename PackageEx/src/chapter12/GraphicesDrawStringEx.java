package chapter12;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicesDrawStringEx extends JFrame{
	Container contentPane;
	public GraphicesDrawStringEx() {
		setTitle("drawString Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(250, 200);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("Java is interesting.", 30, 30);
			g.drawString("How much??", 60, 60);
		}
	}
	
	public static void main(String[] args) {
		new GraphicesDrawStringEx();
	}
}
