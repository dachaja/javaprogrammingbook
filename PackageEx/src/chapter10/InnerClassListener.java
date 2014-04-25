package chapter10;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListener extends JFrame{
	static JFrame frame;
	InnerClassListener() {
		setTitle("Action 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		add(btn);
		
		setSize(300,150);
		setVisible(true);
		
		frame = (JFrame) getFrames()[0];
	}
	private class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			
			frame.setTitle(b.getText());
		}
	}
	public static void main(String[] args) {
		new InnerClassListener();
	}
}
