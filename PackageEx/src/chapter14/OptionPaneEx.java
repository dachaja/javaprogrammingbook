package chapter14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class OptionPaneEx extends JFrame{
	Container contentPane;
	
	public OptionPaneEx() {
		setTitle("OptionPane Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		setSize(500, 200);
		contentPane.add(new MyPanel(), BorderLayout.NORTH);
		setVisible(true);
	}
	
	class MyPanel extends Panel {
		JButton inputBtn = new JButton("Input Name");
		JTextField tf = new JTextField(10);
		JButton confirmBtn = new JButton("Confirm");
		JButton messageBtn = new JButton("Message");
		
		public MyPanel() {
			setBackground(Color.LIGHT_GRAY);
			add(inputBtn);
			add(confirmBtn);
			add(messageBtn);
			add(tf);
			
			inputBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("Enter name");
					if(name != null)
						tf.setText(name);
				}
			});
			
			confirmBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null, "Are you continuing?","Confirm",JOptionPane.YES_NO_OPTION);
					
					if(result == JOptionPane.CLOSED_OPTION)
						tf.setText("Just Closed without selection");
					else if(result == JOptionPane.YES_OPTION)
						tf.setText("Yes");
					else
						tf.setText("No");
				}
			});
			
			messageBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Be careful.","Message",JOptionPane.ERROR_MESSAGE);
				}
			});
		}
	}
	
	public static void main(String[] args) {
		new OptionPaneEx();
	}
}
