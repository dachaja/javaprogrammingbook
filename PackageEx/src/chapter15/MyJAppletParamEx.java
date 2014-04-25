package chapter15;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JPanel;

public class MyJAppletParamEx extends JApplet{
	String text = null;
	int x = 0;
	int y = 0;
	int fontSize = 10;
	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		
		text = getParameter("text");
		try {
			x = Integer.parseInt(getParameter("xpos"));
			y = Integer.parseInt(getParameter("ypos"));
			fontSize = Integer.parseInt(getParameter("fontsize"));
		} catch (NumberFormatException e) {	
		}
		
		setContentPane(new MyPanel());
	}
	
	class MyPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			
			if(text==null)
				return;
			g.setColor(Color.YELLOW);
			g.fillRect(0, 0, getWidth(), getHeight());
			g.setColor(Color.RED);
			g.setFont(new Font("Arial", Font.ITALIC, fontSize));
			g.drawString(text, x, y);
		}
	}
}
