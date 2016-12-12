import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class CCScriptModule extends Kraken implements ActionListener {
	
	static JFrame frame = new JFrame("CCScript Utility");
	static JFrame fcframe = new JFrame();
	static JPanel tScTab = new JPanel();
	static JFileChooser fco = new JFileChooser();
	static JMenuBar bar = new JMenuBar();
	static File f;
	static File fs;
	public static File ROM;
	static FileInputStream is;
	static JMenu file = new JMenu("File");
	static JMenuItem newf = new JMenuItem("New");
	static JMenuItem open = new JMenuItem("Open Kraken CCS File");
	static JMenuItem save = new JMenuItem("Save");
	static JMenuItem close = new JMenuItem("Close");
	static JButton openROM = new JButton("Open ROM");
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
		tabp.addTab("Title Screen to CCS", tScTab);
		tScTab.add(openROM);
		openROM.addActionListener(ccsm);
		fco.setFileFilter(new FileNameExtensionFilter("SNES ROMs: .smc, .sfc", "smc", "sfc"));
		fco.setAcceptAllFileFilterUsed(false);
		lafUpdate();
		initDone = true;
	} else { frame.setVisible(true); }
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
				int fcs = fco.showOpenDialog(fcframe);
				
				if (fcs == JFileChooser.APPROVE_OPTION) {
				ROM = fco.getSelectedFile();
				try {
				is = new FileInputStream(ROM);
				is.read(rombytes, 0, rombytes.length);
				is.close();
				File fi = new File(ROM.getParent() + "/title_screen.ccs");
				ttccs.CCSFile(rombytes, fi);
				dia.showMessageDialog(frame, "Kraken has converted your title screen to a CCS file.", "Success!", JOptionPane.INFORMATION_MESSAGE);
				} catch (IOException whatever) { System.err.println(whatever.toString()); }
			}
		}
		
		if (src == open) {
			SwingUtilities.updateComponentTreeUI(fco);
			fco.setFileSelectionMode(JFileChooser.FILES_ONLY);
				int fcs = fco.showOpenDialog(fcframe);
				
				if (fcs == JFileChooser.APPROVE_OPTION) {
				f = fco.getSelectedFile();
			}
		}
		
	}
	
}