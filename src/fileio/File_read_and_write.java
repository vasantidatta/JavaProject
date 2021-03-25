package fileio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_read_and_write {

	public static void main(String[] args) throws Throwable {
		
		File file = new File("C://Users//vasan//mssg.txt");
		
		FileWriter write = new FileWriter(file);
		
		String s = "Patiance is everything";
		
		write.write(s);
		write.close();
		
		System.out.println("written successfully");
		
		FileReader read = new FileReader(file);
		
		int i;
		
		while((i=read.read())!=0) {
			System.out.print((char)i);
		}
		read.close();
		System.out.println();

	}

}
