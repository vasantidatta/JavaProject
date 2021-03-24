package fileio;

import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoutputstream {

	public static void main(String[] args)throws IOException {
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Shreesh\\Documents\\message.txt");
		    String s = "Please help me god , please help my family";
		    byte[] b = s.getBytes();
		    fout.write(b);
		    fout.close();  
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("wrote");
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Shreesh\\Prayers.txt");
			String str = "Ambiga naa ninna nambide jagadambaramana ninna nambide";
			byte[] by = str.getBytes();
			fout.write(by);
			fout.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("om namaha shivay");

	}

}
