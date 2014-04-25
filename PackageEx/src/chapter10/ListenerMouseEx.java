package chapter10;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ListenerMouseEx extends JFrame {
	ListenerMouseEx() {
		setTitle("버튼에 Mouse 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Mouse Event 테스트 버튼");
		btn.setBackground(Color.YELLOW);
	
		MyMouseListener listener = new MyMouseListener();
		btn.addMouseListener(listener);
		
		add(btn);
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ListenerMouseEx();
	}
	
}

class MyMouseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.RED);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.YELLOW);
	}
	
}

