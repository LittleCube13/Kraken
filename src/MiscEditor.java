import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.*;

public class MiscEditor extends Kraken implements ActionListener {
	
	static JFrame frame = new JFrame("Misc Editor");
	static JPanel atted = new JPanel();
	static boolean initDone;
	static JTabbedPane tabp = new JTabbedPane(SwingConstants.TOP, JTabbedPane.WRAP_TAB_LAYOUT);
	static JMenuBar bar = new JMenuBar();
	static JMenu file = new JMenu("File");
	static JMenuItem close = new JMenuItem("Close");
	static JMenu help = new JMenu("Help");
	static JMenuItem about = new JMenuItem("About...");
	static JFrame helpf = new JFrame("Attract Mode Help");
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
        bar.add(help);
        file.add(close);
        close.setAccelerator(ctrlw);
        close.addActionListener(misced);
        help.add(about);
        about.addActionListener(misced);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
        lafUpdate();
        initDone = true;
	} else { lafUpdate(); getPointers(); frame.setVisible(true); }
	}
	
	public void setPointers() {
		try {
		File attmod = new File(gui.projectString + "/attract_mode_txt.yml");
		FileReader fr = new FileReader(attmod);
		BufferedReader buff = new BufferedReader(fr);
		String line = "";
		String File = "";
		while (line != null) {
			line = buff.readLine();
			System.out.println(line);
			System.out.println(File);
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
			System.out.println("we made it here");
		}
		buff.close();
		FileWriter fw = new FileWriter(attmod);
		BufferedWriter buffw = new BufferedWriter(fw);
		buffw.write(File, 0, File.length());
		System.out.println(File);
		buffw.close();
		} catch (Exception sffsfsfsfsfsfsfsfsfs) { System.err.println(sffsfsfsfsfsfsfsfsfs.toString()); }
	}
	
	void getPointers() {
		try {
		File attmod = new File(gui.projectString + "/attract_mode_txt.yml");
		FileReader fr = new FileReader(attmod);
		BufferedReader buff = new BufferedReader(fr);
		String line = "";
		while (line != null) {
			line = buff.readLine();
			if (line.startsWith("0")) {
				for (line = line; !line.startsWith("1"); line = buff.readLine()) {
					if (line.lastIndexOf("Pointer:") != -1) {
						pointer1 = line.substring(line.lastIndexOf(":") + 2, line.length());
						jTextField1.setText(pointer1);
					}
				}
			}
			if (line.startsWith("1")) {
				for (line = line; !line.startsWith("2"); line = buff.readLine()) {
					if (line.lastIndexOf("Pointer:") != -1) {
						pointer2 = line.substring(line.lastIndexOf(":") + 2, line.length());
						jTextField2.setText(pointer2);
					}
				}
			}
			if (line.startsWith("2")) {
				for (line = line; !line.startsWith("3"); line = buff.readLine()) {
					if (line.lastIndexOf("Pointer:") != -1) {
						pointer3 = line.substring(line.lastIndexOf(":") + 2, line.length());
						jTextField3.setText(pointer3);
					}
				}
			}
			if (line.startsWith("3")) {
				for (line = line; !line.startsWith("4"); line = buff.readLine()) {
					if (line.lastIndexOf("Pointer:") != -1) {
						pointer4 = line.substring(line.lastIndexOf(":") + 2, line.length());
						jTextField4.setText(pointer4);
					}
				}
			}
			if (line.startsWith("4")) {
				for (line = line; !line.startsWith("5"); line = buff.readLine()) {
					if (line.lastIndexOf("Pointer:") != -1) {
						pointer5 = line.substring(line.lastIndexOf(":") + 2, line.length());
						jTextField5.setText(pointer5);
					}
				}
			}
			if (line.startsWith("5")) {
				for (line = line; !line.startsWith("6"); line = buff.readLine()) {
					if (line.lastIndexOf("Pointer:") != -1) {
						pointer6 = line.substring(line.lastIndexOf(":") + 2, line.length());
						jTextField6.setText(pointer6);
					}
				}
			}
			if (line.startsWith("6")) {
				for (line = line; !line.startsWith("7"); line = buff.readLine()) {
					if (line.lastIndexOf("Pointer:") != -1) {
						pointer7 = line.substring(line.lastIndexOf(":") + 2, line.length());
						jTextField7.setText(pointer7);
					}
				}
			}
			if (line.startsWith("7")) {
				for (line = line; !line.startsWith("8"); line = buff.readLine()) {
					if (line.lastIndexOf("Pointer:") != -1) {
						pointer8 = line.substring(line.lastIndexOf(":") + 2, line.length());
						jTextField8.setText(pointer8);
					}
				}
			}
			if (line.startsWith("8")) {
				for (line = line; !line.startsWith("9"); line = buff.readLine()) {
					if (line.lastIndexOf("Pointer:") != -1) {
						pointer9 = line.substring(line.lastIndexOf(":") + 2, line.length());
						jTextField9.setText(pointer9);
					}
				}
			}
			if (line.startsWith("9")) {
				for (line = line; line != null; line = buff.readLine()) {
					if (line.lastIndexOf("Pointer:") != -1) {
						pointer10 = line.substring(line.lastIndexOf(":") + 2, line.length());
						jTextField10.setText(pointer10);
					}
				}
			}
		}
		} catch (Exception shutup) { System.err.println(shutup.toString()); }
	}
	
	public void lafUpdate() {
		SwingUtilities.updateComponentTreeUI(frame);
		frame.pack();
		SwingUtilities.updateComponentTreeUI(helpf);
		helpf.pack();
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == jButton1) {
			helpf.setVisible(false);
		}
		
		if (src == close) {
			frame.setVisible(false);
		}
		
		if (src == about) {
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
        
        jButton1.addActionListener(misced);

        jLabel1.setText("The Attract Mode pointers point to");

        jLabel2.setText("cutscene labels, so that if the player");

        jLabel3.setText("does not press start for a period of");

        jLabel4.setText("time, the attract mode will be");

        jLabel5.setText("activated and the specified labels will");

        jLabel6.setText("be executed.");

        jButton1.setText("Close");

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
                .addGap(83, 83, 83)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(88, 88, 88)
                .addComponent(jButton1)
                .addContainerGap())
        );
        helpf.add(asdf);
        helpf.pack();
        helpf.setVisible(true);
		}
	}
}