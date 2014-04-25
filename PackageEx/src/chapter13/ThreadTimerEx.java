package chapter13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadTimerEx extends JFrame{
	public ThreadTimerEx() {
		setTitle("ThreadTimer Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		TimerThread th = new TimerThread(timerLabel);
		c.add(timerLabel);
		
		setSize(300,150);
		setVisible(true);
		
		th.start();
	}
	
	class TimerThread extends Thread {
		JLabel timerLabel;
		public TimerThread(JLabel timerLabel) {
			this.timerLabel = timerLabel;
		}
		
		@Override
		public void run() {
			super.run();
			
			int n=0;
			while (true) {
				timerLabel.setText(Integer.toString(n));
				n++;
				try {
					Thread.sleep(1000);//1 second.
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return;
				} 
			}
		}
	}
	
	public static void main(String[] args) {
		new ThreadTimerEx();
	}
}
