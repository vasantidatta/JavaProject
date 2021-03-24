package fileio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bufferedinputoutput {

	public static void main(String[] args)throws IOException {
		try {
			File file = new File("C:\\Users\\kulkarnivasanti\\String.txt");
			boolean fvar = file.createNewFile();
			if(fvar) {
				System.out.println("Created successfully");
			}
			FileOutputStream fout = new FileOutputStream(file);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			String str = "Java is a object orianted programming language";
			byte[] byt = str.getBytes();
			bout.write(byt);
			bout.close();
			fout.close();
			System.out.println("wrote,,Done!");
			
			FileInputStream fips = new FileInputStream(file);
			BufferedInputStream bips = new BufferedInputStream(fips);
			int i;
			while((i=bips.read())!=-1) {
				System.out.print((char)i);
			}
			System.out.println();
			fips.close();
			bips.close();	
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
