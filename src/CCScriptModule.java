import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class CCScriptModule extends Kraken implements ActionListener {
	
	static JFrame frame = new JFrame("CCScript Utility");
	static JPanel diffTab = new JPanel();
	static JFileChooser fco = new JFileChooser();
	static JMenuBar bar = new JMenuBar();
	static File f;
	static File fs;
	public static File ROM;
	public static File hackROM;
	static byte[] rombytes;
	static FileInputStream is;
	static JMenu file = new JMenu("File");
	static JMenuItem newf = new JMenuItem("New");
	static JMenuItem open = new JMenuItem("Open Kraken CCS File");
	static JMenuItem save = new JMenuItem("Save");
	static JMenuItem close = new JMenuItem("Close");
	static JButton openROM = new JButton("Open Clean ROM");
	static JButton hackROMbutton = new JButton("Open Hacked ROM");
	static JTextField currentCleanFile = new JTextField(20);
	static JTextField currentHackFile = new JTextField(20);
	static JTabbedPane tabp = new JTabbedPane(SwingConstants.TOP, JTabbedPane.WRAP_TAB_LAYOUT);
	static JOptionPane dia = new JOptionPane();
	static boolean initDone = false;
	
	public void init() {
	if (!initDone) {
		frame.setSize(500, 350);
		frame.setVisible(true);
		frame.setJMenuBar(bar);
		bar.add(file);
		file.add(newf);
		newf.addActionListener(ccsm);
		newf.setAccelerator(ctrln);
		newf.setEnabled(false);
		file.add(open);
		open.addActionListener(ccsm);
		open.setAccelerator(ctrlo);
		open.setEnabled(false);
		file.add(save);
		save.addActionListener(ccsm);
		save.setAccelerator(ctrls);
		save.setEnabled(false);
		file.addSeparator();
		file.add(close);
		close.addActionListener(ccsm);
		close.setAccelerator(ctrlw);
		frame.add(tabp);
		tabp.addTab("ROM Diff to CCS", diffTab);
		initTabs();
		openROM.addActionListener(ccsm);
		fco.setFileFilter(new FileNameExtensionFilter("SNES ROMs: .smc, .sfc", "smc", "sfc"));
		fco.setAcceptAllFileFilterUsed(false);
		lafUpdate();
		initDone = true;
	} else { frame.setVisible(true); }
	}
	
	public void initTabs() {
		diffTab.add(openROM);
		diffTab.add(currentCleanFile);
		diffTab.add(hackROMbutton);
		diffTab.add(currentHackFile);
	}
	
	public void lafUpdate() {
		SwingUtilities.updateComponentTreeUI(frame);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == close) {
			frame.setVisible(false);
		}
		
		if (src == openROM) {
			SwingUtilities.updateComponentTreeUI(fco);
			fco.setFileSelectionMode(JFileChooser.FILES_ONLY);
				int fcs = fco.showOpenDialog(null);
				
				if (fcs == JFileChooser.APPROVE_OPTION) {
				ROM = fco.getSelectedFile();
				dia.showMessageDialog(frame, "Kraken has created a ccs file of your diff.", "Success!", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
		if (src == open) {
			SwingUtilities.updateComponentTreeUI(fco);
			fco.setFileSelectionMode(JFileChooser.FILES_ONLY);
				int fcs = fco.showOpenDialog(null);
				
				if (fcs == JFileChooser.APPROVE_OPTION) {
				f = fco.getSelectedFile();
			}
		}
		
	}
	
}