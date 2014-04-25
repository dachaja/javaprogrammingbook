package chapter15;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class MyAppletEx extends Applet{
	String text = null;
	int x;
	int y;
	int fontSize;
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		
		text = "Hello. It's Applet.";
		x = 30;
		y = 30;
		fontSize = 20;
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.RED);
		g.setFont(new Font("Arial", Font.ITALIC, fontSize));
		g.drawString(text, x, y);
	}
}
