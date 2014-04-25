package chaper11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import chapter7.MyStack;

public class TextAreaEx extends JFrame{
	Container contentPane;
	public TextAreaEx() {
		setTitle("TextArea Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		
		contentPane.add(new MyCenterPanel(), BorderLayout.CENTER);
		
		setSize(300,300);
		setVisible(true);
	}
	
	class MyCenterPanel extends JPanel {
		JTextField tf;
		JButton btn;
		JTextArea ta;
		public MyCenterPanel() {
			tf = new JTextField(20);
			btn = new JButton("append");
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					ta.append(tf.getText() + "\n");
				}
			});
			
			ta = new JTextArea("hello\n",7,20);
			add(new JLabel("type the sentence and click button to append it to textarea."));
			add(tf);
			add(btn);
			add(new JScrollPane(ta));
		}
	}
	
	public static void main(String[] args) {
		new TextAreaEx();
	}
}
