package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fileinputstream {

	public static void main(String[] args) throws IOException {
		try {
		FileInputStream fis = new FileInputStream("C:\\Users\\Shreesh\\Documents\\sms.txt");
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
			//fis.close();
		}
		System.out.println();
		fis.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("well done !");

	}

}
