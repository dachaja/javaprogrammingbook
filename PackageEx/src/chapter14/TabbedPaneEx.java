package chapter14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPaneEx extends JFrame{
	Container contentPane;
	public TabbedPaneEx() {
		setTitle("Tabpanel Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		JTabbedPane pane = createTabbedPane();
		contentPane.add(pane, BorderLayout.CENTER);
		setSize(250, 250);
		setVisible(true);
	}
	
	JTabbedPane createTabbedPane() {
		JTabbedPane pane = new JTabbedPane();
		pane.addTab("tab1", new JLabel(new ImageIcon("/Users/adokalways/Documents/pictures/moonbipics/_MG_7985.JPG")));
		pane.addTab("tab2", new JLabel(new ImageIcon("/Users/adokalways/Documents/pictures/moonbipics/_MG_7986.JPG")));
		pane.addTab("tab3", new MyPanel());
		
		return pane;
	}
	
	class MyPanel extends JPanel {
		public MyPanel() {
			this.setBackground(Color.YELLOW);
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			
			g.setColor(Color.RED);
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.BLUE);
			g.fillOval(10, 70, 50, 50);
			g.setColor(Color.BLACK);
			g.drawString("Tab 3 JPanel", 30, 50);
		}
	}
	
	public static void main(String[] args) {
		new TabbedPaneEx();
	}
}
