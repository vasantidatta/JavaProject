package fileio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Bufferedinputstream {

	public static void main(String[] args)throws IOException {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Shreesh\\Documents\\message.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			int i;
			while((i=bis.read())!=-1) {
				System.out.print((char)i);
			}
			System.out.println("");
			bis.close();
			fis.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
		System.out.println("Jai sri krishna..!");
		}
	}

}
