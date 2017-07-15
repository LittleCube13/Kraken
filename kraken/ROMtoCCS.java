import javax.swing.*;
import java.io.*;
import java.util.*;
import javax.xml.bind.*;

public class ROMtoCCS extends Kraken {
	
	static FileInputStream ROMreader;
	static FileInputStream hackreader;
	static byte[] basebytes;
	static byte[] hackbytes;
	static JOptionPane dia = new JOptionPane();
	static String difffile = "// note that this currently may only work with unheadered ROMs.\n\n";
	static boolean headered;
	
	public void addToCCS(int offset, byte[] hack, int range1, int range2) {
	if (offset >= range1 && offset <= range2) {
	if (offset <= 0x3fffff && !headered) {
		difffile += "ROM[0x" + Integer.toHexString(offset + 0xC00000) + "] = \"[" + DatatypeConverter.printHexBinary(hack) + "]\"\n\n";
	}
	if (offset > 0x3fffff && !headered) {
		difffile += "ROM[0x" + Integer.toHexString(offset) + "] = \"[" + DatatypeConverter.printHexBinary(hack) + "]\"\n\n";
	}
	if (offset <= 0x3fffff && headered) {
		difffile += "ROM[0x" + Integer.toHexString(offset + 0xBFFE00) + "] = \"[" + DatatypeConverter.printHexBinary(hack) + "]\"\n\n";
	}
	if (offset > 0x3fffff && headered) {
		difffile += "ROM[0x" + Integer.toHexString(offset - 0x200) + "] = \"[" + DatatypeConverter.printHexBinary(hack) + "]\"\n\n";
	}
}
}
	public void runDiff(File baserom, File hackrom, int range1, int range2, File outfile) {
	
	try {
		ROMreader = new FileInputStream(baserom);
		hackreader = new FileInputStream(hackrom);
		basebytes = new byte[(int) baserom.length()];
		hackbytes = new byte[(int) hackrom.length()];
		if (basebytes.length == 0x400000 || basebytes.length == 0x600000) {
			headered = false;
		}
		if (basebytes.length == 0x400200 || basebytes.length == 0x600200) {
			headered = true;
		}
		if (basebytes.length != 0x400000 && basebytes.length != 0x600000 && basebytes.length != 0x400200 && basebytes.length != 0x600200) {
			dia.showMessageDialog(null, "One or both of these ROMs are an invalid length. (possibly 3MB) Please expand to 4MB or 6MB.", "You screwed up", JOptionPane.ERROR_MESSAGE);
			return;
		}
		System.out.println(headered);
		System.out.println(outfile);
		System.out.println(basebytes.length);
		System.out.println(hackbytes.length);
		System.out.println(baserom.toString());
		System.out.println(hackrom.toString());
			if (basebytes.length != hackbytes.length) {
				dia.showMessageDialog(null, "These ROMs differ in length. Please expand the smaller ROM or add/remove headers as needed.", "You screwed up", JOptionPane.ERROR_MESSAGE);
			} else {
			
			ROMreader.read(basebytes, 0, basebytes.length);
			hackreader.read(hackbytes, 0, hackbytes.length);
			for(int it = 0; it < basebytes.length; it++) {
				if (basebytes[it] != hackbytes[it]) {
					byte[] stupid = Arrays.copyOfRange(hackbytes, it, it + 1);
					addToCCS(it, stupid, range1, range2);
			}
		}
		FileWriter fw = new FileWriter(outfile);
		BufferedWriter buff = new BufferedWriter(fw);
		buff.write(difffile);
		buff.close();
		dia.showMessageDialog(null, "Kraken has completed the diff.", "Success!", JOptionPane.INFORMATION_MESSAGE);
	}
	}
	catch (IOException ioe) { System.err.println(ioe.toString()); }
	}
}