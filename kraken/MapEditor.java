import ebhack.*;
import javax.swing.*;
import java.awt.*;

public class MapEditor extends Kraken {
	
	static JFrame frame;
	static Container win;
	
	public void init() {
		try {
		ebhack.Ebhack ebhackruntime = new ebhack.Ebhack();
		ebhackruntime.main(new String[]{ gui.projectString });
		ebhack.MapEditor mapedi = new ebhack.MapEditor(ebhackruntime.main.prefs);
		mapedi.init();
		win = ToolModule.mainWindow.getContentPane();
		frame.add(win);
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
		} catch (Exception e) { System.err.println("Whoops! Error in function MapEditor.init(): " + e.toString()); }
	}
}