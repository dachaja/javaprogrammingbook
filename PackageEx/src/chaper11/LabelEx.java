package chaper11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame{
	Container contentPane;
	public LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("사랑합니다.");
		
		ImageIcon beauty = new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter11/beauty.jpg");
		JLabel imageLabel = new JLabel(beauty);
		
		ImageIcon normalIcon = new ImageIcon("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter11/normalIcon.gif");
		JLabel label = new JLabel("보고싶으면 전화하세요.", normalIcon, SwingConstants.CENTER);
		
		contentPane.add(textLabel);
		contentPane.add(imageLabel);
		contentPane.add(label);
		
		setSize(400, 600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LabelEx();
	}
}
