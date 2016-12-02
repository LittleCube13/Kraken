import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MainGUI extends Kraken implements ActionListener {
	
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
	static JButton npcs = new JButton("NPCs");
	static JButton battle = new JButton("Battle");
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == map) {
		}
		
		if (src == npcs) {
			npce.init();
		}
		
		if (src == ccs) {
			ccsm.init();
		}
		
		if (src == sys) {
			try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(frame);
			npce.lafUpdate();
			ccsm.lafUpdate();
		} catch (Exception exc) {}
		}
		
		if (src == nimbus) {
			try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(frame);
			npce.lafUpdate();
			ccsm.lafUpdate();
		} catch (Exception exc) {}
		}
		
		if (src == metal) {
			try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			SwingUtilities.updateComponentTreeUI(frame);
			npce.lafUpdate();
			ccsm.lafUpdate();
		} catch (Exception exc) {}
		}
		
		if (src == exit) {
			System.exit(0);
		}
		
}
	
	public static void initGUI() {
		if (UIManager.getSystemLookAndFeelClassName() == "com.apple.laf.AquaLookAndFeel") {
				sys.setText("Mac OS X");
			} else { sys.setText("System"); }
		frame.add(win);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add(ccs);
		win.add(map);
		win.add(npcs);
		win.add(battle);
		map.setEnabled(false);
		npcs.setEnabled(false);
		battle.setEnabled(false);
		ccs.addActionListener(gui);
		map.addActionListener(gui);
		npcs.addActionListener(gui);
		battle.addActionListener(gui);
		ccs.setPreferredSize(new Dimension(175, 26));
		map.setPreferredSize(new Dimension(175, 26));
		npcs.setPreferredSize(new Dimension(175, 26));
		battle.setPreferredSize(new Dimension(175, 26));
		frame.setJMenuBar(bar);
		bar.add(file);
		file.add(laf);
		file.add(exit);
		exit.setAccelerator(ctrlq);
		exit.addActionListener(gui);
		laf.add(sys);
		laf.add(metal);
		laf.add(nimbus);
		g.add(sys);
		g.add(metal);
		g.add(nimbus);
		sys.addActionListener(gui);
		metal.addActionListener(gui);
		nimbus.addActionListener(gui);
		frame.setVisible(true);
		frame.setSize(190, 174);
		frame.setResizable(false);
	}
}