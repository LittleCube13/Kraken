import javax.swing.*;

public class BattleEditor extends Kraken {
	
	static JFrame frame = new JFrame("Battle Editor");
	static JTabbedPane tabp = new JTabbedPane(SwingConstants.TOP, JTabbedPane.WRAP_TAB_LAYOUT);
	
	public static void init() {
		frame.add(tabp);
	}
}