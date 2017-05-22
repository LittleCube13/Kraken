package leviathanyaml;

import java.io.*;
import java.util.*;

public class EntryYaml {
	
	static File ymlfile;
	static FileReader fr;
	static BufferedReader buffr;
	
	public EntryYaml(File f) {
		try {
			ymlfile = f;
		} catch (Exception e) { System.out.println(e.toString()); }
	}
	
	public String[] readEntryLines(int entryNo) {
		String line = "";
		List<String> lines = new ArrayList<String>();
		try {
			fr = new FileReader(ymlfile);
			buffr = new BufferedReader(fr);
			while (line != null) {
				line = buffr.readLine();
				if (line.trim().startsWith(Integer.toString(entryNo))) {
					line = buffr.readLine();
					for (line = line; !line.trim().startsWith(Integer.toString(entryNo + 1)); line = buffr.readLine()) {
						if (!line.trim().startsWith("#")) {
							lines.add(line + "\n");
						}
					}
				}
			}
		} catch (Exception e) { System.out.println(e.toString()); }
		String[] ret = lines.toArray(new String[lines.size()]);
		return ret;
	}
	
	public String[] readEntryValues(int entryNo) {
		String line = "";
		List<String> lines = new ArrayList<String>();
		try {
			fr = new FileReader(ymlfile);
			buffr = new BufferedReader(fr);
			while (line != null) {
				line = buffr.readLine();
				if (line.trim().startsWith(Integer.toString(entryNo))) {
					line = buffr.readLine();
					for (line = line; !line.trim().startsWith(Integer.toString(entryNo + 1)); line = buffr.readLine()) {
						if (!line.trim().startsWith("#")) {
							lines.add(line.substring(line.lastIndexOf(":") + 2, line.length()));
						}
					}
				}
			}
		} catch (Exception e) { System.out.println(e.toString()); }
		String[] ret = lines.toArray(new String[lines.size()]);
		return ret;
	}
	
	public String[][] readEntry(int entryNo) {
		String line = "";
		List<String> keys = new ArrayList<String>();
		List<String> values = new ArrayList<String>();
		try {
			fr = new FileReader(ymlfile);
			buffr = new BufferedReader(fr);
			while (line != null) {
				line = buffr.readLine();
				if (line.trim().startsWith(Integer.toString(entryNo))) {
					line = buffr.readLine();
					for (line = line; !line.trim().startsWith(Integer.toString(entryNo + 1)); line = buffr.readLine()) {
						if (!line.trim().startsWith("#")) {
							keys.add(line.substring(0, line.lastIndexOf(":") - 1));
							values.add(line.substring(line.lastIndexOf(":") + 2, line.length()));
						}
					}
				}
			}
		} catch (Exception e) { System.out.println(e.toString()); }
		String[] a1 = keys.toArray(new String[keys.size()]);
		String[] a2 = values.toArray(new String[values.size()]);
		String[][] ret = { a1, a2 };
		return ret;
	}
	
	public String[][][] readAllEntries() {
		String line = "";
		int i = -1;
		List<String[][]> entries = new ArrayList<String[][]>();
		try {
			while (line != null) {
				fr = new FileReader(ymlfile);
				buffr = new BufferedReader(fr);
				i++;
				line = buffr.readLine();
				if (line.trim().startsWith(Integer.toString(i))) {
					List<String> keys = new ArrayList<String>();
					List<String> values = new ArrayList<String>();
					line = buffr.readLine();
					for (line = line; !line.trim().endsWith(":"); line = buffr.readLine()) {
						if (!line.trim().startsWith("#")) {
							keys.add(line.trim().substring(0, line.trim().lastIndexOf(":")));
							values.add(line.trim().substring(line.trim().lastIndexOf(":") + 2, line.trim().length()));
						}
					}
					String[] a1 = keys.toArray(new String[keys.size()]);
					String[] a2 = values.toArray(new String[values.size()]);
					String[][] arr = { a1, a2 };
					entries.add(i, arr);
				}
			}
		} catch (Exception e) { System.out.println(e.toString()); }
		String[][][] arr = entries.toArray(new String[entries.size()][][]);
		return arr;
	}
}