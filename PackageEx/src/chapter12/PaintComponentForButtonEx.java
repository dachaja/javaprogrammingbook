package chapter12;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PaintComponentForButtonEx extends JFrame{
	Container contentPane;
	public PaintComponentForButtonEx() {
		setTitle("Make New Button");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		MyButton b = new MyButton("New Button");
		//JButton b = new JButton("NEw Button");
		b.setOpaque(true);
		b.setBackground(Color.CYAN);
		contentPane.add(b);
		setSize(250, 200);
		setVisible(true);
	}
	
	class MyButton extends JButton {
		MyButton(String s) {
			super(s);
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.RED);
			g.drawOval(0, 0, getWidth()-1, getHeight()-1);
		}
	}
	
	public static void main(String[] args) {
		new PaintComponentForButtonEx();
	}
}
