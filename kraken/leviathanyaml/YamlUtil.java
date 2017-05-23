package leviathanyaml;

import java.util.*;

public abstract class YamlUtil {
	
	public static int getKey(String key, String[][] entry) {
		for (int i = 0; i < entry.length; i++) {
			if (entry[0][i].equals(key)) {
				return i;
			}
		}
		return -1;
	}
	
	public static int getKey(String key, String[][][] entry) {
		for (int i = 0; i < entry.length; i++) {
			if (entry[0][0][i].equals(key)) {
				return i;
			}
		}
		return -1;
	}
	
	public static void ensureSize(List<String[][]> arr, int size) {
		while (arr.size() < size) {
			arr.add(null);
		}
	}
}