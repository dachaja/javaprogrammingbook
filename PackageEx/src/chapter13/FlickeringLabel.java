package chapter13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlickeringLabel extends JLabel implements Runnable{
	
	public FlickeringLabel(String text) {
		super(text);
		setOpaque(true);
		
		Thread th = new Thread(this);
		
		th.start();
	}
	@Override
	public void run() {
		int n=0;
		while (true) {
			if(n==0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			if(n==0)
				n=1;
			else
				n=0;
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

