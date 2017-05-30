import javax.swing.*;
import java.io.*;
import java.util.*;

import leviathanyaml.*;

public class BattleEditor extends Kraken {
	
	static JFrame frame = new JFrame("Battle Editor");
	static JPanel battactwin = new JPanel();
	static JTabbedPane tabp = new JTabbedPane(SwingConstants.TOP, JTabbedPane.WRAP_TAB_LAYOUT);
	static javax.swing.JComboBox<String> jComboBox1;
	static javax.swing.JComboBox<String> jComboBox2;
	static javax.swing.JComboBox<String> jComboBox4;
	static javax.swing.JComboBox<String> jComboBox5;
	static javax.swing.JLabel jLabel1;
	static javax.swing.JLabel jLabel2;
	static javax.swing.JLabel jLabel3;
	static javax.swing.JLabel jLabel4;
	static javax.swing.JLabel jLabel5;
	static javax.swing.JLabel jLabel6;
	static javax.swing.JLabel jLabel7;
	static javax.swing.JTextField jTextField1;
	static javax.swing.JTextField jTextField2;
	static javax.swing.JTextField jTextField3;
	static String[][][] entries;
	static int currEntry = 0;
	static List<Integer> entriestoedit = new ArrayList<Integer>();
	static boolean initDone = false;
	
	public void lafUpdate() {
		SwingUtilities.updateComponentTreeUI(frame);
		frame.pack();
	}
	
	public void init() {
		frame.setVisible(true);
	}
	
	public void initGUI() {
		if (!initDone) {
		jComboBox1 = new javax.swing.JComboBox<>();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jComboBox2 = new javax.swing.JComboBox<>();
		jTextField1 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jComboBox4 = new javax.swing.JComboBox<>();
		jLabel4 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jComboBox5 = new javax.swing.JComboBox<>();
		jLabel6 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				setEntry(Integer.parseInt(jComboBox1.getSelectedItem().toString()));
			}
		});

		jLabel1.setText("Entry:");

		jLabel2.setText("Action Type:");

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "psi", "item", "physical (affected by shields and defending)", "physical (unaffected by shields and defending)", "other", "nothing" }));

		jLabel3.setText("Code Address:");

		jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "party", "enemy" }));

		jLabel4.setText("Direction:");

		jLabel5.setText("PP Cost:");

		jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "all", "one", "row", "random", "none" }));

		jLabel6.setText("Target:");

		jLabel7.setText("Text Address:");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(battactwin);
		battactwin.setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
					.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
						.addComponent(jLabel1)
						.addGap(4, 4, 4)
						.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
					.addGroup(layout.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
							.addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
							.addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
							.addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
							.addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
							.addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
							.addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.TRAILING, 0, 344, Short.MAX_VALUE)
							.addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
							.addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
							.addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(jTextField3))))
				.addContainerGap())
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel1))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jLabel2)
					.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel3))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel4))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel5))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel6))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel7))
				.addContainerGap())
		);
		File battfile = new File(gui.projectString + File.separator + "battle_action_table.yml");
		EntryYaml battactyml = new EntryYaml(battfile);
		entries = battactyml.readAllEntries();
		jComboBox2.setSelectedItem(entries[currEntry][1][YamlUtil.getKey("Action type", entries)]);
		jTextField1.setText(entries[currEntry][1][YamlUtil.getKey("Code Address", entries)]);
		jComboBox4.setSelectedItem(entries[currEntry][1][YamlUtil.getKey("Direction", entries)]);
		jTextField2.setText(entries[currEntry][1][YamlUtil.getKey("PP Cost", entries)]);
		jComboBox5.setSelectedItem(entries[currEntry][1][YamlUtil.getKey("Target", entries)]);
		jTextField3.setText(entries[currEntry][1][YamlUtil.getKey("Text Address", entries)]);
		tabp.addTab("Battle Action Table", battactwin);
		frame.add(tabp);
		lafUpdate();
		frame.pack();
		System.out.println(battactwin.getSize().toString());
		frame.setResizable(false);
		initDone = true;
	}
	}
	
	public void getEntries() {
		initGUI();
		for (int i = 0; i < entries.length; i++) {
			jComboBox1.addItem(Integer.toString(i));
		}
		entriestoedit.clear();
		entriestoedit.add(currEntry);
		setEntry(currEntry);
	}
	
	public void saveEntries() {
		int[] tmp = YamlUtil.convertIntegers(entriestoedit);
		if (!entriestoedit.contains((Integer) currEntry)) {
			entriestoedit.add(currEntry);
		}
		entries[currEntry][1][YamlUtil.getKey("Action type", entries)] = jComboBox2.getSelectedItem().toString();
		entries[currEntry][1][YamlUtil.getKey("Code Address", entries)] = jTextField1.getText();
		entries[currEntry][1][YamlUtil.getKey("Direction", entries)] = jComboBox4.getSelectedItem().toString();
		entries[currEntry][1][YamlUtil.getKey("PP Cost", entries)] = jTextField2.getText();
		entries[currEntry][1][YamlUtil.getKey("Target", entries)] = jComboBox5.getSelectedItem().toString();
		entries[currEntry][1][YamlUtil.getKey("Text Address", entries)] = jTextField3.getText();
		File battfile = new File(gui.projectString + File.separator + "battle_action_table.yml");
		EntryYaml battactyml = new EntryYaml(battfile);
		battactyml.writeMultipleEntries(tmp, entries);
		entriestoedit.clear();
		entriestoedit.add(currEntry);
	}
	
	public void setEntry(int entryNo) {
		if (!entriestoedit.contains((Integer) entryNo)) {
			entriestoedit.add(entryNo);
		}
		entries[currEntry][1][YamlUtil.getKey("Action type", entries)] = jComboBox2.getSelectedItem().toString();
		entries[currEntry][1][YamlUtil.getKey("Code Address", entries)] = jTextField1.getText();
		entries[currEntry][1][YamlUtil.getKey("Direction", entries)] = jComboBox4.getSelectedItem().toString();
		entries[currEntry][1][YamlUtil.getKey("PP Cost", entries)] = jTextField2.getText();
		entries[currEntry][1][YamlUtil.getKey("Target", entries)] = jComboBox5.getSelectedItem().toString();
		entries[currEntry][1][YamlUtil.getKey("Text Address", entries)] = jTextField3.getText();
		jComboBox2.setSelectedItem(entries[entryNo][1][YamlUtil.getKey("Action type", entries)]);
		jTextField1.setText(entries[entryNo][1][YamlUtil.getKey("Code Address", entries)]);
		jComboBox4.setSelectedItem(entries[entryNo][1][YamlUtil.getKey("Direction", entries)]);
		jTextField2.setText(entries[entryNo][1][YamlUtil.getKey("PP Cost", entries)]);
		jComboBox5.setSelectedItem(entries[entryNo][1][YamlUtil.getKey("Target", entries)]);
		jTextField3.setText(entries[entryNo][1][YamlUtil.getKey("Text Address", entries)]);
		currEntry = entryNo;
	}
}