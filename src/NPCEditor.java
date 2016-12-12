import javax.swing.*;
import java.io.*;
import java.awt.event.*;

public class NPCEditor extends Kraken implements ActionListener {
	
	static JFrame frame = new JFrame();
	static JPanel win = new JPanel();
	static JButton apply = new JButton("Save NPC");
	
	public void init() {
		SwingUtilities.updateComponentTreeUI(frame);
		frame.setSize(600, 375);
		frame.setVisible(true);
	}
	
	public void lafUpdate() {
		SwingUtilities.updateComponentTreeUI(frame);
	}
	
	public void actionPerformed(ActionEvent e) {
	
	}
	
}