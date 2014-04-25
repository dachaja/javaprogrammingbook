package chaper11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEventEx extends JFrame {
	Container contentPane;
	JCheckBox[] fruits = new JCheckBox[3];
	String[] names = {"apple","pear","cherry"};
	JLabel sumLabel;
	int sum = 0;
	
	public CheckBoxItemEventEx() {
		setTitle("Checkbox and ItemEvent example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("apple 100 won, pear 500 won, cherry 20000 won"));
		
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			contentPane.add(fruits[i]);
			fruits[i].addItemListener(new MyItemListener());
		}
		
		sumLabel = new JLabel("It is 0 won now.");
		contentPane.add(sumLabel);
		
		setSize(250,200);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			int selected = 1;
			if(e.getStateChange() == ItemEvent.SELECTED) {
				selected = 1;
			} else {
				selected = -1;
			}
			
			if(e.getItem() == fruits[0])
				sum = sum + selected * 100;
			else if(e.getItem() == fruits[1])
				sum = sum + selected * 500;
			else
				sum = sum + selected * 20000;
			
			sumLabel.setText("It is " + sum + " now.");
		}
		
	}
	
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}

}
