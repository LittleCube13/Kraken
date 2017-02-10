import java.io.*;
import java.awt.event.*;

public class Preferences extends Kraken {
	
	static File home = new File(System.getProperty("user.home"));
	static File dir = new File(home + "/.leviathan");
	static File prefs = new File(dir + "/prefs.txt");
	static FileReader fr;
	static BufferedReader buff;
	static FileWriter fw;
	static BufferedWriter buffw;
	boolean openatstart;
	File projectlast;
	int lafint;
	
	public void createNewPreferences() {
			dir.mkdirs();
	}
	
	public void setOpenAtStart(boolean b) {
		File lp = gui.currentProject;
		int laflaf = gui.LAF;
		try {
			fw = new FileWriter(prefs);
			buffw = new BufferedWriter(fw);
			buffw.write(b + "\n" + lp.toString() + "\n" + Integer.toString(laflaf));
			buffw.close();
		} catch (Exception asdlfj) {}
}
	
	public void setLastProject(File lp) {
		boolean b = gui.openlastproject.getState();
		int laflaf = gui.LAF;
		try {
			fw = new FileWriter(prefs);
			buffw = new BufferedWriter(fw);
			buffw.write(b + "\n" + lp.toString() + "\n" + Integer.toString(laflaf));
			buffw.close();
		} catch (Exception ashdfhfl) { System.err.println(ashdfhfl.toString()); }
}
	public void setLAF(int laflaf) {
		boolean b = gui.openlastproject.getState();
		File lp = gui.currentProject;
		try {
		fw = new FileWriter(prefs);
		buffw = new BufferedWriter(fw);
		buffw.write(b + "\n" + lp.toString() + "\n" + Integer.toString(laflaf));
		buffw.close();
	} catch (Exception asdlfkjbg) {}
}
	
	public void getAll() {
		try {
			fr = new FileReader(prefs);
			buff = new BufferedReader(fr);
			gui.openlastproject.setState(Boolean.parseBoolean(buff.readLine()));
			gui.currentProject = new File(buff.readLine());
			gui.LAF = Integer.parseInt(buff.readLine());
			buff.close();
		} catch (Exception asdlffj) {}
	}
	
	public boolean getOpenAtStart() {
		try {
		boolean openatstart = Boolean.parseBoolean(buff.readLine());
		buff.close();
	} catch (IOException ioex) { System.err.println(ioex.toString()); }
	return openatstart;
}
	
	public File getLastProject() {
		try {
		buff.readLine();
		projectlast = new File(buff.readLine());
		buff.close();
	} catch (IOException ioexc) { System.err.println(ioexc.toString()); }
	return projectlast;
}
	
	public int getLAF() {
		try {
		buff.readLine();
		buff.readLine();
		lafint = Integer.parseInt(buff.readLine());
		buff.close();
	} catch (IOException ioexce) { System.err.println(ioexce.toString()); }
	return lafint;
	}
}