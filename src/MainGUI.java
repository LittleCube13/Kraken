import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.event.*;
import java.awt.*;

public class MainGUI extends Kraken implements ActionListener {
	
	static JFrame frame = new JFrame("No Project Selected");
	static JPanel win = new JPanel();
	static JMenuBar bar = new JMenuBar();
	static JMenu file = new JMenu("File");
	static JMenu options = new JMenu("Options");
	static JCheckBoxMenuItem openlastproject = new JCheckBoxMenuItem("Load Last Project at Startup");
	static JMenu laf = new JMenu("Look and Feel");
	static JMenuItem open = new JMenuItem("Open");
	static JMenuItem save = new JMenuItem("Save");
	static JMenuItem exit = new JMenuItem("Exit");
	static ButtonGroup g = new ButtonGroup();
	static JRadioButtonMenuItem sys = new JRadioButtonMenuItem("", true);
	static JRadioButtonMenuItem metal = new JRadioButtonMenuItem("Metal");
	static JRadioButtonMenuItem nimbus = new JRadioButtonMenuItem("Nimbus");
	static JFileChooser fco = new JFileChooser();
	public static File currentProject;
	public static String projectString;
	public static int LAF;
	static JButton map = new JButton("Map");
	static JButton ccs = new JButton("CCScript");
	static JButton npcs = new JButton("NPCs");
	static JButton battle = new JButton("Battle");
	static JButton misc = new JButton("Misc.");
	static boolean initDone;
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == open) {
			SwingUtilities.updateComponentTreeUI(fco);
			fco.setFileSelectionMode(JFileChooser.FILES_ONLY);
				int fcs = fco.showOpenDialog(null);
				
				if (fcs == JFileChooser.APPROVE_OPTION) {
				currentProject = new File(fco.getSelectedFile().getParent());
				projectString = currentProject.toString();
				frame.setTitle(projectString.substring(projectString.lastIndexOf("/") + 1, projectString.length()));
				ccs.setEnabled(true);
				misc.setEnabled(true);
				prfs.setLastProject(currentProject);
				System.out.println(currentProject.toString());
			}
		}
		
		if (src == save) {
			misced.setPointers();
		}
		
		if (src == map) {
		}
		
		if (src == npcs) {
			npce.init();
		}
		
		if (src == ccs) {
			ccsm.init();
		}
		
		if (src == misc) {
			misced.init();
		}
		
		if (src == sys) {
			try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(frame);
			npce.lafUpdate();
			ccsm.lafUpdate();
			misced.lafUpdate();
			frame.pack();
			LAF = 0;
			prfs.setLAF(LAF);
		} catch (Exception exc) {}
		}
		
		if (src == nimbus) {
			try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(frame);
			npce.lafUpdate();
			ccsm.lafUpdate();
			misced.lafUpdate();
			frame.pack();
			LAF = 1;
			prfs.setLAF(LAF);
		} catch (Exception exc) {}
		}
		
		if (src == metal) {
			try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			SwingUtilities.updateComponentTreeUI(frame);
			npce.lafUpdate();
			ccsm.lafUpdate();
			misced.lafUpdate();
			frame.pack();
			LAF = 2;
			prfs.setLAF(LAF);
		} catch (Exception exc) {}
		}
		
		if (src == openlastproject) {
			prfs.setOpenAtStart(openlastproject.getState());
		}
		
		if (src == exit) {
			System.exit(0);
		}
		
}
	
	public static void initGUI() {
	
	if (!initDone) {	
		if (UIManager.getSystemLookAndFeelClassName() == "com.apple.laf.AquaLookAndFeel") {
								sys.setText("Mac OS X");
                                sys.setSelected(true);
                                metal.setSelected(false);
			} else {
            sys.setText("System");
            sys.setSelected(false);
            metal.setSelected(true);
        }
		frame.add(win);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GroupLayout layout = new GroupLayout(win);
		ccs.setPreferredSize(new Dimension(175, 26));
		map.setPreferredSize(new Dimension(175, 26));
		npcs.setPreferredSize(new Dimension(175, 26));
		battle.setPreferredSize(new Dimension(175, 26));
		win.setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		layout.setHorizontalGroup(layout.createParallelGroup().addComponent(ccs).addComponent(map).addComponent(npcs).addComponent(battle).addComponent(misc));
		layout.setVerticalGroup(layout.createSequentialGroup().addComponent(ccs).addComponent(map).addComponent(npcs).addComponent(battle).addComponent(misc));
		layout.linkSize(ccs, map, npcs, battle, misc);
		ccs.setEnabled(false);
		map.setEnabled(false);
		npcs.setEnabled(false);
		battle.setEnabled(false);
		misc.setEnabled(false);
		ccs.addActionListener(gui);
		map.addActionListener(gui);
		npcs.addActionListener(gui);
		battle.addActionListener(gui);
		misc.addActionListener(gui);
		frame.setJMenuBar(bar);
		bar.add(file);
		bar.add(options);
		options.add(openlastproject);
		openlastproject.addActionListener(gui);
		file.add(open);
		file.add(save);
		file.add(laf);
		file.add(exit);
		open.setAccelerator(ctrlo);
		open.addActionListener(gui);
		save.setAccelerator(ctrls);
		save.addActionListener(gui);
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
		frame.pack();
//		frame.setSize(190, 174);
		frame.setResizable(false);
		fco.setFileFilter(new FileNameExtensionFilter("Snakey snakey eggs and bakey (.snake)", "snake"));
		fco.setAcceptAllFileFilterUsed(false);
		if (!prfs.dir.exists()) {
			prfs.createNewPreferences();
		} else {
			prfs.getAll();
			if (openlastproject.getState()) {
			projectString = currentProject.toString();
			frame.setTitle(projectString.substring(projectString.lastIndexOf("/") + 1, projectString.length()));
			ccs.setEnabled(true);
			misc.setEnabled(true);
		}
			try {
			if (LAF == 0) {
			sys.setSelected(true);
			nimbus.setSelected(false);
			metal.setSelected(false);
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(frame);
			npce.lafUpdate();
			ccsm.lafUpdate();
			frame.pack();
			}
			if (LAF == 1) {
			sys.setSelected(false);
			nimbus.setSelected(true);
			metal.setSelected(false);
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(frame);
			npce.lafUpdate();
			ccsm.lafUpdate();
			frame.pack();
			}
			if (LAF == 2) {
			sys.setSelected(false);
			nimbus.setSelected(false);
			metal.setSelected(true);
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			SwingUtilities.updateComponentTreeUI(frame);
			npce.lafUpdate();
			ccsm.lafUpdate();
			frame.pack();
		}
	} catch (Exception asdfjkl) {}
}
		
		misced.getPointers();
		
		initDone = true;
	} else { frame.setVisible(true); }
	}
}