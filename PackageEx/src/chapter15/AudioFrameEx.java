package chapter15;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AudioFrameEx extends JFrame{
	public AudioFrameEx() {
		setTitle("JFrame Audio player");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300, 150);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		AudioClip clip = null;
		JButton btn[] = new JButton[2];
		
		public MyPanel() {
			setBackground(Color.ORANGE);
			setLayout(new FlowLayout());
			
			MyActionListener listener = new MyActionListener();
			btn[0] = new JButton("Play");
			btn[1] = new JButton("Stop");
			for (int i = 0; i < btn.length; i++) {
				add(btn[i]);
				btn[i].addActionListener(listener);
			}
			
			URL audioURL = getClass().getResource("ToYou.mid");
			clip = Applet.newAudioClip(audioURL);
		}
		
		class MyActionListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Play"))
					clip.play();
				else
					clip.stop();
			}
			
		}
	}
	
	public static void main(String[] args) {
		new AudioFrameEx();
	}
}
