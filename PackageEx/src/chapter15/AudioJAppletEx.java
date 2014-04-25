package chapter15;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AudioJAppletEx extends JApplet{
	AudioClip clip = null;
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		
		setContentPane(new MyPanel());
		URL audioURL = getClass().getResource("ToYou.mid");
		clip = Applet.newAudioClip(audioURL);
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
		
		if(clip!=null)
			clip.play();
		((MyPanel)getContentPane()).setText("start playing");
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
		
		if(clip!=null)
			clip.stop();
	}
	
	class MyPanel extends JPanel {
		JLabel label = new JLabel();
		public MyPanel() {
			add(label);
		}
		void setText(String text) {
			label.setText(text);
		}
	}
}
