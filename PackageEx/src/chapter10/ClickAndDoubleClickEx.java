package chapter10;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClickAndDoubleClickEx extends JFrame{
	JPanel contentPane = new JPanel();
	
	public ClickAndDoubleClickEx() {
		setTitle("Click and DoubleClick Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.addMouseListener(new MyMouseListener());
		setSize(300, 200);
		setVisible(true);
	}
	class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount() == 2) {
				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				
				JPanel p = (JPanel)e.getSource();
				p.setBackground(new Color(r,b,g));
			}
			super.mouseClicked(e);
		}
	}
	public static void main(String[] args) {
		new ClickAndDoubleClickEx();
	}
}
