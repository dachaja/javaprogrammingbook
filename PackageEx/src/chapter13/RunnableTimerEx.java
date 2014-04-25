package chapter13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class RunnableTimerEx extends JFrame{
	public RunnableTimerEx() {
		setTitle("Runnable Timer Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);
		
		c.add(timerLabel);
		
		setSize(300, 150);
		setVisible(true);
		
		th.start();
	}
	
	class TimerRunnable implements Runnable {
		JLabel timerLabel;
		
		public TimerRunnable(JLabel timerLabel) {
			this.timerLabel = timerLabel;
		}
		@Override
		public void run() {
			int n=0;
			while (true) {
				timerLabel.setText(Integer.toString(n));
				n++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new RunnableTimerEx();
	}
}
