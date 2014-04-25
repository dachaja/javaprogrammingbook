package chapter14;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MenuAndFileDialogEx extends JFrame{
	Container contentPane;
	JLabel imageLabel = new JLabel();
	
	public MenuAndFileDialogEx() {
		setTitle("Menu and JFileChooser Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.add(imageLabel);
		createMenu();
		setSize(300, 200);
		setVisible(true);
	}
	
	void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open");
		
		openItem.addActionListener(new OpenActionListener());
		fileMenu.add(openItem);
		mb.add(fileMenu);
		this.setJMenuBar(mb);
	}
	
	class OpenActionListener implements ActionListener {
		JFileChooser chooser;
		
		public OpenActionListener() {
			chooser = new JFileChooser();
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
			chooser.setFileFilter(filter);
			
			int ret = chooser.showOpenDialog(null);
			if(ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "Didn't select a file.","Warning",JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			String filePath = chooser.getSelectedFile().getPath();
			imageLabel.setIcon(new ImageIcon(filePath));
			pack();
		}
	}
	
	public static void main(String[] args) {
		new MenuAndFileDialogEx();
	}
}
