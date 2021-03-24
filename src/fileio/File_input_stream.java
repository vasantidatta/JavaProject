package fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_input_stream {

	public static void main(String[] args)throws IOException {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Shreesh\\Prayers.txt");
			int i;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			System.out.println(" ");
			fis.close();
		}
		finally {
			System.out.println("Sri ram");
		}
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Shreesh\\Prayers.txt");
			String str = "JIT compiler is run time environment";
			byte[] by = str.getBytes();
			fout.write(by);
			fout.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Java world");
		}
	}

}
