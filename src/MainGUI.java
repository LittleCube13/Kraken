import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MainGUI extends Kraken implements ActionListener {
	
	static MainGUI app = new MainGUI();
	static JFrame frame = new JFrame();
	static JPanel win = new JPanel();
	static JMenuBar bar = new JMenuBar();
	static JMenu file = new JMenu("File");
	static JMenu laf = new JMenu("Look and Feel");
	static JMenuItem open = new JMenuItem("Open");
	static JMenuItem exit = new JMenuItem("Exit");
	static ButtonGroup g = new ButtonGroup();
	static JRadioButtonMenuItem sys = new JRadioButtonMenuItem("", true);
	static JRadioButtonMenuItem metal = new JRadioButtonMenuItem("Metal");
	static JRadioButtonMenuItem nimbus = new JRadioButtonMenuItem("Nimbus");
	static JButton map = new JButton("Map");
	static JButton ccs = new JButton("CCScript");
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == map) {
		}
		
		if (src == sys) {
			try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(frame);
			frame.pack();
		} catch (Exception exc) {}
		}
		
		if (src == nimbus) {
			try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(frame);
			frame.pack();
		} catch (Exception exc) {}
		}
		
		if (src == metal) {
			try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			SwingUtilities.updateComponentTreeUI(frame);
			frame.pack();
		} catch (Exception exc) {}
		}
		
}
	
	public static void initGUI() {
		if (UIManager.getSystemLookAndFeelClassName() == "com.apple.laf.AquaLookAndFeel") {
				sys.setText("Mac OS X");
			} else { sys.setText("System"); }
		frame.add(win);
		frame.setSize(175, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add(ccs);
		ccs.setPreferredSize(new Dimension(175, 26));
//		win.add(map);
		map.setPreferredSize(new Dimension(175, 26));
		frame.setJMenuBar(bar);
		bar.add(file);
		file.add(laf);
		laf.add(sys);
		laf.add(metal);
		laf.add(nimbus);
		g.add(sys);
		g.add(metal);
		g.add(nimbus);
		sys.addActionListener(app);
		metal.addActionListener(app);
		nimbus.addActionListener(app);
		frame.setVisible(true);
	}
}