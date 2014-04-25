package chaper11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame{
	Container contentPane;
	public TextFieldEx() {
		setTitle("TextField Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("name : "));
		contentPane.add(new JTextField(10));
		contentPane.add(new JLabel("subject : "));
		contentPane.add(new JTextField("computer science"));
		contentPane.add(new JLabel("address : "));
		contentPane.add(new JTextField("Seoul...",20));
		
		setSize(350,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextFieldEx();
	}
}
