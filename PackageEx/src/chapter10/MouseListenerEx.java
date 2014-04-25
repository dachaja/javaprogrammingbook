package chapter10;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListenerEx extends JFrame{
	JPanel contentPane = new JPanel();
	JLabel la;
	
	public MouseListenerEx() {
		setTitle("Mouse 이벤트 예");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addMouseListener(new MyMouseListener());
		
		la = new JLabel("hello");
		la.setSize(50, 20);
		la.setLocation(30, 30);
		contentPane.add(la);
		setSize(200, 200);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	public static void main(String[] args) {
		new MouseListenerEx();
	}
}
