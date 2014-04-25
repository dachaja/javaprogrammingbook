package chaper11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxEx extends JFrame{
	Container contentPane;
	String[] fruits = {"apple","banana","kiwi","mango","pear","peach","berry","strawberry","blackberry"};
	String[] names = {"kitae","jaemoon","hyosoo","namyun"};
	
	public ComboBoxEx() {
		setTitle("ComboBox Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JComboBox<String> strCombo = new JComboBox<String>(fruits);
		contentPane.add(strCombo);
		
		JComboBox<String> nameCombo = new JComboBox<String>();
		for (int i = 0; i < names.length; i++) {
			nameCombo.addItem(names[i]);
		}
		contentPane.add(nameCombo);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComboBoxEx();
	}
}
