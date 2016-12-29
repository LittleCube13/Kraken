import java.io.*;
import java.util.*;
import javax.xml.bind.*;

public class ROMtoCCS extends Kraken {
	
	static FileInputStream ROMreader;
	static FileInputStream hackreader;
	static byte[] basebytes;
	static byte[] hackbytes;
	
	public void runDiff(File baserom, File hackrom) {
	
	try {
		ROMreader = new FileInputStream(baserom);
		hackreader = new FileInputStream(hackrom);
		ROMreader.read(basebytes);
		hackreader.read(hackbytes);
		System.out.println(basebytes[0xeec6]);
	}
	catch (IOException ioe) { System.err.println("whoops"); }
	}
}