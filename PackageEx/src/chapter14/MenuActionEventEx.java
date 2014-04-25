package chapter14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class MenuActionEventEx extends JFrame{
	Container contentPane;
	JLabel label = new JLabel("Hello");
	
	public MenuActionEventEx() {
		setTitle("Menu add ActionEvent Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label, BorderLayout.CENTER);
		createMenu();
		setSize(250,200);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem[] menuItem = new JMenuItem[4];
		String[] itemTitle = {"Color", "Font", "Top", "Bottom"};
		JMenu fileMenu = new JMenu("Text");
		
		for (int i = 0; i < menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(new MenuActionListener());
			
			fileMenu.add(menuItem[i]);
		}
		mb.add(fileMenu);
		setJMenuBar(mb);
	}
	
	class MenuActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(cmd.equals("Color"))
				label.setForeground(Color.BLUE);
			else if(cmd.equals("Font"))
				label.setFont(new Font("Ravie", Font.ITALIC, 30));
			else if(cmd.equals("Top"))
				label.setVerticalAlignment(SwingConstants.TOP);
			else
				label.setVerticalAlignment(SwingConstants.BOTTOM);
		}
	}
	
	public static void main(String[] args) {
		new MenuActionEventEx();
	}
}
