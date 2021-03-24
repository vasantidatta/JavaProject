package fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileinputoutput {

	public static void main(String[] args) throws IOException {
		try {
		File file = new File("c:\\users\\kulkarnivasanti\\info.txt");
		boolean fvar = file.createNewFile();
		if(fvar) {
			System.out.println("file has created successfully");
		}
		FileOutputStream fout = new FileOutputStream(file);
		String str = "What goes around,comes around";
		byte[] strbyte = str.getBytes();
		fout.write(strbyte);
		fout.close();
		System.out.println("Written");
		
		FileInputStream fis = new FileInputStream(file);
		int i ;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		System.out.println("");
		fis.close();
        System.out.println("Done!");
	}
		catch(Exception e) {
			System.out.println(e);		}

}
}
