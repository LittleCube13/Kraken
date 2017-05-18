import javax.swing.*;
import java.io.*;
import java.awt.event.*;

public class NPCEditor extends Kraken implements ActionListener {
	
	static JFrame frame = new JFrame();
	static JPanel win = new JPanel();
	static JButton apply = new JButton("Save NPC");
	static boolean initDone;
	
	public void init() {
		if (!initDone) {
		SwingUtilities.updateComponentTreeUI(frame);
		frame.setSize(600, 375);
		frame.setVisible(true);
		initDone = true;
		} else { lafUpdate(); frame.setVisible(true); }
	}
	
	public void lafUpdate() {
		SwingUtilities.updateComponentTreeUI(frame);
		frame.pack();
	}
	
	public void actionPerformed(ActionEvent e) {
	
	}
}