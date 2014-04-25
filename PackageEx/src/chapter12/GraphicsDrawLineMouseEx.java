package chapter12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawLineMouseEx extends JFrame{
	Container contentPane;
	public GraphicsDrawLineMouseEx() {
		setTitle("Drawing Line by Mouse Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		Vector<Point> vStart = new Vector<Point>();
		Vector<Point> vEnd	= new Vector<Point>();
		
		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					super.mousePressed(e);
					Point startP = e.getPoint();
					vStart.add(startP);
				}
				@Override
				public void mouseReleased(MouseEvent e) {
					super.mouseReleased(e);
					Point endP = e.getPoint();
					vEnd.add(endP);
					
					repaint();
				}
			});
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.BLUE);
			for (int i = 0; i < vStart.size(); i++) {
				Point s = vStart.elementAt(i);
				Point e = vEnd.elementAt(i);
				
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
		}
	}
	
	public static void main(String[] args) {
		new GraphicsDrawLineMouseEx();
	}
}
