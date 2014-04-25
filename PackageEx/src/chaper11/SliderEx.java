package chaper11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class SliderEx extends JFrame{
	Container contentPane;
	public SliderEx() {
		setTitle("Slider Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		
		contentPane.add(slider);
		setSize(300,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SliderEx();
	}
}
