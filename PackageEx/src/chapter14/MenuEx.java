package chapter14;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame {
	public MenuEx() {
		setTitle("Menu Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}
	
	void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		
		fileMenu.add(new JMenuItem("New"));
		fileMenu.add(new JMenuItem("Open"));
		fileMenu.addSeparator();
		fileMenu.add(new JMenuItem("Save"));
		fileMenu.add(new JMenuItem("SaveAs"));
		
		mb.add(fileMenu);
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		
		setJMenuBar(mb);
	}
	
	public static void main(String[] args) {
		new MenuEx();
	}
}
