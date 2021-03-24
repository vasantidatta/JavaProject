package fileio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Buffinputstream {

	public static void main(String[] args)throws IOException {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Shreesh\\Prayers.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			int i ;
			while((i=bis.read())!=-1) {
				System.out.print((char)i);
			}
			System.out.println(" ");
			bis.close();
			fis.close();
		}
		finally {
			System.out.println("Great job..!");
		}

	}

}
