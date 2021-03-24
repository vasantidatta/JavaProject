package fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_writing {

	public static void main(String[] args) throws IOException {
		try {
		File file = new File("C:\\Users\\Shreesh\\Documents\\message.txt");
		
		boolean fvar = file.createNewFile();
		if(fvar) {
			System.out.println("File has been created successfully");
		}
		else {
			System.out.println("File already exists");
		}
		FileWriter fwrite = new FileWriter(file);
		fwrite.write("hello, my name is vasanti");
		fwrite.close();
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}		

}
