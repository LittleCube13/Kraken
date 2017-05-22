import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.*;
import java.util.*;
import leviathanyaml.*;

public class MiscEditor extends Kraken implements ActionListener {
	
	static JFrame frame = new JFrame("Misc Editor");
	static JPanel atted = new JPanel();
	static boolean initDone;
	static JTabbedPane tabp = new JTabbedPane(SwingConstants.TOP, JTabbedPane.WRAP_TAB_LAYOUT);
	static JMenuBar bar = new JMenuBar();
	static JMenu file = new JMenu("File");
	static JMenuItem close = new JMenuItem("Close");
	static JMenu other = new JMenu("Other");
	static JMenuItem help = new JMenuItem("Help");
	static JLabel lhelp = new JLabel("The Attract Mode pointers point to cutscene labels, so that if the player does not press start for a period of time, the attract mode will be activated and the specified labels will be executed.");
	static JButton jButton1 = new javax.swing.JButton();
	static String pointer1;
	static String pointer2;
	static String pointer3;
	static String pointer4;
	static String pointer5;
	static String pointer6;
	static String pointer7;
	static String pointer8;
	static String pointer9;
	static String pointer10;
	static JTextField jTextField1 = new javax.swing.JTextField();
	static JTextField jTextField2 = new javax.swing.JTextField();
	static JTextField jTextField3 = new javax.swing.JTextField();
	static JTextField jTextField4 = new javax.swing.JTextField();
	static JTextField jTextField5 = new javax.swing.JTextField();
	static JTextField jTextField6 = new javax.swing.JTextField();
	static JTextField jTextField7 = new javax.swing.JTextField();
	static JTextField jTextField8 = new javax.swing.JTextField();
	static JLabel jLabel2 = new javax.swing.JLabel("Pointer 1:");
	static JLabel jLabel3 = new javax.swing.JLabel("Pointer 2:");
	static JLabel jLabel4 = new javax.swing.JLabel("Pointer 3:");
	static JLabel jLabel5 = new javax.swing.JLabel("Pointer 4:");
	static JTextField jTextField9 = new javax.swing.JTextField();
	static JTextField jTextField10 = new javax.swing.JTextField();
	static JLabel jLabel6 = new javax.swing.JLabel("Pointer 5:");
	static JLabel jLabel7 = new javax.swing.JLabel("Pointer 6:");
	static JLabel jLabel8 = new javax.swing.JLabel("Pointer 7:");
	static JLabel jLabel9 = new javax.swing.JLabel("Pointer 8:");
	static JLabel jLabel10 = new javax.swing.JLabel("Pointer 9:");
	static JLabel jLabel11 = new javax.swing.JLabel("Pointer 10:");
	
	public void init() {
		if (!initDone) {
		
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(atted);
		atted.setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(jLabel2)
					.addComponent(jLabel3)
					.addComponent(jLabel10)
					.addComponent(jLabel11)
					.addComponent(jLabel8)
					.addComponent(jLabel9)
					.addComponent(jLabel4)
					.addComponent(jLabel5)
					.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jLabel7)
						.addComponent(jLabel6)))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
					.addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
					.addComponent(jTextField10)
					.addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING)
					.addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING)
					.addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING)
					.addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING)
					.addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
					.addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
					.addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
					.addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING))
				.addContainerGap())
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel2))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel3))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel4))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel5))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel6))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel7))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel8))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel9))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel10))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel11))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		frame.add(tabp);
		tabp.addTab("Attract Mode", atted);
		frame.setJMenuBar(bar);
		bar.add(file);
		bar.add(Box.createHorizontalGlue());
		bar.add(other);
		other.add(help);
		file.add(close);
		close.setAccelerator(ctrlw);
		close.addActionListener(misced);
		help.addActionListener(misced);
		frame.pack();
		lafUpdate();
		frame.setResizable(false);
		frame.setVisible(true);
		initDone = true;
	} else { lafUpdate(); getPointers(); frame.setVisible(true); }
	}
	
	public void setPointers() {
		try {
		File attmod = new File(gui.projectString + File.separator + "attract_mode_txt.yml");
		FileReader fr = new FileReader(attmod);
		BufferedReader buff = new BufferedReader(fr);
		EntryYaml entry = new EntryYaml(attmod);
		String[] stuff = entry.readEntryLines(0);
		System.out.println(stuff[0]);
		String line = "";
		String File = "";
		while (line != null) {
			line = buff.readLine();
			if (line.startsWith("0")) {
				File += line;
				File += "\n";
				for (line = line; !line.startsWith("1"); line = buff.readLine()) {
					if (line.trim().startsWith("//")) {
						File += line;
						File += "\n";
					}
					if (line.lastIndexOf("Pointer:") != -1) {
						File += line.substring(0, line.lastIndexOf(":")) + ": ";
						pointer1 = jTextField1.getText();
						File += pointer1;
						File += "\n";
					}
				}
			}
			if (line.startsWith("1")) {
				File += line;
				File += "\n";
				for (line = line; !line.startsWith("2"); line = buff.readLine()) {
					if (line.trim().startsWith("//")) {
						File += line;
						File += "\n";
					}
					if (line.lastIndexOf("Pointer:") != -1) {
						File += line.substring(0, line.lastIndexOf(":")) + ": ";
						pointer2 = jTextField2.getText();
						File += pointer2;
						File += "\n";
					}
				}
			}
			if (line.startsWith("2")) {
				File += line;
				File += "\n";
				for (line = line; !line.startsWith("3"); line = buff.readLine()) {
					if (line.trim().startsWith("//")) {
						File += line;
						File += "\n";
					}
					if (line.lastIndexOf("Pointer:") != -1) {
						File += line.substring(0, line.lastIndexOf(":")) + ": ";
						pointer3 = jTextField3.getText();
						File += pointer3;
						File += "\n";
					}
				}
			}
			if (line.startsWith("3")) {
				File += line;
				File += "\n";
				for (line = line; !line.startsWith("4"); line = buff.readLine()) {
					if (line.trim().startsWith("//")) {
						File += line;
						File += "\n";
					}
					if (line.lastIndexOf("Pointer:") != -1) {
						File += line.substring(0, line.lastIndexOf(":")) + ": ";
						pointer4 = jTextField4.getText();
						File += pointer4;
						File += "\n";
					}
				}
			}
			if (line.startsWith("4")) {
				File += line;
				File += "\n";
				for (line = line; !line.startsWith("5"); line = buff.readLine()) {
					if (line.trim().startsWith("//")) {
						File += line;
						File += "\n";
					}
					if (line.lastIndexOf("Pointer:") != -1) {
						File += line.substring(0, line.lastIndexOf(":")) + ": ";
						pointer5 = jTextField5.getText();
						File += pointer5;
						File += "\n";
					}
				}
			}
			if (line.startsWith("5")) {
				File += line;
				File += "\n";
				for (line = line; !line.startsWith("6"); line = buff.readLine()) {
					if (line.trim().startsWith("//")) {
						File += line;
						File += "\n";
					}
					if (line.lastIndexOf("Pointer:") != -1) {
						File += line.substring(0, line.lastIndexOf(":")) + ": ";
						pointer6 = jTextField6.getText();
						File += pointer6;
						File += "\n";
					}
				}
			}
			if (line.startsWith("6")) {
				File += line;
				File += "\n";
				for (line = line; !line.startsWith("7"); line = buff.readLine()) {
					if (line.trim().startsWith("//")) {
						File += line;
						File += "\n";
					}
					if (line.lastIndexOf("Pointer:") != -1) {
						File += line.substring(0, line.lastIndexOf(":")) + ": ";
						pointer7 = jTextField7.getText();
						File += pointer7;
						File += "\n";
					}
				}
			}
			if (line.startsWith("7")) {
				File += line;
				File += "\n";
				for (line = line; !line.startsWith("8"); line = buff.readLine()) {
					if (line.trim().startsWith("//")) {
						File += line;
						File += "\n";
					}
					if (line.lastIndexOf("Pointer:") != -1) {
						File += line.substring(0, line.lastIndexOf(":")) + ": ";
						pointer8 = jTextField8.getText();
						File += pointer8;
						File += "\n";
					}
				}
			}
			if (line.startsWith("8")) {
				File += line;
				File += "\n";
				for (line = line; !line.startsWith("9"); line = buff.readLine()) {
					if (line.trim().startsWith("//")) {
						File += line;
						File += "\n";
					}
					if (line.lastIndexOf("Pointer:") != -1) {
						File += line.substring(0, line.lastIndexOf(":")) + ": ";
						pointer9 = jTextField9.getText();
						File += pointer9;
						File += "\n";
					}
				}
			}
			if (line.startsWith("9")) {
				File += line;
				File += "\n";
				for (line = line; line != null; line = buff.readLine()) {
					if (line.trim().startsWith("//")) {
						File += line;
						File += "\n";
					}
					if (line.lastIndexOf("Pointer:") != -1) {
						File += line.substring(0, line.lastIndexOf(":")) + ": ";
						pointer10 = jTextField10.getText();
						File += pointer10;
						File += "\n";
					}
				}
			}
			if (line == null) {
				break;
			}
			if (line.indexOf("//") != -1) {
				File += line;
				File += "\n";
			}
		}
		buff.close();
		FileWriter fw = new FileWriter(attmod);
		BufferedWriter buffw = new BufferedWriter(fw);
		buffw.write(File, 0, File.length());
		buffw.close();
		} catch (Exception sffsfsfsfsfsfsfsfsfs) { System.err.println(sffsfsfsfsfsfsfsfsfs.toString()); }
	}
	
	void getPointers() {
		try {
			File attmod = new File(gui.projectString + File.separator + "attract_mode_txt.yml");
			EntryYaml attmodyml = new EntryYaml(attmod);
			String[] entry = attmodyml.readEntryValues(0);
			jTextField1.setText(entry[0]);
			entry = attmodyml.readEntryValues(1);
			jTextField2.setText(entry[0]);
			entry = attmodyml.readEntryValues(2);
			jTextField3.setText(entry[0]);
			entry = attmodyml.readEntryValues(3);
			jTextField4.setText(entry[0]);
			entry = attmodyml.readEntryValues(4);
			jTextField5.setText(entry[0]);
			entry = attmodyml.readEntryValues(5);
			jTextField6.setText(entry[0]);
			entry = attmodyml.readEntryValues(6);
			jTextField7.setText(entry[0]);
			entry = attmodyml.readEntryValues(7);
			jTextField8.setText(entry[0]);
			entry = attmodyml.readEntryValues(8);
			jTextField9.setText(entry[0]);
			entry = attmodyml.readEntryValues(9);
			jTextField10.setText(entry[0]);
		} catch (Exception shutup) { System.err.println(shutup.toString()); }
	}
	
	public void lafUpdate() {
		SwingUtilities.updateComponentTreeUI(frame);
		frame.pack();
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		
		if (src == close) {
			frame.setVisible(false);
		}
		
		if (src == help) {
		JPanel asdf = new JPanel();
		javax.swing.JLabel jLabel1;
		javax.swing.JLabel jLabel2;
		javax.swing.JLabel jLabel3;
		javax.swing.JLabel jLabel4;
		javax.swing.JLabel jLabel5;
		javax.swing.JLabel jLabel6;
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();

		jLabel1.setText("The Attract Mode pointers point to");

		jLabel2.setText("cutscene labels, so that if the player");

		jLabel3.setText("does not press start for a period of");

		jLabel4.setText("time, the attract mode will be");

		jLabel5.setText("activated and the specified labels will");

		jLabel6.setText("be executed.");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(asdf);
		asdf.setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(jLabel2)
							.addComponent(jLabel3)
							.addComponent(jLabel4)
							.addComponent(jLabel5)
							.addComponent(jLabel6))
						.addGap(0, 2, Short.MAX_VALUE)))
				.addContainerGap())
			.addGroup(layout.createSequentialGroup()
				.addGap(83, 83, 83))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addGap(26, 26, 26)
				.addComponent(jLabel1)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jLabel2)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jLabel3)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jLabel4)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jLabel5)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jLabel6)
				.addGap(88, 88, 88))
		);
		JOptionPane dia = new JOptionPane();
		int result = JOptionPane.showOptionDialog(null, asdf, "Help", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[]{ "Close" }, "default");
		lafUpdate();
		}
	}
}