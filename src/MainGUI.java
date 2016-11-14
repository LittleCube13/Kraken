import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MainGUI extends Kraken implements ActionListener {
	
	static JFrame frame = new JFrame();
	static JPanel win = new JPanel();
	static JMenuBar bar = new JMenuBar();
	static JMenu file = new JMenu("File");
	static JMenuItem open = new JMenuItem();
	static JButton map = new JButton("Map");
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == map) {
			
	}
}
	
	public static void initGUI() {
		frame.add(win);
		frame.setSize(175, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add(map);
		map.setPreferredSize(new Dimension(175, 26));
		frame.setVisible(true);
	}
}