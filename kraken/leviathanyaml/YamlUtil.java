package leviathanyaml;

public abstract class YamlUtil {
	
	public int getKey(String key, String[][] entry) {
		for (int i = 0; i < entry.length; i++) {
			if (entry[0][i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public int getKey(String key, String[][][] entry) {
		for (int i = 0; i < entry.length; i++) {
			if (entry[0][0][i] == key) {
				return i;
			}
		}
		return -1;
	}
}