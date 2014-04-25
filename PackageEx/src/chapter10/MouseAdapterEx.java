package chapter10;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseAdapterEx extends JFrame{
	JPanel contentPane = new JPanel();
	JLabel la;
	
	public MouseAdapterEx() {
		setTitle("Mouse 이벤트 예");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addMouseListener(new MyMouseAdapter());
		
		la = new JLabel("hello");
		la.setSize(50, 20);
		la.setLocation(30, 30);
		contentPane.add(la);
		setSize(200, 200);
		setVisible(true);
	}
	class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}
	
	public static void main(String[] args) {
		new MouseAdapterEx();
	}
}
