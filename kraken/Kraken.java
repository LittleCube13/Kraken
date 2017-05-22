import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Kraken {
	
	public static Kraken app = new Kraken();
	public static MainGUI gui = new MainGUI();
	public static NPCEditor npce = new NPCEditor();
	public static CCScriptModule ccsm = new CCScriptModule();
	public static ROMtoCCS rtccs = new ROMtoCCS();
	public static Preferences prfs = new Preferences();
	public static MiscEditor misced = new MiscEditor();
	public static KeyStroke ctrlq = KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK);
	public static KeyStroke ctrlo = KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK);
	public static KeyStroke ctrls = KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK);
	public static KeyStroke ctrlw = KeyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.CTRL_MASK);
	public static KeyStroke ctrln = KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK);
	public static KeyStroke ctrlr = KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK);
	
	public static void main(String args[]) {
		if (args.length > 0) {
			gui.initGUI(true, args[0]);
		} else {
			gui.initGUI(false, "");
		}
	}
}