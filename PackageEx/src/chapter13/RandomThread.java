package chapter13;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;

public class RandomThread extends Thread{
	Container contentPane;
	boolean flag = false;
	
	public RandomThread(Container contentPane) {
		this.contentPane = contentPane;
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		flag = true;
	}
	
	@Override
	public void run() {
		super.run();
		
		while (true) {
			int x = ((int)(Math.random()*contentPane.getWidth()));
			int y = ((int)(Math.random()*contentPane.getHeight()));
			JLabel label = new JLabel("Java");
			label.setSize(80, 30);
			label.setLocation(x, y);
			contentPane.add(label);
			contentPane.repaint();
			try {
				Thread.sleep(300);
				if(flag==true) {
					contentPane.removeAll();
					label = new JLabel("finish");
					label.setSize(80, 30);
					label.setLocation(100, 100);
					label.setForeground(Color.RED);
					contentPane.add(label);
					contentPane.repaint();
					return;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
		}
	}
}
